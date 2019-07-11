/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.domain.XZPT_FY;
import com.szh.xyd2zx.dao.XZPT_FYDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-8-3 10:31:19
 */
@Service
public class XZPT_FYService {

    @Autowired
    XZPT_FYDao xZPT_FYDao;
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd"); 
    SimpleDateFormat sdfTime = new SimpleDateFormat("HHmmss"); 
    
    
    final static HashMap<String,String> youlu = new HashMap<String,String>(){
        {
            put("吴江-无锡(吴标速1)","2321528001");
            put("吴江-苏州JJ","3321509040");
            put("吴江-苏州晚班(速)","3321529004");
            put("吴江-苏州(二频)","3321529002");
            put("吴江-南京(吴速物1)","2321529001");
            put("吴江-苏州（蟹）","3321509060");
            put("吴江-南京(吴速2)","2321529003");
            put("吴江-南京(吴速3)","2321529005");
            put("吴江-苏州(吴速1)","3321529003");
            put("吴江-上海(苏速物临1)","1321521915");
            put("吴江-苏州(国际速)","3321529005");
            put("吴江-苏州中班(华扬)","3321509095");
            put("吴江-淮安(吴速临1)","2321529011");
            put("吴江-南京(虚拟)","2321529015");
            put("吴江-无锡(吴锡速①)","2321529055");
            put("吴江-无锡(吴锡速②)","2321529065");
            put("吴江-无锡(吴邮速③)","2321521085");
            put("吴江-无锡(吴锡速③)","2321529085");
            put("吴江-无锡(吴锡速④)","2321529075");
            put("吴江-无锡(宝尊专线1)","2321521101");
            
           // put("4321529999","少件邮路");
        }
    };
    
    public void save(Sc_fysj sc_fysj) {
        try{
            xZPT_FYDao.save(zhuanhuan(sc_fysj));
        }catch(Exception  e){
            System.out.println(sc_fysj.toString());
            e.printStackTrace();
        }
    }
    
    public XZPT_FY zhuanhuan(Sc_fysj sc_fysj) throws ParseException{
        XZPT_FY xzpt_fy = new XZPT_FY();
        Date date = sdf.parse(sc_fysj.getSaomiaoshijian());
        xzpt_fy.setBAG_ID(sc_fysj.getZongbaotiaoma());
        xzpt_fy.setLABEL_KIND_CODE("121");
        xzpt_fy.setMWAY_CODE(youlu.get(sc_fysj.getYouluxinxi()));
        xzpt_fy.setROUTE_ACTN_CODE("S");
        xzpt_fy.setROUTE_CRT_DATE(sdfDate.format(date));
        xzpt_fy.setROUTE_CRT_ORG_CODE("21520000");
        xzpt_fy.setROUTE_KIND_CODE("121");
        xzpt_fy.setROUTE_RCV_ORG_CODE("21520000");
        xzpt_fy.setROUTE_SEQ_NUM("9");
        xzpt_fy.setLABEL_STRIP(sc_fysj.getZongbaotiaoma());
        xzpt_fy.setDATA_SRC_SYS("X");
        return xzpt_fy;
    }
    
}
