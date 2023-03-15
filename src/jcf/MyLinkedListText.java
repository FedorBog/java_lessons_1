package advanced;

public class MyLinkedListText {

    public static void main(String[] args) {

        MyLInkedList myList = new MyLInkedList();

       for (int i = 0; i < 10; i++){

           myList.add(i);
       }

        System.out.println(myList.toString());

        myList.remove(5);

        System.out.println(myList.toString());


    }
}
