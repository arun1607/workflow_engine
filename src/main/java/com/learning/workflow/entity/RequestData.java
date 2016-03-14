package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by amits on 06/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_request_data")
public class RequestData extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String  val;

}
