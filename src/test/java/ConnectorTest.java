/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrateur
 */
import com.cassandraguide.hotel.Connector;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.thrift.TException;

public class ConnectorTest {

    public static void main(String[] args) {

    Connector connector = new Connector();
        try {
            connector.connect();
        } catch (TException ex) {
            Logger.getLogger(ConnectorTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidRequestException ex) {
            Logger.getLogger(ConnectorTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
}
