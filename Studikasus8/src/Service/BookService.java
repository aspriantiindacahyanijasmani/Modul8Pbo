/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;
import Model.book;
/**
 *
 * @author ASUS
 */
public interface BookService {
    public void addBook(book book);

    public List<book> findBookList();

    public book findBookById(int id);

    public void updateBook(int id, book book);

    public void removeBook(int id);
}
