package com.example.demo.model;

import java.util.Date;
public class UserComments{
  private int userId;
  private int placeId;
  private String comment;
  private Date date;
 
  public UserComments(int userId, int placeId, String comment, Date date){
    this.userId = userId;
    this.placeId = placeId;
    this.comment = comment;
    this.date = date;
  }

  public void setUserId(int userId){
    this.userId = userId;
  }

  public void setPlaceId(int placeId){
    this.placeId = placeId;
  }

  public void setComment(String comment){
    this.comment = comment;
  }

  public void setDate(Date date){
    this.date = date;
  }

  public int getUserId(){
    return this.userId;
  }

  public int getPlaceId(){
    return this.placeId;
  }

  public String getComment(){
    return this.comment;
  }

  public Date getDate(){
    return this.date;
  }
}