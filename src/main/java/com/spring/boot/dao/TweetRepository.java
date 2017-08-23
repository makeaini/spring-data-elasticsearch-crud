package com.spring.boot.dao;

import com.spring.boot.pojo.City;
import com.spring.boot.pojo.Tweet;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by shining on 2017-7-26.
 */
@Repository
public interface TweetRepository extends ElasticsearchRepository<Tweet, Long> {

}
