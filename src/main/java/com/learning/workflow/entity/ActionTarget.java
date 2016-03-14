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
@Table(name = "wf_action_target")
public class ActionTarget extends BaseEntity {

    @Id
    @GeneratedValue
    private Long actionTargetId;

    @OneToOne
    @JoinColumn(name = "action_id")
    private Action action;

    @OneToOne
    @JoinColumn(name = "target_id")
    private Target target;

    @OneToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
