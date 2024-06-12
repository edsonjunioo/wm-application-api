package wedding.manager.wm_application_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/produtos")
public class ProdutoController {

    @GetMapping
    public String produtosEmEstoque() {
        return "Produtos em estoque...";
    }
}
