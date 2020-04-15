package org.nrj.app.repo;

import org.nrj.app.entities.ResumeEntity;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepo extends CrudRepository<ResumeEntity, Integer>{
}
