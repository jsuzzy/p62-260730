package com.back.p_62_260730.domain.post.service;

import com.back.p_62_260730.domain.post.entity.Post;
import com.back.p_62_260730.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post write(String title, String body){
        Post post1 = new Post(title, body);
        return postRepository.save(post1); //insert into ... => sql db 반영하려면 commit
        //기본적으로 jpa가 제공하는 기능은 그 자체로 트랜잭션 범위를 갖는다.

    }

    public void modify(Post post, String title, String body) {
        post.setTitle(title);
        post.setBody(body);
        postRepository.save(post);
    }

    public void delete(Post post) {
        postRepository.delete(post);
    }

    public Optional<Post> findById(int id){
        return postRepository.findById(id); // 트랜잭션 시작 -> select * form post -> 트랜잭션 종료 -> commit
        //repository가 제공하는 메서드 단위로 트랜잭션이 잡힘
    }

    public long count(){
        return postRepository.count();
    }


}
