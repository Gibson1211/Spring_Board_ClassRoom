package com.icia.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.board.dto.BoardDTO;
import com.icia.board.repository.BoardRepository;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardRepository br;
	
	@Override
	public void save(BoardDTO board) {

		br.save(board);
				
	}

	@Override
	public List<BoardDTO> findAll() {
		List<BoardDTO>boardList=br.findAll();
		return boardList;
	}

	@Override
	public BoardDTO findById(long b_number) {
		br.hits(b_number);
		return br.findById(b_number);
	}

	@Override
	public void delete(long b_number) {
		sql.delete("Board.delete", b_number);
		br.delete(b_number);
		
	}


}
