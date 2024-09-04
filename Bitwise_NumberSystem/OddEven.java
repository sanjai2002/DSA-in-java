class OddEven{
    public static void main(String[] args) {
        int number=11; 
        System.out.println(isodd(number));       
    }

    public static boolean  isodd(int number){
        return (number&1)==1;

    }
}