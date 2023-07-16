package Practice.CodingPractices.Delegation;

public class DelegationDriver {
    public static void main(String[] args) {
         new TicketBookingAgent(new FlightTicket()).bookTicket(); ; 
    }
    
}
