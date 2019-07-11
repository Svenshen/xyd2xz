/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Xydshujulog;
import com.szh.xyd2zx.dao.XydshujuDao;
import com.szh.xyd2zx.dao.XydshujulogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-1 13:15:12
 */
@Service
public class XydshujulogService {
    @Autowired
    XydshujulogDao xydshujulogDao;
    
    public void save(Xydshujulog xydshujulog){
        xydshujulogDao.save(xydshujulog);
    }
}
