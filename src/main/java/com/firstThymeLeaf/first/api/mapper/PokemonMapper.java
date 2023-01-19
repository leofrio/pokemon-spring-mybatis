package com.firstThymeLeaf.first.api.mapper;

import com.firstThymeLeaf.first.api.model.Pokemon;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface PokemonMapper {
    List<Pokemon> getAllPokemon(
       @Param("limit") Integer limit,
       @Param("offset") Integer offset);
    }
