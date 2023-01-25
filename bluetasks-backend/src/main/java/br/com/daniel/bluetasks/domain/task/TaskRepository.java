package br.com.daniel.bluetasks.domain.task;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<Task, Integer>{ //PagingAndSortingRepository fazer ordenação 
	
	Task findByDescription(String description);
	
}
