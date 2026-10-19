public class MusicPlaylist {
/**
 * Represents the doubly linked list for the music playlist.
 */
    private SongNode head;
    private SongNode tail;
    private SongNode current;

    // constructor
    public MusicPlaylist() {
        this.head = null;
        this.tail = null;
        this.current = null;
    }
    public void addSong(String title) {
        SongNode newNode = new SongNode(title);

        if (head == null) {
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {
            newNode.prev = tail; //[cite: 1, 2]
            tail.next = newNode; //[cite: 1, 2]
            tail = newNode;      //[cite: 1, 2]
        }
    }

    public void removeSong(String title) {
        SongNode temp = head;

        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("The song isn't in the playlist"); //[cite: 1]
            return;
        }

        System.out.println("Removed: " + title);

        if (temp == head && temp == tail) {
            head = null;
            tail = null;
            current = null;
        } else if (temp == head) {
            // deleting head[cite: 1, 2]
            head = head.next;   //[cite: 1, 2]
            head.prev = null;   //[cite: 1, 2]
            if (current == temp) current = head;
        } else if (temp == tail) {
            // deleting tail
            tail = tail.prev;   //[cite: 1, 2]
            tail.next = null;   //[cite: 1, 2]
            if (current == temp) current = tail;
        } else {
            temp.prev.next = temp.next; //[cite: 1, 2]
            temp.next.prev = temp.prev; //[cite: 1, 2]
            if (current == temp) current = temp.next;
        }
    }

    // Sonraki şarkıya geçme[cite: 1]
    public void nextSong() {
        if (current != null && current.next != null) {
            current = current.next; // İleri gitme[cite: 1, 2]
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the last song of the playlist."); //[cite: 1]
        }
    }

    // Önceki şarkıya geçme[cite: 1]
    public void previousSong() {
        if (current != null && current.prev != null) {
            current = current.prev; // Geri gitme[cite: 1, 2]
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Already at the first song of the playlist."); //[cite: 1]
        }
    }

    // Mevcut şarkıyı gösterme[cite: 1]
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Current Song: " + current.title); //[cite: 1]
        }
    }

    // Tüm şarkıları gösterme[cite: 1]
    public void displayPlaylist() {
        SongNode temp = head; // Head'den başla[cite: 1]
        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next; // Next pointer'ı takip et[cite: 1]
        }
        System.out.println("END");
    }
}