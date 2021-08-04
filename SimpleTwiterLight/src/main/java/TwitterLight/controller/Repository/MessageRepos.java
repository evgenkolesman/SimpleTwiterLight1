package TwitterLight.controller.Repository;


import TwitterLight.controller.domain.Message;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface MessageRepos extends CrudRepository<Message, Integer> {
}
