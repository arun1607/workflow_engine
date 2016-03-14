package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by amits on 14/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_group")
public class Group extends BaseEntity {

    @Id
    @GeneratedValue
    private Long groupId;

    @OneToOne(targetEntity = Workflow.class)
    @JoinColumn(name = "workflow_id")
    private Workflow workflow;

    private String name;

    @ManyToMany
    @JoinTable(name = "wf_user_group", joinColumns = @JoinColumn(name = "group_id"), inverseJoinColumns = @JoinColumn(name = "username"))
    private Set<User> users;

}
