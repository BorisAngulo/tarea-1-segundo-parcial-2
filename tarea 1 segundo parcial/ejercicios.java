
public class ejercicios
{
    public int escalera(int n){
        int n1 = 1;
        int n2 = 2;
        int n3 = 4;
        int resp = 0;
        for(int i = 2 ; i <= n; i++){
            if((i + 1) % 2 == 0){
                resp = n1 + 1;
                n1 = resp + 4;
            }else if(i % 2 == 0){
                resp = n2 + 2;
                n2 = resp + 4;
            }else if(i % 2 != 0){
                resp = n3 + 3;
                n3 = resp + 4;
            }
            
        }
        
        return resp;
    }
    
    public int padovan(int n){
        int padovan[] = new int[n];
        padovan [0] = 1;
        padovan [1] = 1;
        padovan [2] = 1;
        int resp = 0;

        for(int i = 3 ; i < padovan.length; i++){
            padovan[i] = padovan[i - 2] + padovan [i - 3];
            resp = padovan[i];
        }
        return resp;
        
    }
}
 