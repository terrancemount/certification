package com.revature.NestedClasses;

public class LocalInnerClass {
	private int x = 10;
	class B {
		private int x = 20;
		class C{
			private int x = 30;
			public void allTheX() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(LocalInnerClass.this.x);
			}
		}
	}
	public static void main(String[] args) {
		LocalInnerClass a = new LocalInnerClass();
		LocalInnerClass.B b = a.new B();
		LocalInnerClass.B.C c = b.new C();
		c.allTheX();
	}
}
