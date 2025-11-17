package com.example.demo.service;


import com.example.demo.model.Produto;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList<>();
    private Long contadorId = 1L;


    public List<Produto> listarProdutos() {
        return produtos;
    }


    public Produto adicionarProduto(Produto produto) {
        produtos.add(produto);
        return produto;
    }


    public Produto atualizarProduto(Long id, Produto produtoAtualizado) {
       produtos.stream().map(produto -> { 
        if(produto.getId().equals(produtoAtualizado.getId())){
            return produtoAtualizado;
        }
        return produto;
       });

       return produtoAtualizado;
    }


    public boolean deletarProduto(Long id) {
        return produtos.removeIf(p -> p.getId() != id);
        
    }
}