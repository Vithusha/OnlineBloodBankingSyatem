/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.sql.Date;

/**
 *
 * @author Hp
 */
public class Donor {
    
    private String f_name;
    private String l_name;
    private String contact;
    private String dob;
    private String d_username;
    private String d_password;
    private String gender;
    private String b_group;
    private String last_donation;
    
    
public Donor(){
    
}  

public void set_fname(String name){
    this.f_name=name;
}
public void set_lname(String name){
    this.l_name=name;
}
public void set_contact(String cont){
    this.contact=contact;
}
public void set_dob(String dob){
    this.dob=dob;
}
public void set_username(String username){
    this.d_username=username;
}
public void set_password(String password){
    this.d_password=password;
}
public void set_gender(String gender){
    this.gender=gender;
}
public void set_group(String group){
    this.b_group=group;
}
public void set_last(String last){
    this.last_donation=last;
}
public void get_fname(String name){
    this.f_name=name;
}
public String get_lname(String name){
    return name;
}
public String get_contact(String cont){
    return contact;
}
public String get_dob(String dob){
    return dob;
}
public String get_username(String username){
    return username;
}
public String get_password(String password){
    return password;
}
public String get_gender(String gender){
    return gender;
}
public String get_group(String group){
   return group;
}
public String get_last(String last){
    return last;
}

    
}
