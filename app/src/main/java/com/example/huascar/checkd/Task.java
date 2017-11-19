package com.example.huascar.checkd;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by huascar on 17/11/2017.
 */

public class Task {
    private int id;
    private String title;
    private String description;
    private Boolean completed;

    public Task(String title, String description, Boolean completed) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getCompleted() {
        return completed;
    }

}
