package example0121;

import org.springframework.stereotype.Controller;    
import org.springframework.ui.Model;    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;    
    
@Controller    
public class HomeController {    
    
    @RequestMapping("home.html")  
    public ModelAndView index(){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
       ModelAndView mav = new ModelAndView("home");  
       return mav; 
    }
 
} 