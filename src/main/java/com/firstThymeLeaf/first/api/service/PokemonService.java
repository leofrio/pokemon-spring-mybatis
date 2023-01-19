package com.firstThymeLeaf.first.api.service;

import com.firstThymeLeaf.first.api.model.Pokemon;
import org.springframework.stereotype.Service;

import java.util.List;
public interface PokemonService {
    List<Pokemon> getAllPokemon(Integer page, Integer limit);
}
