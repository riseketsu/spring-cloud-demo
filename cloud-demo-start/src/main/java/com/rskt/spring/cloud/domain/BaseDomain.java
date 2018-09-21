/**
 * Copyright © 2018 RSKT. All rights reserved. 
 */
package com.rskt.spring.cloud.domain;

/**
 * Class:BaseDomain.java<br>
 *
 * Class Summary：<br>
 * 
 * Class Feature:<br>
 *
 * @Author SHIJIELI
 * @CreateDate 2018-09-21
 */
public class BaseDomain {

	/** 数据删除标识 0：正常 1：删除 */
	private String deleteFlg;

	/**
	 * deleteFlg Get Method.
	 * 
	 * @return the deleteFlg
	 */
	public String getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * deleteFlg Set Method.
	 * 
	 * @param deleteFlg the deleteFlg to set
	 */
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
