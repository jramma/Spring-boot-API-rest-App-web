package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.repository.SucursalRepository;

@SpringBootApplication
public class S05T01N01GognomsNomApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N01GognomsNomApplication.class, args);
	}
	@Autowired
	private SucursalRepository lista;
	
	@Override
	public void run(String... args) throws Exception {
		Sucursal fruita = new Sucursal(1,"Bq","Spain");
		Sucursal fruita1 = new Sucursal(2,"Activision","Canada");
		Sucursal fruita2 = new Sucursal(3,"EA","Portugal");
		lista.save(fruita);
		lista.save(fruita1);
		lista.save(fruita2);
	}

}
// https://www.youtube.com/watch?v=_wQo62h6VgU