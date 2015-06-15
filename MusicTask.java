import java.util.Arrays;


public class MusicTask {

	public static void main(String[] args) {
		Artist a1 = new Artist("Osvajaci", true, 1990, "Heavy metal");
		Artist a2 = new Artist("Galija", true, 1977, "Heavy metal");
		Artist a3 = new Artist("Gile", false, 1990, "Rock");
		
		Song s1 = new Song(a1 , "Krv i led", 1991 , "Glam metal" );
		Song s2 = new Song(a1 , "Gde da pobegnem", 1991 , "Heavy metal" );
		Song s3 = new Song(a1 , "Sam", 1995 , "Heavy metal" );
		Song s4 = new Song(a1 , "Maska", 1995 , "Heavy metal" );
		Song s5 = new Song(a2 , "Skadarska", 1991 , "Folk rock" );
		Song s6 = new Song(a2 , "Trube", 1991 , "Folk rock" );
		Song s7 = new Song(a2 , "Kotor", 1997 , "Folk rock" );
		Song s8 = new Song(a2 , "Burna pijana noc", 1982 , "Symphonic rock" );
		Song s9 = new Song(a3 , "Ne prestaju moje kise", 2013 , "Folk" );
		Song s10 = new Song(a3 , "Zasto sam sam", 2013 , "Folk" );
		
		
		
		Album al1 = new Album("Krv i led", a1, new Song[2], "Heavy metal");
		al1.songs[0] = s1;
		al1.songs[1] = s2;
		
		Album al2 = new Album("Sam", a1, new Song[2], "Heavy metal");
		al2.songs[0] = s3;
		al2.songs[1] = s4;
		
		Album al3 = new Album("Ipak verujem u sebe", a2, new Song[1], "Symphonic rock");
		al3.songs[0] = s8;
		
		Album al4 = new Album("Istorija, ti i ja", a2, new Song[2], "Folk rock");
		al4.songs[0] = s5;
		al4.songs[1] = s6;

		Album al5 = new Album("Voleti voleti", a2, new Song[1], "Folk rock");
		al5.songs[0] = s7;
		
		Album al6 = new Album("Covek tvoga sna", a3, new Song[2], "Folk");
		al6.songs[0] = s9;
		al6.songs[1] = s10;
		
		Concert c1 = new Concert(new Artist [3], new Song[10]);
		c1.artist[0] = a1;
		c1.artist[1] = a2;
		c1.artist[2] = a3;
		c1.songs[0] = s1;
		c1.songs[1] = s2;
		c1.songs[2] = s3;
		c1.songs[3] = s4;
		c1.songs[4] = s5;
		c1.songs[5] = s6;
		c1.songs[6] = s7;
		c1.songs[7] = s8;
		c1.songs[8] = s9;
		c1.songs[9] = s10;
		
		System.out.println(sameArtist(s4, s8));
		System.out.println(isFromSoloArtist(s5));
		System.out.println(getOlderSong(s7, s5).songName);
		System.out.println(countGenreNumber(al6, "Folk"));
		printAlbumInformation(new Album[]{al1,al2,al3,al4,al5,al6}, s9);
		System.out.println(Arrays.toString(getNumberOfSongsPerAlbum(c1, new Album[] {al1,al2,al3,al4,al5,al6})));
		System.out.println(getMaxNumberOfSongs(c1));
	}
	/**
	 * Determine is songs comes from same artist
	 * @param s1 - A song
	 * @param s2 - A song
	 * @return boolean
	 */
	public static boolean sameArtist(Song s1, Song s2) {
		return (s1.artist.nameOfArtist == s2.artist.nameOfArtist) ? true
				: false;
	}
	/**
	 * Determine is song performed by solo artist
	 * @param s - A song
	 * @return boolean
	 */
	public static boolean isFromSoloArtist(Song s) {
		return (s.artist.isBand == true) ? false : true;
	}
	/**
	 * Determine which song is created before
	 * @param s1 - A song
	 * @param s2 - A song
	 * @return a song
	 */
	public static Song getOlderSong(Song s1, Song s2) {
		return (s1.year >= s2.year) ? s2 : s1;
	}
	/**
	 * Determines how many song of given genre is on the given album
	 * @param a - album
	 * @param genre - String genre
	 * @return integer 
	 */
	public static int countGenreNumber(Album a, String genre) {
		int counter = 0;
		for (int i = 0; i < a.songs.length; i++) {
			if (a.songs[i].genreOfSong == genre) {
				counter++;
			}
		}
		return counter;
	}
	/**
	 * Determine which album contains given song and print on the console album 
	 * informations
	 * @param a
	 * @param s
	 */
	public static void printAlbumInformation(Album[] a, Song s) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].songs.length; j++) {
				if (a[i].songs[j].songName == s.songName) {
					System.out.println(a[i].nameOfAlbum);
					return;
				}
			}
		}
		System.out.println("null");
	}
	/**
	 * Determines how many songs are performed from each albums on the concert
	 * @param c - Concert 
	 * @param a - Album
	 * @return array of integer
	 */
	public static int[] getNumberOfSongsPerAlbum(Concert c, Album[] a){
		int counter = 0;
		int [] numberOfSong = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			counter = 0;
			for (int j = 0; j < a[i].songs.length; j++){
				for(int k = 0; k < c.songs.length; k++){
					if(c.songs[k].songName == a[i].songs[j].songName){
						counter ++;
					}
				}
				numberOfSong[i] = counter;
			}
				
		}
		return numberOfSong;
	}
	/**
	 * Determines which artist is performed most number of songs and return number 
	 * of songs
	 * @param c - Concert
	 * @return - integer
	 */
	public static int getMaxNumberOfSongs(Concert c){
		int counter = 0;
		int [] maxNumber = new int[c.artist.length];
		for(int i = 0; i < c.artist.length; i++){
			counter = 0;
			for(int j = 0; j < c.songs.length; j++){
				if(c.songs[j].artist.nameOfArtist == c.artist[i].nameOfArtist){
					counter++;
				}
			}
			
			maxNumber[i] = counter;	
		}
		int max = maxNumber[0];
		for(int i = 0; i < maxNumber.length; i++){
			max = (max >= maxNumber[i])? max:maxNumber[i];
		}
		return max;
	}
}
