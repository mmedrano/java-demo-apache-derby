package pe.sura.demos.bdembebida.feature.tipodocumento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/tiposdocumento")
public class TipoDocumentoController {

	@Autowired
	TipoDocumentoService tipoDocumentoService;
	
	@GetMapping
	public List<TipoDocumento> findAllTiposDocumento() {
		return tipoDocumentoService.findAllTiposDocumento();
	}
	
	@PostMapping
	public void createTipoDocumento(@RequestBody TipoDocumentoRequest request) {
		TipoDocumento tipoDocumento = TipoDocumento.builder()
				.id(request.getId())
				.descripcion(request.getDescripcion())
				.build();
		tipoDocumentoService.registrarTipoDocumento(tipoDocumento);
	}
	
}
