package pe.sura.demos.bdembebida.feature.empresa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPRESA")
public class Empresa {
	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "VC_DESCRIPCION")
	private String descripcion;
}
