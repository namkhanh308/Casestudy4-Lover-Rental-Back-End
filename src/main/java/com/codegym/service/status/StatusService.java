package com.codegym.service.status;

import com.codegym.model.account.Status;
import com.codegym.repository.status.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatusService implements IStatusService {
    @Autowired
    IStatusRepository statusRepository;

    @Override
    public Iterable<Status> findAll() {
        return statusRepository.findAll();
    }

    @Override
    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    @Override
    public Status save(Status status) {
        return statusRepository.save(status);
    }

    @Override
    public void remove(Long id) {
        statusRepository.deleteById(id);
    }

    @Override
    public Page<Status> findAll(Pageable pageable) {
        return statusRepository.findAll(pageable);
    }
}
