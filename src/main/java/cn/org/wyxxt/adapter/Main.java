package cn.org.wyxxt.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author xingzhiwei
 * @createBy IntelliJ IDEA
 * @time 2021/3/11 11:24 上午
 * @email jsjxzw@163.com
 */
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/xingzhiwei/java/DesignPatterns/src/main/resources/1.txt");

        InputStreamReader isr = new InputStreamReader(fis);

        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();

    }
}
