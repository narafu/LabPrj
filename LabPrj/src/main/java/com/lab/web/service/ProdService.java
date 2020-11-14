package com.lab.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.web.dao.ProdDao;
import com.lab.web.vo.Code;
import com.lab.web.vo.ProductVO;

@Service
public class ProdService {

	@Autowired
	private ProdDao prodDao;

	public List<ProductVO> selectProdList() {

//		int cnt = pager.getCntPageNo();
//		int size = pager.getPageRecord();
//		int startNo = (cnt - 1) * size;

		return prodDao.selectProdList();
	}

	public List<Code> selectProdMenu() {
		return prodDao.selectProdMenu();
	}

	public List<ProductVO> selectRankingList() {
		return prodDao.selectRankingList();
	}

}