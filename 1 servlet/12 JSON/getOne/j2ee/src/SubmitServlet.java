  

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;  
  
public class SubmitServlet extends HttpServlet {  
    protected void service(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {
    	String data =request.getParameter("data");
    	
        System.out.println("����˽��յ��������ǣ�" +data);
 
        JSONObject json=JSONObject.fromObject(data);  
         
        System.out.println("ת��ΪJSON����֮���ǣ�"+ json);
          
  
        Hero hero = (Hero)JSONObject.toBean(json,Hero.class);  
        System.out.println("ת��ΪHero����֮���ǣ�"+hero);
    }  
}  