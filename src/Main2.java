public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        ///Shallow Copy
        Masina masina1 = new Masina("Fiat" , "Negru");
        Student Ana = new Student("Äna" , "Maria" , masina1);
        Student andrei = null;

        andrei = (Student)Ana.clone();
        System.out.println(andrei.toString());

        andrei.revopseste("Galben");
        System.out.println("Shallow copy:");
        System.out.println(andrei.toString());
        System.out.println(Ana.toString());

        Masina1 car = new Masina1("Fiat" , "Negru");
        Student2 student2 = new Student2("Ana" , "J" , car);

        System.out.println("");

        Student2 st = null ;
        st=(Student2)student2.clone();
        System.out.println(st.toString());
        System.out.println("Shallow copy:");
        st.revopseste("Rosu");
        System.out.println(st.toString());
        System.out.println(student2.toString());


    }
}
