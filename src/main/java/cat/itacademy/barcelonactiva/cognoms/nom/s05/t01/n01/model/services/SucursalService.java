package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.services;

import java.util.List;

import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;

@Service
public interface SucursalService {

	public List<Sucursal> getAll();

	public Sucursal add(Sucursal fruita);

	public void delete(int id);

	public Sucursal getOne(int id);

	public Sucursal update(Sucursal fruita);

}
