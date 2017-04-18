package cn.lingban.webservice.utils;

import cn.lingban.webservice.entity.BaseResponse;
import cn.lingban.webservice.entity.Result;
import cn.lingban.webservice.entity.Task;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * Created by xukai on 2017/4/18.
 */
public class XmlUtils {
    public static Result xml2Obj(String xml){
        XStream xstream = new XStream();
        xstream.alias("task", Task.class);
        xstream.alias("req", Result.class);
        return (Result) xstream.fromXML(xml);
    }
    public static String result2Xml(Result results){
        XStream xstream = new XStream();
        xstream.alias("task", Task.class);
        xstream.alias("result", Result.class);
        return xstream.toXML(results);
    }

    public static String obj2Xml(Object obj){
        XStream xstream = new XStream(new DomDriver());
        xstream.alias("rsp", BaseResponse.class);
        return xstream.toXML(obj);
    }
}
