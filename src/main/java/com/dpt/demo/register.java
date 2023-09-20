package com.dpt.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class register {
	

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String DBusername;

	@Value("${spring.datasource.password}")
	private String DBpassword;
	
	
	@GetMapping("register")
	public ModelAndView registerform()
	{
		ModelAndView mv=new ModelAndView("register");
		
		return mv;		
	}
	
	
	@PostMapping("register")
	public ModelAndView register(String firstName,String lastName,String email,String userName,String password) throws ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");
		//Add employee here
		try (Connection con = DriverManager.getConnection(url, DBusername, DBpassword);
				Statement st = con.createStatement()) {

			String sql = "insert into Employee (first_name,last_name,email,username,password,regdate) values('"+firstName+"','"+lastName+"','"+email+"','"+userName+"','"+password+"',CURDATE());";
			st.execute(sql);

		} catch (SQLException ex) {

			ex.printStackTrace();

		}
				
		
		ModelAndView mv=new ModelAndView("register");		
		mv.addObject("message", "user account has been added for "+userName);
		return mv;		
	}
	

}
