// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int n=4;
        int c=6;
        for(int i=0;i<n;i++){
            for(int j=0;j<c/2-i;j++){
                System.out.print("_ ");
            }
        
            for(int k=0;k<c/2+i;k++){
            System.out.print("* ");
            }
            System.out.println();
        }
            
        
    }
}