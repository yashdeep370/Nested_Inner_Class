public class nested {
    public static void main(String[] args) {
        outer o = new outer();
        o.outerdisplay();
        outer.inner i = new outer().new inner();
    }
}

class outer 
{
    int x=10;
    class inner
    {
        int y = 20;
        void innerdisplay()
        {
            System.err.println(x);
            System.err.println(y);
        }
    }
    void outerdisplay()
    {
        inner i = new inner();
        i.innerdisplay();
        System.err.println(i.y);
    }
}