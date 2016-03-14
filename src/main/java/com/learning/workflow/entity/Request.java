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
@Table(name = "wf_request")
public class Request extends BaseEntity {

    @Id
    @GeneratedValue
    private Long requestId;

    @OneToOne(targetEntity = Workflow.class)
    private Workflow workflow;

    @OneToOne(targetEntity = User.class)
    private User user;

    @Enumerated(EnumType.STRING)
    private RequestState requestState;

    private String title;


}
