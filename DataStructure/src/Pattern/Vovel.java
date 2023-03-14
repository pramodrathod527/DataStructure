package Pattern;
public class Vovel {
	public void VowelOrConsonent(char Char) {
		if(Char=='a'||Char=='A'||Char=='e'||Char=='E'||Char=='i'||Char=='I'||Char=='o'||Char=='O'||Char=='u'||Char=='U') {
			System.out.println(Char+" is Vowel");
		}else if(Char=='b'||Char=='c'||Char=='d'||Char=='f'||Char=='g'||
				 Char=='h'||Char=='j'||Char=='k'||Char=='l'||Char=='m'||
				 Char=='n'||Char=='p'||Char=='q'||Char=='r'||Char=='s'||
				 Char=='t'||Char=='v'||Char=='w'||Char=='x'||Char=='y'||
				 Char=='z'||Char=='A'||Char=='B'||Char=='C'||Char=='D'||
				 Char=='F'||Char=='G'||Char=='H'||Char=='J'||Char=='K'||
				 Char=='L'||Char=='M'||Char=='N'||Char=='P'||Char=='Q'||
				 Char=='R'||Char=='S'||Char=='T'||Char=='V'||Char=='W'||
				 Char=='X'||Char=='Z') {
			System.out.println(Char+" is Consonent");
		}else {
			System.out.println("Invalid Charcter!");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vovel obj = new Vovel();	
		obj.VowelOrConsonent('a');		obj.VowelOrConsonent('b');	obj.VowelOrConsonent('A');
		obj.VowelOrConsonent('B');
		obj.VowelOrConsonent('5');
	}
}
