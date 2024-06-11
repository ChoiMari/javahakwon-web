package com.itwill.spring2.repository;

import java.util.List;

public interface PostDao {

	//post-mapper.xml에서 id="selectOrderByIdDesc"인 SQL을 실행하는 메서드
	List<Post> selectOrderByIdDesc(); //-> post-mapper.xml 에서 설정한 id이름과 같은 메서드
}
