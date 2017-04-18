package cn.lingban.webservice.entity;

import com.thoughtworks.xstream.XStream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xukai on 2017/4/18.
 */
public class bean2ObjTest2 {
    public static void main(String[] args) {
        testBean2XML();
    }

    /**
     * 生成一个Persons对象
     *
     * @return Persons对象
     */
    public static Result getPersons() {
        Task task1 = new Task();
        task1.setOrderId("11");
        task1.setOemCode("11");
        task1.setOrderType(1);
        task1.setPhone("1308241982");
        task1.setCustomerName("zs");
        task1.setSex("n");
        task1.setRemainingOrders(12);
        Task task2 = new Task();
        task2.setOrderId("12");
        task2.setOemCode("12");
        task2.setOrderType(1);
        task2.setPhone("1308221982");
        task2.setCustomerName("zs");
        task2.setSex("n");
        task2.setRemainingOrders(12);
        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);

        Result result = new Result();
        result.setTaskList(taskList);
        result.setResultMsg("ok");
        result.setResultCode("0");
        return result;
    }
    /**
     * 利用XStream在Java对象和XML之间相互转换
     */
    public static void testBean2XML() {
        System.out.println("将Java对象转换为xml！\n");
        Result results = getPersons();
        XStream xstream = new XStream();
        xstream.alias("task", Task.class);
        xstream.alias("result", Result.class);
        String xml = xstream.toXML(results);
        System.out.println(xml);

        System.out.println("\n将xml转换为Java对象！");
        Result cre_person = (Result) xstream.fromXML(xml);
        System.out.println(cre_person.toString());
    }
}
