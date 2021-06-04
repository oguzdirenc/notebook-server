package com.oguzdirenc.notebook.service;

import com.oguzdirenc.notebook.domain.ApplicationUser;
import com.oguzdirenc.notebook.repositories.ApplicationUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ApplicationUserServiceImpl implements ApplicationUserService {

    private final ApplicationUserRepository applicationUserRepository;

    public ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public ApplicationUser saveApplicationUser(ApplicationUser user) {
        return applicationUserRepository.save(user);
    }
}
