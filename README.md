# webservice
### 使用说明
1. 运行HelloService main方法
2. 使用wsimport 生成webservice 客户端
```
  D:\工作\2017年\04月\18日\jaxws-ri\bin>wsimport -s D:\workspace\webserviceClient\
src\main http://127.0.0.1/MyService?WSDL
```
3. 将生成的客户端代码拷贝到idea 的工程中并编写app类
```
        MyService mywebService = new MyService();

        /**
         * <port name="HelloServicePort" binding="tns:HelloServicePortBinding">
         */
        HelloService hs = mywebService.getHelloServicePort();

        /**
         * 调用方法
         */
        System.out.println(hs.sayGoodbye("sjk"));

        System.out.println(hs.aliassayHello("sjk"));
```

### xStream 的使用方法
xStream 是 xml字符串与java 对象相互转换的工具  
使用详见XmlUtils工具类
