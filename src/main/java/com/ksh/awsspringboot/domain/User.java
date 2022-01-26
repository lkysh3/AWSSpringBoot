package com.ksh.awsspringboot.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    int id;
    String name;

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id : ");
        sb.append(this.id);
        sb.append(System.getProperty("line.separator"));
        sb.append("Name : ");
        sb.append(this.name);

        return sb.toString();
    }
}
