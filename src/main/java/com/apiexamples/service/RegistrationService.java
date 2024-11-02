package com.apiexamples.service;

import com.apiexamples.payload.RegistrationDto;

import java.util.List;

public interface RegistrationService {
    public RegistrationDto createRegistration(RegistrationDto registrationDto);

    void deleteRegistration(long id);

    RegistrationDto updateRegistration(long id, RegistrationDto registrationDto);

    List<RegistrationDto> getRegistration(int pageNo, int pageSize, String sortBy, String sortDir);

    RegistrationDto getRegistrationById(long id);
}
