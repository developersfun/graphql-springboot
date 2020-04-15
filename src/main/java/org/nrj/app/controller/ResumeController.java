package org.nrj.app.controller;

import graphql.ExecutionResult;
import org.nrj.app.entities.PersonalDetails;
import org.nrj.app.entities.ResumeEntity;
import org.nrj.app.graphql.config.GraphQLConfig;
import org.nrj.app.repo.ResumeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class ResumeController {

	@Autowired
	private ResumeRepo resumeRepo;

	@Autowired
	private GraphQLConfig graphQLConfig;

	@RequestMapping("/myresume/personal-details")
	public List<ResumeEntity> showName() {
		
		PersonalDetails pd = new PersonalDetails();
		
		pd.setName("Neeraj Suthar");
		pd.setPhone("9461641009");
		pd.setEmailId("suthar.nj@gmail.com");


		return (List<ResumeEntity>) resumeRepo.findAll();
		//return Arrays.asList(pd);
	}

	@PostMapping("/myresume/resume")
	public ResponseEntity<Object> generateResume(@RequestBody String query) {

		Logger.getLogger("MyLogger").log(Level.INFO,"Query is : " + query);

		ExecutionResult result = graphQLConfig.graphQL().execute(query);
		return new ResponseEntity(result, HttpStatus.ACCEPTED);
	}

	/*@RequestMapping("/myresume/name")
	public List<Education> showName() {
		return "Neeraj Suthar";
	}*/
	
}
