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
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 8:30:55
 */
@Data
@Entity(name = "XYD_sjsj")
public class Xydshuju implements Serializable {
    
    @Column
    String chanpin;
    @Id
    @Column
    String youjianhao;
    @Column
    String jijianren;
    @Column
    String jidaguo;
    @Column
    String jidasheng;
    @Column
    String jidashi;
    @Column
    String jidaju;
    @Column
    String kehudaima;
    @Column
    String kehumingcheng;
    @Column
    String zikehubianma;
    @Column
    String zikehumingcheng;
    @Column
    String shoujiyuan;
    @Column
    String shoujishijian;
    @Column
    String yunshufangshi;
    @Column
    String benjigougekou;
    @Column
    String sijifenjianma;
    @Column
    String zhongliang;
    @Column
    String jifeizhongliang;
    @Column
    String zongyouzi;
    @Column
    String biaozhunyouzi;
    @Column
    String shishouyouzi;
    @Column
    String qitayouzi;
    @Column
    String huidanjine;
    @Column
    String baofeijinge;
    @Column
    String jiesuanfangshi;
    @Column
    String shoujilaiyuan;
    @Column
    String daishoukuan;
    @Column
    String tiji;
    @Column
    String chang;
    @Column
    String kuan;
    @Column
    String gao;
    @Column
    String baojiabaoxianbiaozhi;
    @Column
    String shengmingjiazhi;
    @Column
    String huidanbiaozhi;
    @Column
    String huidanyundanhao;
    @Column
    String yipiaoduojianzhudanhao;
    @Column
    String yipiaoduojianbiaozhi;
    @Column
    String yipiaoduojianjifeifangshi;
    @Column
    String baozhuang;
    @Column
    String zuihouxiugaishijian;
    @Column
    String shoujijigou;
}
