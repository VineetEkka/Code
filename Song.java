public class Song {
    private String name;
    private int year,numberOfWriters,rating;
    private String []writers;

    public Song(String name){
        this.name=name;
        numberOfWriters=year=0;
        rating=0;
        writers=new String[50];

    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setRating(int rating){
        this.rating=rating;

    }
    public int getRating(){
        return rating;
    }
    public void addWriter(String writerName){

        if ( numberOfWriters < 50 ) {
            writers[numberOfWriters] = writerName;
            numberOfWriters += 1;
        } else {
            System.out.println("Array of writers is full (max is 50 writers)");
        }
    }

    public String[] getWriters()
    {
       return writers;
    }

    public int getNumberOfWriters(){
        return numberOfWriters;
    }
    public String getWriterAtIndex(int index){
        return writers[index];
    }
    public String toString(){
        return name+","+year+","+rating;
    }

    public boolean equals(Object other){
        if(other instanceof Song){
            Song otherSong=(Song)other;
            int j=0;
            int wo=otherSong.getNumberOfWriters();
            if(numberOfWriters==wo){
                if(name.equals(otherSong.getName())&& year== otherSong.getYear()){
                    for (int i = 0; i < wo; i++) {
                        for(j=0;j<wo;j++){
                            if(writers[i]==otherSong.getWriters()[j]){
                                break;
                            }
                        }
                        if(j==wo){
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public int compareTo(Song other){


        return this.name.compareToIgnoreCase(other.name);
        /*
        int a=(other.getName()).compareTo(this.name);
        if(a>0){
            return 1;

        }
        else if(a==0){
            return 0;
        }
        else {
            return -1;
        }
        */

    }






}
