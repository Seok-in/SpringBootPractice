package com.ssafy.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.web.service.MemberService;
import com.ssafy.web.vo.MemberVO;

@RestController
@RequestMapping("html")
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@PostMapping("memberInsert")
	public String memberInsert(MemberVO vo) {
		memberService.memberInsert(vo);
		return "ok";
	}
}
