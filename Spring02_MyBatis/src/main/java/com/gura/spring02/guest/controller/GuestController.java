package com.gura.spring02.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gura.spring02.guest.dao.GuestDao;
import com.gura.spring02.guest.dto.GuestDto;
import com.gura.spring02.guest.service.GuestService;

@Controller
public class GuestController {
	
	//컨트롤러는 비즈니스 로직을 대신 처리해주는 서비스에 의존한다.
	@Autowired
	private GuestService service;
	
	//방명록 수정 요청 처리
	@RequestMapping(method =  RequestMethod.POST, value="/guest/update")
	public String update(GuestDto dto) {
		//서비스를 이용해서 글 정보를 추가한다.
		service.updateGuest(dto);
		return "guest/update";
	}
	
	@RequestMapping("/guest/updateform")
	public ModelAndView updateform(ModelAndView mView, int num) {
		//서비스를 이용해서 ModelAndView 객체에 글 하나의 정보를 담아온다.
		service.getGuestInfo(mView, num);
		//view page로 forward 이동해서 수정폼 응답하기
		mView.setViewName("guest/updateform");
		return mView;
	}
	
	
	//방명록 삭제 요청 처리
	@RequestMapping("/guest/delete")
	public String delete(GuestDto dto){
		service.deleteGuest(dto);		
		return "redirect:/guest/list";
	}
	
	//방명록 추가 폼 요청 처리
	@RequestMapping(method =  RequestMethod.POST, value="/guest/insert")
	public String insert(GuestDto dto) {
		service.addGuest(dto);
		return "guest/insert";
	}
	
	//방명록 추가 폼 요청 처리
	@RequestMapping("/guest/insertform")
	public String insertform() {
		return "guest/insertform";
	}
	
	@RequestMapping("/guest/list")
	public ModelAndView list(ModelAndView mView) {
		//서비스의 메소드를 호출해서 ModelAndView 객체의 참조값을 전달하면 방명록 목록이 담긴다.
		 service.getGuestList(mView);
		mView.setViewName("guest/list");
		
		return mView;
	}
	
	
}
