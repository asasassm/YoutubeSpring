package com.web.myweb.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//롬북을 설치했기에 getter setter 필요없음
@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //오토 인크리먼트
    private long id;
    @NotNull
    @Size(min=2,max=30,message = "제목은 30자 이하입니다.")
    private String title;
    private String content;
}
