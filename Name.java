public class Name {
    private String myFirst;
    private String myLast;

    public Name(String first, String last){
        this.myFirst = fixCase(first);
        this.myLast = fixCase(last);
    }

    public String fullName(){
        return myFirst + " " + myLast;
    }

    public String fixCase(String part){
        if(!part.equals("")){
        part = part.toLowerCase();
        return part.substring(0,1).toUpperCase() + part.substring(1);
        }
        return part; 
    }
    //compare the first and last to see if the same
    public boolean isSame(Name other){
        return this.myFirst == other.myFirst;
    }
}
