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
@Table(name = "wf_transition")
public class Transition extends BaseEntity {
    @Id
    @GeneratedValue
    private Long transitionId;

    @OneToOne(targetEntity = Workflow.class)
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

    @OneToOne(targetEntity = State.class)
    @JoinColumn(name = "state_id")
    private State currentState;
}
