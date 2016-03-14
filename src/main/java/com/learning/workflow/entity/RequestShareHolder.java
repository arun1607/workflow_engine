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
@Table(name = "wf_request_shareholder")
public class RequestShareHolder extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(targetEntity = Request.class)
    @JoinColumn(name = "request_id")
    private Request request;

    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "username")
    private User shareHolder;
}
