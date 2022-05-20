import java.util.Random;


public class Test_Class {
	String message = "Hello World!";
	String[] dict = new String[]{"the", "house", "is", "falling", "and", "our", "dog", "on", "we", "I"};	

	
	public Test_Class(String message) {
		this.message = message;
	}
	
	public void print_message() {
		System.out.println(this.message);
	} 

	public void tell_me_a_tale() {
		Word_Data d = new Word_Data();
		for(int i = 0; i < 50000; i++) {
			Random r = new Random();
			int stype = r.nextInt(2);
			if (i % 10  == 0) {
				System.out.print("\n\n" + "      ");
			}
			if(stype == 0) {
				System.out.print(d.adjectives[r.nextInt(d.adjectives.length)] + " ");
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.verbs[r.nextInt(d.verbs.length)] + " ");
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)] + " ");
				System.out.print(". ");
			} else if(stype == 1) {
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.verbs[r.nextInt(d.verbs.length)] + " ");
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)] + " ");
				System.out.print(d.adjectives[r.nextInt(d.adjectives.length)] + " ");
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)] + " ");
			}
		}
	}

	public static void main(String[] args) {
		Test_Class t = new Test_Class("Hello Universe");
		//t.print_message();
		t.tell_me_a_tale();
	}
}
