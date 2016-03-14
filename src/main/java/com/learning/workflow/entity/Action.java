package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by amits on 14/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_action")
public class Action extends BaseEntity {

    @Id
    @GeneratedValue
    private Long actionId;

    @OneToOne(targetEntity = ActionType.class)
    @JoinColumn(name = "action_type_id")
    private ActionType actionType;

    @OneToOne(targetEntity = Workflow.class)
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

    private String name;

    private String description;

}
