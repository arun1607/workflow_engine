package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by amits on 07/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_request_note")
public class RequestNote {

    @Id
    @GeneratedValue
    private Long requestNoteId;

    @OneToOne(targetEntity = Request.class)
    private Request request;

    @ManyToOne(targetEntity = User.class)
    private User user;
}
