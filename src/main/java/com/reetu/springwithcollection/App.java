package com.reetu.springwithcollection;


import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reetu.beans.Author;
import com.reetu.beans.*;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
    	Book1 b1=ctx.getBean("book1",Book1.class);
    	System.out.println(b1.getName());
    	System.out.println(b1.getPrice());
    	for(Object o:b1.getAuthor())
        	System.out.println(o);
    	
    	Book2 b2=(Book2)ctx.getBean("book2");
    	System.out.println(b2.getName());
    	System.out.println(b2.getPrice());
    	for(Object o:b2.getAuthor()) {
    		//System.out.println(o);
    		Author a=(Author)o;
        	System.out.println(a.getName());
        	System.out.println(a.getAge());
        	System.out.println(a.getPhone());
    	}
    	
    	Book3 b3=(Book3)ctx.getBean("book3");
    	System.out.println(b3.getName());
    	System.out.println(b3.getPrice());
    	System.out.println(b3.getAuthor());
    	Map m=b3.getAuthor();
    	System.out.println(m.get("age"));
    	System.out.println(m.get("name"));
    	System.out.println(m.get("phone"));
    }
}
