package com.picpaysimplificado.domain.dtos;

import com.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, UserType userType, String email, String password) {

}
