import java.util.ArrayList;
import java.util.Scanner;

public class Playlist 
{
	//list to hold songs
	ArrayList<Class_Song> m_songs = new ArrayList<Class_Song>();
	
	//scanner to read input about songs from keyboard
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		//create a playlist
		Playlist favorites = new Playlist();
		
		//add songs to it
		favorites.initializePlayList();
		
		//show songs in playlist
		favorites.displayPlayList();
	}
	
	private void initializePlayList()
	{
		//read songs until user wants to quit
		System.out.println("Enter a song name or Q to quit:");
		String songName = sc.nextLine();
		
		while(!songName.equalsIgnoreCase("Q"))
		{
			System.out.println("Enter " + songName + " rank:");
			int rank = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter the artist for " + songName +":");
			String artist = sc.nextLine();
			
			//create a song object
			Class_Song nextSong = new Class_Song(songName, rank, artist);
			
			//add it to the songs list
			m_songs.add(nextSong);
			
			System.out.println("Enter a song name or Q to quit:");
			songName = sc.nextLine();	
		}
	}
	
	private void displayPlayList()
	{
		//go over list and print out details for each song
		for (Class_Song song: m_songs)
		{
			System.out.println("Name: " + song.getSongName() + " Rank: " + song.getSongRank() + " Artist: " +song.getArtist());
		}
	}
}
