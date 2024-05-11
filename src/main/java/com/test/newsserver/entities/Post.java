package com.test.newsserver.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Content", length =5000)
    private String content;

    @Column(name = "Postby")
    private String postby;

    @Column(name = "Img")
    private String img;

    @Column(name = "Date")
    private Date date;

    @Column(name = "`Likecount`")
    private int likecount ;

    @Column(name = "Viewcount")
    private int viewcount;

    @Column(name = "Tags")
    private String tags;
}
