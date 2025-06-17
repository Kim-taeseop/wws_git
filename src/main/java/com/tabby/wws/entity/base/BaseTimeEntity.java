package com.tabby.wws.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString  // 오버라이드 하는 역할
@MappedSuperclass       // JPA 상속용 클래스, 테이블을 생성하지 않음.
@EntityListeners(AuditingEntityListener.class)      // 엔티티의 수정, 생성을 감지해서 자동으로 값을 바꿔주는 역할
public class BaseTimeEntity {

    @CreatedDate
    @Column(name = "create_date",updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "update_date")
    private LocalDateTime updatedAt;
}
