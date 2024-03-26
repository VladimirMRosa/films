package com.swapi.films;

import com.swapi.films.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MockDomain {

    public List<Films> filmsListMock(){
        List<Films> films = new ArrayList<>();
        List<Characters> charactersList = new ArrayList<>();
        Characters character = new Characters();
        List<Planets> planetsList = new ArrayList<>();
        Planets planets = new Planets();
        List<Starships> starshipsList = new ArrayList<>();
        Starships starships = new Starships();
        List<Vehicles> vehiclesList = new ArrayList<>();
        Vehicles vehicles = new Vehicles();
        List<Species> speciesList = new ArrayList<>();
        Species species = new Species();
        Films film = new Films();
        film.setEpisodeId(1);
        film.setTitulo("Teste");
        film.setOpeningCrawl("Teste");
        film.setReleaseDate("Teste");
        film.setCreated(LocalDate.now());
        film.setEdited(LocalDate.now());
        film.setUrl("Teste");
        character.setCharacters("Teste");
        charactersList.add(character);
        planets.setPlanets("Teste");
        planetsList.add(planets);
        starships.setStarships("Teste");
        starshipsList.add(starships);
        vehicles.setVehicles("Teste");
        vehiclesList.add(vehicles);
        species.setSpecies("Teste");
        speciesList.add(species);
        film.setCharacters(charactersList);
        film.setStarships(starshipsList);
        film.setPlanets(planetsList);
        film.setVehicles(vehiclesList);
        film.setSpecies(speciesList);
        films.add(film);
        return films;
    }

    public List<com.swapi.films.models.Films> filmsListModelsMock (){
        List<com.swapi.films.models.Films> filmsList = new ArrayList<>();
        List<com.swapi.films.models.Characters> charactersList = new ArrayList<com.swapi.films.models.Characters>();
        List<com.swapi.films.models.Planets> planetsList = new ArrayList<com.swapi.films.models.Planets>();
        List<com.swapi.films.models.Species> speciesList = new ArrayList<com.swapi.films.models.Species>();
        List<com.swapi.films.models.Starships> starshipsList = new ArrayList<com.swapi.films.models.Starships>();
        List<com.swapi.films.models.Vehicles> vehiclesList = new ArrayList<com.swapi.films.models.Vehicles>();
        com.swapi.films.models.Films films = new com.swapi.films.models.Films();
        com.swapi.films.models.Characters characters = new com.swapi.films.models.Characters();
        com.swapi.films.models.Planets planets = new com.swapi.films.models.Planets();
        com.swapi.films.models.Starships starships = new com.swapi.films.models.Starships();
        com.swapi.films.models.Species species = new com.swapi.films.models.Species();
        com.swapi.films.models.Vehicles vehicles = new com.swapi.films.models.Vehicles();
        films.setEpisodeId(1);
        films.setTitulo("Teste");
        films.setOpeningCrawl("Teste");
        films.setReleaseDate("Teste");
        films.setCreated(LocalDate.now());
        films.setEdited(LocalDate.now());
        films.setUrl("Teste");
        characters.setCharacters("Teste");
        charactersList.add(characters);
        planets.setPlanets("Teste");
        planetsList.add(planets);
        starships.setStarships("Teste");
        starshipsList.add(starships);
        vehicles.setVehicules("Teste");
        vehiclesList.add(vehicles);
        species.setSpecies("Teste");
        speciesList.add(species);
        films.setCharacters(charactersList);
        films.setStarships(starshipsList);
        films.setPlanets(planetsList);
        films.setVehicules(vehiclesList);
        films.setSpecies(speciesList);
        filmsList.add(films);
        return filmsList;
    }

}
