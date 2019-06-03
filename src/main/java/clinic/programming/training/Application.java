package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application{
	
	public int countWords(String words){
		String[] separateWords = StringUtils.split(words, ' ');
		return (separateWords == null) ? 0 : separateWords.length;
	}


	public Application(){
		System.out.println("Dentro de la aplicacion");
	}

	public static void main (String[] args){
		System.out.println("Empezando aplicacion");
		Application app = new Application();
		System.out.println("Segundo java");
		int count = app.countWords("I have four words");
		System.out.println("Word Count: " + count);
	}
}
