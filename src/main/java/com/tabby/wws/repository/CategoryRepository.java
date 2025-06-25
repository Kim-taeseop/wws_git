package com.tabby.wws.repository;

import com.tabby.wws.entity.Category;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

    private final EntityManager em;

    // 카테고리 추가
    public void save(Category category){
        if(category.getId() == null){
            em.persist(category);
        } else {
            em.merge(category);
        }
    }

    // 한개 조회
    public Category findOne(Long id){
        return em.find(Category.class, id);
    }
}
