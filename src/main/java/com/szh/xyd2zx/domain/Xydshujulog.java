/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 8:30:55
 */
@Data
@Entity(name = "XYD_sjsj2xzlog")
public class Xydshujulog implements Serializable {
   
    @Id
    @Column
    String youjianhao;
    @Column
    Boolean flag;
    
}

