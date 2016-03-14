package com.learning.workflow.repository;

import com.learning.workflow.entity.ActivityType;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by amits on 14/03/16.
 */
public interface ActivityTypeRepository extends JpaRepository<ActivityType, Long> {
}
