package resumespring;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.io.IOException;


/*@Controller
public class MyController {

    @GetMapping("/addUser")
    public String sendForm(User user) {

        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(User user) {

        return "showMessage";
    }
}/*

 */
@Controller
public class MyController implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/showMessage").setViewName("showMessage");
    }

    @GetMapping("/addUser")
    public String sendForm(User user) {

        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(@Valid User user , BindingResult bindingResult) throws IOException {
        /*if (bindingResult.hasErrors()) {
            return "addUser";
        }*/

        System.out.println("we are here");
        return "showMessage";
    }


    /*
    method works but there is a
    problem getting picture in showMessage --> crash image
    @PostMapping("/upload")
    public String uploadImage(@RequestParam("file") MultipartFile file) throws IllegalStateException,IOException{
        System.out.println("1");
	    String basedir = "/home/elizaveta/IdeaProjects/SubForm1/src/main/resources/templates/";
        System.out.println("dir found");
	   file.transferTo(new File(basedir+"myfile.jpg"));
        System.out.println("last step");
	    return "redirect:/addUser";}
*/

}