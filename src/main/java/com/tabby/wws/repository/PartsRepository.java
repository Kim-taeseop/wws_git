package com.tabby.wws.repository;

import com.tabby.wws.entity.Parts;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PartsRepository {

    private final EntityManager em;

    // 신규 파츠 등색
    public void save(Parts parts) {
        if(parts.getId() == null){
            em.persist(parts);
        } else {
            em.merge(parts);
        }
    }

    // 파츠 삭제
    public void remove(Parts parts){
        em.remove(parts);
    }

    // 단건 조회
    public Parts findOne(Long id){
        return em.find(Parts.class, id);
    }

    // 전체 조회
    public List<Parts> findAll() {
        return em.createQuery("selct p from Parts p", Parts.class)
                .getResultList();
    }

    // 파츠 이름으로 조회
    public List<Parts> findByName(String name) {
        return em.createQuery("select p from Parts p where lower(p.name) like lower(:name)", Parts.class)
                .setParameter("name", "%" + name + "%").getResultList();
    }
}
