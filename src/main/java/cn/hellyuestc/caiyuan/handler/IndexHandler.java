package cn.hellyuestc.caiyuan.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexHandler {

	@RequestMapping("/")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("/myHomepage")
	public String myHomepage() {
		return "myHomepage";
	}
	
}
