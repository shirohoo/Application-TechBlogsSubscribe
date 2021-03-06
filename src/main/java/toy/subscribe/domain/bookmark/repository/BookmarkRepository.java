package toy.subscribe.domain.bookmark.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import toy.subscribe.domain.bookmark.model.Bookmark;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long>, QuerydslPredicateExecutor<Bookmark>, BookmarkCustomRepository {
}
