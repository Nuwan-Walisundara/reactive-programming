package com.nuwan.reactiveprogramming.services;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public final record UserRequest(String id,String name, String email, String phone, String address, String city,String state, String postalCode,Boolean isPreferred ) {

}