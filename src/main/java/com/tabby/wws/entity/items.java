package com.tabby.wws.entity;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.tabby.wws.entity.base.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "items")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class items extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "items_id")
    private Long id;

    // 아이템 명
    @Column(name = "items_name", nullable = false, unique = true)
    private String items_name;

    // 데미지
    @Column(name = "damage")
    private int damage;

    // 사용탄
    @Column(name = "bullet")
    private String bullet;

    // 발사모드
    @Column(name = "firing_mode")
    private String firing_mode;

    // 저지력
    @Column(name = "stopping_power")
    private int stopping_power;

    // 탄속
    @Column(name = "arrest")
    private String arrest;

    // RPM
    @Column(name = "rpm")
    private int rpm;

    // 재장전 시간
    @Column(name = "load_time")
    private int load_time;

    // DPS
    @Column(name = "dps")
    private int dps;

    // 등장 지역
    @Column(name = "spawn_area")
    private String spawn_area;

    // 여기부터 파츠 가능 여부 true : 착용 가능, false : 착용 불가능
    // 총구
    @Column(name = "parts_front")
    private boolean parts_front;
    // 손잡이
    @Column(name = "parts_knob")
    private boolean parts_knob;
    // 탄창
    @Column(name = "parts_bulletBox")
    private boolean parts_bulletBox;
    // 개머리판
    @Column(name = "parts_reverse")
    private boolean parts_reverse;
    // 조준경
    @Column(name = "parts_scope")
    private boolean parts_scope;
    // 캔티드
    @Column(name = "parts_canted")
    private boolean parts_canted;
    // 설명
    @Column(name = "items_script")
    private String items_script;

    // 엔티티 관계

}
