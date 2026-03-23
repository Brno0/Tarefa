package com.Tarefa.Tarefa.Repository;

import com.Tarefa.Tarefa.Entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
