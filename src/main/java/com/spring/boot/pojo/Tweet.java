package com.spring.boot.pojo;

import org.elasticsearch.action.fieldstats.FieldStats;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by shining on 2017-7-27.
 */
@Document(indexName = "gb",type = "tweet")
public class Tweet implements Serializable{
    private Integer id;
    private Date date;
    @Field(type = FieldType.String)
    private String name;
    @Field(type = FieldType.String)
    private String tweet;
    private Long user_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
