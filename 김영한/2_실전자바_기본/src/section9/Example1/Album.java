package section9.Example1;


public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        //super();
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
