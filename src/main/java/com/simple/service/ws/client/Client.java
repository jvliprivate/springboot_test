package com.simple.service.ws.client;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class Client {
 
     public static void main(String args[]) throws Exception{

         JaxWsDynamicClientFactory dcf =JaxWsDynamicClientFactory.newInstance();
         org.apache.cxf.endpoint.Client client =dcf.createClient("http://localhost:8003/test/userWeb?wsdl");
         //getUser 为接口中定义的方法名称  张三为传递的参数   返回一个Object数组
         Object[] objects=client.invoke("getName","411001");
         //输出调用结果
         System.out.println("*****"+objects[0].toString());
     }
     
 }
