package cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n01.model.domain;

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
public class Sucursal {
	Integer pk_SucursalID;
	String nomSucursal;
	String paisSucursal;

}
