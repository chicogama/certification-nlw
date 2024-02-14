package dev.chicogama.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.chicogama.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@RestController
@RequestMapping("/students")
public class StudentController {

    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@ResquestBody VerifyHasCertificationDTO verifyHasCertificationDTO){
        //Email
        //Technology
        System.out.println(verifyHasCertificationDTO);
        return "Usuário pode fazer a prova";
    }
}   
