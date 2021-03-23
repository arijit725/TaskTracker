package org.arijit.task.traker.dto;

import javafx.concurrent.Task;

import java.util.Date;

public class TaskDto {

    // sample id=> yyyymmddsl => under path/yyyy/mm/dd serial number sl
    private final String id;
    private final long date;
    private final String subject;
    private final String details;

    // empty constructor will be used when TaskDTO object is used as argument in PUT and POST request.
    public TaskDto(){
        this.id = null;
        this.date = 0;
        this.subject = null;
        this.details = null;
    }
    public TaskDto(String id, long date, String subject, String details){
        this.id = id;
        this.date = date;
        this.subject = subject;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public long getDate() {
        return date;
    }

    public String getSubject() {
        return subject;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "id='" + id + '\'' +
                "date='" + new Date(date) + '\'' +
                ", subject='" + subject + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
