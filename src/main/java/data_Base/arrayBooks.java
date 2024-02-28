/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_Base;

/**
 *
 * @author denil
 */
public class arrayBooks {
    //constructores necesarios pra los libros 
    private String tokenBook;//token el cual define si es libro o no 
    private String title;//titulo del libro 
    private String author;//nombre del autor
    private String code;//codigo del libro
    private int numer;//cantidad de libros
//constructores de los strings
    public arrayBooks(String tokeBook, String title, String author, String code, int numer) {
        this.tokenBook = tokenBook;
        this.title = title;
        this.author = author;
        this.code = code;
        this.numer = numer;
    }

    public String getTokenBook() {
        return tokenBook;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCode() {
        return code;
    }

    public int getNumer() {
        return numer;
    }
//metodo toString para almacenar de mejor manera en los arrayList
    @Override
    public String toString() {
        return "tokeBook " + tokenBook + " title " + 
                title + " author " + author + " code " + code + " numer " + numer;
    }
    
}
