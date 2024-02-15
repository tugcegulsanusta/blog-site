package com.pinsoft.blogsite.resolver;

import com.pinsoft.blogsite.dto.PostDto;
import com.pinsoft.blogsite.entity.Category;
import com.pinsoft.blogsite.entity.Post;
import com.pinsoft.blogsite.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
@Component
@RequiredArgsConstructor
public class PostResolver {
    @Autowired
    private PostRepository postRepository;
    @QueryMapping
    public List<Post> getPostsByHeader(@Argument String header){
        return postRepository.getByHeader(header);
    }

    @MutationMapping
    public Post createPost(@Argument(value = "post") PostDto postDto){
        Post post = new Post();
        post.setHeader(post.getHeader());
        post.setContent(post.getContent());
        post.setBase64img(post.getBase64img());

        return postRepository.save(post);
    }
}
