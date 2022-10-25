package com.teamproject.teamprojectclone.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CMRespDto<T> {
    private String msg;
    private T date;

}
