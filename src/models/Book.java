package models;

public class Book {
private String title;
private String author;
private int anio;
public Book(String title, String author, int anio) {
    this.title = title;
    this.author = author;
    this.anio = anio;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getAuthor() {
    return author;
}
public void setAuthor(String author) {
    this.author = author;
}
public int getAnio() {
    return anio;
}
public void setAnio(int anio) {
    this.anio = anio;
}
@Override
public String toString() {
    return "Book [title=" + title + ", author=" + author + ", anio=" + anio + "]";
}



}
