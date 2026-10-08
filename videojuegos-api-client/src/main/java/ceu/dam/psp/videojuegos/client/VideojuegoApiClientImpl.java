package ceu.dam.psp.videojuegos.client;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

import ceu.dam.psp.videojuegos.exceptions.ApiException;
import ceu.dam.psp.videojuegos.exceptions.NotFoundException;
import ceu.dam.psp.videojuegos.model.Videojuego;

public class VideojuegoApiClientImpl implements VideojuegoApiClient {

	private String urlBase; // Este atributo contendrá la URL base a la que hacer las peticiones
	private HttpClient httpClient;

	/**
	 * Tiene que devolver el videojuego con el ID indicado. Si no existe, lanzará
	 * NotFoundException. Si hay cualquier otro error, lanzará ApiException
	 * 
	 * @param id
	 * @return
	 * @throws NotFoundException
	 * @throws ApiException
	 */

	public VideojuegoApiClientImpl(String urlBase) {
		// El constructor recibe el identificador que ha generado crudcrud.com para
		// nuestro API y construye la URL base
		this.urlBase = (urlBase);
		httpClient = HttpClient.newHttpClient();
		urlBase = "https://ca8c4375967b0332c452.free.beeceptor.com/api/videojuegos" + urlBase + "/";
	}

	// TODO: Implementar el resto de métodos
	

	@Override
	public Videojuego findById(String id) throws NotFoundException, ApiException {
		
		
		
		
		
		return null;
	}

	@Override
	public List<Videojuego> findByAñoPublicacion(Integer año) throws NotFoundException, ApiException {
		return null;
	}

	@Override
	public String create(Videojuego videojuego) throws ApiException {
		return null;
	}

	@Override
	public void update(Videojuego videojuego) throws NotFoundException, ApiException {
	}

	@Override
	public void delete(String id) throws NotFoundException, ApiException {
	}

}
