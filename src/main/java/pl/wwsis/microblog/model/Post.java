package pl.wwsis.microblog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="Post_time", nullable = false)
    private Timestamp postTime;

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="content", nullable = false)
    private String content;

    public Post(int id, Timestamp postTime, String username, String content) {
        this.id = id;
        this.postTime = postTime;
        this.username = username;
        this.content = content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }


    public Timestamp getPostTime() {
        return this.postTime;
    }


    public String getUsername() {
        return this.username;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}