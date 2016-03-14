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
@Table(name = "wf_workflow_admin")
public class WorkflowAdmin extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @OneToOne(targetEntity = Workflow.class)
    private Workflow workflow;
}
