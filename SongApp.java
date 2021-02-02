/*
 *
 * This class implements a library of songs
 *
 * @author CS111 - Rutgers University
 *
 */
public class SongApp {

    private Song[] items;      // keep Songs in an unsorted array
    private int numberOfItems; // number of Songs in the array

    /*
     * Default constructor creates array with capacity for 5 Songs
     */
    SongApp () {
        items=new Song[5];
        numberOfItems=0;
    }

    /*
     * One argument constructor creates array with user defines capacity
     *
     * @param capacity defines the capacity of the Song library
     */
    SongApp (int capacity) {
        Song items[]=new Song[capacity];
        numberOfItems=0;
    }

    /*
     * Add a Song into the library (unsorted array)
     *
     * If the library is full (there is not enough space to add another Song)
     *   - create a new array with double the size of the current array.
     *   - copy all current Songs into new array
     *   - add new Song
     *
     * @param m The Song to be added to the library
     */
    public void addSong (Song m) {
        if(items.length == numberOfItems)
        {
            Song[] items2 = new Song[items.length *2 ];
            for(int i=0; i< items.length; i++)
            {
                items2[i] = items[i];
            }
            items2[items.length] = m;
            items = items2;
        }
        else
        {
            items[numberOfItems]= m;
        }
        numberOfItems++;
    }

    /*
     * Removes a Song from the library. Returns true if Song is removed, false
     * otherwise.
     * The array should not become sparse after a remove, that is, all Songs
     * should be in consecutive indexes in the array.
     *
     * @param m The Song to be removed
     *
     */
    public boolean removeSong (Song m) {
        for (int i = 0; i <numberOfItems; i++) {
            if(items[i].equals(m)){
                for (int j = i; j <numberOfItems-1 ; j++) {
                    items[j]=items[j+1];
                }
                numberOfItems--;
                items[numberOfItems]=null;
                return true;
            }
        }
        return false;

    }

    /*
     * Returns the library of songs
     *
     * @return The array of Songs
     */
    public Song[] getSongs () {
        return items;
    }

    /*
     * Returns the current number of Songs in the library
     *
     * @return The number of items in the array
     */
    public int getNumberOfItems () {
        return numberOfItems;
    }

    /*
     * Update the rating of Song @m to @rating
     *
     * @param @m The Song to have its ratings updated
     * @param @rating The new rating of @m
     * @return tue if update is successful, false otherwise
     *
     */
    public boolean updateRating (Song m, int rating) {
        for (int i=0;i<items.length; i++) {
            if(items[i].equals(m)){
                items[i].setRating(rating);
                return true;
            }

        }
        return false;
    }

    /*
     * Prints all Song
     */
    public void print () {
        for (int i=0;i<items.length; i++) {
            System.out.println(items[i]);
        }
    }

    /*
     * Return all the Songs by @songwriter. The array size should be the
     * number of Songs by @songwriter.
     *
     * @param songwriter The songwriter's name
     * @param An array of all the Songs by @songwriter
     *
     */
    public Song[] getSongsBySongwriter (String songwriter) {
        Song[] items2;
        int count =0;
        int k=0;
        for(int i=0;i<numberOfItems;i++)
        {
            for(int j=0;j<items[i].getNumberOfWriters(); j++)
            {
                if(songwriter.equals(items[i].getWriterAtIndex(j)))
                {
                    count++;
                    break;
                }
            }
        }
        items2= new Song[count];
        for(int i=0;i<numberOfItems; i++)
        {
            for(int j=0;j<items[i].getNumberOfWriters(); j++)
            {
                if(songwriter.equals(items[i].getWriterAtIndex(j)))
                {
                    items2[k] = items[i];
                    k++;
                    break;
                }
            }
        }
        return items2;
    }

    /*
     * Return all the Songs released in @year. The array size should be the
     * number of Songs made in @year.
     *
     * @param year The year the Songs were made
     * @return An array of all the Songs made in @year
     *
     */
    public Song[] getSongsByYear (int year) {
        int count = 0;
        int indexer=0;
        Song[] items2;
        for(int i=0;i< numberOfItems;i++){
            if(items[i].getYear()==year){
                count++;
            }
        }
        items2 = new Song[count];
        for(int i=0;i<numberOfItems;i++){
            if(items[i].getYear()==year){
                items2[indexer] = items[i];
                indexer++;
            }
        }
        return items2;
    }

    /*
     * Return all the Songs with ratings greater then @rating
     *
     * @param rating
     * @return An array of all Songs with rating greater than @rating
     *
     */
    public Song[] getSongsWithRatingsGreaterThan (int rating) {
        int k=0;
        int count=0;
        Song[] items2;
        for(int i=0;i<numberOfItems;i++)
        {
            if(items[i].getRating()>rating)
            {
                k++;
            }
        }
        items2 = new Song[k];
        for(int i=0;i<numberOfItems;i++)
        {
            if(items[i].getRating()> rating)
            {
                items2[count]=items[i];
                count++;
            }
        }
        return items2;
    }

    /*
     * Search for Song name @name using binary search algorithm.
     * Assumes items is sorted
     */
    public Song searchSongByName (String name) {
        int max = items.length - 1;
        int min = 0;
        int mid;
        while(max>= min){
            mid =(min+max)/2;
            if(items[mid]!=null && name.compareTo(items[mid].getName()) > 0)
            {
                min = mid + 1;
            }
            else if(items[mid] != null&& name.compareTo(items[mid].getName()) < 0)
            {
                max=mid -1;
            }
            else
            {
                return items[mid];
            }
        }
        System.out.println("Song not found");
        return null;
    }

    /*
     * Sorts Songs by year using insertion sort
     */
    public void sortByYear () {
        for(int i=1;i<numberOfItems;i++)
        {
            Song items2 = items[i];
            int k=i-1;
            while(k>=0)
            {
                if(items[k].getYear() > items2.getYear())
                {
                    items[k+1] = items[k];
                    k-=1;
                }
                else{
                    break;
                }
            }
            items[k+1]=items2;
        }
    }

    /*
     * Sorts array of Songs by name using selection sort
     */
    public void sortByName () {
        for(int i = numberOfItems - 1; i > 0; i--){
            int max = 0;
            for(int j = 1; j <=i; j++){
                if(items[j].getName().compareTo(items[max].getName()) > 0)
                {
                    max = j;
                }
            }
            Song items2=items[max];
            items[max]=items[i];
            items[i] = items2;
        }
    }

    /*
     * Search for Song name using recursive linear search
     * @param name The name of the song to search
     * @param Songs The array containing all songs
     * @param l The left index
     * @param r The right index
     * @return The song with name @name or null if song is not found
     */
    public static Song searchSongByName (String name, Song[] Songs, int l, int r) {
        if(l > r)
        {
            return null;
        }
        else
        {
            if(Songs[l]!= null && Songs[l].getName().equals(name))
            {
                return Songs[l];
            }
            else
            {
                return searchSongByName(name, Songs, l + 1, r);
            }
        }
    }


    }

