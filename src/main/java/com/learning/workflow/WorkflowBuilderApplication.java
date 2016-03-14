package com.learning.workflow;

import com.learning.workflow.entity.ActionType;
import com.learning.workflow.entity.ActivityType;
import com.learning.workflow.entity.StateType;
import com.learning.workflow.entity.Target;
import com.learning.workflow.repository.ActionTypeRepository;
import com.learning.workflow.repository.ActivityTypeRepository;
import com.learning.workflow.repository.StateTypeRepository;
import com.learning.workflow.repository.TargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class WorkflowBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkflowBuilderApplication.class, args);
    }


    @Component
    public static class MyBean implements CommandLineRunner {
        private String[] states = new String[]{"Start", "Normal", "Complete", "Denied", "Cancelled"};
        private String[] actionTypes = new String[]{"Approve", "Deny", "Cancel", "Restart", "Resolve"};
        private String[] activityTypes = new String[]{"Add Note", "Send Email", "Add StakeHolders", "Remove StakeHolders"};
        private String[] targetNames = new String[]{"Requester", "Stackholders", "Group members", "Process Admins"};

        @Autowired
        private StateTypeRepository stateTypeRepository;

        @Autowired
        private ActionTypeRepository actionTypeRepository;

        @Autowired
        private ActivityTypeRepository activityTypeRepository;

        @Autowired
        private TargetRepository targetRepository;

        public void run(String... args) {
            Arrays.stream(states).forEach(stateName -> {
                StateType stateType = new StateType(stateName);
                stateTypeRepository.save(stateType);
            });

            Arrays.stream(actionTypes).forEach(actionTypeName -> {
                ActionType actionType = new ActionType(actionTypeName);
                actionTypeRepository.save(actionType);
            });

            Arrays.stream(activityTypes).forEach(activityTypeName -> {
                ActivityType activityType = new ActivityType(activityTypeName);
                activityTypeRepository.save(activityType);
            });

            Arrays.stream(targetNames).forEach(name -> {
                Target target = new Target(name);
                targetRepository.save(target);
            });
        }

    }

}
