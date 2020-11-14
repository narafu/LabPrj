package com.lab.web.vo;

import lombok.Data;

@Data
public class ProductVO {

	private int prodId;
	private String prodNm;
	private String mfrNm;
	private String imgRoute;
	private String mfrLogo;

	private int totalSales;
	private int deptMarket;
	private int discMarket;
	private int superMarket;
	private int cvsMarket;
	private int retailMarket;
	private int etcMarket;

}
