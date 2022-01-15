package com.spring.usermanagement.response;

import com.spring.usermanagement.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateView {
    private User user;
    private Department department;
}
