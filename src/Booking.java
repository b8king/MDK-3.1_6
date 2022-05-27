import java.util.ArrayList;

public class Booking {
    ArrayList<Hotel>list=new ArrayList<>();
    ArrayList<Client>clientsList=new ArrayList<>();
    public void booking(String firstname,String lastname){
        Hotel hotel = new Hotel();
        hotel.setFloor(1);
        hotel.setNumber(1);
        hotel.setPrice(1000);
        list.add(hotel);
        Client client = new Client();
        client.setFirstName(firstname);
        client.setLastName(lastname);
        clientsList.add(client);
        System.out.println(hotel+" "+client);
    }
}
