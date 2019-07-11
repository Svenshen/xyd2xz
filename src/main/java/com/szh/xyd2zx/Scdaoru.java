/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @autoor szh
 */

package com.szh.xyd2zx;

import com.szh.xyd2zx.domain.Sc_ffsj;
import com.szh.xyd2zx.domain.Sc_fysj;
import com.szh.xyd2zx.services.Sc_ffsjService;
import com.szh.xyd2zx.services.Sc_fysjService;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
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
 * @date 2018-8-2 12:51:53
 */
@Component
public class Scdaoru {

    @Autowired
    Sc_ffsjService sc_ffsjService;
    @Autowired
    Sc_fysjService sc_fysjService;
    
    public void fayundaoru(String path){
        
            System.out.println("发运信息导入");
            File file = new File(path);
            File filesw [] = file.listFiles();
           for(File f:filesw){
              new Thread(() -> {
                  System.out.println(f.getName());
                  fayundaoru(f);
               }).start();
               
           }
    }
    
    @Async
    public void fayundaoru(File file){
        try{
                InputStream myxls = new FileInputStream(file);
                
                HSSFWorkbook wb = new HSSFWorkbook(myxls);
                HSSFSheet sheet = wb.getSheetAt(0); 
                for(int hang = 1;hang <= sheet.getLastRowNum();hang++){
                    HSSFRow row = sheet.getRow(hang);
                    Sc_fysj sc_fysj = new Sc_fysj();
                    sc_fysj.setZongbaotiaoma(row.getCell(0).toString());
                    sc_fysj.setChulijigou(row.getCell(1).toString());
                    sc_fysj.setSaomiaoshijian(row.getCell(2).toString());
                    sc_fysj.setShangchuanshijian(row.getCell(3).toString());
                    sc_fysj.setCaozuogonghao(row.getCell(4).toString());
                    sc_fysj.setCaozuoyuanxingming(row.getCell(5).toString());
                    sc_fysj.setJidadi(row.getCell(6).toString());
                    sc_fysj.setZhongliang(row.getCell(7).toString());
                    sc_fysj.setYouluxinxi(row.getCell(8).toString());
                    sc_fysj.setLudanhao(row.getCell(9).toString());
                    sc_fysj.setPaichedanhao(row.getCell(10).toString());
                    sc_fysjService.save(sc_fysj);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
   
    
    public void fengfadaoru(String path){
            System.out.println("封发信息导入");
            File file = new File(path);
            File filesw [] = file.listFiles();
           for(File f:filesw){
               new Thread(() -> {
                   System.out.println(f.getName());
                   fengfadaoru(f);
               }).start();
               
           }
    }
    
    @Async
    public void fengfadaoru(File file){
        
        try{
                InputStream myxls = new FileInputStream(file);
                
                HSSFWorkbook wb = new HSSFWorkbook(myxls);
                HSSFSheet sheet = wb.getSheetAt(0); 
                for(int hang = 1;hang <= sheet.getLastRowNum();hang++){
                    HSSFRow row = sheet.getRow(hang);
                    Sc_ffsj ssSc_ffsj = new Sc_ffsj();
                    ssSc_ffsj.setYoujianhao(row.getCell(0).toString());
                    ssSc_ffsj.setChulijigou(row.getCell(1).toString());
                    ssSc_ffsj.setSaomiaoshijian(row.getCell(2).toString());
                    ssSc_ffsj.setShangchuanshijian(row.getCell(3).toString());
                    ssSc_ffsj.setCaozuoyuangonghao(row.getCell(4).toString());
                    ssSc_ffsj.setCaozuoyuanxingming(row.getCell(5).toString());
                    ssSc_ffsj.setJidadi(row.getCell(6).toString());
                    ssSc_ffsj.setZongbaohao(row.getCell(7).toString());
                    ssSc_ffsj.setZhongliang(row.getCell(8).toString());
                    ssSc_ffsj.setJinchukoubiaozhi(row.getCell(9).toString());
                    sc_ffsjService.save(ssSc_ffsj);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
    }
    
}
