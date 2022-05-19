/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package softwarefundamental;

/**
 *
 * @author Gopika Kalathiya
 */
public class Friends {
    private String name;
    private int age;
    public Friends(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String toString()
    {
        return "[Student:: " +name + " , " + age + "]";
    }
}
