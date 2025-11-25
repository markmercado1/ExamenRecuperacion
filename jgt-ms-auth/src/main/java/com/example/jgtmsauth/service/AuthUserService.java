package com.example.jgtmsauth.service;

import com.emm.authservice.dtos.AuthUserDto;
import com.emm.authservice.dtos.TokenDto;
import com.emm.authservice.models.AuthUser;

public interface AuthUserService {
    AuthUser save(AuthUserDto authUserDto);


    TokenDto login(AuthUserDto authUserDto);

    AuthUserDto findById(Long id);
    boolean existsById(Long id);
    TokenDto validate(String token);
}
