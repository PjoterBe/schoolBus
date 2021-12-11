package pl.wwsis.microblog.model;

import javax.persistence.*;

@Entity
@Table(name="Follower")
public class Follower {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="follower", nullable = true)
    private String follower;
    @Column(name="following", nullable = true)
    private String following;
    @Column(name="primary_key", nullable = true)
    private int primaryKey;


    public Follower(int id, String follower, String following, int primaryKey ) {
        this.id = id;
        this.follower = follower;
        this.following = following;
        this.primaryKey = primaryKey;

    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
    public void setFollower(String follower) {
        this.follower = follower;
    }
    public String getFollower() {
        return this.follower;
    }
    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollowing() {
        return this.following;
    }
}