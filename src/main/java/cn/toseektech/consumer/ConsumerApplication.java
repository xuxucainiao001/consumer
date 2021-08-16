  package cn.toseektech.consumer;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.TimeZone;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.toseektech.common.configuration.annotations.EnableSecurityPermitAll;
import cn.toseektech.common.configuration.annotations.EnableToSeekTechDataSource;
import cn.toseektech.common.configuration.annotations.EnableToSeekTechExceptionHandler;
import cn.toseektech.common.configuration.annotations.EnableToSeekTechRedission;
import cn.toseektech.common.utils.SpringUtils;
import cn.toseektech.translation.annotation.EnableToSeekTechTranslation;


@EnableDiscoveryClient
@EnableSecurityPermitAll
@EnableToSeekTechRedission
@EnableToSeekTechDataSource
@EnableToSeekTechTranslation
@EnableToSeekTechExceptionHandler
@MapperScan(basePackages = {"cn.toseektech.consumer.dao"})
@EnableFeignClients(basePackages = { "cn.toseektech.remote.**" })
@SpringBootApplication(scanBasePackages = {"cn.toseektech.consumer.**","cn.toseektech.remote.**"})
public class ConsumerApplication {

	private static final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);
	
	static {
		// redisson和es会共用netty，导致 es.set.netty.runtime.available.processors 设置重复
		System.setProperty("es.set.netty.runtime.available.processors", "false");
	}
    
	
	public static void main(String[] args) {
		
		logger.info("=====consumer 启动开始！======");		
		ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
		SpringUtils.setApplicationContext(context);
		logger.info("=====consumer 启动结束！======");
	
	}

    
	/**
	 * jackson统一处理规则
	 * @param env
	 * @return
	 */
	@Bean
	public ObjectMapper objectMapper(Environment env) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setDateFormat(new SimpleDateFormat());
		objectMapper.setTimeZone(TimeZone.getTimeZone(ZoneId.of("Asia/Shanghai")));
		return objectMapper;
	}
	
	/**
	 * RestTemplate 开启负载均衡的注解
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate  restTemplate() {
	    return new RestTemplate();
	}
	
	/**
     * 注入一个ServerEndpointExporter,该Bean会自动注册使用@ServerEndpoint注解申明的websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
	
	
	
}
