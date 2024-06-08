package Ex_110422024;

public class Lab_060 {
    public static void main(String[] args) {
        //double the salary of employees
        int atb6xstudemts_salary[]={22,50,100,35,44,55};
        int new_salary[]=new int[6];
        for (int i=0;i<atb6xstudemts_salary.length;i++)
        {
           new_salary[i] =atb6xstudemts_salary[i]*2;
        }
        for (int j=0;j<new_salary.length;j++)
        {
            System.out.println(new_salary[j]);
        }
    }
}
