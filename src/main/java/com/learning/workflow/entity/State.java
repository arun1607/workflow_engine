package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by amits on 06/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_state")
public class State extends BaseEntity {

    @Id
    @GeneratedValue
    private Long stateId;

    private String name;

    private String description;

    @OneToOne(targetEntity = StateType.class)
    private StateType stateType;

    @OneToOne(targetEntity = Workflow.class)
    private Workflow workflow;
}
