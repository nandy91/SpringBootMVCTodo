/**
 * 
 */
package com.nandithak.TodoListApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author NANDITHA
 *
 */
@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		String initname ="World";
		model.addAttribute("name", initname);
		return "welcome";
	}

}
 