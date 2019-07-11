/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx.services;

import com.szh.xyd2zx.domain.Xiazaipingtai;
import com.szh.xyd2zx.domain.Xydshuju;
import com.szh.xyd2zx.domain.Xydshujulog;
import com.szh.xyd2zx.dao.XiazaipingtaiDao;
import com.szh.xyd2zx.dao.XydshujulogDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 15:06:21
 */
@Service
public class XiazaipingtaiService {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");  
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyyMMdd"); 
    SimpleDateFormat sdfTime = new SimpleDateFormat("HHmmss"); 
    @Autowired
    XiazaipingtaiDao xiazaipingtaiDao;
    @Autowired
    Xyd_chanpin2prod_codeService xyd_chanpin2prod_codeService;
    @Autowired
    Xyd_jidadi2rcv_areaServeice xyd_jidadi2rcv_areaServeice;
    @Autowired
    XydshujulogService xydshujulogService;
    public boolean saveshuju(Xydshuju xydshuju){
        boolean flag = false;
        try{
            xiazaipingtaiDao.save(zhuanhuan(xydshuju));            
            flag = true;
        }catch(Exception e){
            System.out.println(xydshuju.toString());
            e.printStackTrace();
            flag = false;
        }
        Xydshujulog x = new Xydshujulog();
        x.setYoujianhao(xydshuju.getYoujianhao());
        x.setFlag(flag);
        xydshujulogService.save(x);
        return flag;
    }
    
    public boolean saveshuju2(Xydshuju xydshuju){
        boolean flag = false;
        try{
            xiazaipingtaiDao.save(zhuanhuan2(xydshuju));            
            flag = true;
        }catch(Exception e){
            System.out.println(xydshuju.toString());
            e.printStackTrace();
            flag = false;
        }
        Xydshujulog x = new Xydshujulog();
        x.setYoujianhao(xydshuju.getYoujianhao());
        x.setFlag(flag);
        xydshujulogService.save(x);
        return flag;
    }
    
    public Xiazaipingtai zhuanhuan(Xydshuju xydshuju) throws ParseException {
        Xiazaipingtai xiazaipingtai = new Xiazaipingtai();
        xiazaipingtai.setMAIL_NUM(xydshuju.getYoujianhao());
        xiazaipingtai.setCLCT_BUREAU_ORG_CODE(xydshuju.getShoujijigou());
        
        Date date = sdf.parse(xydshuju.getShoujishijian());
        xiazaipingtai.setCLCT_DATE(sdfDate.format(date));
        xiazaipingtai.setCLCT_TIME(sdfTime.format(date));
        xiazaipingtai.setCLCT_BUREAU_POST_CODE("215200");
        
        String prod_code = xyd_chanpin2prod_codeService.getprodcodebychanpin(xydshuju.getChanpin());
        String jidaguo = xydshuju.getJidaguo();
        if(!"中华人民共和国".equals(jidaguo)){
            String rcvarea = xyd_jidadi2rcv_areaServeice.getrcvareaguoji(xydshuju.getJidaguo());
            xiazaipingtai.setINTER_FLAG("1");
            if(null == rcvarea){
                return null;
            }else{
                xiazaipingtai.setRCV_AREA(rcvarea);
            }
        }else{
            String rcvarea = xyd_jidadi2rcv_areaServeice.getrcvareaguonei(xydshuju.getJidaguo(), xydshuju.getJidasheng(), xydshuju.getJidashi(),xydshuju.getJidaju());
            xiazaipingtai.setINTER_FLAG("0");
            if(null == rcvarea){
                return null;
            }else{
                xiazaipingtai.setRCV_AREA(rcvarea);
            }
        }
        if(xydshuju.getYunshufangshi().equals("全程陆运")){
            xiazaipingtai.setTRANS_MODE_CODE("0");
        }else{
            xiazaipingtai.setTRANS_MODE_CODE(null);
        }
        xiazaipingtai.setACTUAL_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getZhongliang())/1000.0));
        xiazaipingtai.setVOL_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getTiji())/1000.0));
        xiazaipingtai.setBILLING_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getJifeizhongliang())/1000.0));
        xiazaipingtai.setBASIC_FEE(xydshuju.getBiaozhunyouzi());
        xiazaipingtai.setSHOULD_PAY_TOTAL_FEE(String.valueOf(Double.valueOf(xydshuju.getBiaozhunyouzi())+Double.valueOf(xydshuju.getQitayouzi())));
        xiazaipingtai.setACTUAL_TOTAL_FEE(xydshuju.getZongyouzi());
        xiazaipingtai.setCANT_DLV_DEAL_MODE_CODE(null);
        
        
        xiazaipingtai.setSENDER_NAME(xydshuju.getJijianren());
        xiazaipingtai.setSENDER_DEPT_NAME(null);
        xiazaipingtai.setSENDER_ADDR(null);
        xiazaipingtai.setSENDER_CONTACT_PHONE(null);
        xiazaipingtai.setSENDER_HOME_AREA_NAME(null);
        xiazaipingtai.setSENDER_POST_CODE(null);
        xiazaipingtai.setRCVER_NAME(null);
        xiazaipingtai.setRCVER_ADDR(null);
        xiazaipingtai.setRCVER_CONTACT_PHONE(null);
        xiazaipingtai.setRCVER_DEPT_NAME(null);
        xiazaipingtai.setRCVER_HOME_AREA_NAME(null);
        xiazaipingtai.setRCVER_POST_CODE(null);
        xiazaipingtai.setSENDER_CUST_CODE(xydshuju.getKehudaima());
        xiazaipingtai.setPROD_CODE(prod_code);
        xiazaipingtai.setMAIL_KIND_CODE(prod_code.substring(2, 7));
        xiazaipingtai.setMAIL_PRPTY_CODE(prod_code.substring(1, 2));        
        xiazaipingtai.setTIME_LIMIT_CODE(prod_code.substring(7, 8));
        xiazaipingtai.setPAY_SIDE_CODE(prod_code.substring(9, 10));        
        xiazaipingtai.setADDI_SERVICE_CODE(prod_code.substring(8, 9));
        xiazaipingtai.setDLV_AREA_CODE(prod_code.substring(0, 1));
        xiazaipingtai.setBUSI_KIND_CODE(null);
        xiazaipingtai.setSETLMT_MODE_CODE(null);
        xiazaipingtai.setCLCT_STAFF_CODE(null);
        xiazaipingtai.setCLCT_STAFF_NAME(xydshuju.getShoujiyuan());
        xiazaipingtai.setOPERATOR_CODE(null);
        xiazaipingtai.setOPERATOR_NAME(xydshuju.getShoujiyuan());
        xiazaipingtai.setRCPT_INVOICE_NUM(null);
        xiazaipingtai.setAPPLY_CHK_FLAG(null);
        xiazaipingtai.setINITIATIVE_FEEDBACK_FLAG(null);
        xiazaipingtai.setFEEDBACK_PARA(null);
        xiazaipingtai.setPART_KIND_QUAN(null);
        xiazaipingtai.setATTACH_LIST_QUAN(null);
        xiazaipingtai.setYPDJ_QUAN(null);
        xiazaipingtai.setDZZ_NUM(null);
        xiazaipingtai.setDATA_SRC_SYS("X");
        return xiazaipingtai;
    }
    
    public Xiazaipingtai zhuanhuan2(Xydshuju xydshuju) throws ParseException {
        Xiazaipingtai xiazaipingtai = new Xiazaipingtai();
        xiazaipingtai.setMAIL_NUM(xydshuju.getYoujianhao());
        xiazaipingtai.setCLCT_BUREAU_ORG_CODE(xydshuju.getShoujijigou());
        
        Date date = sdf.parse(xydshuju.getShoujishijian());
        xiazaipingtai.setCLCT_DATE(sdfDate.format(date));
        xiazaipingtai.setCLCT_TIME(sdfTime.format(date));
        xiazaipingtai.setCLCT_BUREAU_POST_CODE("215200");
        
        String prod_code = xyd_chanpin2prod_codeService.getprodcodebychanpin(xydshuju.getChanpin());
        String jidaguo = xydshuju.getJidaguo();
        if(!"中华人民共和国".equals(jidaguo)){
            String rcvarea = xyd_jidadi2rcv_areaServeice.getrcvareaguoji(xydshuju.getJidaguo());
            xiazaipingtai.setINTER_FLAG("1");
            if(null == rcvarea){
                return null;
            }else{
                xiazaipingtai.setRCV_AREA(rcvarea);
            }
        }else{
            String rcvarea = xyd_jidadi2rcv_areaServeice.getrcvareaguonei2(xydshuju.getJidaguo(), xydshuju.getJidasheng(), xydshuju.getJidashi());
            xiazaipingtai.setINTER_FLAG("0");
            if(null == rcvarea){
                return null;
            }else{
                xiazaipingtai.setRCV_AREA(rcvarea);
            }
        }
        if(xydshuju.getYunshufangshi().equals("全程陆运")){
            xiazaipingtai.setTRANS_MODE_CODE("0");
        }else{
            xiazaipingtai.setTRANS_MODE_CODE(null);
        }
        
        
        xiazaipingtai.setACTUAL_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getZhongliang())/1000.0));
        xiazaipingtai.setVOL_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getTiji())/1000.0));
        xiazaipingtai.setBILLING_WEIGHT(String.valueOf(Double.valueOf(xydshuju.getJifeizhongliang())/1000.0));
        xiazaipingtai.setBASIC_FEE(xydshuju.getBiaozhunyouzi());
        xiazaipingtai.setSHOULD_PAY_TOTAL_FEE(String.valueOf(Double.valueOf(xydshuju.getBiaozhunyouzi())+Double.valueOf(xydshuju.getQitayouzi())));
        xiazaipingtai.setACTUAL_TOTAL_FEE(xydshuju.getZongyouzi());
        xiazaipingtai.setCANT_DLV_DEAL_MODE_CODE(null);
        
        xiazaipingtai.setSENDER_NAME(xydshuju.getJijianren());
        xiazaipingtai.setSENDER_DEPT_NAME(null);
        xiazaipingtai.setSENDER_ADDR(null);
        xiazaipingtai.setSENDER_CONTACT_PHONE(null);
        xiazaipingtai.setSENDER_HOME_AREA_NAME(null);
        xiazaipingtai.setSENDER_POST_CODE(null);
        xiazaipingtai.setRCVER_NAME(null);
        xiazaipingtai.setRCVER_ADDR(null);
        xiazaipingtai.setRCVER_CONTACT_PHONE(null);
        xiazaipingtai.setRCVER_DEPT_NAME(null);
        xiazaipingtai.setRCVER_HOME_AREA_NAME(null);
        xiazaipingtai.setRCVER_POST_CODE(null);
        xiazaipingtai.setSENDER_CUST_CODE(xydshuju.getKehudaima());
        xiazaipingtai.setPROD_CODE(prod_code);
        xiazaipingtai.setMAIL_KIND_CODE(prod_code.substring(2, 7));
        xiazaipingtai.setMAIL_PRPTY_CODE(prod_code.substring(1, 2));        
        xiazaipingtai.setTIME_LIMIT_CODE(prod_code.substring(7, 8));
        xiazaipingtai.setPAY_SIDE_CODE(prod_code.substring(9, 10));        
        xiazaipingtai.setADDI_SERVICE_CODE(prod_code.substring(8, 9));
        xiazaipingtai.setDLV_AREA_CODE(prod_code.substring(0, 1));
        xiazaipingtai.setBUSI_KIND_CODE(null);
        xiazaipingtai.setSETLMT_MODE_CODE(null);
        xiazaipingtai.setCLCT_STAFF_CODE(null);
        xiazaipingtai.setCLCT_STAFF_NAME(xydshuju.getShoujiyuan());
        xiazaipingtai.setOPERATOR_CODE(null);
        xiazaipingtai.setOPERATOR_NAME(xydshuju.getShoujiyuan());
        xiazaipingtai.setRCPT_INVOICE_NUM(null);
        xiazaipingtai.setAPPLY_CHK_FLAG(null);
        xiazaipingtai.setINITIATIVE_FEEDBACK_FLAG(null);
        xiazaipingtai.setFEEDBACK_PARA(null);
        xiazaipingtai.setPART_KIND_QUAN(null);
        xiazaipingtai.setATTACH_LIST_QUAN(null);
        xiazaipingtai.setYPDJ_QUAN(null);
        xiazaipingtai.setDZZ_NUM(null);
        xiazaipingtai.setDATA_SRC_SYS("X");
        return xiazaipingtai;
    }
}
