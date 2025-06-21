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
public class Changes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "changes_id")
    private Long id;

    @Column(name = "comment")
    private String comment;


    // 아이템과 다대일 연관관계 (단방향)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "items_id")
    private Items items;

    // 파츠와 다대일 연관관계 (단방향)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parts_id")
    private Parts parts;

}
