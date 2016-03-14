package com.learning.workflow.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by amits on 14/03/16.
 */
@Entity
@Getter
@Table(name = "wf_action_type")
public class ActionType {
    public ActionType() {
    }

    public ActionType(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long actionTypeId;

    private String name;
}
