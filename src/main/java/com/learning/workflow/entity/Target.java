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
@Table(name = "wf_target")
public class Target {

    @Id
    @GeneratedValue
    private Long targetId;

    private String name;

    private String description;

    public Target(String name) {
        this.name = name;
    }

    public Target() {
    }

    public Target(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
