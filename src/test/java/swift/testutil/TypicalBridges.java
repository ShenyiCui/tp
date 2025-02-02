package swift.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import swift.model.AddressBook;
import swift.model.bridge.PersonTaskBridge;

/**
 * A utility class containing a list of {@code PersonTaskBridge} objects to be
 * used in tests.
 */
public class TypicalBridges {
    public static final String PERSON1_UUID = "c4c645da-27b3-454d-9428-5295a6ee1f33";
    public static final String TASK1_UUID = "bfbf250c-fd58-49b4-be15-ca12095ca2ee";
    public static final String TASK2_UUID = "41478d11-dbba-441f-ab0f-99ddf097eac1";

    public static final PersonTaskBridge DEFAULT_BRIDGE_1 = new PersonTaskBridge(
            UUID.fromString(PERSON1_UUID),
            UUID.fromString(TASK1_UUID));
    public static final PersonTaskBridge DEFAULT_BRIDGE_2 = new PersonTaskBridge(
            UUID.fromString(PERSON1_UUID),
            UUID.fromString(TASK2_UUID));

    private TypicalBridges() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical tasks.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = TypicalTasks.getTypicalAddressBook();
        for (PersonTaskBridge bridge : getTypicalBridges()) {
            ab.addBridge(bridge);
        }
        return ab;
    }

    public static List<PersonTaskBridge> getTypicalBridges() {
        return new ArrayList<>(Arrays.asList(DEFAULT_BRIDGE_1, DEFAULT_BRIDGE_2));
    }
}
