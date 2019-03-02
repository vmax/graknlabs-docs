package generated;

import grakn.client.GraknClient;

import graql.lang.Graql;
import graql.lang.query.GraqlQuery;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import javax.xml.stream.XMLStreamException;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStandalonePhoneCalls {

    @BeforeClass
    public static void loadPhoneCalls() {
        GraknClient client = new GraknClient("localhost:48555");
        GraknClient.Session session = client.session("phone_calls");
        GraknClient.Transaction transaction = session.transaction().write();

        try {
            byte[] encoded = Files.readAllBytes(Paths.get("files/phone-calls/schema.gql"));
            String query = new String(encoded, StandardCharsets.UTF_8);
            transaction.execute((GraqlQuery) Graql.parse(query));
            transaction.commit();
            session.close();
            System.out.println("Loaded the phone_calls schema");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAPhoneCallsFirtstQuery() {
        PhoneCallsFirstQuery.main(new String[]{});
    }

    @Test
    public void testBPhoneCallsSecondQuery() {
        PhoneCallsSecondQuery.main(new String[]{});
    }

    @Test
    public void testCPhoneCallsThirdQuery() {
        PhoneCallsSecondQuery.main(new String[]{});
    }

    @Test
    public void testDPhoneCallsForthQuery() {
        PhoneCallsForthQuery.main(new String[]{});
    }

    @Test
    public void testEPhoneCallsFifthQuery() {
        PhoneCallsFifthQuery.main(new String[]{});
    }

    @Test
    public void testFPhoneCallsCSVMigration() throws FileNotFoundException {
        PhoneCallsCSVMigration.main(new String[]{});
    }

    @Test
    public void testGPhoneCallsJSONMigration() throws IOException {
        PhoneCallsJSONMigration.main(new String[]{});
    }

    @Test
    public void testHPhoneCallsXMLMigration() throws FileNotFoundException, XMLStreamException {
        PhoneCallsXMLMigration.main(new String[]{});
    }

    @AfterClass
    public static void cleanPhoneCalls() {
        GraknClient client = new GraknClient("localhost:48555");
        client.keyspaces().delete("phone_calls");
        System.out.println("Deleted the phone_calls keyspace");
    }
}