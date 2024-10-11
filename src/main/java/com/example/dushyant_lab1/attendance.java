package com.example.dushyant_lab1;

import javafx.scene.control.TableColumn;

public class attendance {
    private TableColumn<attendance, Integer> id;     private String name;     private String subject;     private int room;

    public attendance(TableColumn<attendance, Integer> id, String name, TableColumn<attendance, String> subject, int room) {         this.id = id;         this.name = name;         this.subject = ubject;         this.room = room;
    }
    public TableColumn<attendance, Integer> getId() {         return id;
    }      public String getName() {         return name;
    }
    public String getsubject() {

        return subject;
    }      public int getRoom() {         return room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(TableColumn<attendance, Integer> id) {
        this.id = id;

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public attendance(TableColumn<attendance, Integer> id) {
        this.id = id;
    }

    public attendance(String name) {
        this.name = name;
    }

}


