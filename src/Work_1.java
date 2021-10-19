
public class Work_1 {

    public static void main(String[] args){

        al<String> list = new al<>();

        list.add("红岩网校Android");

        list.removeFromIndex(0);

        list.add( 0 , "加油冲冲冲!" );

        System.out.println( list.get(0) );

        System.out.println( "list中拥有 " + list.Size() + " 个元素" );

        return;

    }

}
