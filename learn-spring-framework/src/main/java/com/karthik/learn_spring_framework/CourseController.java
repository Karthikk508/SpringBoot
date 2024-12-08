package com.karthik.learn_spring_framework;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {

		return Arrays.asList(new Course(1, "Learn spring", "in28Minutes"), new Course(2, "Learn aws", "in28Minutes"),
				new Course(3, "Learn springBoot", "in28Minutes"), new Course(4, "Learn spring devtools", "karthi"));
	}

}

//http://localhost:8080/courses
