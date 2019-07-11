/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Sc_ffsj;
import com.szh.xyd2zx.domain.Sc_ffsjID;
import com.szh.xyd2zx.domain.Xiazaipingtai;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-2 12:47:57
 */
@Repository
public interface Sc_ffsjDao extends  JpaRepository<Sc_ffsj,Sc_ffsjID>{

    
    @Query(value  = "select * from xyd_scffsj where youjianhao not in (select mail_num from TB_EVT_BAG_MAIL_RELA where BAG_ACTN_CODE = '3' and DEAL_ORG_CODE= '21520000' ) and saomiaoshijian>= ?1 and saomiaoshijian <= ?2  ",nativeQuery = true)
    public List<Sc_ffsj> getSc_ffsjByburushuju(String kshijian,String jshijian);
}
