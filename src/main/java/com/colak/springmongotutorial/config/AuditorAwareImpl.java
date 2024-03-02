package com.colak.springmongotutorial.config;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    public static final String USER_NAME = "myuser";

    @Override
    public Optional<String> getCurrentAuditor() {
        // get user from the security context
        return Optional.of(USER_NAME);
    }
}
