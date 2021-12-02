package com.icia.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.icia.board.dto.BoardDTO;

@Service
public interface BoardService{
	
	public void save(BoardDTO board);

	public List<BoardDTO> findAll();

	public BoardDTO findById(long b_number);

	public void delete(long b_number);
	
		
	
	}


