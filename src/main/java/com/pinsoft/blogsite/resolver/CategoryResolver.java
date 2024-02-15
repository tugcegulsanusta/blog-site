package com.pinsoft.blogsite.resolver;

import com.pinsoft.blogsite.entity.Category;
import com.pinsoft.blogsite.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
@Controller
@RequiredArgsConstructor
public class CategoryResolver {
    @Autowired
    private CategoryRepository categoryRepository;
    @MutationMapping
    public Category createCategory(@Argument String name){
        Category category = new Category();
        category.setName(name);
        return categoryRepository.save(category);
    }
}
