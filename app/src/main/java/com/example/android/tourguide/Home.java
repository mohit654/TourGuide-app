package com.example.android.tourguide;

/**
 * Created by user on 05-06-2017.
 */

public class Home {
    private int imageResource;
    private String textResource;
    private String Resource;
    public Home(int image_resource,String text_resource,String text)
    {
        imageResource = image_resource;
        textResource = text_resource;
        Resource = text;
    }
    public int getImageResorce(){
        return imageResource;
    }
    public String getTextResource(){
        return textResource;
    }
    public String getResource(){
        return Resource;
    }
}
