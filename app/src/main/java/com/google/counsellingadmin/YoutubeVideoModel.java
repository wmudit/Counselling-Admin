package com.google.counsellingadmin;

public class YoutubeVideoModel {

    String title;
    String link;

    public YoutubeVideoModel()  {

    }
    public YoutubeVideoModel(String title, String link) {
        this.title = title;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
