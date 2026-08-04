package com.back.p_62_260730.domain.post.post.entity;

import com.back.p_62_260730.domain.post.member.entity.Member;
import com.back.p_62_260730.global.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
public class Post extends BaseEntity {
    private String title; // varchar(255)
    private String body; // varchar(255)
//    private int authorId; //작성자 외래키

    @ManyToOne
    private Member author;

    public Post( Member author, String title, String body){
        this.title = title;
        this.body = body;
        this.author = author;
    }

    public void modify(String title, String body){
        this.title = title;
        this.body = body;
    }
}