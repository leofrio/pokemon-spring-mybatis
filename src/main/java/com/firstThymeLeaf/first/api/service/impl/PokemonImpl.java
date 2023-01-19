package com.firstThymeLeaf.first.api.service.impl;

import com.firstThymeLeaf.first.api.mapper.PokemonMapper;
import com.firstThymeLeaf.first.api.model.Pokemon;
import com.firstThymeLeaf.first.api.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PokemonImpl implements PokemonService {
    @Autowired
    private PokemonMapper pokemonMapper;

    @Override
    public List<Pokemon> getAllPokemon(Integer page, Integer limit) {
        Integer offset=(page-1)*limit;
        return pokemonMapper.getAllPokemon(limit,offset);
    }
}
