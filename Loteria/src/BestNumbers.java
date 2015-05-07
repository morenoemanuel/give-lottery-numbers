import java.util.Random;


	public class BestNumbers {

	Random rdm = new Random();
	
	public int numRegular[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59};
	
	public int numBall[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
	
	public int contador = 0;
	public void powerballBest(){
	
		for (int a=0; a<6; a++){
			for (int i=0; i < 9366819  ;i++){
				contador++;
				int numero = numRegular[rdm.nextInt(59)];
				int numero2 = numRegular[rdm.nextInt(59)];
				
				if (numero == numero2){
					System.out.println("Repite numero "+numero);
					break;
					
				}
				
		}

			
		}
		
		System.out.print("PowerBall "+ numBall[rdm.nextInt(35)]);
		System.out.println("Valor contador "+contador);
	}
}
