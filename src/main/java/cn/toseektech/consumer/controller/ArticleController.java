package cn.toseektech.consumer.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.toseektech.common.configuration.annotations.GlobalExceptionHandler;
import cn.toseektech.common.model.ResponseVO;
import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.ao.ArticleSaveAo;
import cn.toseektech.consumer.dto.ArticleSaveDto;
import cn.toseektech.consumer.service.ArticleService;
import cn.toseektech.consumer.vo.ArticleVo;
import cn.toseektech.translation.annotation.Translate;


@RestController
@GlobalExceptionHandler
@RequestMapping("/article")
public class ArticleController {
	
	@Resource
	private ArticleService articleService;
	
	@PostMapping("/saveArticle")
	public ResponseVO<Object> saveArticle(@RequestBody ArticleSaveAo articleSaveAo){	
		articleService.saveArticleService(CommonUtil.copy(articleSaveAo, ArticleSaveDto.class));
		return new ResponseVO<>();		
	}
	
	@PostMapping("/deleteArticle/{title}")
	public ResponseVO<Object> deleteArticle(@PathVariable("title") String title){	
		articleService.deleteArticle(title);
		return new ResponseVO<>();		
	}
	
	
	@GetMapping("/getArticleByTitle/{title}")
	public ResponseVO<ArticleVo> getArticleByTitle(@PathVariable("title") String title){
		return new ResponseVO<>(CommonUtil.copy(articleService.getArticleByTitle(title), ArticleVo.class));		
	}
	
	@GetMapping("/getArticleList")
	public ResponseVO<List<ArticleVo>> getArticleList(){
		return new ResponseVO<>(CommonUtil.listCopy(articleService.getArticleList(), ArticleVo.class));		
	}
	
	@Translate
	@GetMapping("/searchArticleByContent/{contentKeyword}")
	public ResponseVO<List<ArticleVo>> searchArticleByContent(@PathVariable("contentKeyword")String contentKeyword){
		return new ResponseVO<>(CommonUtil.listCopy(articleService.searchArticleByContent(contentKeyword), ArticleVo.class));		
	}
	
}
