package example0121;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class UserController {
	@RequestMapping("login")  
	public ModelAndView login(String username,String password){  
        //创建模型跟视图，用于渲染页面。并且指定要返回的页面为home页面  
      /* ModelAndView mav = new ModelAndView("succ");  
       return mav; */
		ModelAndView mav = new ModelAndView("succ");  
		            //将参数返回给页面  
		            mav.addObject("username",username);  
		            mav.addObject("password", password);  
		            return mav;  

    }



}
