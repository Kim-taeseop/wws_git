package com.tabby.wws.repository;

import com.tabby.wws.entity.Items;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemsRepository {

    private final EntityManager em;

    // 아이템 등록 및 수정
    public void save(Items items) {
        if(items.getId() == null){
            em.persist(items);
        } else{
            em.merge(items);
        }
    }

    // 아이템 삭제
    public void remove(Items items){
        em.remove(items);
    }

    // 아이템 단건 조회
    public Items findOne(Long id){
        return em.find(Items.class, id);
    }

    // 아이템 리스트 조회
    public List<Items> findAll() {
        return em.createQuery( "select i from Items i" , Items.class)
                .getResultList();
    }

    // 아이템 이름으로 조회 ( 검색어 포함된 단어)
    public List<Items> findByName(String name) {
        return em.createQuery("select i from Items i where lower(i.name) like lower(:name)", Items.class)
                .setParameter("name", "%" + name + "%").getResultList();
    }
}
