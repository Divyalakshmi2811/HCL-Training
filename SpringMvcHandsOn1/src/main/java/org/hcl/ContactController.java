package org.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
@RequestMapping("/contactus")
public String redirect2()
{
	return "ContactUs";
}
}
