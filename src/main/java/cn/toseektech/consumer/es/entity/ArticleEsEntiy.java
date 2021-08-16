package cn.toseektech.consumer.es.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import cn.toseektech.consumer.entity.Article;

@Document(indexName = "article")
public class ArticleEsEntiy {
	
	 @Id
	 private Long id;
	 
	 /*数据库的id*/
	 @Field(type = FieldType.Long)
	 private Long databaseId;
	 
	 /*keyword 不分词，查找时只能精确查找*/
	 @Field(type=FieldType.Keyword)
	 private String title;
	 
	 /*Text 需要分词，要指定分词器  ik_max_word：细粒度拆分   ik_smart：粗粒度拆分*/
	 @Field(type=FieldType.Text,analyzer = "ik_max_word")
	 private String content;
	
     public static ArticleEsEntiy createArticleEsEntiy(Article article) {
    	 ArticleEsEntiy articleEsEntiy = new ArticleEsEntiy();
    	 articleEsEntiy.setContent(article.getContent());
    	 articleEsEntiy.setDatabaseId(article.getId());
    	 articleEsEntiy.setTitle(article.getTitle());
    	 return articleEsEntiy;
     }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDatabaseId() {
		return databaseId;
	}

	public void setDatabaseId(Long databaseId) {
		this.databaseId = databaseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
     
     
}
