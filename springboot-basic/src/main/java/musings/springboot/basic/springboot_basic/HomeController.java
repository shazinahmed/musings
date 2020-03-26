package musings.springboot.basic.springboot_basic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
	
	@RequestMapping("/")
	public String index()
	{
		return "Our home page";
	}

}
