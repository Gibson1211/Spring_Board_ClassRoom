package com.icia.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

@Controller

@RequestMapping(value="/board/*")
public class BoardController {
	
	@Autowired
	private BoardService bs;
		
	@RequestMapping(value="save", method=RequestMethod.GET)
	public String saveForm() {
		
		return "board/save";
	}
	
	@RequestMapping(value="save", method=RequestMethod.POST)
	public String save(@ModelAttribute BoardDTO board) {
		bs.save(board);
		return "redirect:/board/findAll";
	}
	
	@RequestMapping(value="findAll", method=RequestMethod.GET)
	public String findAll(Model model) {
		List<BoardDTO>boardList=bs.findAll();
		model.addAttribute("boardList", boardList);
		return "/board/findAll";
	}
	
	@RequestMapping(value="detail", method=RequestMethod.GET)
	public String findById(@RequestParam("b_number") long b_number, Model model) {
		BoardDTO board = bs.findById(b_number);
		model.addAttribute("board", board);
		return "/board/detail";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String delete(@RequestParam("b_number") long b_number, Model model) {
		bs.delete(b_number);
		return "redirect:/board/findAll";
	}
	
	

}
