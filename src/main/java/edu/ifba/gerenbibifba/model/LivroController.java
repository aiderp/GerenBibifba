package edu.ifba.gerenbibifba.model;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import edu.ifba.gerenbibifba.service.impl.LivroService;

@Controller
public class LivroController{

	@Autowired
	private LivroService service;
	
	@GetMapping ("/livro/list")
	public String findAll(Model model){
		model.addAttribute("livros", service.fidALL());
		return "livro/list";
		
	}
	
	@GetMapping("/livro/delete/{id}")
	public String find(@PathVariable Integer id, Model model) {
		return "livro/registation-from"; 
	}
	
	@GetMapping({"/livro/save/{id}", "livro/save"})
	
	public String loadRegistrationForm(@PathVariable(required = false)
	
	 Integer id, Model model) {
		Livro l;
		String mode;
		if(id == null) {
			mode = "create";
			l = new Livro();
		}else{
			mode = "update";
			l = service.find(id);
	}
		model.addAttribute("livro", l);
		model.addAttribute("mode", mode); 
		return "livro/registration-form";
	}
	@PostMapping("livro/save")
			public String save(@ModelAttribute Livro l) {
			l.setRegistration(new Date());
			service.save(l);
			return "redirect:/livro/list";
			}
}
