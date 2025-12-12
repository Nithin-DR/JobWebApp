package com.nkoder.JobApp.controller;

import com.nkoder.JobApp.model.JobPost;
import com.nkoder.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@Controller // it returns the html (view) pages
@RestController //sends data in JSON format to the browser
@CrossOrigin(origins = "http://localhost:3000")// now React can call our API from port 3000 safely
//since our springboot origin is http://localhost:8080" browser won't allow :browsers block requests between different origins for security reasons
public class JobController {



    @Autowired
    private JobService service;


//    @GetMapping("addjob")
//    public String addJob() {
//        return "addjob";
//    }
//
//    @PostMapping("handleForm")
//    public String handleForm(JobPost jobPost) {
//        service.addJob(jobPost);
//        return "success";
//
//    }
//
    @PostMapping("jobPost")
    public void addJob(@RequestBody JobPost jobPost){// here it accepts the JSON value and converts it to java object it takes the request from client
        service.addJob(jobPost);
    }


// this will return json values to the web browser end
    @GetMapping("/api/jobs")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();   // returns JSON automatically
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> getByKeyword(@PathVariable String keyword){
        return service.searchByKeyWord(keyword);
    }

    //THE BELOW FUNCTION LETS USER FETCH THE JOB DETAIL BY POST ID
    @GetMapping("job/{postId}") //IN URL job/3 - IT CHECKS THE PATH ALONG WITH THE ID AND CALL THIS FUNCTION
    public Optional<JobPost> getJob(@PathVariable("postId") int postId){ // BY USING PATH VARIABLE SPRING WILL TAKE CARE

        return service.getJob(postId);
    }

    @PutMapping("/jobPost")
    public Optional<JobPost> updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "deleted";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }


//    @GetMapping("/api/jobs")
//    public String viewJobs(Model m) {
//        List<JobPost> jobs = service.getAllJobs();
//        m.addAttribute("jobPosts", jobs);
//
//        return "viewalljobs"; // this tells the spring to open file [ src/main/resources/templates/viewalljobs.html ]
//    }
}
