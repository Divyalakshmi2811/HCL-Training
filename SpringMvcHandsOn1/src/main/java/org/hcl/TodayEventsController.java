package org.hcl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodayEventsController {
@RequestMapping("/todayevent")
public String redirect3()
{
	return "TodayEvent";
}

}
