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
 * @date 2018-7-31 14:41:30
 */
@Data
@Entity(name = "TB_EVT_MAIL_CLCT")
@IdClass(XiazaipingtaiID.class)
public class Xiazaipingtai implements Serializable  {
    @Column
    @Id
    String MAIL_NUM;
    @Column
    @Id
    String CLCT_BUREAU_ORG_CODE;
    @Column
    @Id
    String CLCT_DATE;
    @Column
    @Id
    String CLCT_TIME;
    @Column
    String CLCT_BUREAU_POST_CODE;
    @Column
    String RCV_AREA;
    @Column
    String ACTUAL_WEIGHT;
    @Column
    String VOL_WEIGHT;
    @Column
    String BILLING_WEIGHT;
    @Column
    String BASIC_FEE;
    @Column
    String SHOULD_PAY_TOTAL_FEE;
    @Column
    String ACTUAL_TOTAL_FEE;
    @Column
    String CANT_DLV_DEAL_MODE_CODE;
    @Column
    String TRANS_MODE_CODE;
    @Column
    String SENDER_NAME;
    @Column
    String SENDER_DEPT_NAME;
    @Column
    String SENDER_ADDR;
    @Column
    String SENDER_CONTACT_PHONE;
    @Column
    String SENDER_HOME_AREA_NAME;
    @Column
    String SENDER_POST_CODE;
    @Column
    String RCVER_NAME;
    @Column
    String RCVER_ADDR;
    @Column
    String RCVER_CONTACT_PHONE;
    @Column
    String RCVER_DEPT_NAME;
    @Column
    String RCVER_HOME_AREA_NAME;
    @Column
    String RCVER_POST_CODE;
    @Column
    String SENDER_CUST_CODE;
    @Column
    String PROD_CODE;
    @Column
    String MAIL_KIND_CODE;
    @Column
    String MAIL_PRPTY_CODE;
    @Column
    String FEEDBACK_MODE_CODE;
    @Column
    String TIME_LIMIT_CODE;
    @Column
    String PAY_SIDE_CODE;
    @Column
    String DUTY_CODE;
    @Column
    String ADDI_SERVICE_CODE;
    @Column
    String DLV_AREA_CODE;
    @Column
    String BUSI_KIND_CODE;
    @Column
    String SETLMT_MODE_CODE;
   
    @Column
    String CLCT_STAFF_CODE;
    @Column
    String OPERATOR_CODE;
    @Column
    String CLCT_STAFF_NAME;
    @Column
    String OPERATOR_NAME;
    @Column
    String RCPT_INVOICE_NUM;
    @Column
    String APPLY_CHK_FLAG;
    @Column
    String INITIATIVE_FEEDBACK_FLAG;
    @Column
    String FEEDBACK_PARA;
    @Column
    String PART_KIND_QUAN;
    @Column
    String ATTACH_LIST_QUAN;
    @Column
    String YPDJ_QUAN;
    @Column
    String DZZ_NUM;
    @Column
    String INTER_FLAG;
   
    @Column
    String DATA_SRC_SYS;
    
}
