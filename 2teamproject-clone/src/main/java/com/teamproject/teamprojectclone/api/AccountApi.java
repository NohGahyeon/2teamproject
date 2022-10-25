package com.teamproject.teamprojectclone.api;


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

@RequestMapping("api/account")
@RestController
public class AccountApi {

    @PostMapping("/register")
    public ResponseEntity<?> register(@Validated(ValidationSequence.class) @RequestBody RegisterReqDto registerReqDto, BindingResult bindingResult) {

       if (bindingResult.hasErrors()) {
           Map<String, String> errorMap = new HashMap<String, String>();

           List<FieldError> fieldErrors = bindingResult.getFieldErrors();
           for(FieldError fieldError : fieldErrors) {
               System.out.println("필드명:" +fieldError.getField());
               System.out.println("에러메세지"+fieldError.getDefaultMessage());
               errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
           }

           throw new CustomValidationException("Validation Error", errorMap);
       }


        return ResponseEntity.created(null).body(null);
    }
}
