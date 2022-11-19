package SpringCartxofa.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
//@RequestMapping(path = "/ies") 
public class MainController {
	/*@Autowired
	JuegoServices juegoServices;
	
	@Autowired
	JugadorServices jugadorServices;*/
	
	@GetMapping(path = "/") // Map ONLY GET Requests
	public @ResponseBody String welcome() {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request


		return "Estoy vivito y coleando!!!";
	}
}