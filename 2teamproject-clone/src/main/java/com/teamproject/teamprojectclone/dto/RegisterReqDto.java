package com.teamproject.teamprojectclone.dto;


import com.teamproject.teamprojectclone.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class RegisterReqDto {

    @NotBlank( groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^[a-zA-Z]*$", groups = ValidationGroups.PatternCheckGroup.class)
    private String UserId;

    @NotBlank(groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 3, groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp ="^[가-힣]*$", groups = ValidationGroups.PatternCheckGroup.class)
    private String Username;

    @NotBlank(groups = ValidationGroups.NotBlankGroup.class)
    @Email
    private String email;

    @NotBlank(groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", groups = ValidationGroups.PatternCheckGroup.class)
    private String password;
}
