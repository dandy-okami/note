package testexo;

import java.util.Scanner;

public class GestionDeNotes {
	private int note[];
	private boolean entier;
	private int nb;
	
	public GestionDeNotes(int x){
		note=new int[x];
		
	}
	public int saisirUneNote(Scanner scanner) {
		String saisie;
		while (entier == false) {
				try {
					
					saisie = scanner.nextLine();
					nb = Integer.parseInt(saisie);
					return nb;
				} catch (NumberFormatException ex) {
					entier =false;
					System.out.println("Its not a valid Integer");
				}
			}
		return 0;
	}
		public void saisirNotes() {
			 Scanner scanner = new Scanner(System.in);
			System.out.println("saisir les notes");
		  for(int i = 0; i < note.length; i++) {
		    note[i] =saisirUneNote(scanner);  
		  }
		}
		private void affiche(){
			 for(int i = 0; i < note.length; i++) {
				    System.out.println("indice"+i+" note:"+note[i]);   
				  }
		}
	public static void main(String[] args) {
		GestionDeNotes t5 = new GestionDeNotes(2);
		t5.saisirNotes();
		t5.affiche();
	}
}
