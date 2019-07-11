/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.dao.Sc_fysjDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-2 13:48:25
 */
@Service
public class Sc_fysjService {

     @Autowired
     Sc_fysjDao sc_fysjDao;
    
    
    
    public void save(Sc_fysj sc_fysj){
        sc_fysjDao.save(sc_fysj);
    }
    
    public List<Sc_fysj> getSc_fysjByburushuju(String kshijian,String jshijian){
        return sc_fysjDao.getSc_fysjByburushuju(kshijian,jshijian);
    }
}
