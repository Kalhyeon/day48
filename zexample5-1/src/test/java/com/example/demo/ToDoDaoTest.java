package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.entity.ToDo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ToDoDaoTest {
  @Autowired
  ToDoDao toDoDao;
  
//  @Test
  public void test1() {
//    assertEquals(결과값, 내가 원한 값);
//    => 성공하면 초록색, 아니면 빨간색
    assertNotEquals(toDoDao, null);
  }
  
//  테스트에서 @Transactional 은 테스트가 끝난 다음 rollback 한다.
//  콘솔에 rollback 된 것이 표시되지는 않는다.
//  @Transactional
//  @Test
  public void insertTest() {
//    Builder : 상황별로 생성자를 모두 만들지 않아도
//              사용자가 원하는 대로 객체를 생성할 수 있다.
    ToDo toDo = ToDo.builder().job("영억 공부").build();
    assertEquals(toDoDao.save(toDo), 1);
  }
  
//  @Test
  public void updateTest() {
    assertNotEquals(toDoDao.update(1L), 0);
  }
  
  @Transactional
  @Test
  public void deleteTest() {
    assertNotEquals(toDoDao.delete(1L), 0);
  }
  
}
