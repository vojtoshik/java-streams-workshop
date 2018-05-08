package com.vojtoshik.education.workshop.streams.exercise.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collections;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {

    @JsonProperty
    private Integer id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty
    private String gender;

    @JsonProperty
    private Integer age;

    @JsonProperty
    private String email;

    @JsonProperty
    private String country;

    @JsonProperty("job_title")
    private String jobTitle;

    @JsonProperty("annual_income_in_eur")
    private Integer income;

    @JsonProperty
    private List<String> languages = Collections.emptyList();

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Integer getIncome() {
        return income;
    }

    public List<String> getLanguages() {
        return Collections.unmodifiableList(languages);
    }
}
