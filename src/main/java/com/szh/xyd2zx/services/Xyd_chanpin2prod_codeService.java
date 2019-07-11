/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.dao.Xyd_chanpin2prod_codeDao;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-1 9:15:24
 */
@Service
public class Xyd_chanpin2prod_codeService {    
    @Autowired
    Xyd_chanpin2prod_codeDao xyd_chanpin2prod_codeDao;
    
    public String getprodcodebychanpin(String chanpin){
        return xyd_chanpin2prod_codeDao.findById(chanpin).get().getProd_code();
    }
    
}
