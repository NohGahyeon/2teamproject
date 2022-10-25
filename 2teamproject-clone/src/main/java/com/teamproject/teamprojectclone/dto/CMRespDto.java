package com.teamproject.teamprojectclone.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
    private String msg;
    private T date;

}
