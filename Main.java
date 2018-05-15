class Main {

	public static void main(String[] args){
		if( args.length == 0){
			System.out.println("germac-Error: Es wurden keine Quelldateien übergeben.");
			System.exit(1);
		}

		for(String sourcefile: args){
			compile(sourcefile);
		}

	}

	private static void compile(String sourcefile){
		System.out.print("Verarbeite "+sourcefile+"... ");
		// read file
		// replace words
		// write temporary .java-file
		// compile temporary .java
		// delete .java
		System.out.println("OK");
	}

}
