//Team Hydration
//Roster: Zane Wang, Sophia Xia, Maggie Zhao
//APCS2 pd1
//L02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2018-04-18

public interface Deque<Card>{
    
    //Size Method
    public int size();

    //add methods
    public boolean add(Card c);
    public void addFirst(Card c);
    public void addLast(Card c);

    //Accessor Methods
    public Card element();
    public Card getFirst();
    public Card getLast();

    //Remove Methods
    public Card remove();
    public Card removeFirst();
    public Card removeLast();

}
