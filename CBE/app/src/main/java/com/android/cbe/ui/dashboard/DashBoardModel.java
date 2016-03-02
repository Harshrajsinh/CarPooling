package com.android.cbe.ui.dashboard;

/**
 * Created by Intern.harshrajT on 3/1/2016.
 */
public class DashBoardModel {
    String description;
    int image;

    public DashBoardModel(int image,String description) {
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
