/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_Base;

/**
 *
 * @author denil
 */
public class arrayStudent {
    //clase que almacena los constructores del estudiante
    private String tokenStudent;//almacena si es de tipo estudiante
    private int carnet;//almacena el carnet, llave primaria
    private String name;//almacena el nombre del estudiante
    private int career;//en que carrera esta
//constructores para el estudiante
    public arrayStudent(String tokenStudent, int carnet, String name, int career) {
        this.tokenStudent = tokenStudent;
        this.carnet = carnet;
        this.name = name;
        this.career = career;
    }

    public String getTokenStudent() {
        return tokenStudent;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getName() {
        return name;
    }

    public int getCareer() {
        return career;
    }
//metodo toString para poder llevar control del array list
    @Override
    public String toString() {
        return "tokenStudent " + tokenStudent + " carnet " + carnet + 
                " name " + name + " carrera" + career;
    }
    
}
