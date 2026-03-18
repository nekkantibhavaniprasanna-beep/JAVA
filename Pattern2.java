// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Pattern2 {
    public static void main(String[] args) {
       int r=5;
       int c=4;
          for(int i=0;i<r;i++){
              for(int j=0;j<r-i-1;j++){
                  System.out.print("  ");
              }
              for(int k=0;k<r;k++){
                      System.out.print("* ");
                  }
             System.out.println();
          }
       
    }
}