/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Xiazaipingtai;
import com.szh.xyd2zx.domain.XiazaipingtaiID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 15:05:37
 */
@Repository
public interface XiazaipingtaiDao extends  JpaRepository<Xiazaipingtai,XiazaipingtaiID>{

}
