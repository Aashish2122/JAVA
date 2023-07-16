package Practice.CodingPractices.Delegation;

public class TicketBookingAgent implements TravelBooking {
    TravelBooking t; 
    public TicketBookingAgent(TravelBooking t) {
        this.t = t;
    }

    @Override
    public void bookTicket() {
        t.bookTicket();
    }
}
