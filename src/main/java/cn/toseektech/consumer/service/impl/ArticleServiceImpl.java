package cn.toseektech.consumer.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.toseektech.common.utils.CommonUtil;
import cn.toseektech.consumer.dao.ArticleMapper;
import cn.toseektech.consumer.dto.ArticleDto;
import cn.toseektech.consumer.dto.ArticleSaveDto;
import cn.toseektech.consumer.entity.Article;
import cn.toseektech.consumer.entity.ArticleExample;
import cn.toseektech.consumer.es.entity.ArticleEsEntiy;
import cn.toseektech.consumer.es.repository.ArticleEsReposotory;
import cn.toseektech.consumer.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Resource
	private ArticleMapper articleMapper;

	@Resource
	private ArticleEsReposotory articleEsReposotory;

	@Override
	public void saveArticleService(ArticleSaveDto articleSaveDto) {
		Article article = articleMapper.queryByTitle(articleSaveDto.getTitle());
		if (article != null) {
			article.setContent(articleSaveDto.getContent());
			articleMapper.updateByPrimaryKeySelective(article);
			articleEsReposotory.deleteByDatabaseId(article.getId());
		} else {
			article = CommonUtil.copy(articleSaveDto, Article.class);
			article.setId(CommonUtil.generateSnowflakeId());
			articleMapper.insertSelective(article);
		}
		ArticleEsEntiy articleEsEntiy = ArticleEsEntiy.createArticleEsEntiy(article);
		articleEsReposotory.save(articleEsEntiy);
	}

	@Override
	public ArticleDto getArticleByTitle(String title) {
		return CommonUtil.copy(articleMapper.queryByTitle(title), ArticleDto.class);
	}

	@Override
	public List<ArticleDto> getArticleList() {
		return CommonUtil.listCopy(articleMapper.queryArticleList(), ArticleDto.class);
	}

	@Override
	public void deleteArticle(String title) {
		ArticleExample articleExample = new ArticleExample();
		articleExample.createCriteria().andTitleEqualTo(title);
		articleMapper.deleteByExample(articleExample);
		articleEsReposotory.deleteByTitle(title);
	}

	@Override
	public List<ArticleDto> searchArticleByContent(String contentKeyword) {
		List<ArticleEsEntiy> list = articleEsReposotory.findByContentContaining(contentKeyword);
		return list.stream().map(e -> {
			ArticleDto articleDto = new ArticleDto();
			articleDto.setId(e.getDatabaseId());
			articleDto.setContent(e.getContent());
			articleDto.setTitle(e.getTitle());
			return articleDto;
		}).collect(Collectors.toList());
	}

}
