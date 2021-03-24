/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceexample;

/**
 *
 * @author shegavala
 */
class Bussiness {
    

    private String name;
    private String address;
    
    public void setName(String busName){
    name = busName;
    }
    public void setAdress(String busAddress){
    address = busAddress;
    }
    public String getDescription(){
        return name + "--" +address;
    
    }
}
