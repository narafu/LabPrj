package com.lab.web.dto;

import lombok.Data;

@Data
public class Pager {

	/* 현재페이지 번호 */
	private int cntPageNo = 1;

	/* 페이지당 출력할 데이터 갯수 */
	private int pageRecord = 20;

	/* 표시할 페이지 수 */
	private int pageSize = 5;

	/* 검색 유형 */
	private String schType;

	/* 검색어 */
	private String schContent;

}
