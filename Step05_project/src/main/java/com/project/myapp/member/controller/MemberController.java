package com.project.myapp.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.myapp.member.dto.MemberDto;
import com.project.myapp.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@RequestMapping("/member/list")
	public String list(HttpServletRequest request) {
		service.getList(request);
		return "member/list";
		}
	
	@RequestMapping(value = "/member/detail", method = RequestMethod.GET)
	public ModelAndView detail(ModelAndView mView, int num) {
		//갤러리 detail 페이지에 필요한 data를 num 으로 가져와, ModelAndView 에 저장
		service.getDetail(mView, num);
		mView.setViewName("member/detail");
		
		return mView;
	}	
	
	@RequestMapping("/member/upload_form")
	public String uploadForm() {
		
		return "member/upload_form";
	}
	
	
	
	   @RequestMapping(method = RequestMethod.POST, value = "/member/upload")
	   public String upload(MemberDto dto, HttpSession session,  HttpServletRequest request) {
	      //글 작성자는 세션에서 얻어낸다.
	      String writer=(String)session.getAttribute("id");
	      //dto 는 글의 제목과 내용만 있으므로 글작성자는 직접 넣어준다.
	      dto.setWriter(writer);
	      //서비스를 이용해서 새글을 저장한다.
	      service.saveContent(dto , request);
	      return "member/upload";
	   }
	   
	
}
