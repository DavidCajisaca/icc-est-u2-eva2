package controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Book;

public class LibroController {
 public Set<Book> ProcesarLibro(List<Book> libros){
    //Debe devolver un set<Books>
    Set<Book> librosProcesados = new HashSet<>(libros);
    return librosProcesados;

 }
}
