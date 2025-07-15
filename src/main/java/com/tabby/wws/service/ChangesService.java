package com.tabby.wws.service;

import com.tabby.wws.entity.Changes;
import com.tabby.wws.repository.ChangesRepository;
import com.tabby.wws.repository.ItemsRepository;
import com.tabby.wws.repository.PartsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ChangesService {

    private final ChangesRepository changesRepository;

    // 변경 사항 저장
    public void saveChanges(Changes changes){
        changesRepository.save(changes);
    }
}
