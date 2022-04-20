package com.ssafy.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ssafy.web.vo.MemberVO;

@Repository
@Mapper
public interface MemberDAO {

	void memberInsert(MemberVO vo);

}
