package com.itwill.spring2.repository;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ExtendWith(SpringExtension.class)//스프링 테스트 할때만 넣어주면 된다고함. SpringExtension.class는 스프링 프레임 워크에서 JUnit테스트를 사용할때 쓰는 클래스라고 함.
//Sprint JUnit 테스트를 실행하는 메인 클래스.

@ContextConfiguration(
		locations = { "file:src/main/webapp/WEB-INF/application-context.xml" }
		)//-> 스프링 컨텍스트(환경변수)파일(들)의 경로와 파일 이름을 알려주는것.
public class PostDaoTest {

	//주입 받겠다@Autowired
	@Autowired
	private PostDao postDao; //-> 변수를 인터페이스로 선언.
	
	@Test
	public void testSelectAll() {
		Assertions.assertNotNull(postDao); //객체 생성되어있다 주장 -->단위 테스트 성공함.
		
		List<Post> list = postDao.selectOrderByIdDesc();
		for(Post p : list) {
			System.out.println(p);
		}
	}
}
