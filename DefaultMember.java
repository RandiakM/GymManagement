/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GymManagement;

/**
 *
 * @author Randika
 */
public class DefaultMember {
    
    private String name;
    private int id;
    private String address;
    private int phoneNo; 
    
    //parameter constructor

    public DefaultMember(String name, int id, String address, int phoneNo) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    
    
}
