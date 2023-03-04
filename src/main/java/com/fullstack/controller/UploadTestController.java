package com.fullstack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UploadTestController {
	@GetMapping("/uploadEx")
	public void uploadEx() {
	//view resolver 뷰어를 찾는 객체 이름이 리절버임 에러에 못찾겟다고하면 mapping경로를 못찾는다는거임	
	}
}
