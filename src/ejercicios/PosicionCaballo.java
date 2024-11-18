package ejercicios;

public class PosicionCaballo {
    public PosicionCaballo(){
        int[][] tablero=new int[8][8];
        tablero=generarTablero();
        printAjedrez(tablero);
    }


    
    /**
     * 0=black, 1=white
     * @return A 2D array representing the chessboard. Each cell contains either 0 or 1.
     */
    public int[][] generarTablero(){
        int [][] tablero=new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2==0){
                    tablero[i][j]=1;
                } else {
                    tablero[i][j]=0;
                }
            }
        }
        return tablero;
    }


    public void printAjedrez(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]==0){
                    System.out.print("[ ]"); 
                } else if(array[i][j]==1){
                    System.out.print("[■]"); 
                }              
            }
            System.out.println("");
        }
    }
}
