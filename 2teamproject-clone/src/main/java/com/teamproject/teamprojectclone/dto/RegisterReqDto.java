package com.teamproject.teamprojectclone.dto;


import com.teamproject.teamprojectclone.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class RegisterReqDto {

    @NotBlank(groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^[a-zA-Z]*$", groups = ValidationGroups.PatternCheckGroup.class)
    private String UserId;

    @NotBlank(groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 4,message = "이름은 4글자 까지만 입력가능합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp ="^[가-힣]*$",message = "한글만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String Username;

    @NotBlank(message = "이메일은 비워 둘 수 없습니다",groups = ValidationGroups.NotBlankGroup.class)
    @Email
    private String email;

    @NotBlank(message = "비밀번호는 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$", groups = ValidationGroups.PatternCheckGroup.class)
    private String password;
}
