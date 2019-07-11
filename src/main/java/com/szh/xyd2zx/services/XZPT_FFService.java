/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Sc_ffsj;
import com.szh.xyd2zx.domain.XZPT_FF;
import com.szh.xyd2zx.dao.XZPT_FFDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 8:33:45
 */
@Service
public class XZPT_FFService {

    @Autowired
    XZPT_FFDao xZPT_FFDao;
    
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd"); 
    SimpleDateFormat sdfTime = new SimpleDateFormat("HHmmss"); 
    public void save(Sc_ffsj sc_ffsj) {
        try{
            xZPT_FFDao.save(zhuanhuan(sc_ffsj));
        }catch(Exception  e){
            System.out.println(sc_ffsj.toString());
            e.printStackTrace();
        }
    }
    
    public XZPT_FF zhuanhuan(Sc_ffsj sc_ffsj) throws ParseException{
        XZPT_FF xzpt_ff = new XZPT_FF();
        Date date = sdf.parse(sc_ffsj.getSaomiaoshijian());
        xzpt_ff.setBAG_ACTN_CODE("3");
        xzpt_ff.setBAG_ID(sc_ffsj.getZongbaohao());
        xzpt_ff.setDEAL_DATE(sdfDate.format(date));
        xzpt_ff.setDEAL_ORG_CODE("21520000");
        xzpt_ff.setDEAL_TIME(sdfTime.format(date));
        xzpt_ff.setLABEL_KIND_CODE("121");
        xzpt_ff.setLABEL_STRIP(sc_ffsj.getZongbaohao());
        xzpt_ff.setMAIL_NUM(sc_ffsj.getYoujianhao());
        xzpt_ff.setMAIL_WEIGHT(sc_ffsj.getZhongliang());
        xzpt_ff.setSEAL_ORG_CODE("21520000");
        if(sc_ffsj.getZongbaohao().length() <= 16){
            xzpt_ff.setDLV_ORG_CODE(sc_ffsj.getZongbaohao().substring(0, 8));
        }else{
            xzpt_ff.setDLV_ORG_CODE(sc_ffsj.getZongbaohao().substring(8, 16));
        }
        
        xzpt_ff.setPKG_BUSI_KIND_CODE(sc_ffsj.getJinchukoubiaozhi());
        xzpt_ff.setDATA_SRC_SYS("X");
        return xzpt_ff;
    }
    
    
}
