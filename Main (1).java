/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Employee {
    private int emp_id;
    public void SetEmpid(int eid)
    {
        emp_id = eid;
    }
    public int view_id()
    {
        return emp_id;
    }
}
public class Main
{
	public static void main(String[] args) {
	   Employee e = new Employee();
	   Employee g = new Employee();
	   e.SetEmpid(101);
	   g.SetEmpid(99);
	   System.out.println(e.view_id());
	   System.out.println(g.view_id());
	}
}
