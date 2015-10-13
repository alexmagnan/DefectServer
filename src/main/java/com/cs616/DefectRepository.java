package com.cs616;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "defect", path = "defect")
public interface DefectRepository extends CrudRepository<Defect, Long> {
    List<Defect> findByStatus(@Param("status") Status status);
    List<Defect> findByCreatedBetween(@Param("start") Date start, @Param("end") Date end);
}
