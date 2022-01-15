package com.spring.usermanagement.service;

import com.spring.usermanagement.model.User;
import com.spring.usermanagement.repository.UserRepository;
import com.spring.usermanagement.response.Department;
import com.spring.usermanagement.response.ResponseTemplateView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public ResponseTemplateView findByUserIdWithDepartments(long id){
        ResponseTemplateView responseTemplateView=new ResponseTemplateView();
        User user=userRepository.findById(id).get();
        Department department=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(),Department.class);
        System.out.println("department id ="+user.getDepartmentId());
        responseTemplateView.setUser(user);
        responseTemplateView.setDepartment(department);
        return responseTemplateView;
    }
}
