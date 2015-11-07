package com.dk.model;

import javax.persistence.*;
import java.util.Date;

/**e
 * Created by fredrick on 9/20/15.
 */
@Entity
@Table(name = "user_login_details")
public class UserLoginDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "email", nullable = false)
    private User user;
    @Column(name = "LoginDate")
    private Date LoginDateAndTime;
    @Column(name = "LogoutDate")
    private  Date LogotDateAndTime;


    public UserLoginDetails(User user, Date loginDateAndTime, Date logotDateAndTime) {
        this.user = user;
        LoginDateAndTime = loginDateAndTime;
        LogotDateAndTime = logotDateAndTime;
    }

    public UserLoginDetails() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getLoginDateAndTime() {
        return LoginDateAndTime;
    }

    public void setLoginDateAndTime(Date loginDateAndTime) {
        LoginDateAndTime = loginDateAndTime;
    }

    public Date getLogotDateAndTime() {
        return LogotDateAndTime;
    }

    public void setLogotDateAndTime(Date logotDateAndTime) {
        LogotDateAndTime = logotDateAndTime;
    }
}
