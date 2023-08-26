package com.example.demo.model;

public class Place {
	  private static int count = 1;
	  private int placeId;
	  private String name;
	  private String placeDes;
	  private int like;
	  private int dislike;
	  private double rate;
//	  private UserComments[] userComments = new UserComments [10];

	  public Place(String name, String placeDes, int like, int dislike, double rate){
	    this.name = name;
	    this.placeDes = placeDes;
	    this.like = like;
	    this.dislike = dislike;
	    this.rate = rate;
//	    setPlaceId(++count);
	    
	  }

//	  public void setUserComments(UserComments uesrComment){
//	    for(int i = 0; i < 10; i++){
//	      if(this.userComments[i] == null){
//	        this.userComments[i] = uesrComment;
//	        return;
//	      }
//	    }
//	  }
	  
	  public String getPlaceDes(){
	    return this.placeDes;
	  }

	  public String getName( ){
	    return this.name;
	  }
	  
	  public int getLike( ){
	    return this.like;
	  }
	  
	  public int getDislike( ){
	    return this.dislike;
	  }
	  
	  public double getRate( ){
	    return this.rate;
	  }
	  
	  public void setPlaceDes(String placeDes){
	    this.placeDes = placeDes;
	  }

	  public void setName(String name){
	    this.name = name;
	  }
	  
	  public void setLike(int like){
	    this.like = like;
	  }
	  
	  public void setName(int dislike){
	    this.dislike = dislike;
	  }
	  
	  public void setName(double rate){
	    this.rate = rate;
	  }

	  public void setPlaceId(int count){
	    this.placeId = placeId;
	  }

	  public String toString(){
	    return String.format("\n\tname: %s\n\tplaceDes: %s\n\tlike: %s\n\tdislike: %s\n\trate: %s\n\n", name, placeDes, like, dislike, rate);
	  }

	}
