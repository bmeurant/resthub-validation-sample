package org.resthub.validation.controller;

import javax.inject.Inject;
import javax.inject.Named;

import org.resthub.web.controller.RepositoryBasedRestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.resthub.validation.model.Sample;
import org.resthub.validation.repository.SampleRepository;

@Controller
@RequestMapping(value = "/api/sample")
public class SampleController extends RepositoryBasedRestController<Sample, Long, SampleRepository> {

    @Inject
    @Named("sampleRepository")
    @Override
    public void setRepository(SampleRepository repository) {
        this.repository = repository;
    }
}
