package com.myapplicationdev.android.p02_holidays;

public class Holidays  {
  private String date;
  private String day;
  private  Integer image;

  public Holidays(String day, String date, Integer image) {
    this.date = date;
    this.day = day;
    this.image = image;

  }

  public String getDate() {
    return date;
  }


  public String getDay() {
    return day;
  }



  public Integer getImage() {
    return image;
  }


}
