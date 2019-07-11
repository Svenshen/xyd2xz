/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.domain.Sc_fysjID;
import com.szh.xyd2zx.domain.XZPT_FF;
import com.szh.xyd2zx.domain.XZPT_FFID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 8:33:09
 */
@Repository
public interface XZPT_FFDao extends  JpaRepository<XZPT_FF,XZPT_FFID>{

    
    
}
