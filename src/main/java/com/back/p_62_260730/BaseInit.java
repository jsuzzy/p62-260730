package com.back.p_62_260730;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration //빈 등록을 위한 클래스
public class BaseInit {

//    @Bean
//    public Person getPerson() {
//        return new Person();
//    }

//    @Bean
//    public ApplicationRunner init(){
//        return new MyApplicationRunner();
//    }

    @Bean
    public Doctor getDoctor(){
        return new APerson();
    }

    @Bean
    public Person getPerson(){
        return new APerson();
    }

    //람다 방식: 익명 클래스를 만들어 반환(MyApplicationRunner 없어도 됨)
    @Bean
    @Order(2)
    public ApplicationRunner init() {
        return args -> System.out.println("초기 데이터를 로딩합니다");
    }
}
