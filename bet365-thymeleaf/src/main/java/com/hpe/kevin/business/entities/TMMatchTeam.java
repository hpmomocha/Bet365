package com.hpe.kevin.business.entities;
// Generated 2017/12/20 14:07:38 by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * TMMatchTeam generated by hbm2java
 */
@Entity
@Table(name = "t_m_match_team")
public class TMMatchTeam implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4509815310598036604L;
	
	@EmbeddedId
	private TMMatchTeamId id;
	
	@Transient
	private int teamId;
	
	@OneToOne
	@JoinColumn(name = "match_id", insertable = false, updatable = false)
	private TMBetTgtMatch TMBetTgtMatch;
	
	@OneToOne
	@JoinColumn(name = "match_ssn_id")
	private TMMatchSeason TMMatchSeason;
	
	@Column(name = "team_name")
	private String teamName;
	
	@Column(name = "team_short_name")
	private String teamShortName;
	
	@Column(name = "match_group")
	private String matchGroup;
	
	@Column(name = "knkt_match_rival")
	private String knktMatchRival;
	
	@Column(name = "team_standing")
	private String teamStanding;

	public TMMatchTeam() {
	}

	public TMMatchTeam(TMMatchTeamId id, TMBetTgtMatch TMBetTgtMatch, TMMatchSeason TMMatchSeason, String teamName,
			String teamShortName, String matchGroup, String knktMatchRival, String teamStanding) {
		this.id = id;
		this.TMBetTgtMatch = TMBetTgtMatch;
		this.TMMatchSeason = TMMatchSeason;
		this.teamName = teamName;
		this.teamShortName = teamShortName;
		this.matchGroup = matchGroup;
		this.knktMatchRival = knktMatchRival;
		this.teamStanding = teamStanding;
	}

	public TMMatchTeamId getId() {
		return this.id;
	}

	public void setId(TMMatchTeamId id) {
		this.id = id;
	}

	public TMBetTgtMatch getTMBetTgtMatch() {
		return this.TMBetTgtMatch;
	}

	public void setTMBetTgtMatch(TMBetTgtMatch TMBetTgtMatch) {
		this.TMBetTgtMatch = TMBetTgtMatch;
	}

	public TMMatchSeason getTMMatchSeason() {
		return this.TMMatchSeason;
	}

	public void setTMMatchSeason(TMMatchSeason TMMatchSeason) {
		this.TMMatchSeason = TMMatchSeason;
	}

	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamShortName() {
		return this.teamShortName;
	}

	public void setTeamShortName(String teamShortName) {
		this.teamShortName = teamShortName;
	}

	public String getMatchGroup() {
		return this.matchGroup;
	}

	public void setMatchGroup(String matchGroup) {
		this.matchGroup = matchGroup;
	}

	public String getKnktMatchRival() {
		return this.knktMatchRival;
	}

	public void setKnktMatchRival(String knktMatchRival) {
		this.knktMatchRival = knktMatchRival;
	}

	public String getTeamStanding() {
		return this.teamStanding;
	}

	public void setTeamStanding(String teamStanding) {
		this.teamStanding = teamStanding;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	
}
