package student;

import java.util.Scanner;
public class Finance {
    Dues library;
    Dues departmentdue;
    int fees;
    int cd;

    Finance()
    {
        library = new Dues();
        departmentdue = new Dues();
        fees = 0;
        cd = 5000;
    }

    Finance(int fee, int cautiond)
    {
        fees = fee;
        cd = cautiond;
    }

    public void addFinance()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fee amount");
        fees = sc.nextInt();
    }

    public void addLibraryDue()
    {
        if(library.getFine()==0)
            library.newDue();
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter fine amount");
            int f = sc.nextInt();
            f=f+library.getFine();
            library.setFine(f);
        }
    }

    public void addDepartmentDue()
    {
        if(departmentdue.getFine()==0)
            departmentdue.newDue();
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter fine amount");
            int f = sc.nextInt();
            f=f+departmentdue.getFine();
            departmentdue.setFine(f);
        }
    }

    public String toString()
    {
        return "Fee amount: " + fees + "\n" + "Caution Deposit: " + cd + library.toString() + departmentdue.toString();
    }

    public void printFinancials()
    {
        System.out.println(toString());
    }


    public static void main(String args[])
    {
        Finance f = new Finance();
        f.addFinance();
        f.addDepartmentDue();
        f.addLibraryDue();
        f.printFinancials();
    }


}