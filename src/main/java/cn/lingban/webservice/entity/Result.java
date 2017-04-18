package cn.lingban.webservice.entity;

import java.util.List;

/**
 * Created by xukai on 2017/4/18.
 */

public class Result extends BaseResponse{
    private static final long serialVersionUID = -4601687272216326006L;

    private List<Task> taskList;

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

}
