package com.example.demo.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author: ChangXuefei
 * @date: 2018/11/27 14:37
 * @Version 1.0
 */
@Data
public class User {
    private Integer id;

    @NotBlank
    private String name;

    @Pattern(regexp = "/")
    private String mobile;

    @Email
    private String email;
}
