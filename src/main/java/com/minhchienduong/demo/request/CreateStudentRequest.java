package com.minhchienduong.demo.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
public class CreateStudentRequest {

    @JsonProperty("first_name")
    @NotBlank(message = "First name is required")
    private String firstName;

    @JsonProperty("last_name")
    @NotBlank(message = "Last name is required")
    private String lastName;

    @JsonProperty("email")
    private String email;

    private String street;

    private String city;

    private List<CreateSubjectRequest> subjectsLearning;
}
