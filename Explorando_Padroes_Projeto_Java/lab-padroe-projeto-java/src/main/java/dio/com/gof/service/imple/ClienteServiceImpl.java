package dio.com.gof.service.imple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.com.gof.model.Cliente;
import dio.com.gof.model.ClienteRepository;
import dio.com.gof.model.Endereco;
import dio.com.gof.model.EnderecoRepository;
import dio.com.gof.service.ClienteService;
import dio.com.gof.service.ViaCepService;
@Service
public class ClienteServiceImpl implements ClienteService{

	//TODO singleton : Injetar os componentes do String com @Autowired
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		// TODO Auto-generated method stub
		Optional<Cliente>cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		// TODO Buscar Cliente por ID, caso exista
		Optional<Cliente>clienteBd = clienteRepository.findById(id);
		if(clienteBd.isPresent()) {
			
			// FIXME Verificar se Endereço co cliente já exista(pelo CEP)
			// FIXME Caso não exista, interagir com o ViaCep e persistir o retorno
			// FIXME Alterar Cliente, vinculando o Endereço (novo ou existente)
			salvarClienteComCep(cliente);
		}
		
	}
	
	

	@Override
	public void deletar(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
		
	}
	
private void salvarClienteComCep(Cliente cliente) {
		
		// FIXME Verificar se endereço existe
				String cep = cliente.getEndereco().getCep();
				//verificação do banco
				Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
					//FIXME caso não exista, integrar com ViaCep e persistir retorno
					Endereco novoEndereço = viaCepService.consultarCep(cep);
					enderecoRepository.save(novoEndereço);
					return novoEndereço;
						});
				cliente.setEndereco(endereco);
				//FIXME inserir cliente, vinculando o Endereço (novo ou exixtente)
				clienteRepository.save(cliente);
		
	}

}
