package cn.lingban.webservice.entity;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.Xpp3DomDriver;
import com.thoughtworks.xstream.mapper.ClassAliasingMapper;
// bean 2 xml  ->  http://lavasoft.blog.51cto.com/62575/64114/

/**
 * Created by xukai on 2017/4/18.
 */
public class xml2objTest {
    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
                "<req>\n" +
                "  <resultCode>0</resultCode>\n" +
                "  <resultMsg>ok</resultMsg>\n" +
                "  <taskList>\n" +
                "    <task>\n" +
                "      <orderId>11</orderId>\n" +
                "      <oemCode>11</oemCode>\n" +
                "      <orderType>1</orderType>\n" +
                "      <phone>1308241982</phone>\n" +
                "      <customerName>zs</customerName>\n" +
                "      <sex>n</sex>\n" +
                "      <remainingOrders>12</remainingOrders>\n" +
                "    </task>\n" +
                "    <task>\n" +
                "      <orderId>12</orderId>\n" +
                "      <oemCode>12</oemCode>\n" +
                "      <orderType>1</orderType>\n" +
                "      <phone>1308221982</phone>\n" +
                "      <customerName>zs</customerName>\n" +
                "      <sex>n</sex>\n" +
                "      <remainingOrders>12</remainingOrders>\n" +
                "    </task>\n" +
                "  </taskList>\n" +
                "</req>";
        XStream xstream = new XStream();
        xstream.alias("task", Task.class);
        xstream.alias("req", Result.class);
        Result result = (Result) xstream.fromXML(xml);
        System.out.println(result.toString());
    }
    public static String doPojo2Xml(Object obj){
        XStream xstream=new XStream(new DomDriver());
        xstream.alias(obj.getClass().getSimpleName(), obj.getClass());
        ClassAliasingMapper mapper = new ClassAliasingMapper(xstream.getMapper());
        mapper.addClassAlias("tag", String.class);

        String xmlContent=xstream.toXML(obj);

        return xmlContent;
    }

    public static Object doXml2Pojo(String xmlContent,Object obj){
        XStream xstream=new XStream(new DomDriver());
        xstream.alias(obj.getClass().getSimpleName(), obj.getClass());
        Object getObj=xstream.fromXML(xmlContent);
        return getObj;
    }
}
