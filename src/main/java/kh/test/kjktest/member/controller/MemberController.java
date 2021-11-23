package kh.test.kjktest.member.controller;

import java.util.Locale;

import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import kh.test.kjktest.member.model.service.MemberService;
import kh.test.kjktest.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	@Autowired
	MemberService memberservice;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		return "index";
	}
	
	@RequestMapping(value = "signUp", method = RequestMethod.POST)
	public String signUp(Member newmember, Model model) {
		int result = 0;
		try {
			result = memberservice.signUp(newmember);
			System.out.println(newmember);
			if (result == 1) {
				model.addAttribute("msg", "회원가입 성공");
			} else {
				model.addAttribute("msg", "회원가입 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "회원가입 고정에서 오류 발생");
		}
		return "redirect:/";
	}
}
