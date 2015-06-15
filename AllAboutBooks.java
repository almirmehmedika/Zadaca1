public class AllAboutBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("The notebook", 1996, "romantic novel", true);
		Book b2 = new Book("Dear John", 2006, "romantic novel", true);
		Book b3 = new Book("The best of me", 2011, "romantic novel", true);
		Book b4 = new Book("The Fellowship of the Ring", 1954,
				"adventure, high fantasy", true);
		Book b5 = new Book("A game of thrones", 1996, "epic fantasy", true);

		Author a1 = new Author("Nicolas Sparks", 1965, new Book[3]);
		a1.books[0] = b1;
		a1.books[1] = b2;
		a1.books[2] = b3;

		Author a2 = new Author("J. R. R. Tolkien", 1892, new Book[1]);
		a2.books[0] = b4;

		Author a3 = new Author("George R. R. Martin", 1948, new Book[1]);
		a3.books[0] = b5;

		System.out.println("This author have : " + countBestsellingBooks(a1)
				+ " bestseller books");
		int year1 = 1996;
		int year2 = 2011;
		System.out.println("Number of published books between " + year1
				+ " and " + year2 + " is: "
				+ getNumberOfWrittenBooks(a1, year1, year2));
		System.out.println(getAuthorWithMostBestsellers(new Author []{a1,a2,a3}).nameOfAuthor);
	}

	/**
	 * Count how many bestseller books author has
	 * 
	 * @param a
	 *            - Author
	 * @return - integer of bestseller books
	 */
	public static int countBestsellingBooks(Author a) {
		int counter = 0;
		for (int i = 0; i < a.books.length; i++) {
			if (a.books[i].isBestseller == true) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Count how many books is published between year 1 and year 2
	 * 
	 * @param a
	 *            - Author
	 * @param year1
	 *            - integer year
	 * @param year2
	 *            - integer year
	 * @return integer number of books
	 */
	public static int getNumberOfWrittenBooks(Author a, int year1, int year2) {
		int minYear = (year1 >= year2) ? year2 : year1;
		int maxYear = (year2 > year1) ? year2 : year1;
		int counter = 0;
		for (int i = minYear; i <= maxYear; i++) {
			for (int j = 0; j < a.books.length; j++)
				if (i == a.books[j].yearOfPublishing) {
					counter++;
				}
		}
		return counter;
	}
	/**
	 * Finding author with most bestsellers and print his name on the console
	 * @param authors - Array of authors
	 * @return Author name
	 */
	public static Author getAuthorWithMostBestsellers(Author[] authors) {
		int counter = 0;
		int [] bestselling = new int [authors.length];
		for (int i = 0; i < authors.length; i++) {
			counter = 0;
			for (int j = 0; j < authors[i].books.length; j++) {
				if (authors[i].books[j].isBestseller == true) {
					counter++;
				}
			}
			bestselling[i] = counter;
		}
		int max = bestselling[0];
		for(int i = 0 ; i < bestselling.length; i++){
			if(max >= bestselling[i]){
			}else{
				max = bestselling[i];
			}
		}
		
		for(int i = 0; i < authors.length; i++){
			counter = 0;
			for(int j = 0; i < authors[i].books.length; j++){
				if (authors[i].books[j].isBestseller == true){
					counter++;
				}
				if(counter == max){
					return authors[i];
				}
			}
		}
		return null;
	}
}
