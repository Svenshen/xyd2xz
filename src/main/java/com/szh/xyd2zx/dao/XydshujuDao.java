/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */
package com.szh.xyd2zx.dao;

import com.szh.xyd2zx.domain.Xydshuju;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public interface XydshujuDao extends JpaRepository<Xydshuju,String>{
    
    @Query(value  = "select * from xyd_sjsj x where x.shoujishijian >= ?1 and x.shoujishijian <= ?2  and x.youjianhao not in (select mail_num from tb_evt_mail_clct) ",nativeQuery = true)
    public List<Xydshuju> getXydshujuByburushuju(String shoujishijian1,String shoujishijian2);
    
}
