package com.apiexamples.payload;

import java.util.Date;

public class ExceptionDetails {
    private String message;
    private Date date;

    public ExceptionDetails(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
