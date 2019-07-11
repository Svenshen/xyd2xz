/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.domain.Sc_fysjID;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-2 13:45:35
 */
@Repository
public interface Sc_fysjDao extends  JpaRepository<Sc_fysj,Sc_fysjID>{

    @Query(value  = "select * from xyd_scfysj where zongbaotiaoma not in (select LABEL_STRIP from TB_EVT_ROUTE_BAG_RELA where ROUTE_ACTN_CODE = 'S' and ROUTE_CRT_ORG_CODE= '21520000' ) and saomiaoshijian>= ?1 and saomiaoshijian <= ?2  ",nativeQuery = true)
    public List<Sc_fysj> getSc_fysjByburushuju(String kshijian,String jshijian);
}
