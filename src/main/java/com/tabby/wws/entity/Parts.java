package com.tabby.wws.entity;

import com.tabby.wws.entity.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
총기 파츠의 정보를 저장하는 엔티티
 */

@Entity
@Table(name = "parts")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Parts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parts_id")
    private Long id;

    // 파츠명
    @Column(name = "parts_name", nullable = false, unique = true)
    private String name;

    // 설명 >> 성능
    @Column(name = "parts_script")
    private String partsScript;

    // 사용 가능한 장비
    @Column(name = "use_item")
    private String useItem;

    // 아이과와 다대일 연관관계 (양방향)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "items_id")
    private Items items;

}
