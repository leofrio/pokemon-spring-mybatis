package com.firstThymeLeaf.first.api.controller;

import com.firstThymeLeaf.first.api.mapper.PokemonMapper;
import com.firstThymeLeaf.first.api.model.Pokemon;
import com.firstThymeLeaf.first.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public List<Pokemon> getAll(@RequestParam(required = false,defaultValue = "1") Integer page,@RequestParam(required = false,defaultValue = "10") Integer limit) {
        return pokemonService.getAllPokemon(page,limit);
    }
}
