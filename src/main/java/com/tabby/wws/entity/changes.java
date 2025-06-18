package com.tabby.wws.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
패치로 인한 아이템, 파츠 등의 변경점을 저장하는 엔티티
 */

@Entity
@Table(name = "changes")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class changes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "changes_id")
    private Long id;
}
