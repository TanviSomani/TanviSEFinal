package MVC_Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@SessionAttributes("name")
public class studentController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String show() {

        return "student-list";
    }
}


