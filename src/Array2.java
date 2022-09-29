public class Array2 {
    private int array2 [] = new int [0];

    public void add(int element, int index) {
        int[] temp = new int[array2.length + 1];
        for (int i = 0; i < array2.length; i++) {
            temp[i] = array2[i];
        }
        for (int i = 0; i < array2.length - index; i++) {
            temp[index + 1] = array2[index];

        }


        temp[index] = element;
        this.array2 = temp;
    }

    public void   remove( int index) {
        int[] temp = new int[array2.length - 1];

        for (int i = 0; i <index; i++) {
            temp[i] = array2[i];

        }


        for (int i = index+1; i < array2.length; i++) {
            temp[i-1] = array2[i];
        }

        this.array2 = temp;


    }

    public int get(int index) {
        return array2[index];
    }

}
