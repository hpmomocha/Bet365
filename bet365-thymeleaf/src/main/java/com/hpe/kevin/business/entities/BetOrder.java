/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2016, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package com.hpe.kevin.business.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BetOrder implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2292485125442960992L;
	// 投注日期
	private Date orderDate;
	// 过关方式
	private String betTgtMatches;
	// 投注本金
	private Double orderPrpl;
	// 预计返奖
	private Double estmBonus;
	// 投注单详情
	private List<TOrderDetail> orderDetailList = new ArrayList<TOrderDetail>();
	
	public BetOrder() {
		super();
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getBetTgtMatches() {
		return betTgtMatches;
	}
	public void setBetTgtMatches(String betTgtMatches) {
		this.betTgtMatches = betTgtMatches;
	}
	public Double getOrderPrpl() {
		return orderPrpl;
	}
	public void setOrderPrpl(Double orderPrpl) {
		this.orderPrpl = orderPrpl;
	}
	public Double getEstmBonus() {
		return estmBonus;
	}
	public void setEstmBonus(Double estmBonus) {
		this.estmBonus = estmBonus;
	}

	public List<TOrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<TOrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
}