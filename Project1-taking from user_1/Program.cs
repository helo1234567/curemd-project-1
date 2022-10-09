using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Schema;

namespace CureMD
{
    public class salarySlip
    {
        int basesalary;



        void Enginer()
        {
            double medFue = 7000 / 12;
            double totalSalary = basesalary + medFue;
            Console.WriteLine("Enginerr Monthly Salary is :" + totalSalary);
            Console.ReadLine();
        }

        void Manager()
        {
            double medallownce = 1000;
            double fueallownce = 250;
            double Salarywithouttax = basesalary + medallownce + fueallownce;
            double totalSalary = Salarywithouttax - (Salarywithouttax / 100) * 17;
            Console.WriteLine("Manager monthly salary is:" + totalSalary);
            Console.ReadLine();
        }


        void HR()
        {
            double medallownce = 800;
            double fueallownce = 150;

            double totalAllownce = medallownce + fueallownce;
            double telecharges = (totalAllownce / 100) * 10;
            double totalSalary = basesalary + totalAllownce + telecharges;
            Console.WriteLine("HR monthly salary is:" + totalSalary);
            Console.ReadLine();
        }


        public static void Main(String[] args)
        {
           
            Console.WriteLine("Enter the type of employee");
            string a = Console.ReadLine();
            salarySlip obj = new salarySlip();
            obj.basesalary = 1500;
            if (a == "manager")
            {
                obj.Manager();
            }
            if (a == "engineer")
            {
                obj.Enginer();
            }
            if (a == "HR")
            {
                obj.HR();
            }
           
            Console.ReadLine();
        }


    }
}
