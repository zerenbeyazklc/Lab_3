/**
 * MusicPlayerDemo.java
 * Tests the playlist
 */
public class MusicPlayerDemo {

    public static void main(String[] args) {

        // create Playlist [cite: 1]
        MusicPlaylist playlist = new MusicPlaylist();

        // add songs [cite: 1]
        playlist.addSong("Shape of You - Ed Sheeran");
        playlist.addSong("Save Me - BTS");
        playlist.addSong("Snap - Manifest");
        playlist.addSong("like JENNIE - JENNIE");

        System.out.println("=== PLAYLIST ===");
        // show playlist [cite: 1]
        playlist.displayPlaylist();

        System.out.println("\n=== CURRENT SONG PLAYING ===");
        playlist.displayCurrentSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== NEXT SONG TO PLAY ===");
        playlist.nextSong();

        System.out.println("\n=== PREVIOUS SONG TO PLAY ===");
        playlist.previousSong();

        System.out.println("\n=== AFTER REMOVING Shape of You SONG ===");
        // delete "Shape of You - Ed Sheeran" song and show the list [cite: 1]
        playlist.removeSong("Shape of You - Ed Sheeran");
        playlist.displayPlaylist();

        System.out.println("\n=== AFTER REMOVING Snap SONG ===");
        // delete "Snap - Manifest" and show the list [cite: 1]
        playlist.removeSong("Snap - Manifest");
        playlist.displayPlaylist();
    }
}
