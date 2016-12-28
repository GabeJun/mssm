package com.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/***
 * @ClassName: Test1 文件夹下的文件有一些没有记录在文档里，将没有记录的文件删除  
 * @Description: TODO  查询文件夹下的文件 ,读取文档的数据，循环判断，将文件删除
 * @Author lijunhui
 * @Date 2016年12月8日 下午4:06:05
 * @Modify
 * @CopyRight 珍诚医药在线股份有限公司
 */
public class TestFile {

    public static void main(String[] args) throws IOException {

        String path = "E:/my/ecWorkSpace4/admin/webapp/product_big_pic";
        File file = new File(path);
        File[] tempList = file.listFiles();//查询文件夹下的文件
        System.out.println("该目录下图片对象个数：" + tempList.length);
        List<String> ls = readFileByLine();//按行读取文档数据
        System.out.println("数据库产品数" + ls.size());
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                String name = tempList[i].getName();

                if (!ls.contains(name)) {
                    tempList[i].delete();// 删除文件
                    System.out.println("被删除的"+name);
                }
            }
        }
        System.out.println("end");
    }

    /***
     * @Title: readFileByLine
     * @Description: TODO 按行读取文档数据，加入list
     * @Param @return
     * @Param @throws IOException
     * @Return List<String>
     * @Throws
     */
    static List<String> readFileByLine() throws IOException {
        List<String> ls = new ArrayList<String>();
        FileReader reader = null;
        reader = new FileReader("C:/Users/Administrator/Desktop/a.xml");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        while (!StringUtils.isEmpty(str = br.readLine())) {
            ls.add(str);
        }
        br.close();
        reader.close();
        return ls;
    }
}
