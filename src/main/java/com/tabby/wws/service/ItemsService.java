package com.tabby.wws.service;

import com.tabby.wws.entity.Items;
import com.tabby.wws.repository.ItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemsService {

    private final ItemsRepository itemsRepository;

    // 아이템 등록 및 수정
    @Transactional
    public void saveItems(Items items){
        itemsRepository.save(items);
    }

    // 아이템 삭제
    @Transactional
    public void removeItems(Items items){
        itemsRepository.remove(items);
    }

    // 아이템 단건 조회
    public Items findOneItems(Long itemsId){
        return itemsRepository.findOne(itemsId);
    }

    // 아이템 전체 조회
    public List<Items> findAllItems() {
        return itemsRepository.findAll();
    }

    // 아이템 이름으로 검색
    public List<Items> findByNameItems(String itemsName){
        return itemsRepository.findByName(itemsName);
    }

}
