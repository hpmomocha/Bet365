package com.hpe.kevin.business.entities;
// Generated 2017/12/20 14:07:38 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	
	@EmbeddedId
	private TOrderDetailId id;
	
	@OneToOne
	@JoinColumn(name = "bet_tgt_match_id")
	private TMBetTgtMatch TMBetTgtMatch;
	
	@OneToOne
	@JoinColumn(name = "bet_type_id")
	private TMEarlyStageBetType TMEarlyStageBetType;
	
	@OneToOne
	@JoinColumn(name = "match_ssn_id")
	private TMMatchSeason TMMatchSeason;
	
//	@OneToOne
//	@JoinColumn(name="bet_tgt_team_id")
//	private TMMatchTeam tMMatchTeam;
//	
	@Column(name = "bet_tgt_team_id")
	private int betTgtTeamId;
	
	@Column(name = "return_rate")
	private double returnRate;
	
	@Column(name = "is_closed")
	private Byte isClosed;

	public TOrderDetail() {
	}

	public TOrderDetail(TOrderDetailId id, com.hpe.kevin.business.entities.TMBetTgtMatch tMBetTgtMatch,
			com.hpe.kevin.business.entities.TMEarlyStageBetType tMEarlyStageBetType,
			com.hpe.kevin.business.entities.TMMatchSeason tMMatchSeason, int betTgtTeamId, double returnRate,
			Byte isClosed) {
		super();
		this.id = id;
		TMBetTgtMatch = tMBetTgtMatch;
		TMEarlyStageBetType = tMEarlyStageBetType;
		TMMatchSeason = tMMatchSeason;
		this.betTgtTeamId = betTgtTeamId;
		this.returnRate = returnRate;
		this.isClosed = isClosed;
	}
//	public TOrderDetail(TOrderDetailId id, com.hpe.kevin.business.entities.TMBetTgtMatch tMBetTgtMatch,
//			com.hpe.kevin.business.entities.TMEarlyStageBetType tMEarlyStageBetType,
//			com.hpe.kevin.business.entities.TMMatchSeason tMMatchSeason, TMMatchTeam tMMatchTeam, double returnRate,
//			Byte isClosed) {
//		super();
//		this.id = id;
//		TMBetTgtMatch = tMBetTgtMatch;
//		TMEarlyStageBetType = tMEarlyStageBetType;
//		TMMatchSeason = tMMatchSeason;
//		this.tMMatchTeam = tMMatchTeam;
//		this.returnRate = returnRate;
//		this.isClosed = isClosed;
//	}


//	public TMMatchTeam gettMMatchTeam() {
//		return tMMatchTeam;
//	}
//
//
//	public void settMMatchTeam(TMMatchTeam tMMatchTeam) {
//		this.tMMatchTeam = tMMatchTeam;
//	}


	public TOrderDetailId getId() {
		return this.id;
	}

	public void setId(TOrderDetailId id) {
		this.id = id;
	}

	public TMBetTgtMatch getTMBetTgtMatch() {
		return this.TMBetTgtMatch;
	}

	public void setTMBetTgtMatch(TMBetTgtMatch TMBetTgtMatch) {
		this.TMBetTgtMatch = TMBetTgtMatch;
	}

	public TMEarlyStageBetType getTMEarlyStageBetType() {
		return this.TMEarlyStageBetType;
	}

	public void setTMEarlyStageBetType(TMEarlyStageBetType TMEarlyStageBetType) {
		this.TMEarlyStageBetType = TMEarlyStageBetType;
	}

	public TMMatchSeason getTMMatchSeason() {
		return this.TMMatchSeason;
	}

	public void setTMMatchSeason(TMMatchSeason TMMatchSeason) {
		this.TMMatchSeason = TMMatchSeason;
	}

//	public TMMatchTeam getTMMatchTeam() {
//		return this.TMMatchTeam;
//	}
//
//	public void setTMMatchTeam(TMMatchTeam TMMatchTeam) {
//		this.TMMatchTeam = TMMatchTeam;
//	}

	public double getReturnRate() {
		return this.returnRate;
	}

	public void setReturnRate(double returnRate) {
		this.returnRate = returnRate;
	}

	public Byte getIsClosed() {
		return this.isClosed;
	}

	public void setIsClosed(Byte isClosed) {
		this.isClosed = isClosed;
	}

//	public int getBetTgtTeamId() {
//		return betTgtTeamId;
//	}
//
//	public void setBetTgtTeamId(int betTgtTeamId) {
//		this.betTgtTeamId = betTgtTeamId;
//	}

}
