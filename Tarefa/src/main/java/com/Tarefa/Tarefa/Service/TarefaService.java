package com.Tarefa.Tarefa.Service;

import com.Tarefa.Tarefa.Entity.Tarefa;
import com.Tarefa.Tarefa.Repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public List<Tarefa> listarTodos() {
        return repository.findAll();
    }

    public Tarefa buscarPorId(Long id) {
        Optional<Tarefa> tarefa = repository.findById(id);
        return tarefa.orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
