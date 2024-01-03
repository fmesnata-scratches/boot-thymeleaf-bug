package dev.fmesnata.bootthymleafbug;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {



    @GetMapping(path = "/books")
    public ModelAndView getBooks() {
        ModelAndView response = new ModelAndView("pages/home");
        record Book(int title, int price) {}
        Book book = new Book(99, 30);
        response.getModelMap().addAttribute("book", book);
        return response;
    }
}
