CREATE TABLE `t_m_bet_tgt_match` (
  `match_id` int(11) NOT NULL COMMENT '赛事ID',
  `match_name` varchar(45) NOT NULL COMMENT '赛事名称',
  `match_short_name` varchar(45) NOT NULL COMMENT '赛事简称',
  `match_belongs_in_cy_id` int(11) NOT NULL COMMENT '赛事所属国家ID',
  `match_ssn_id` int(11) NOT NULL COMMENT '赛事赛季ID',
  `match_crrt_stage` varchar(45) DEFAULT NULL COMMENT '赛事当前阶段',
  `match_category` int(11) NOT NULL COMMENT '赛事分类',
  PRIMARY KEY (`match_id`),
  KEY `fk_bet_tgt_match_match_session_idx` (`match_ssn_id`),
  KEY `fk_bet_tgt_match_match_country_idx` (`match_belongs_in_cy_id`),
  KEY `fk_bet_tgt_match_match_category_idx` (`match_category`),
  CONSTRAINT `fk_bet_tgt_match_match_category` FOREIGN KEY (`match_category`) REFERENCES `t_m_match_category` (`match_category_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bet_tgt_match_match_country` FOREIGN KEY (`match_belongs_in_cy_id`) REFERENCES `t_m_match_country` (`match_cy_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bet_tgt_match_match_session` FOREIGN KEY (`match_ssn_id`) REFERENCES `t_m_match_season` (`match_ssn_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投注对象赛事一览表'