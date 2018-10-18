/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingstudentbygpa;

/**
 *
 * @author Дом
 */
public class Student {
    protected int score;
    private String name;
    public Student (String name, int score) {
        this.name = name;
        this.score = score;
}
    public Student () {
        
    }
    int getScore () {
        return score;
    }
    String getName () {
        return name;
    }
    void setScore (int score) {
        this.score = score;
    }
    void setName (String name) {
        this.name = name;
    }
    
}
