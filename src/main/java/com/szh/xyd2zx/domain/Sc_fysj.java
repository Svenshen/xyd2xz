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
 * @date 2018-8-2 13:38:39
 */
@Data
@Entity(name = "xyd_scfysj")
@IdClass(Sc_fysjID.class)
public class Sc_fysj implements Serializable{

    @Id
    @Column
    String zongbaotiaoma;
    @Column
    String chulijigou;
    @Id
    @Column
    String saomiaoshijian;
    @Column
    String shangchuanshijian;
    @Column
    String caozuogonghao;
    @Column
    String caozuoyuanxingming;
    @Column
    String jidadi;
    @Column
    String zhongliang;
    @Column 
    String youluxinxi;
    @Column
    String ludanhao;
    @Column
    String paichedanhao;
    
}
