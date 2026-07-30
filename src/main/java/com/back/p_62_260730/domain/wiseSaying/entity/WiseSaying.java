package com.back.p_62_260730.domain.wiseSaying.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity //JPA가 db에 클래스에 해당하는 테이블 생성
@NoArgsConstructor //JPA에는 무조건 필요?
public class WiseSaying {
    @Id //식별하고자 하는 데이터 위에 붙임
    private int id; // int
    private String content; // varchar(255)
    private String author; // varchar(255)
}