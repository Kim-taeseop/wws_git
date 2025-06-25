package com.tabby.wws.repository;

import com.tabby.wws.entity.Changes;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChangesRepository {

    private final EntityManager em;

    // 신규 내용
    public void save(Changes changes){
        if(changes.getId() == null){
            em.persist(changes);
        } else{
            em.merge(changes);
        }
    }
}
