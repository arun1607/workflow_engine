package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by amits on 06/03/16.
 */
@Entity
@Getter
@Setter
@Table(name = "wf_user")
public class User extends BaseEntity {

    @Id
    private String username;

    private String password;

    private Timestamp birthDate;

    private String firstName;

    private String lastName;

    @ManyToMany(mappedBy = "users")
    private Set<Group> groups;
}
