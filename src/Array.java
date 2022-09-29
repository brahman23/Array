public class Array {
    private int [] array = new int[0];
    public void add(int element,int index){
        int [] temp = new int[array.length+1];
        System.arraycopy(array,0,temp,0,index);
        System.arraycopy(array,index,temp,index+1,array.length-index);
        temp[index] = element;
        this.array=temp;
    }
    public void remove(int index){
        int [] temp = new int[array.length-1];
        System.arraycopy(array,0,temp,0,index);
        System.arraycopy(array,index+1,temp,index,array.length-index-1);
        this.array=temp;
    }
    public int get( int index){
        return array[index];
    }


}
