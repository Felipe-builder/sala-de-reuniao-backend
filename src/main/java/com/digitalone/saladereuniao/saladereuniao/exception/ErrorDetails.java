package com.digitalone.saladereuniao.saladereuniao.exception;

import java.util.Date;

public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String datails;

    public ErrorDetails() {
    }

    public ErrorDetails(Date timestamp, String message, String datails) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.datails = datails;
    }

    public Date getTimestamp() {
        return timestamp;
    }


    public String getMessage() {
        return message;
    }


    public String getDatails() {
        return datails;
    }
}
