package student;

import java.io.Serializable;
import java.util.Scanner;

public class  Club implements Serializable {
    String c;

    Club(){
        c = "";
    }
    public void addDetail(){
        System.out.println("Enter the club you belong to,otherwise enter NIL");
        Scanner sc = new Scanner(System.in);
        c=sc.next();

    }

    public String getClub()
    {
        return c;
    }

    public void setClub(String s)
    {
        this.c=s;
    }

    public String toString(){
        return "Club" + c;
    }
    public void print(){
        System.out.println(this.toString());
    }
}
fdfdf
