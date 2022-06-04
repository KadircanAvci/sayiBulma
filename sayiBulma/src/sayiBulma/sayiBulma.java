package sayiBulma;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak =0;
		boolean varMi=false;
		
		for(int i=0;i<sayilar.length;i++) {
			
			if(sayilar[i]==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi==true) {
			System.out.println("Sayı listede vardır");
			
		}
		else {
			System.out.println("Sayı yoktur");
		}
		}
		
		
	}


