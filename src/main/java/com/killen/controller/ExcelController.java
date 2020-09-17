package com.killen.controller;

/**
 * @ClassName : ExcelController
 * @Description :
 * @Author : KILLEN
 * @Date: 2020-09-17 19:13
 */

import com.killen.entity.Address;
import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.*;
import jxl.format.VerticalAlignment;
import jxl.write.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/**
 * @author dyh
 * @create 2018-07-14 下午8:20
 * @desc excle表格功能编写
 **/
@RestController
@RequestMapping("/excel")
public class ExcelController {
    /**
     * 下载文件
     *
     * @return
     */
    @RequestMapping({"/download"})
    public void download() {
        // 文件名
    }
}