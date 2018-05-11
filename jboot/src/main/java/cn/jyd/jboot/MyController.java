package cn.jyd.jboot;

import io.jboot.Jboot;
import io.jboot.web.controller.JbootController;
import io.jboot.web.controller.annotation.RequestMapping;

@RequestMapping("/")
public class MyController extends JbootController{
   public void index(){
        renderText("hello jboot");
   }
   
   public static void main(String [] args){
       Jboot.run(args);
   }
}

