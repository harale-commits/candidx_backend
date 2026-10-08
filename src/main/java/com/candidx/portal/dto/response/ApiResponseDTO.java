package com.candidx.portal.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponseDTO<T> {

    private int status;
    private T data;
    private String message;

}
