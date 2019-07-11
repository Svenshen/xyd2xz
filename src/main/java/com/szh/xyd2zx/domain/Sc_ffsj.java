/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-2 12:42:37
 */

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import lombok.Data;

@Data
@Entity(name = "xyd_scffsj")
@IdClass(Sc_ffsjID.class)
public class Sc_ffsj implements Serializable {


    @Id
    @Column
    String youjianhao;
    @Id
    @Column
    String saomiaoshijian;
    
    @Column
    String chulijigou;
    
    @Column
    String shangchuanshijian;
    @Column
    String caozuoyuangonghao;
    @Column
    String caozuoyuanxingming;
    @Column
    String jidadi;
    @Column
    String zongbaohao;
    @Column
    String zhongliang;
    @Column
    String jinchukoubiaozhi;
   
}

