package edu.ifba.gerenbibifba.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import edu.ifba.gerenbibifba.model.Livro;
import edu.ifba.gerenbibifba.service.ILivrosService;

@Controller
public class LivroController{

	@Autowired
	private ILivrosService service;
	
	@GetMapping ("/Livro/list")
	public String findAll(Model model){
		model.addAttribute("livro", service.findALL());
		return "Livro/list";
		
	}
	
	@GetMapping("/Livro/delete/{id}")
	public String delete(@PathVariable (name = "id") Integer id) {
		service.delete(id);
		return "redirect:/Livro/list";
	}
	
	@GetMapping("/Livro/datails/{id}")
	public String find(@PathVariable Integer id, Model model) {
		
		model.addAttribute("Livro", service.find(id));
		model.addAttribute("mode", "view");
		return "Livro/registration-from"; 
	}
	
	
	@GetMapping({"/Livro/save/{id}", "/Livro/save"})
	
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
		model.addAttribute("Livro", l);
		model.addAttribute("mode", mode); 
		return "Livro/registration-form";
	}
	@PostMapping("/Livro/save")
			public String save(@ModelAttribute Livro l) {
			l.setCadastro(new Date());
			service.save(l);
			return "redirect:/Livro/list";
			}
}
