package testvagrantTest;
import java.util.LinkedList;

public class PlayList {
	public static void main(String[] args) {
	
    // Create a LinkedList to represent the playlist
    LinkedList<String> playlist = new LinkedList<>();

    // Add initial songs to the playlist
    playlist.add("S1");
    playlist.add("S2");
    playlist.add("S3");

    // Function to simulate playing a song
    // This method will move the played song to the end of the playlist
    // If the playlist exceeds the capacity, it will remove the first song
    // and add the new song to the end
    playSong(playlist, "S4");
    playSong(playlist, "S2");
    playSong(playlist, "S1");
}

// Function to simulate playing a song
private static void playSong(LinkedList<String> playlist, String song) {
    // Check if the playlist is at full capacity
    if (playlist.size() >= 3) {
        // Remove the first song from the playlist
        playlist.removeFirst();
    }
    
    // If the playlist is empty or the song is already in the playlist,
    // just add the song to the end
    if (playlist.isEmpty() || playlist.contains(song)) {
        playlist.add(song);
    } else {
        // If the song is not in the playlist, remove it if exists in the middle
        // and add it to the end
        if (playlist.indexOf(song) != -1) {
            playlist.remove(song);
        }
        // Add the song to the end of the playlist
        playlist.add(song);
    }

    // Print the updated playlist
    System.out.println("Current Playlist: " + playlist);
}

}
