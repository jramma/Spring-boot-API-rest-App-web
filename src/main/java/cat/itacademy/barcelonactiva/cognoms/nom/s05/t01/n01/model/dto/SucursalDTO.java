package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.dto;

import java.io.Serializable;
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
public class SucursalDTO extends Sucursal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String tipusSucursal;
	
	static private List<String> paisos = new ArrayList<String>(Arrays.asList("austria", "belgium", "bulgaria", "croatia",
			"republic of Cyprus", "czech Republic", "denmark", "estonia", "finland", "france", "germany", "greece",
			"hungary", "ireland", "italy", "latvia", "lithuania", "luxembourg", "malta", "netherlands", "poland",
			"portugal", "romania", "slovakia", "slovenia", "spain", "sweden"));


	
	public SucursalDTO() {
		
	}

	public SucursalDTO(Integer pk_SucursalID, String nomSucursal, String paisSucursal) {
		super(pk_SucursalID, nomSucursal, paisSucursal);
		String respuesta;
		if (paisos.contains(getPaisSucursal().toLowerCase())) {
			respuesta = "From EU";
		} else {
			respuesta = "Not from EU";
		}
		setTipusSucursal(respuesta);
	}



	public String getTipusSucursal() {
		return tipusSucursal;
	}

	public void setTipusSucursal(String tipusSucursal) {
		this.tipusSucursal = tipusSucursal;
	}

}
