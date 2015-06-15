
public class Album {
	public String nameOfAlbum;
	public Artist artist;
	public Song[] songs; 
	public String genreOfAlbums;
	
	public Album(String nameOfAlbum, Artist artist, Song[] songs,
			String genreOfAlbums) {
		super();
		this.nameOfAlbum = nameOfAlbum;
		this.artist = artist;
		this.songs = songs;
		this.genreOfAlbums = genreOfAlbums;
	}
	
	
}
