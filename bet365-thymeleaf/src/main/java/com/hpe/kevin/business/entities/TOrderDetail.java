package com.hpe.kevin.business.entities;
// Generated 2017/12/20 14:07:38 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * TOrderDetail generated by hbm2java
 */
@Entity
@Table(name = "t_order_detail")
public class TOrderDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3275613444242907126L;
	
	@Id
	@Column(name = "order_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailId;
	
	@OneToOne
	@JoinColumn(name = "bet_tgt_match_id")
	private TMBetTgtMatch tMBetTgtMatch;
	
	@OneToOne
	@JoinColumn(name = "bet_type_id")
	private TMEarlyStageBetType tMEarlyStageBetType;
	
	@OneToOne
	@JoinColumn(name = "match_ssn_id")
	private TMMatchSeason tMMatchSeason;
	
	@OneToOne
	@JoinColumn(name = "bet_tgt_team_id")
	private TMMatchTeam tMMatchTeam;
	
	@Column(name = "return_rate")
	private double returnRate;
	
	@Column(name = "is_closed")
	private String isClosed;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	// @JoinColumn indicates the entity is the owner of the relationship: 
	// the corresponding table has a column with a foreign key to the referenced table. 
	private TOrder tOrder;
	
	@Transient
	// 赛事区域
	private TMGlobalMatch globalMatch;
	
	@Transient
	// 赛事类型
	private TMMatchCategory matchCatetory;
	
	@Transient
	// 赛事类型
	private TMMatchCountry matchCountry;
	
	
	public TOrderDetail() {
	}


	public TMMatchTeam gettMMatchTeam() {
		return tMMatchTeam;
	}


	public void settMMatchTeam(TMMatchTeam tMMatchTeam) {
		this.tMMatchTeam = tMMatchTeam;
	}

	public TMBetTgtMatch getTMBetTgtMatch() {
		return this.tMBetTgtMatch;
	}

	public void setTMBetTgtMatch(TMBetTgtMatch tMBetTgtMatch) {
		this.tMBetTgtMatch = tMBetTgtMatch;
	}

	public TMEarlyStageBetType getTMEarlyStageBetType() {
		return this.tMEarlyStageBetType;
	}

	public void setTMEarlyStageBetType(TMEarlyStageBetType tMEarlyStageBetType) {
		this.tMEarlyStageBetType = tMEarlyStageBetType;
	}

	public TMMatchSeason getTMMatchSeason() {
		return this.tMMatchSeason;
	}

	public void setTMMatchSeason(TMMatchSeason tMMatchSeason) {
		this.tMMatchSeason = tMMatchSeason;
	}

	public double getReturnRate() {
		return this.returnRate;
	}

	public void setReturnRate(double returnRate) {
		this.returnRate = returnRate;
	}

	public String getIsClosed() {
		return this.isClosed;
	}

	public void setIsClosed(String isClosed) {
		this.isClosed = isClosed;
	}

	public TMGlobalMatch getGlobalMatch() {
		return globalMatch;
	}

	public void setGlobalMatch(TMGlobalMatch globalMatch) {
		this.globalMatch = globalMatch;
	}

	public TMMatchCategory getMatchCatetory() {
		return matchCatetory;
	}

	public void setMatchCatetory(TMMatchCategory matchCatetory) {
		this.matchCatetory = matchCatetory;
	}

	public TMMatchCountry getMatchCountry() {
		return matchCountry;
	}

	public void setMatchCountry(TMMatchCountry matchCountry) {
		this.matchCountry = matchCountry;
	}


	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public TOrder getTOrder() {
		return tOrder;
	}

	public void setTOrder(TOrder tOrder) {
		this.tOrder = tOrder;
	}

}
