package github.yeori.dummy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	/**
	 * page to /templates/index.html
	 * @return
	 */
	@GetMapping("/")
	public String pageMain() {
		return "index";
	}
	
}
