class Demo {

	Demo() {

	}

	Demo(String s) {

	}

        static void fun(Object o, String s) {

                System.out.println(o);
                System.out.println(s);
		System.out.println();
        }

        public static void main(String[] args) {

                fun("Paris", "Milan");
		fun(new Demo(), "Milan");
		fun(new String("Paris"), "Milan");
		fun(new Character('A'), "Milan");
		fun(new StringBuffer("Rome"), "Milan");
		fun(new Float(101.5), "Milan");
		fun(new Integer(100), "Milan");
		fun(new Demo("Paris"), "Milan");
        }
}
