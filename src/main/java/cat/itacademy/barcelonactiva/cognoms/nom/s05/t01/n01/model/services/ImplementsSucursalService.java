package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.repository.SucursalRepository;

@Service
public class ImplementsSucursalService implements SucursalService {

	@Autowired
	private SucursalRepository repo;
	
	@Override
	public List<Sucursal> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Sucursal add(Sucursal fruita) {
		// TODO Auto-generated method stub
		return repo.save(fruita);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

	@Override
	public Sucursal getOne(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Sucursal update(Sucursal fruita) {
		// TODO Auto-generated method stub
		return repo.save(fruita);
	}

	
	
	
	
	
}
