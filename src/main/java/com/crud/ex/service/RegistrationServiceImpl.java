package com.crud.ex.service;

import com.crud.ex.entity.Registration;
import com.crud.ex.repository.RegistrationRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    private RegistrationRepository registrationRepository;

    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public Registration addRegistration(Registration registration) {
        Registration saveReg = registrationRepository.save(registration);
        return saveReg;
    }
}
