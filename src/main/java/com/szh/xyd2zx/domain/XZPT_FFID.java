/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 8:06:47
 */
@Data
public class XZPT_FFID implements Serializable{

    String MAIL_NUM;
    String BAG_ACTN_CODE;
    String BAG_ID;
    String DEAL_ORG_CODE;
    String DEAL_DATE;
    String DEAL_TIME;
    String LABEL_KIND_CODE;
}
