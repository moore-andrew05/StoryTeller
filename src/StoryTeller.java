import java.util.Random;

public class StoryTeller {
	String message = "Hello World!";
	String[] dict = new String[]{"the", "house", "is", "falling", "and", "our", "dog", "on", "we", "I"};	
	Word_Data words = new Word_Data();
	Random r = new Random();

	public StoryTeller(String message) {
		this.message = message;
	}

	public void print_message() {
		System.out.println(this.message);
	}

	public void random_word(int part) {
		switch(part) {
			case(0): 
				System.out.print(words.adjectives[r.nextInt(words.adjectives.length)]);
				break;
			case(1):
				System.out.print(words.nouns[r.nextInt(words.nouns.length)]);
				break;
			case(2):
				System.out.print(words.verbs[r.nextInt(words.verbs.length)]);
				break;
			case(3):
				System.out.print(words.adverbs[r.nextInt(words.adverbs.length)]);
				break;
			default:
				random_word(1);
				break;
		}
	}

	public int sentence_length() {
		int percent = r.nextInt(100) + 1;
		//System.out.println(percent);
		if(percent > 95) return 15;
		if(percent > 90) return 13;
		if(percent > 75) return 11;
		if(percent > 60) return 8;
		if(percent > 40) return 7;
		if(percent > 25) return 5;
		if(percent > 15) return 4;
		if(percent > 5) return 3;
		return 2;
	}

	public void tell_me_a_tale(int size) {
		for(int i = 0; i < size; i++) {
			int cursor = 0;
			int last_word = 5;
			int s_length = sentence_length();
			while(cursor < s_length) {
				int word_type = r.nextInt(4);
				if(word_type == last_word) {continue;}
				random_word(word_type);
				System.out.print(" ");
				last_word = word_type;
				cursor++;
			}
			System.out.print("\n");
		}
	}


	//Place Random Object as instance variable.
	/*
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
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)]);
				System.out.print(". ");
			} else if(stype == 1) {
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.verbs[r.nextInt(d.verbs.length)] + " ");
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)] + " ");
				System.out.print(d.adjectives[r.nextInt(d.adjectives.length)] + " ");
				System.out.print(d.nouns[r.nextInt(d.nouns.length)] + " ");
				System.out.print(d.adverbs[r.nextInt(d.adverbs.length)]);
				System.out.print(". ");
			}
		}
	}
	*/
	
	public static void main(String[] args) {
		StoryTeller t = new StoryTeller("Hello Universe");
		//t.print_message();
		//t.tell_me_a_tale();
		t.tell_me_a_tale(50000);
	}
}
