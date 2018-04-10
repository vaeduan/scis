package com.jcohy.scis.model;

import javax.persistence.*;

/**
 * Created by jiac on 2018/4/10.
 * ClassName  : com.jcohy.scis.model
 * Description  :
 */
@Entity
@Table(name = "notice")
public class Notice {

    private static final long serialVersionUID = 9L;
    //Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "operation")
    private String operation;

    @Column(name = "status")
    private String status;

    @Column(name = "content")
    private String content;

    @Column(name = "operation_date")
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
