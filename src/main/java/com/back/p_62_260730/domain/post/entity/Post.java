package com.back.p_62_260730.domain.post.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class) //감시대상이 있다
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // int
    private String title; // varchar(255)
    private String body; // varchar(255)

    @CreatedDate //감시대상
    private LocalDateTime createDate;

    @LastModifiedDate //감시대상
    private LocalDateTime modifyDate;


    public Post(String title, String body){
        this.title = title;
        this.body = body;
        this.createDate = LocalDateTime.now();
        this.modifyDate = createDate;

    }
}