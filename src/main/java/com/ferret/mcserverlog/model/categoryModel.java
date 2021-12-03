package com.ferret.mcserverlog.model;

import javax.persistence.*;
import java.util.Set;
@Entity
public class categoryModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String category;

    @ManyToMany(mappedBy = "categories")
    private Set<post> posts;

    public categoryModel() {
    }

    public categoryModel(String category, Set<post> posts) {
        this.category = category;
        this.posts = posts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Set<post> getPosts() {
        return posts;
    }

    public void setPosts(Set<post> posts) {
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        categoryModel that = (categoryModel) o;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
