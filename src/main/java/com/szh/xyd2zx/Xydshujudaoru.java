/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx;

import com.szh.xyd2zx.domain.Sc_ffsj;
import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.domain.XZPT_FF;
import com.szh.xyd2zx.domain.Xydshuju;
import com.szh.xyd2zx.services.Sc_ffsjService;
import com.szh.xyd2zx.services.Sc_fysjService;
import com.szh.xyd2zx.services.XZPT_FFService;
import com.szh.xyd2zx.services.XZPT_FYService;
import com.szh.xyd2zx.services.XiazaipingtaiService;
import com.szh.xyd2zx.services.XydshujuService;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import lombok.extern.log4j.Log4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 *
 * @author  szh
 * QQ:873689
 * @date 2018-7-31 11:31:30
 */
@Log4j
@Component
public class Xydshujudaoru {
    @Autowired
    XydshujuService xydshujuService ;
    @Autowired
    XiazaipingtaiService xiazaipingtaiService;
    @Autowired
    Sc_ffsjService sc_ffsjService;
    @Autowired
    XZPT_FFService xZPT_FFService;
    
    @Autowired
    Sc_fysjService sc_fysjService;
    
    @Autowired
    XZPT_FYService xZPT_FyService;
    
    public void xyddaoruxzpt(String kshijian,String jshijian){
        System.out.println("新一代数据转换");
        for(Xydshuju x :xydshujuService.getburushuju(kshijian, jshijian)){
            xiazaipingtaiService.saveshuju(x);
        }
    }
    
    public void xyddaoruxzpt2(String kshijian,String jshijian){
        System.out.println("新一代数据转换shi");
        for(Xydshuju x :xydshujuService.getburushuju(kshijian, jshijian)){
            xiazaipingtaiService.saveshuju2(x);
        }
    }
    
    
    public void scffdaoruxzpt(String kshijian,String jshijian){
        System.out.println("数据采集平台封发数据转换");
        for(Sc_ffsj x :sc_ffsjService.getSc_ffsjByburushuju(kshijian, jshijian)){
            xZPT_FFService.save(x);
        }
    }
    
    public void scfydaoruxzpt(String kshijian,String jshijian){
        System.out.println("数据采集平台发运数据转换");
        for(Sc_fysj x :sc_fysjService.getSc_fysjByburushuju(kshijian, jshijian)){
            xZPT_FyService.save(x);
        }
    }    
    
    
    
    
    
        public  void daorushuju(String path){
            // String path =path2;
            System.out.println("新一代数据导入");
            File file = new File(path);
            File filesw [] = file.listFiles();
//           for(File f:filesw){
//               new Thread(()->{
//                   System.out.println(f.getName());
//                   daorushujubyfile(f);
//               }).start();
//               
//           }
           for(File f:filesw){
              
                   System.out.println(f.getName());
                   daorushujubyfile(f);
               
               
           }
        }
        
        @Async
        public void daorushujubyfile(File file) {
            
            try{
                InputStream myxls = new FileInputStream(file);
                String shoujijigou = file.getName().split("-")[0];
                HSSFWorkbook wb = new HSSFWorkbook(myxls);
                HSSFSheet sheet = wb.getSheetAt(0); 
                for(int hang = 1;hang <= sheet.getLastRowNum();hang++){
                    HSSFRow row = sheet.getRow(hang);
                    Xydshuju xydshuju = new Xydshuju();
                    xydshuju.setChanpin(row.getCell(0).toString());
                    xydshuju.setYoujianhao(row.getCell(1).toString());
                    xydshuju.setJijianren(row.getCell(2).toString());
                    xydshuju.setJidaguo(row.getCell(3).toString());
                    xydshuju.setJidasheng(row.getCell(4).toString());
                    xydshuju.setJidashi(row.getCell(5).toString());
                    xydshuju.setJidaju(row.getCell(6).toString());
                    xydshuju.setKehudaima(row.getCell(7).toString());
                    xydshuju.setKehumingcheng(row.getCell(8).toString());
                    xydshuju.setZikehubianma(row.getCell(9).toString());
                    xydshuju.setZikehumingcheng(row.getCell(10).toString());
                    xydshuju.setShoujiyuan(row.getCell(11).toString());
                    xydshuju.setShoujishijian(row.getCell(12).toString());
                    xydshuju.setYunshufangshi(row.getCell(13).toString());
                    xydshuju.setBenjigougekou(row.getCell(14).toString());
                    xydshuju.setSijifenjianma(row.getCell(15).toString());
                    xydshuju.setZhongliang(row.getCell(16).toString());
                    xydshuju.setJifeizhongliang(row.getCell(17).toString());
                    xydshuju.setZongyouzi(row.getCell(18).toString());
                    xydshuju.setBiaozhunyouzi(row.getCell(19).toString());
                    xydshuju.setShishouyouzi(row.getCell(20).toString());
                    xydshuju.setQitayouzi(row.getCell(21).toString());
                    xydshuju.setHuidanjine(row.getCell(22).toString());
                    xydshuju.setBaofeijinge(row.getCell(23).toString());
                    xydshuju.setJiesuanfangshi(row.getCell(24).toString());
                    xydshuju.setShoujilaiyuan(row.getCell(25).toString());
                    xydshuju.setDaishoukuan(row.getCell(26).toString());
                    xydshuju.setTiji(row.getCell(27).toString());
                    xydshuju.setChang(row.getCell(28).toString());
                    xydshuju.setKuan(row.getCell(29).toString());
                    xydshuju.setGao(row.getCell(30).toString());
                    xydshuju.setBaojiabaoxianbiaozhi(row.getCell(31).toString());
                    xydshuju.setShengmingjiazhi(row.getCell(32).toString());
                    xydshuju.setHuidanbiaozhi(row.getCell(33).toString());
                    xydshuju.setHuidanyundanhao(row.getCell(34).toString());
                    xydshuju.setYipiaoduojianzhudanhao(row.getCell(35).toString());
                    xydshuju.setYipiaoduojianbiaozhi(row.getCell(36).toString());
                    xydshuju.setYipiaoduojianjifeifangshi(row.getCell(37).toString());
                    xydshuju.setBaozhuang(row.getCell(38).toString());
                    xydshuju.setZuihouxiugaishijian(row.getCell(39).toString());
                    xydshuju.setShoujijigou(shoujijigou);
                    if(!xydshujuService.saveshuju(xydshuju)){
                        System.out.println(sheet.getRow(hang).getCell(1).toString());
                        log.info("导入失败:"+sheet.getRow(hang).getCell(1).toString());
                    }
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        
}
