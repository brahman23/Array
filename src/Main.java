public class Main {
    public static void main(String[] args) {

        Array2 maisiv = new Array2();
        maisiv.add(32,0);
        maisiv.add(33,1);
        maisiv.add(34,2);
        maisiv.add(36,3);
        maisiv.add(78,4);
        maisiv.add(7,5);
        maisiv.remove(3);


        System.out.println(maisiv.get(0));
        System.out.println(maisiv.get(1));
        System.out.println(maisiv.get(2));
        System.out.println(maisiv.get(3));
        System.out.println(maisiv.get(4));

        Array array = new Array();


        array.add(32,0);
        array.add(33,1);
        array.add(34,2);
        array.add(36,3);
        array.add(78,4);
        array.add(7,5);
        array.remove(1);


        System.out.println(array.get(0));
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        System.out.println(array.get(3));
        System.out.println(array.get(4));





    }


}
