package com.tabby.wws.service;

import com.tabby.wws.entity.Parts;
import com.tabby.wws.repository.PartsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PartsService {

    private final PartsRepository partsRepository;

    // 파츠 등록 및 수정
    @Transactional
    public void saveParts(Parts parts){
        partsRepository.save(parts);
    }

    // 파츠 삭제
    @Transactional
    public void removeParts(Parts parts){
        partsRepository.remove(parts);
    }

    // 파츠 단건 조회
    public Parts findOneParts(Long partsId){
        return partsRepository.findOne(partsId);
    }

    // 파츠 전체 조회
    public List<Parts> findAllParts(){
        return partsRepository.findAll();
    }

    // 파츠 이름으로 조회
    public List<Parts> findByName(String partsName){
        return partsRepository.findByName(partsName);
    }
}
