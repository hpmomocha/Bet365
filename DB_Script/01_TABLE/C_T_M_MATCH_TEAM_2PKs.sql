CREATE TABLE `t_m_match_team` (
  `team_id` int(11) NOT NULL COMMENT '球队ID',
  `match_id` int(11) NOT NULL COMMENT '赛事ID',
  `match_ssn_id` int(11) NOT NULL COMMENT '赛事赛季ID',
  `team_name` varchar(45) NOT NULL COMMENT '球队名',
  `team_short_name` varchar(45) NOT NULL COMMENT '球队名简称',
  `match_group` varchar(45) DEFAULT NULL COMMENT '赛事分组',
  `knkt_match_rival` varchar(45) DEFAULT NULL COMMENT '淘汰赛对手球队',
  `team_standing` varchar(45) DEFAULT NULL COMMENT '球队战绩名次',
  PRIMARY KEY (`team_id`,`match_id`),
  KEY `fk_match_team_bet_tgt_match_idx` (`match_id`),
  KEY `fk_match_team_match_session_idx` (`match_ssn_id`),
  CONSTRAINT `fk_match_team_bet_tgt_match` FOREIGN KEY (`match_id`) REFERENCES `t_m_bet_tgt_match` (`match_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_match_team_match_session` FOREIGN KEY (`match_ssn_id`) REFERENCES `t_m_match_season` (`match_ssn_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='赛季球队一览'