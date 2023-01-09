package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberFormDto {

    @NotBlank(message = "이름은 필수 값 입니다.")
    private String name;

    @NotEmpty(message = "이메일은 필수 값 입니다.")
    @Email(message = "이메일의 형식으로 입력해 주시기 바랍니다.")
    private String email;

    @NotEmpty(message = "비밀번호는 필수 값 입니다.")
    @Length(min = 8,  max = 16, message = "비밀번호는 8자 이상 16자이하로 입력해 주시기 바랍니다.")
    private String password;

    @NotEmpty(message = "주소는 필수 값 입니다.")
    private String address;

}
