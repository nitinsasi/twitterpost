package com.tweet;
import java.util.List;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.conf.ConfigurationBuilder;
import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TwitterPost {

 
	public static void main(String[] args) {

		 
			// Twitter twitter = new TwitterFactory().getInstance();

			
			
			
			
			
			 

		 
			
			 ConfigurationBuilder cb = new ConfigurationBuilder();

			    cb.setDebugEnabled(true)
			      .setOAuthConsumerKey("oR86gw20pczrsVayUW2NdLTYU")
			      .setOAuthConsumerSecret("Xaf6slV11NzHrSoKq6NKAD0jDO2mtqrL67ZT14K2nxLm3k7ddb")
			      .setOAuthAccessToken("786453066358730752-ZDMTQzLULnbTpNXTS9BUCgnzqmXEnPM")
			      .setOAuthAccessTokenSecret("t6wxGgZfuKtJZyhATBkauUaDw1LbO2SaNI7Yzy9Qv64oe");
			    TwitterFactory tf = new TwitterFactory(cb.build());

			    Twitter twitter = tf.getInstance();
			    Twitter twitter1 = new TwitterFactory().getInstance();

			    List<Status> statusList = null;

			   try {
			        statusList = twitter.getUserTimeline("india");
			    } catch (TwitterException e) {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
			    }

			    for (Status status : statusList) {
			        System.out.println(status.toString());
			    }        
		 
			
			System.out.println("Successfully updated the status in Twitter.");
			
			
			
	 
	}

}