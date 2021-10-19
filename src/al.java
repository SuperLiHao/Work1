import java.util.Objects;

public class al<E> {


    Object[] mem;//内存

    //add
    public void add(E k) {

        if ( mem == null ){

            mem = new Object[1];mem[0] = k;//新开内存 一位

            return;

        }else{

            Object[] temp_mem = new Object[ mem.length + 1 ]; //新增内存

            for ( int i = 0 ; i < mem.length ; i++ )
                temp_mem[i] = mem[i];

            temp_mem[ mem.length ] = k;

            mem = temp_mem;

            return;

        }

    }

    //insert
    public boolean add( int index , E obj ){

        if ( index > mem.length )
            return false;
        else{

            Object[] temp = new Object[ mem.length + 1 ];

            for( int k = 0 ; k < index ; k++ )
                temp[k] = mem[k];
            //存入index之前的元素
            temp[index] = obj;//insert
            for( int k = index + 1 ; k < mem.length + 1 ; k++ )
                temp[k] = mem[k-1];
            //插入后面的所有元素

            mem = temp;

            return true;

        }

    }

    //get
    public E get( int index ){

        if ( index >= mem.length )
            return null;

        return (E)mem[ index ];

    }

    //remove
    public void remove( E key ){

        for ( int k = 0 ; k < mem.length ; k++)
            if ( key.equals( mem[ k ] )){

                removeFromIndex( k );

                return;

            }

    }

    //remove From Index
    public void removeFromIndex( int k ){

        for ( int i = k + 1 ; i < mem.length ; i++ ){

            mem[i-1] = mem[i];

            mem[ mem.length - 1 ] = null;

        }//清除数据

        Object[] temp = new Object[ mem.length - 1 ];

        for ( int i = 0 ; i < mem.length - 1 ; i++  )
            temp[i] = mem[i];

        mem = temp;//更新内存

        return ;

    }

    //toString
    public String toString(){

        String v = "";

        for ( int k = 0 ; k < mem.length - 1 ; k++ )
            if ( mem[k] != null )
                v += mem[k] + " ";

        if ( mem[mem.length - 1 ] != null  )
            v += mem[mem.length - 1] ;

        v+= "\nThe memory: " + mem;

        return v;

    }

    //getSize
    public int Size(){
        return mem.length;
    }

}
