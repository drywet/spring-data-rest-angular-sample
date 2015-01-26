package com.programmingfree.springservice.data.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subcategories")
public class Subcategory {
    private int id;
    private Category category;
    private String name;
    private Set<Video> videos;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @OneToMany(mappedBy = "subcategory")
    public Set<Video> getVideos() {
        return videos;
    }

    public void setVideos(Set<Video> videos) {
        this.videos = videos;
    }

    @Id
    @Column(name = "subcategory_id")
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
