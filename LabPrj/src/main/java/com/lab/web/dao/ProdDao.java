package com.lab.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.lab.web.vo.Code;
import com.lab.web.vo.ProductVO;

@Mapper
public interface ProdDao {

	/* prod-menu */
	@Select("SELECT * FROM CodeDetail WHERE codeNm = 'prodMenu'")
	public List<Code> selectProdMenu();
	
	/* prod-list */
	@Select("SELECT * FROM ProductView ORDER BY prodNm ASC LIMIT 0, 20")
	public List<ProductVO> selectProdList();

	/* ranking-list */
	@Select("SELECT * FROM ProductView ORDER BY totalSales DESC LIMIT 10")
	public List<ProductVO> selectRankingList();

}