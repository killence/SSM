package excle;

import com.killen.entity.Address;
import jxl.Workbook;
import jxl.format.*;
import jxl.format.Alignment;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.format.Colour;
import jxl.format.VerticalAlignment;
import jxl.write.*;
import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : DownloadExcle
 * @Description :
 * @Author : KILLEN
 * @Date: 2020-09-17 19:28
 */
public class DownloadExcle {


    @Test
    public void test() {

        String filename = "test.xls";

        try {

            File name = new File("D://test.xls");
            // 创建写工作簿对象
            WritableWorkbook workbook = Workbook.createWorkbook(name);
            // 工作表
            WritableSheet sheet = workbook.createSheet("地址列表", 0);
            // 设置字体;
            WritableFont font = new WritableFont(WritableFont.ARIAL, 14, WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
            WritableCellFormat cellFormat = new WritableCellFormat(font);
            // 设置背景颜色;
            cellFormat.setBackground(Colour.WHITE);
            // 设置边框;
            cellFormat.setBorder(Border.ALL, BorderLineStyle.DASH_DOT);
            // 设置文字居中对齐方式;
            cellFormat.setAlignment(Alignment.CENTRE);
            // 设置垂直居中;
            cellFormat.setVerticalAlignment(VerticalAlignment.CENTRE);
            // 分别给1,5,6列设置不同的宽度;
            sheet.setColumnView(0, 15);
            sheet.setColumnView(4, 60);
            sheet.setColumnView(5, 35);
            // 给sheet电子版中所有的列设置默认的列的宽度;
            sheet.getSettings().setDefaultColumnWidth(20);
            // 给sheet电子版中所有的行设置默认的高度，高度的单位是1/20个像素点,但设置这个貌似就不能自动换行了
            // sheet.getSettings().setDefaultRowHeight(30 * 20);
            // 设置自动换行;
            cellFormat.setWrap(true);


            // 单元格
            Label label0 = new Label(0, 0, "ID", cellFormat);
            Label label1 = new Label(1, 0, "省", cellFormat);
            Label label2 = new Label(2, 0, "市", cellFormat);
            Label label3 = new Label(3, 0, "区", cellFormat);
            Label label4 = new Label(4, 0, "详细地址", cellFormat);
            Label label5 = new Label(5, 0, "创建时间", cellFormat);

            sheet.addCell(label0);
            sheet.addCell(label1);
            sheet.addCell(label2);
            sheet.addCell(label3);
            sheet.addCell(label4);
            sheet.addCell(label5);

            // 给第二行设置背景、字体颜色、对齐方式等等;
            WritableFont font2 = new WritableFont(WritableFont.ARIAL, 14, WritableFont.NO_BOLD, false, UnderlineStyle.NO_UNDERLINE, Colour.BLACK);
            WritableCellFormat cellFormat2 = new WritableCellFormat(font2);
            // 设置文字居中对齐方式;
            cellFormat2.setAlignment(Alignment.CENTRE);
            // 设置垂直居中;
            cellFormat2.setVerticalAlignment(VerticalAlignment.CENTRE);
            cellFormat2.setBackground(Colour.WHITE);
            cellFormat2.setBorder(Border.ALL, BorderLineStyle.THIN);
            cellFormat2.setWrap(true);

            // 记录行数
            int n = 1;

            Address address = new Address();

            // 查找所有地址
            List<Address> addressList = new ArrayList<Address>();

            for(int k =0 ;k<10; ++k) {

                address.setId(k);
                address.setAddress("123");
                address.setArea("123");
                address.setCity("123");
                address.setCreateTime(new Date());
                address.setProvince("212");
                addressList.add(address);
            }


            if (addressList != null && addressList.size() > 0) {

                // 遍历
                for (Address a : addressList) {

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String createTime = sdf.format(a.getCreateTime());

                    Label lt0 = new Label(0, n, a.getId() + "", cellFormat2);
                    Label lt1 = new Label(1, n, a.getProvince(), cellFormat2);
                    Label lt2 = new Label(2, n, a.getCity(), cellFormat2);
                    Label lt3 = new Label(3, n, a.getArea(), cellFormat2);
                    Label lt4 = new Label(4, n, a.getAddress(), cellFormat2);
                    Label lt5 = new Label(5, n, createTime, cellFormat2);

                    sheet.addCell(lt0);
                    sheet.addCell(lt1);
                    sheet.addCell(lt2);
                    sheet.addCell(lt3);
                    sheet.addCell(lt4);
                    sheet.addCell(lt5);

                    n++;
                }
            }

            //开始执行写入操作
            workbook.write();
            //关闭流
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }




    }

}
