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
class Test implements I1
{
    public void show()
    {
        System.out.println("Hi Iam Test");
    }
	public static void main(String[] args) {
		Test t = new Test();
		t.show();
	}
}
