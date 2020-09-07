abstract class Parent {

        static int a = 1001;

        static void showA() {

                System.out.println(a);
        }
}

class Child extends Parent {

}

class Demo {

        public static void main(String[] args) {

                new Child().showA();
        }
}
