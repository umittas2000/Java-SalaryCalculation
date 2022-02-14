public class Employee {
    String fullName;
    double salary;
    int workHours;
    int hireYear;

    Employee(String fullName,double salary,int workHours,int hireYear){
        this.fullName=fullName;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double Tax(){
        double tax;

        if(this.salary<1000){
            tax=0.0;
        }else{
            tax=this.salary*0.03;
        }

        return tax;
    }

    public double Bonus(){
        double bonus;
        if(this.workHours>40){
            bonus = (this.workHours-40) *30 *1.0;
        }else{
            bonus =0.0;
        }

        return bonus;
    }

    public double RaiseSalary(){
        double raise;
        int experience = 2021-this.hireYear;
        if( experience>19){
            raise = this.salary*0.15;
        }else if(experience>9){
            raise = this.salary*0.10;
        }else if(experience>0){
            raise=this.salary*0.05;
        }else{
            raise=0;
        }

        return raise;
    }

    @Override
    public String toString(){

        System.out.println("Tam Adi: " + this.fullName);
        System.out.println("Maasi: "+ this.salary);
        System.out.println("Calisma Saati: "+this.workHours);
        System.out.println("Ise baslangic yili: "+ this.hireYear);
        System.out.println("Vergi: " + this.Tax());
        System.out.println("Bonus: " + this.Bonus());
        System.out.println("Maas Artisi:" + this.RaiseSalary());
        System.out.println("Vergi ve Bonuslar birlikte Maas: " + ((this.salary + this.Bonus())-this.Tax()));
        System.out.println("Toplam Maas: " + (this.salary+this.RaiseSalary()));

        return "";
    }

}
