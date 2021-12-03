package com.ferret.mcserverlog.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.Set;
@Entity
public class post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String content;

    @ManyToMany
    @JoinTable(name="post_categoryModel", joinColumns = @JoinColumn(name="post_id"),
    inverseJoinColumns = @JoinColumn(name="categoryModel_id"))
    private Set<categoryModel> categories;


    public post(String title, String content, Set<categoryModel> categories) {
        this.title = title;
        this.content = content;
        this.categories = categories;
    }

    public post() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<categoryModel> getCategories() {
        return categories;
    }

    public void setCategories(Set<categoryModel> categories) {
        this.categories = categories;
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

        post post = (post) o;

        return id != null ? id.equals(post.id) : post.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
