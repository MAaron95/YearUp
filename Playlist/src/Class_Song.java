
public class Class_Song 
{
	//member variables to store info about the song
	private String m_songName = null;
	private int m_songRank = -1;
	private String m_artist = null;

	Class_Song(String name, int rank, String artist)
	{
		setSongName(name);
		setArtist(artist);
		setSongRank(rank);
	}
	
	//getters and setters
	public String getSongName()
	{
		return m_songName;
	}
	
	public void setSongName(String songName)
	{
		 m_songName = songName;
	}
	
	public int getSongRank()
	{
		return m_songRank;
	}
	
	public void setSongRank(int songRank)
	{
		 m_songRank = songRank;
	}
	
	public String getArtist()
	{
		return m_artist;
	}
	
	public void setArtist(String artist)
	{
		m_artist = artist;
	}
}
