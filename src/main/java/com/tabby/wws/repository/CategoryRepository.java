package com.tabby.wws.repository;

import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {

    private final EntityManager em;
}
