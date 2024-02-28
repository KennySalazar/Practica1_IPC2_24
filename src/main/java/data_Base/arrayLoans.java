/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_Base;

/**
 *
 * @author denil
 */
public class arrayLoans {
    //consturctor para poder alamcenar los prestamos
    private String tokenLoans;//token prestamo
    private String codeBooks;//codigo de los libros
    private int carnet;//carnet del estudiante que pido el libro
    private String date;//fecha en que se pidio
//constructores para poder administrar los prestamos
    public arrayLoans(String tokenLoans, String codeBooks, int carnet, String date) {
        this.tokenLoans = tokenLoans;
        this.codeBooks = codeBooks;
        this.carnet = carnet;
        this.date = date;
    }

    public String getTokenLoans() {
        return tokenLoans;
    }

    public String getCodeBooks() {
        return codeBooks;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getDate() {
        return date;
    }
//metodo toString para poder almacenar los prestamos en el arrayList
    @Override
    public String toString() {
        return "tokenLoans " + tokenLoans + " codeBooks " + codeBooks + " carnet " + carnet + " date " + date;
    }
    
}
