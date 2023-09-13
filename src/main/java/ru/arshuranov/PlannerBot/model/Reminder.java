package ru.arshuranov.PlannerBot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reminder {

    @Id
    @GeneratedValue
    private long id;

    private String date; //day.month.year
    private String time; //hour:minutes
    private String text; //text

    private boolean active = true; //change true -> false for deactivate after remind


    public Reminder(long id, String date, String time, String text, boolean active) {
        this.date = date;
        this.time = time;
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", text='" + text + '\'' +
                ", active=" + active +
                '}';
    }
}
