package pe.sura.demos.bdembebida.feature.empresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository empresaRepository;
	
	public List<Empresa> findAllEmpresas() {
		return empresaRepository.findAll();
	}
	
}
