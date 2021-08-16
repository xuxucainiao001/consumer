package cn.toseektech.consumer.service;

import java.util.List;

import cn.toseektech.consumer.dto.ArticleDto;
import cn.toseektech.consumer.dto.ArticleSaveDto;

public interface ArticleService {
	
	void saveArticleService(ArticleSaveDto articleSaveDto);
	
	ArticleDto getArticleByTitle(String title);

	List<ArticleDto> getArticleList();
   
	void deleteArticle(String title);
	
	List<ArticleDto> searchArticleByContent(String contentKeyword);

}
