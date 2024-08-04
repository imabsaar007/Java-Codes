/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A
{
    int i=109;
}
class B extends A
{
    int i = 20;
    void show(int i)
    {
        System.out.println(i);
        System.out.println(this.i);
        System.out.println(super.i);
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		B b = new B();
		b.show(40);
	}
}
