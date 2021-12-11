package pl.wwsis.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="user")
public class User {


    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int user_Id;
    @Column (name="user_name", nullable = false)
    private String userName;
    @Column (name="user_surname", nullable = false)
    private String userSurname;
    @Column (name="user_email", nullable = false)
    private String email;
    @Column (name="user_paassword", nullable = false)
    private String paassword;
    @Column (name="join_Date", nullable = false)
    private Timestamp joinDate;

    public User(int userId, String userName,  String userSurname, String email,  String paassword, Timestamp joinDate) {
        this.user_Id = userId;
        this.userSurname = userSurname;
        this.email = email;
        this.userName = userName;
        this.paassword = paassword;
        this.joinDate = joinDate;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPaassword() {
        return paassword;
    }

    public void setPaassword(String paassword) {
        this.paassword = paassword;
    }

    public Timestamp getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Timestamp joinDate) {
        this.joinDate = joinDate;
    }
}