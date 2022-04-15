package com.company;
import java.time.Year;
import java.util.Calendar;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double vergi;
        if (!(this.salary < 1000)) {
            vergi = (this.salary * 0.03);
            return vergi;
        }
        return 0;
    }
    double bonus(){
        double bonusMaas;
        if(workHours>40){
            bonusMaas=(workHours-40)*30;
            return bonusMaas;
        }
        return 0;
    }
    double raiseSalary(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        double zam;
        if(year-hireYear<=9){
            zam=this.salary*0.05;
            return zam;
        }
        else if(year-hireYear >=9 && year-hireYear<=19){
            zam=this.salary*0.1;
            return zam;
        }
        else if(year-hireYear >19){
            zam=this.salary*0.15;
            return zam;
        }

        return 0;
    }

    @Override
    public String toString() {
        return( "name: " + name + "\n" +
                "Maaş: " + salary +"\n" +
                "Çalışma Saati: " + workHours +"\n" +
                "Başlangıç Yılı: " + hireYear +"\n" +
                "Vergi: "+tax()+"\n"+
                "Bonus: "+ bonus()+"\n"+
                "Maaş Artışı: "+ raiseSalary()+"\n"+
                "Vergi ve Bonuslar ile birlikte maaş:"+(salary-tax()+bonus())+"\n"+
                "Toplam Maaş:"+(salary+raiseSalary())
                );
    }
}
