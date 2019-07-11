/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 8:06:11
 */
@Data
@Entity(name = "TB_EVT_BAG_MAIL_RELA")
@IdClass(XZPT_FFID.class)
public class XZPT_FF implements Serializable {

    @Id
    @Column
    String MAIL_NUM;
    @Id
    @Column
    String BAG_ACTN_CODE;
    @Id
    @Column
    String BAG_ID;
    @Id
    @Column
    String DEAL_ORG_CODE;
    @Column
    String MAIL_WEIGHT;
    @Id
    @Column
    String DEAL_DATE;
    @Id
    @Column
    String DEAL_TIME;
    @Id
    @Column
    String LABEL_KIND_CODE;
    @Column
    String LABEL_STRIP;
    @Column
    String DATA_SRC_SYS;
    @Column
    String SEAL_ORG_CODE;
    @Column
    String DLV_ORG_CODE;
    @Column
    String PKG_BUSI_KIND_CODE;
}
