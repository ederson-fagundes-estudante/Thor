import java.util.*;
 
class Player {
 
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
 
        // Inicializando posicionamento
        int actualPosTx = initialTx;
        int actualPosTy = initialTy;
 
        String resultV = "";
        // game loop
        while (true) {
            int remainingTurns = in.nextInt();
 
            //Diferença entre a posição do personagem e a luz
            int differenceX = lightX-actualPosTx;
            int differenceY = lightY-actualPosTy;
           
            // return
            String result = "";
           
            //Direcionamento do personagem
            if(differenceX == 0){
                if(differenceY < 0)
                    result = "N";
                else if(differenceY > 0)
                    result = "S";
            }else{
                if(differenceX > 0)
                    result = "E";
                else if(differenceX < 0)
                    result = "W";
            }
 
            //Diagonal por que o codigo pediu do nada
            if(remainingTurns == differenceX && differenceX == differenceY || resultV.length() == 2){    
                if(differenceY < 0)
                    result = "N";
                else if(differenceY > 0)
                    result = "S";
           
                if(differenceX > 0)
                    result += "E";
                else if(differenceX < 0)
                    result += "W";
            }
 
            //atualizando valor
            switch (result){
                case "N":
                    actualPosTy += 1;
                    break;
                case "S":
                    actualPosTy -= 1;
                    break;
                case "E":
                    actualPosTx += 1;
                    break;
                case "W":
                    actualPosTx -= 1;
                    break;
                case "SE":
                    actualPosTx += 1;
                    actualPosTy -= 1;
                    break;
            }
 
            resultV = result;
 
            System.out.println(result);
 
        }
    }
}
 

