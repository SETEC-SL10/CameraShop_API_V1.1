package com.setec_ecomerce.repository.products.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PageForm {
	
	//@JsonProperty("COLUMNNAME")
	private String columnName;
	//@JsonProperty("CONDITIONVALUE")
	private String conditionValue;
	//@JsonProperty("LIMIT")
	private int limit;
	//@JsonProperty("PAGE")
	private int page;

	
	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getConditionValue() {
		return conditionValue;
	}

	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	
}
