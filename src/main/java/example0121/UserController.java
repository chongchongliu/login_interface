package example0121;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller  
public class UserController {
	@RequestMapping("login")  
	public ModelAndView login(String username,String password){  
        //����ģ�͸���ͼ��������Ⱦҳ�档����ָ��Ҫ���ص�ҳ��Ϊhomeҳ��  
      /* ModelAndView mav = new ModelAndView("succ");  
       return mav; */
		ModelAndView mav = new ModelAndView("succ");  
		            //���������ظ�ҳ��  
		            mav.addObject("username",username);  
		            mav.addObject("password", password);  
		            return mav;  

    }



}
