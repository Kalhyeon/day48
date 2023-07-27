package com.example.demo.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 객체를 다양하게 생성할 수 있도록 도와주는 디자인 패턴 : Builder

@Data
@Builder
@AllArgsConstructor // 모든 필드를 입력받는 생성자
@NoArgsConstructor  // 매개변수가 없는 생성자 (기본 생성자)
public class ToDo {
  private Long tno;
  private String job;
  private LocalDate writeday;
  private Boolean finish;
}

// AllArgsConstructor : ToDo(tno, job, writeday, finish)
// NoArgsConstructor : ToDo()