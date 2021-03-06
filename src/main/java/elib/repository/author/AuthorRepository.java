package elib.repository.author;

import elib.entity.Author;

import java.util.List;

public interface AuthorRepository {
  Author create(Author author);
  Author update(Author author);
  int delete(Author author);
  List<Author> findAll();
  Author find (Long id);
}
