class pattern2{
    public static void main(String[] args) {
        int a=9;
        for(int i=0;i<=a;i++){
           for(int j=0;j<=a;j++){
             if(j%2==0 && i%2==0){
                System.out.printf("*");
             }
             else{
                System.out.printf("#");
             }
           }
           System.out.println();
        }
    }
}