package org.resthub.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.resthub.validation.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
