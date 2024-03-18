package org.lafabrique_epita.exposition.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class RegisterDto {

    @NotBlank
    @NotNull
    @Pattern(regexp = "^\\p{L}[\\p{L}\\-_]{1,23}\\p{L}$")
    private String username;


    @Email
    @NotNull
    @NotBlank
    private String email;

    @NotNull
    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!\\-_]).{8,}$")
    private String password;
}
