package com.vornicu.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
