/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Xyd_jidadi2rcv_area;
import com.szh.xyd2zx.domain.Xyd_jidadi2rcv_areaID;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 16:53:23
 */
@Repository
public interface Xyd_jidadi2rcv_areaDao extends JpaRepository<Xyd_jidadi2rcv_area,Xyd_jidadi2rcv_areaID>{

    
    public List<Xyd_jidadi2rcv_area> findByjidaguo(String jidaguo);
    
    @Query(value = "select * from xyd_jidadi2rcv_area where jidaguo =?1 and jidasheng =?2 and jidashi =?3 and jidaju = ?4 ",nativeQuery = true)
    public List<Xyd_jidadi2rcv_area> findByguoshengshi(String jidaguo,String jidasheng,String jidashi,String jidaju);
    
    @Query(value = "select * from xyd_jidadi2rcv_area where jidaguo =?1 and jidasheng =?2 and jidashi =?3 ",nativeQuery = true)
    public List<Xyd_jidadi2rcv_area> findByguoshengshi(String jidaguo,String jidasheng,String jidashi);
    
}
