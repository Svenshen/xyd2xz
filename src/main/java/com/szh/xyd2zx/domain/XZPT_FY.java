/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 10:14:07
 */
@Data
@Entity(name = "TB_EVT_ROUTE_BAG_RELA")
@IdClass(XZPT_FYID.class)

public class XZPT_FY implements Serializable {

    @Id
    @Column            
    String ROUTE_CRT_ORG_CODE;
    
    @Id
    @Column
    String ROUTE_RCV_ORG_CODE;
    
    @Id
    @Column
    String ROUTE_ACTN_CODE;
    
    @Id
    @Column
    String ROUTE_SEQ_NUM;
    
    @Id
    @Column
    String ROUTE_KIND_CODE;
    
    @Id
    @Column
    String BAG_ID;
    
    @Id
    @Column
    String ROUTE_CRT_DATE;
    
    @Id
    @Column
    String LABEL_KIND_CODE;
    
    @Column  
    String MWAY_CODE;
    
    @Column  
    String DATA_SRC_SYS;
    
    @Column  
    String LABEL_STRIP;
}
