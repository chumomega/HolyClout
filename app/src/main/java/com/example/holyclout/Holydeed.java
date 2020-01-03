package com.example.holyclout;

import java.util.Date;
import java.util.UUID;

public class Holydeed {
    private UUID id;
    private String title;
    private Date date;
    private boolean blessed;

    public Holydeed() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isBlessed() {
        return blessed;
    }

    public void setBlessed(boolean blessed) {
        this.blessed = blessed;
    }
}
