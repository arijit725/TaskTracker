package org.arijit.task.traker.config;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotEmpty;

public class TaskStoreConfiguration extends Configuration {

    @JsonProperty
    @NotEmpty
    private String store;

    public String getStore() {
        return store;
    }
}
