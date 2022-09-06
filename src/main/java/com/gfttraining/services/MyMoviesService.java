package com.gfttraining.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gfttraining.entities.EntityBackdrops;
import com.gfttraining.entities.EntityCast;
import com.gfttraining.entities.EntityCastAndCrew;
import com.gfttraining.entities.EntityCrew;
import com.gfttraining.entities.EntityGenre;
import com.gfttraining.entities.EntityImages;
import com.gfttraining.entities.EntityKeywords;
import com.gfttraining.entities.EntityMovie;
import com.gfttraining.entities.EntityPosters;

@Service
public class MyMoviesService {
	final String uri = "https://api.themoviedb.org/3/";
    final String apiKey = "949f7ad927a01a36a739c336dd6449b9";
    
	public List<EntityGenre> findAllGenreMovieList() throws IOException{

	       ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"genre/movie/list?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);


	       EntityGenre[] response  = mapper.readValue(mapper.readTree(json.toString()).get("genres").toString(),EntityGenre[].class);



	       return Arrays.asList(response);


	}
	public List<EntityMovie> findPopularMovies() throws IOException{
	     ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/popular?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);



	       EntityMovie[] response  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),EntityMovie[].class);



	       return Arrays.asList(response);
	}
	public List<EntityMovie> findTopRatedMovies() throws IOException {

	     ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/top_rated?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);


	       EntityMovie[] response  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),EntityMovie[].class);



	       return Arrays.asList(response);
	}
	public EntityMovie findMovie(Integer Id) throws IOException {

		 ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/"+Id+"?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);
	        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
            EntityMovie response = mapper.readValue(json.toString(), EntityMovie.class);
            return response;
	}
	
	public StringBuilder createStringBuilder(URL url) throws IOException{
	       InputStream input = url.openStream();
	        InputStreamReader isr = new InputStreamReader(input);
	        BufferedReader reader = new BufferedReader(isr);
	        StringBuilder stringBuilder = new StringBuilder();
	        int c ;
	        while((c= reader.read())!=-1){
	            stringBuilder.append((char)c);
	        }
	        return stringBuilder;

	}
	public List<EntityCastAndCrew> findMovieCredits(Integer Id) throws IOException{
		 ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/"+Id+"/credits?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);
	        EntityCast[] castresponse = mapper.readValue(mapper.readTree(json.toString()).get("cast").toString(), EntityCast[].class);
	        EntityCrew[] crewresponse = mapper.readValue(mapper.readTree(json.toString()).get("crew").toString(), EntityCrew[].class);
            EntityCastAndCrew response = new EntityCastAndCrew();
            response.setEntityCast(Arrays.asList(castresponse));
            response.setEntityCrew(Arrays.asList(crewresponse));
		    return Arrays.asList(response);
	}
	public List<EntityImages> findMovieImages(Integer Id) throws IOException{
		
		 ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/"+Id+"/images?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);
	        EntityBackdrops[] backdropsresponse = mapper.readValue(mapper.readTree(json.toString()).get("backdrops").toString(), EntityBackdrops[].class);
	        EntityPosters[] postersresponse = mapper.readValue(mapper.readTree(json.toString()).get("posters").toString(), EntityPosters[].class);
         EntityImages Imagesresponse = new EntityImages();
         Imagesresponse.setEntityBackdrops(Arrays.asList(backdropsresponse));
         Imagesresponse.setEntityPosters(Arrays.asList(postersresponse));
		    return Arrays.asList(Imagesresponse);
	}
	public List<EntityKeywords> findMovieKeywords(Integer Id) throws IOException{
		ObjectMapper mapper = new ObjectMapper();
        URL url = new URL(uri+"movie/"+Id+"/keywords?api_key="+apiKey);
        StringBuilder json = createStringBuilder(url);
	       EntityKeywords[] response  = mapper.readValue(mapper.readTree(json.toString()).get("keywords").toString(),EntityKeywords[].class);
	       return Arrays.asList(response);
	}
	public List<EntityMovie> findMovieRecommendations(Integer Id) throws IOException{
	     ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/"+Id+"/recommendations?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);
	       EntityMovie[] response  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),EntityMovie[].class);
	       return Arrays.asList(response);
	}
	public List<EntityMovie> findMovieSimilar(Integer Id) throws IOException{
		 ObjectMapper mapper = new ObjectMapper();
	        URL url = new URL(uri+"movie/"+Id+"/similar?api_key="+apiKey);
	        StringBuilder json = createStringBuilder(url);
	       EntityMovie[] response  = mapper.readValue(mapper.readTree(json.toString()).get("results").toString(),EntityMovie[].class);
	       return Arrays.asList(response);
	}
}
