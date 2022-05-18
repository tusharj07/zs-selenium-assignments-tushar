package org.utils.PageUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class FlipkartSecondPage {
    public void captureRouters(WebDriver driver){
        int no_of_routers=driver.findElements(By.xpath("//a[@class='s1Q9rs']")).size();

        System.out.println("No. of routers"+" = "+no_of_routers);
        List<WebElement> list = driver.findElements(By.xpath("//a[@class='s1Q9rs']"));
        List<WebElement> list1=driver.findElements(By.xpath("//div[@class='_30jeq3']"));
        List<String> names=new ArrayList<>();
        HashMap<Integer,String> h1=new HashMap<>();



        for (int i=0;i<list.size();i++){
            String x=list1.get(i).getText().substring(1);
            x = x.replace(",", "");
            int y=Integer.valueOf(x);
            h1.put(y,list.get(i).getText());
        }

        TreeMap<Integer,String> sorted = new TreeMap<>();


        sorted.putAll(h1);

        for (Map.Entry<Integer, String> entry : sorted.entrySet())
            System.out.println(entry.getKey() + " " +entry.getValue());

        Set<Map.Entry<Integer, String> > entrySet
                = sorted.entrySet();

        Map.Entry<Integer, String>[] entryArray
                = entrySet.toArray(
                new Map.Entry[entrySet.size()]);
        try{
            String product = entryArray[1].getValue();
            driver.findElement(By.linkText(product)).click();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
