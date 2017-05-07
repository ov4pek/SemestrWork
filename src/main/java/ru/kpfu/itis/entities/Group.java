package ru.kpfu.itis.entities;

public class Group {


    private String id;
    private String groupNumber;

    public Group() {

    }

    public Group(String id, String groupNumber) {
        this.id = id;
        this.groupNumber = groupNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
}