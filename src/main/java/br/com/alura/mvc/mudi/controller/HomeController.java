package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiomi Redmi Note 8");
		pedido.setUrlImagem("https://t2.tudocdn.net/504304?w=145&h=304");
		pedido.setUrlProduto("https://www.tudocelular.com/Redmi/fichas-tecnicas/n5716/Redmi-Note-8.html");
		pedido.setDescricao("uma descrição qualquer para esse pedido");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		return "home";
	}
}
