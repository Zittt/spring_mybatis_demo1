package pri.zit.spring_mybatis.zhou.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import pri.zit.spring_mybatis.zhou.domain.User;
import pri.zit.spring_mybatis.zhou.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;


	//	@RequestMapping(method = RequestMethod.GET)
	//	public String getUser(int uid, ModelMap model) {
	//		
	//		model.addAttribute("user", userService.getUserById(uid));
	//		return "success";
	//	}

	@RequestMapping("/")
	public String home(){
		return "index";
	}
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	
	@RequestMapping("/getUser")
	public String getUesr(int uid, ModelMap model) {
//		uid = 2;
		User user = userService.getUserById(uid);
		model.addAttribute("user", user);
		System.out.println(user);
		
		JSONArray jsonArray = JSONArray.fromObject(user);
		return jsonArray.toString();
	}
	
	
	@ResponseBody
	@RequestMapping("/getAllUsers")
	public User getAllUsers(HttpServletResponse resp) {
		List<User> list = userService.getAll();
//		model.addAttribute("user", list);
		JSONArray jsonArray = JSONArray.fromObject(list);
		System.out.println(list);
		
		
		return list.get(0);
	}
	
	@RequestMapping("/addUser")
	public String addUser(ModelMap model) {
		
		return "success";
	}
	
	@RequestMapping("deleteUser")
	public String deleteUser(int uid, ModelMap model) {
		
		userService.deleteUser(uid);
		return "success";
	}
	
	
	@RequestMapping("/updateUser")
	public String updateUser(ModelMap model) {
	
		return "success";
	}
	
		
	/*	
	@RequestMapping(method = RequestMethod.GET)
	public String getAllUsers(ModelMap model) {

		List<User> list = userService.getAll();
		model.addAttribute("userList", list);
		return "success";
	}


	@RequestMapping(method = RequestMethod.GET)
	public String deleteUser(ModelMap model) {
		// TODO
		int id = 3;
		userService.deleteUser(id);
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String updateUser(ModelMap model) {
		// TODO
		User user = new User();
		user.setUid(2);
		userService.updateUser(user);
		return "success";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String addUser(ModelMap model) {

		User user = new User();
		user.setUid(99);
		userService.addUser(user);
		return "success";
	}
	 */

}
