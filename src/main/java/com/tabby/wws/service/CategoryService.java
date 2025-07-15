package com.tabby.wws.service;

import com.tabby.wws.entity.Category;
import com.tabby.wws.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true) // 조회만 가능
@RequiredArgsConstructor // 필드 선언만 해도 final 로 된 생성자를 만들어줌
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // 카테고리 생성
    @Transactional
    public void saveCategory(Category category){
        categoryRepository.save(category);
    }

    // 카테고리 삭제
    @Transactional
    public void removeCategory(Category category){
        categoryRepository.remove(category);
    }
}
