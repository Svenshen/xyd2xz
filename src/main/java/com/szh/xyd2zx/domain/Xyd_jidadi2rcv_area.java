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
 * @date 2018-7-31 16:50:22
 */
@Data
@Entity(name = "xyd_jidadi2rcv_area")
@IdClass(Xyd_jidadi2rcv_areaID.class)
public class Xyd_jidadi2rcv_area implements Serializable{
    @Id
    @Column
    String jidaguo;
    @Id
    @Column
    String jidaju;
    @Id
    @Column
    String jidasheng;
    @Id
    @Column
    String jidashi;
    @Column
    String RCV_AREA;
    
    
}
