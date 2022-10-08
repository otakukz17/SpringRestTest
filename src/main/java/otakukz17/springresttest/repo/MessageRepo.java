package otakukz17.springresttest.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import otakukz17.springresttest.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
