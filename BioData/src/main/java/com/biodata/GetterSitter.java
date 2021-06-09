package com.biodata;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;

public class GetterSitter {
    public JFXDatePicker dateofbirth = new JFXDatePicker();
    public JFXTextField name = new JFXTextField();
    public JFXTextField address = new JFXTextField();
    public JFXTextField phone = new JFXTextField();
    public JFXTextField email = new JFXTextField();
    public JFXTextField occupation = new JFXTextField();
    public JFXTextField father = new JFXTextField();
    public JFXTextField mother = new JFXTextField();
    public JFXComboBox<Integer> totalbrothers = new JFXComboBox<>();
    public JFXComboBox<Integer> totalsisters = new JFXComboBox<>();
    public JFXDatePicker getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(JFXDatePicker dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public JFXTextField getName() {
        return name;
    }
    public void setName(JFXTextField name) {
        this.name = name;
    }
    public JFXTextField getAddress() {
        return address;
    }
    public void setAddress(JFXTextField address) {
        this.address = address;
    }
    public JFXTextField getPhone() {
        return phone;
    }
    public void setPhone(JFXTextField phone) {
        this.phone = phone;
    }
    public JFXTextField getEmail() {
        return email;
    }
    public void setEmail(JFXTextField email) {
        this.email = email;
    }
    public JFXTextField getOccupation() {
        return occupation;
    }
    public void setOccupation(JFXTextField occupation) {
        this.occupation = occupation;
    }
    public JFXTextField getFather() {
        return father;
    }
    public void setFather(JFXTextField father) {
        this.father = father;
    }
    public JFXTextField getMother() {
        return mother;
    }
    public void setMother(JFXTextField mother) {
        this.mother = mother;
    }
    public JFXComboBox<Integer> getTotalbrothers() {
        return totalbrothers;
    }
    public void setTotalbrothers(JFXComboBox<Integer> totalbrothers) {
        this.totalbrothers = totalbrothers;
    }
    public JFXComboBox<Integer> getTotalsisters() {
        return totalsisters;
    }
    public void setTotalsisters(JFXComboBox<Integer> totalsisters) {
        this.totalsisters = totalsisters;
    }
    public JFXTextField getBrother() {
        return brother;
    }
    public void setBrother(JFXTextField brother) {
        this.brother = brother;
    }
    public JFXTextField getSister() {
        return sister;
    }
    public void setSister(JFXTextField sister) {
        this.sister = sister;
    }
    public JFXTextField brother = new JFXTextField();
    public JFXTextField sister = new JFXTextField();

  
}
