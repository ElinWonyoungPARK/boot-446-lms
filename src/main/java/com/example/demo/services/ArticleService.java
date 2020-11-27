package com.example.demo.services;

import org.springframework.stereotype.Component;

import java.util.List;

import com.example.demo.domains.ArticleDto;
import com.example.demo.domains.ReplyDto;

@Component
public interface ArticleService {
    public void writeArticle(ArticleDto article);
    public void modifyArticle(ArticleDto article);
    public void removeArticle(ArticleDto article);
    public void writeReply(ReplyDto reply);
    public void removeReply(ReplyDto reply);
    public ArticleDto readArticle(int artId);
    public List<ReplyDto> readReply(int artId);
}
