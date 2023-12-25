package com.nuwan.reactiveprogramming.services;

import java.time.LocalDate;

public record UserResponse(String id,
                           String name,
                           String email,
                           String phone,
                           String address,
                           String city,
                           String state,
                           String postalCode,
                           Boolean isPreferred,
                           LocalDate birthDate) {
}
