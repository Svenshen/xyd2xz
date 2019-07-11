/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Sc_ffsj;
import com.szh.xyd2zx.dao.Sc_ffsjDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-2 12:48:59
 */
@Service
public class Sc_ffsjService {

    @Autowired
    Sc_ffsjDao sc_ffsjDao;
    
    public void save(Sc_ffsj sc_ffsj){
        
            sc_ffsjDao.save(sc_ffsj);
        
    }
    
    public List<Sc_ffsj> getSc_ffsjByburushuju(String kshijian,String jshijian){
        return sc_ffsjDao.getSc_ffsjByburushuju(kshijian,jshijian);
    }
    
}
