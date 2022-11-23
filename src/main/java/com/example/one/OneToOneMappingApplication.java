package com.example.one;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.one.model.User;
import com.example.one.model.UserProfile;



@SpringBootApplication
public class OneToOneMappingApplication implements CommandLineRunner{
@Autowired
OneRepository repository;
@Autowired
OneuserprofileRepository userRepos;
private OneuserprofileRepository userProfile;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneMappingApplication.class, args);
		System.out.println("this is first application");
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("rama","gidda", "teja@gmail.com","Rama@454");
		repository.save(user);
		
		Calendar dateOfBirth = Calendar.getInstance();
        dateOfBirth.set(1995, 12, 16);

        
     //   OneuserprofileRepository userProfile = new OneuserprofileRepository("+91-8574857882", Gender.MALE, dateOfBirth.getTime(),
      //          "345", "2nd street", "sohna road, Badsahpur", "Gurugram",
       //         "Hariyana", "India", "122018");
UserProfile user454=new UserProfile("9505745521",Gender.MALE,dateOfBirth.getTime(),"345", "2nd street", "sohna road, Badsahpur", "Gurugram",
        "Hariyana", "India", "122018");
        user.setUserProfile(user454);

        
        user454.setUser(user);

        repository.save(user);

	
	}

}
