package com.teamproject.teamprojectclone.api;


import com.teamproject.teamprojectclone.dto.CMRespDto;
import com.teamproject.teamprojectclone.dto.RegisterReqDto;
import com.teamproject.teamprojectclone.dto.validation.ValidationSequence;
import com.teamproject.teamprojectclone.exception.CustomValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/api/account")
@RestController
public class AccountApi {

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqDto registerReqDto, BindingResult bindingResult) {
        return ResponseEntity.created(null).body(new CMRespDto<>("회원가입 성공", registerReqDto));
    }

}
