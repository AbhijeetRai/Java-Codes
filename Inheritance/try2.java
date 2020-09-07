class Demo {

        Demo() {

                this(10);
        }

        Demo(int a) {

                this(); //recursion in Constructor is not allowed in java
        }
}
