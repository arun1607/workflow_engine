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
@Table(name = "wf_request_action")
public class RequestAction {

    @Id
    @GeneratedValue
    private Long requestActionId;

    @OneToOne
    @JoinColumn(name = "request_id")
    private Request request;

    @OneToOne
    @JoinColumn(name = "action_id")
    private Action action;

    @OneToOne
    @JoinColumn(name = "transition_id")
    private Transition transition;

    private boolean isActive;

    private boolean isComplete;
}
