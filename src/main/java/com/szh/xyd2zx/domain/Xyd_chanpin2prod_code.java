/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Entity;
import lombok.Data;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-1 9:13:03
 */
@Data
@Entity(name = "xyd_chanpin2prod_code")
public class Xyd_chanpin2prod_code implements Serializable {

    @Id
    @Column
    String chanpin;
    @Column
    String prod_code;
            
}
