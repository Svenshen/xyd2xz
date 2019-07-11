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
 * @date 2018-8-3 10:14:18
 */
@Data
public class XZPT_FYID implements Serializable{

    String ROUTE_CRT_ORG_CODE;
    String ROUTE_RCV_ORG_CODE;
    String ROUTE_ACTN_CODE;
    String ROUTE_SEQ_NUM;
    String ROUTE_KIND_CODE;
    String BAG_ID;
    String ROUTE_CRT_DATE;
    String LABEL_KIND_CODE;
    
}
