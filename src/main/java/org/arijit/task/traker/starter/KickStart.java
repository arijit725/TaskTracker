package org.arijit.task.traker.starter;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.arijit.task.traker.config.TaskStoreConfiguration;
import org.arijit.task.traker.resources.TaskResources;
import org.arijit.task.traker.store.FileBasedStore;
import org.arijit.task.traker.store.IStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KickStart extends Application<TaskStoreConfiguration> {

    private static final Logger logger = LoggerFactory.getLogger(KickStart.class);

    public static void main(String args[]) throws Exception {
        new KickStart().run(args);
    }

    @Override
    public void initialize(Bootstrap<TaskStoreConfiguration> bootstrap) {
        super.initialize(bootstrap);
    }
    @Override
    public void run(TaskStoreConfiguration configuration, Environment environment) throws Exception {
        logger.info("Kickstart started");
        logger.info("Tasks will be stored at: "+configuration.getStore());
        IStore fileBasedStore = FileBasedStore.create(configuration.getStore());
        environment.jersey().register(new TaskResources(fileBasedStore));

    }
}
