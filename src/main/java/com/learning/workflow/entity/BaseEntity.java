package com.learning.workflow.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.sql.Timestamp;

/**
 * Created by amits on 06/03/16.
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Version
    private int version;

    @Column
    private Timestamp dateCreated;

    @Column
    private Timestamp dateUpdated;
}
