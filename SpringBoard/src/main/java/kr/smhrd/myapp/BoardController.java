package kr.smhrd.myapp;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.smhrd.domain.Board;

@Controller
//@Controller : Spring MVC 프로젝트에서 컨트롤러 역할을 할 수 있도록 지정
// 주로 View를 반환하기 위해 사용
public class BoardController {
	// 게시판리스트 요청받는 메서드
	//RequestMapping : 특정 URI로 온 요청 처리 방식 정의
	@RequestMapping("/boardList.do")
	public String boardList(HttpServletRequest request) {
		ArrayList<Board> list = new ArrayList<Board>();
		
		Board vo = new Board();
		
		vo.setIdx(1);
		vo.setTitle("스프링게시판");
		vo.setContent("게시판 내용");
		vo.setWriter("관리자");
		vo.setIndate("2022-04-17");
		vo.setCount(0);
		
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		request.setAttribute("list",list);
		
		//return "/WEB-INF/views/boardList.jsp";
		return "boardList";
	}
}
