class Exercise{
	public static void main(String[] args) {
		String c1="Hello world";
		String c2=c1;
		c2="Hello Java";
		System.out.printf("%s\n%s\n",c1,c2);
		System.out.println("����ָ����ڴ��ַ:");
		System.out.println(c1.getClass()+"@"+c1.hashCode());
		System.out.println(c2.getClass()+"@"+c2.hashCode());
		System.out.println("���ö�����ڴ��ַ:");
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(c2));
	}
}