package com.learning.workflow;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by amits on 06/03/16.
 */
public class Context {

    private Map<String, Object> parameters = new HashMap<>();

    public void addParameter(String name, Object value) {
        parameters.put(name, value);
    }

    public void removeParameter(String name) {
        parameters.remove(name);
    }

    public Map<String, Object> getParameters() {
        return new HashMap<>(parameters);
    }
}
