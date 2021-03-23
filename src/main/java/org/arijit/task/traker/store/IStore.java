package org.arijit.task.traker.store;

import org.arijit.task.traker.dto.TaskDto;

public interface IStore {

    public TaskDto get();
    public void insert();
    public void update();
    public void delete();
}
