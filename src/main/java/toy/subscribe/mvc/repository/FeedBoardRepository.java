package toy.subscribe.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import toy.subscribe.domain.entity.FeedBoard;

public interface FeedBoardRepository extends JpaRepository<FeedBoard, Long>, QuerydslPredicateExecutor<FeedBoard>, FeedBoardCustomRepository {
    
    Long countByGuid (String guid);
    
}