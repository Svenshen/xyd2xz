 package com.szh.xyd2zx;

import com.szh.xyd2zx.services.XydshujuService;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Xyd2xzApplication {

	public static void main(String[] args) throws Exception{
		ApplicationContext app = SpringApplication.run(Xyd2xzApplication.class, args);
                Xydshujudaoru xydshujudaoru = app.getBean(Xydshujudaoru.class);
                Scdaoru scdaoru = app.getBean(Scdaoru.class);
                if(args.length == 2){
                    String dot = args[0];
                    String path = args[1];
                    switch(dot){
                        case "1":
                            System.out.println("封发导入"+path);
                            scdaoru.fengfadaoru(path);
                            break;
                        case "2":
                            System.out.println("发运导入"+path);
                            scdaoru.fayundaoru(path);
                            break;
                        case "3":
                            System.out.println("新一代导入"+path);
                            xydshujudaoru.daorushuju(path);
                            break;
                    }
                }
                if(args.length  == 3){
                    String dot = args[0];
                    String kshijian = args[1];
                    String jshijian = args[2];
                    switch(dot){
                        case "6":
                            System.out.println("新一代数据转换"+kshijian+","+jshijian);
                            xydshujudaoru.xyddaoruxzpt(kshijian,jshijian);
                            break;
                        case "7":
                            System.out.println("新一代数据转换shi"+kshijian+","+jshijian);
                            xydshujudaoru.xyddaoruxzpt2(kshijian,jshijian);
                            break;
                        case "8":
                            System.out.println("数据采集平台封发数据转换"+kshijian+","+jshijian);
                            xydshujudaoru.scffdaoruxzpt(kshijian, jshijian);
                            break;
                        case "9":
                            System.out.println("数据采集平台封发数据转换"+kshijian+","+jshijian);
                            xydshujudaoru.scfydaoruxzpt(kshijian, jshijian);
                            break;
                    }
                }
                //scdaoru.fengfadaoru("Z:\\fengfamingxi\\201808-4\\");
                //scdaoru.fayundaoru("Z:\\fayunxinxidaochu\\201808\\");
               xydshujudaoru.daorushuju("C:\\xyd\\201906\\");
                xydshujudaoru.xyddaoruxzpt("2019-06-01 00:00:00", "2019-07-01 00:00:00");
                //xydshujudaoru.scffdaoruxzpt("2018-08-01 00:00:00", "2018-09-01 00:00:00");
                //xydshujudaoru.scfydaoruxzpt("2018-08-01 00:00:00", "2018-09-01 00:00:00");
               xydshujudaoru.xyddaoruxzpt2("2019-06-01 00:00:00", "2019-07-01 00:00:00");
                
	}
        
}
