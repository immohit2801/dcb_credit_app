package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import in.ashokit.service.MsgService;

@RestController
@RequestMapping("/api")
public class MsgRestController {
	
	@Autowired
	private MsgService msgService;
	
	@GetMapping("/welcome")
	public String getMsg() {
		int age= 26;
		int i = 10;
		int j = 20;
		int age = 16;
		int k = 30;
		int y = 11;
		return msgService.getWelcomeMsg();
	}
	
}
