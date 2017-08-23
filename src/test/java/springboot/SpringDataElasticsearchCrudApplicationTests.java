package springboot;

import com.spring.boot.SpringDataElasticsearchCrudApplication;
import com.spring.boot.pojo.Tweet;
import com.spring.boot.service.TweetServiceI;
import org.elasticsearch.action.fieldstats.FieldStats;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilder;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringDataElasticsearchCrudApplication.class)
public class SpringDataElasticsearchCrudApplicationTests {
	@Autowired
	private TweetServiceI tweetServiceI;

	@Test
	public void contextLoads() {
		Tweet tweet = new Tweet();
		tweet.setDate(new Date());
		tweet.setName("181 1110731");
		tweet.setUser_id(14L);
		tweet.setTweet("这是一个很牛逼的12");
		tweet.setId(8);
		tweetServiceI.saveTweet(tweet);
	}

}
