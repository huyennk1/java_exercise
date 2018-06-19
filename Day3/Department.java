package com.vpb.day3;

import java.util.ArrayList;

public class Department {
    int id;
    String  name;
    String Description;
    /* Bai 10*/
    ArrayList<Employee>  arrEmployee = new ArrayList<>(); // 1 Derartment có thể có nhiều emp
    public  void addEmployee (Employee e){
        arrEmployee.add(e); // Them 1 nhan vien vao phong ban
    }
    public String readEmployee (){
        String x = "";
        for (int i=0; i< arrEmployee.size(); i++){
            Employee e = arrEmployee.get(i);
            x+= e.name+" ";
        }
        return  x;

    }

}
