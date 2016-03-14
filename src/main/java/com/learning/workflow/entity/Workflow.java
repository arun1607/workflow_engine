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
@Table(name = "wf_workflow")
public class Workflow extends BaseEntity  {

    @Id
    @GeneratedValue
    private Long workflowId;

    @Column(unique = true)
    private String name;

    @OneToOne(targetEntity = State.class)
    private State state;

}
