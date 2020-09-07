interface Covid {

        int cases = 100000; //(1 lakh in Bihar)

        void stats();
}

class Demo {

        public static void main(String[] args) {

                //By default variables of an interface are static
                System.out.println(Covid.cases);
        }
}
