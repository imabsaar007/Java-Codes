/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface I1
{
    void show();
}
interface I2
{
    void display();
}
class Test implements I1,I2
{
    public void show()
    {
        System.out.println("Follow EveryWhere i go");
    }
    public void display()
    {
        System.out.println("Top over the mountains and the valley low");
    }
}

public class Main
{
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
		t.display();
	}
}
