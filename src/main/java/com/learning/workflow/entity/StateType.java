package com.learning.workflow.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by amits on 06/03/16.
 */
@Entity
@Getter
@Table(name = "wf_state_type")
public class StateType {
    public StateType() {
    }

    public StateType(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    private Long stateTypeId;

    private String name;
}
