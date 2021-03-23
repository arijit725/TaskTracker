package org.arijit.task.traker.store;

import org.arijit.task.traker.dto.TaskDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FileBasedStore implements IStore {

    private static final Logger logger = LoggerFactory.getLogger(FileBasedStore.class);

    private final Path path;
    private FileBasedStore(Path path){
        this.path = path;
    }

    public static IStore create(String pathStr){
        Path path = Paths.get(pathStr);
        FileBasedStore fileBasedStore = new FileBasedStore(path);
        logger.info("FileBased Store is initialized: path: "+pathStr);
        return  fileBasedStore;
    }
    @Override
    public TaskDto get() {
        return null;
    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
