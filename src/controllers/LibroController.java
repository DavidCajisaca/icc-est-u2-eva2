package controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Book;

public class LibroController {
 public Set<Book>  procesarLibros(List<Book> libros){
      Set<Book> librosSet = new HashSet<>();
      for (Book libro : libros) {
          librosSet.add(libro);
      }
      return librosSet;
      
 }
}
