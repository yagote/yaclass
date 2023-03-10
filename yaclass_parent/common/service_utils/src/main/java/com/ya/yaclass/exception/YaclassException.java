package com.ya.yaclass.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yagote    create 2023/2/20 14:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class YaclassException  extends RuntimeException{
    private Integer code;
    private String msg;
}
