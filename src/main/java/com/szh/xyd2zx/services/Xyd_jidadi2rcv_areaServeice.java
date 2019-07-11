/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Xyd_jidadi2rcv_area;
import com.szh.xyd2zx.dao.Xyd_jidadi2rcv_areaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-1 9:24:46
 */
@Service
public class Xyd_jidadi2rcv_areaServeice {

    @Autowired
    Xyd_jidadi2rcv_areaDao xyd_jidadi2rcv_areaDao;
    
    public String getrcvareaguoji(String jidaguo){
        String rcvarea = null;
        List<Xyd_jidadi2rcv_area> list = xyd_jidadi2rcv_areaDao.findByjidaguo(jidaguo);
        if(!list.isEmpty()){
            rcvarea = list.get(0).getRCV_AREA();
        }
        return rcvarea;
    }
    
    public String getrcvareaguonei(String jidaguo,String jidasheng,String jidashi,String jidaju){
        String rcvarea = null;
        List<Xyd_jidadi2rcv_area> list = xyd_jidadi2rcv_areaDao.findByguoshengshi(jidaguo, jidasheng, jidashi,jidaju);
        if(!list.isEmpty()){
            rcvarea = list.get(0).getRCV_AREA();
        }
        return rcvarea;
    }
    
    
    public String getrcvareaguonei2(String jidaguo,String jidasheng,String jidashi){
        String rcvarea = null;
        List<Xyd_jidadi2rcv_area> list = xyd_jidadi2rcv_areaDao.findByguoshengshi(jidaguo, jidasheng, jidashi);
        if(!list.isEmpty()){
            rcvarea = list.get(0).getRCV_AREA();
        }
        return rcvarea;
    }
}
