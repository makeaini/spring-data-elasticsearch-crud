package com.spring.boot.service;

import com.spring.boot.pojo.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.query.SearchQuery;

import java.util.List;

/**
 * Created by shining on 2017-08-02.
 */
public interface TweetServiceI {
    public void saveTweet(Tweet tweet);


}
