package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain.Sucursal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SucursalDTO extends Sucursal{
	private String tipusSucursal;
	static private List<String> paisos = new ArrayList(Arrays.asList("austria", "belgium", "bulgaria", "croatia",
			"republic of Cyprus", "czech Republic", "denmark", "estonia", "finland", "france", "germany", "greece",
			"hungary", "ireland", "italy", "latvia", "lithuania", "luxembourg", "malta", "netherlands", "poland",
			"portugal", "romania", "slovakia", "slovenia", "spain", "sweden"));

	public String esEU(String pais) {
		String respuesta;
		if (paisos.contains(pais.toLowerCase())) {
			respuesta = "Is from EU";
		} else {
			respuesta = "Not from EU";
		}
		return respuesta;
	}

}
