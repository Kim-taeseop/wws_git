package com.tabby.wws.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
무기류, 투척류 등 카테고리를 분류하는 엔티티
 */

@Entity
@Table(name = "category")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

    // 카테고리 명
    @Column(name = "category_name", nullable = false, unique = true)
    private String name;

    // 사용 가능한 칸 (1~5) (1:주무기  3:보조무기  4:근접무기  5:투척무기)
    @Column(name = "use_number", nullable = false)
    private int useNumber;

    // 설명
    @Column(name = "category_script")
    private String categoryScript;

    // 엔티티 관계 아이템과 1:N

}
