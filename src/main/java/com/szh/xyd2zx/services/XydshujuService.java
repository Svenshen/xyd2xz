/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Xydshuju;
import com.szh.xyd2zx.dao.XydshujuDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 11:09:03
 */
@Service
public class XydshujuService {

    @Autowired
    XydshujuDao xydshujuDao;
    
    public boolean saveshuju(Xydshuju xydshuju){
        boolean flag = false;
        try{
            xydshujuDao.save(xydshuju);
            flag = true;
        }catch(Exception e){
            System.out.println(xydshuju.toString());
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
    
    public List<Xydshuju> getburushuju(String kshijian,String jshijian){
        return xydshujuDao.getXydshujuByburushuju(kshijian,jshijian);
    }
    
}
