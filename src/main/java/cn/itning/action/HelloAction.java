package cn.itning.action;

import cn.itning.service.UserService;
import com.opensymphony.xwork2.ActionSupport;


public class HelloAction extends ActionSupport {

    private UserService userService;


    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /*action中方法必须返回String 不能有参数*/
    @Override
    public String execute() throws Exception {
        System.out.println("ok");
        if (userService != null) {
            System.out.println(userService.say());
        } else {
            System.out.println("userService is null");
        }
        return SUCCESS;
    }
}
