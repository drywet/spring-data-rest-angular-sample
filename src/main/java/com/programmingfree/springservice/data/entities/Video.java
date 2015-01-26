package com.programmingfree.springservice.data.entities;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {
    private int id;
    private String name;
    private Subcategory subcategory;

    @ManyToOne
    @JoinColumn(name = "subcategory_id", insertable = false, updatable = false)
    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    @Id
    @Column(name = "video_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
