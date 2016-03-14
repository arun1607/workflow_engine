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
@Table(name = "wf_activity")
public class Activity {

    @Id
    @GeneratedValue
    private Long activityId;

    @OneToOne(targetEntity = ActivityType.class)
    @JoinColumn(name = "activity_type_id")
    private ActivityType activityType;

    @OneToOne(targetEntity = Workflow.class)
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

    private String name;

    private String description;


}
