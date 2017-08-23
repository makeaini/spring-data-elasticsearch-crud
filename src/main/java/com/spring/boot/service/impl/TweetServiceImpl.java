package com.spring.boot.service.impl;

import com.spring.boot.dao.TweetRepository;
import com.spring.boot.pojo.Tweet;
import com.spring.boot.service.TweetServiceI;
import org.elasticsearch.action.search.MultiSearchRequestBuilder;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

/**
 * Created by shining on 2017-08-02.
 */
@Service
public class TweetServiceImpl implements TweetServiceI {    /* 分页参数 */
    Integer PAGE_SIZE = 12;          // 每页数量
    Integer DEFAULT_PAGE_NUMBER = 0; // 默认当前页码

    @Autowired
    private TweetRepository tweetRepository;

    @Override
    public void saveTweet(Tweet tweet) {
        tweetRepository.save(tweet);
    }



}
