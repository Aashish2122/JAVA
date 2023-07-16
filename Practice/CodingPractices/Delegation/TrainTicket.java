package Practice.CodingPractices.Delegation;

public class TrainTicket implements TravelBooking{

    @Override
    public void bookTicket() {
        System.out.println("Train Ticket booked");
    }
    
}
