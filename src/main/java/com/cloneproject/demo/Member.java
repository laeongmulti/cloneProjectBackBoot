package com.cloneproject.demo;

/**
 * 이 페이지는 DB에 있는거 그대로 따라하면 됨
 */

// 필수
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//유틸
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@ToString
public class Member {
  //auto increment
  @Id @GeneratedValue( strategy =  GenerationType.IDENTITY)
  public Long id;

  public String name; //이름
  public String email;  //이메일
  public String pwd; //sha256
  public LocalDateTime join; //회원가입일
}
