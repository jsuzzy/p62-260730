package com.back.p_62_260730.domain.wiseSaying.entity;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //빈 등록을 위한 클래스
public class BaseInit {

    @Bean
    public Person getPerson(){
        return new Person();
    }

//    @Bean
//    public ApplicationRunner init(){
//        return new MyApplicationRunner();
//    }

    //람다 방식: 익명 클래스를 만들어 반환(MyApplicationRunner 없어도 됨)
    @Bean
    public ApplicationRunner init(){
        return args -> System.out.println("초기 데이터를 로딩합니다");
    }
}
