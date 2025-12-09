package com.nkoder.JobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data  //Includes @Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor
@NoArgsConstructor //automatically generates a constructor with no arguments (a default constructor)
//@AllArgsConstructor  //This annotation automatically generates a constructor with arguments for all fields in the class, except for static fields and initialized final fields.
@Component
public class JobPost {

    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPost(int postId, String postProfile, String postDesc,
                   Integer reqExperience, List<String> postTechStack) {

        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }


}



