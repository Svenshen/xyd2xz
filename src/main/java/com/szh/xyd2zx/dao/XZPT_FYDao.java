/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.XZPT_FF;
import com.szh.xyd2zx.domain.XZPT_FFID;
import com.szh.xyd2zx.domain.XZPT_FY;
import com.szh.xyd2zx.domain.XZPT_FYID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 10:30:08
 */
@Repository
public interface XZPT_FYDao extends  JpaRepository<XZPT_FY,XZPT_FYID>{

}
