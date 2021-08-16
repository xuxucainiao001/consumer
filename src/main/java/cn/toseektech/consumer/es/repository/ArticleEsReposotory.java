package cn.toseektech.consumer.es.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import cn.toseektech.consumer.es.entity.ArticleEsEntiy;

@Repository
public interface ArticleEsReposotory extends ElasticsearchRepository<ArticleEsEntiy,Long>{

	ArticleEsEntiy findByDatabaseId(Long id);
	
	void deleteByDatabaseId(Long id);
	
	void deleteByTitle(String title);
	
	List<ArticleEsEntiy> findByContentContaining(String contentKeyword);

}
