package com.example.demo.controller;


import com.example.demo.model.Produto;
import com.example.demo.service.ProdutoService;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private final ProdutoService produtoService;


    public ProdutoController(ProdutoService produtoService) {
        // implemente aqui
    }


    @GetMapping
    public List<Produto> listarProdutos() {
        // implemente aqui
    }


    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto) {
        // implemente aqui
    }


    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        // implemente aqui
    }


    @DeleteMapping("/{id}")
    public String deletarProduto(@PathVariable Long id) {
        // implemente aqui
    }
}