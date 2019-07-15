package pe.sura.demos.bdembebida.feature.tipodocumento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoDocumentoService {

	@Autowired
	TipoDocumentoRepository tipoDocumentoRepository;
	
	public List<TipoDocumento> findAllTiposDocumento() {
		return tipoDocumentoRepository.findAll();
	}
	
	public void registrarTipoDocumento(TipoDocumento tipoDocumento) {
		tipoDocumentoRepository.save(tipoDocumento);
	}
	
}
