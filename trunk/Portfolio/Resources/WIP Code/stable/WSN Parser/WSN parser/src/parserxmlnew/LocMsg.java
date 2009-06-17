/* Peter De Cauwer & Tim Van Overtveldt, graduate student Artesis, Applied Engineering: Electronics-ICT
 * Master thesis: WSN localization with Senseless
 */

package parserxmlnew;

/**
 * This class is automatically generated by mig.
 * This class implements a Java interface to the 'LocMsg' message type.
 * LocMsg is used to transmit location data to the controller
 */
public class LocMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 8;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 144;

    /** Create a new LocMsg of size 8. */
    public LocMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new LocMsg of the given data_length. */
    public LocMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg with the given data_length
     * and base offset.
     */
    public LocMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg using the given byte array
     * as backing store.
     */
    public LocMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public LocMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public LocMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg embedded in the given message
     * at the given base offset.
     */
    public LocMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new LocMsg embedded in the given message
     * at the given base offset and length.
     */
    public LocMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <LocMsg> \n";
      try {
        s += "  [moteid=0x"+Long.toHexString(get_moteid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [ANmoteid=0x"+Long.toHexString(get_ANmoteid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [VANs=0x"+Long.toHexString(get_VANs())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [VANr=0x"+Long.toHexString(get_VANr())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [hopCount=0x"+Long.toHexString(get_hopCount())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [RSSI=0x"+Long.toHexString(get_RSSI())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: moteid
    //   Field type: int, signed
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'moteid' is signed (true).
     */
    public static boolean isSigned_moteid() {
        return true;
    }

    /**
     * Return whether the field 'moteid' is an array (false).
     */
    public static boolean isArray_moteid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'moteid'
     */
    public static int offset_moteid() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'moteid'
     */
    public static int offsetBits_moteid() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'moteid'
     */
    public int get_moteid() {
        return (int)getUIntBEElement(offsetBits_moteid(), 16);
    }

    /**
     * Set the value of the field 'moteid'
     */
    public void set_moteid(int value) {
        setUIntBEElement(offsetBits_moteid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'moteid'
     */
    public static int size_moteid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'moteid'
     */
    public static int sizeBits_moteid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: ANmoteid
    //   Field type: int, signed
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'ANmoteid' is signed (true).
     */
    public static boolean isSigned_ANmoteid() {
        return true;
    }

    /**
     * Return whether the field 'ANmoteid' is an array (false).
     */
    public static boolean isArray_ANmoteid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'ANmoteid'
     */
    public static int offset_ANmoteid() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'ANmoteid'
     */
    public static int offsetBits_ANmoteid() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'ANmoteid'
     */
    public int get_ANmoteid() {
        return (int)getUIntBEElement(offsetBits_ANmoteid(), 16);
    }

    /**
     * Set the value of the field 'ANmoteid'
     */
    public void set_ANmoteid(int value) {
        setUIntBEElement(offsetBits_ANmoteid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'ANmoteid'
     */
    public static int size_ANmoteid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'ANmoteid'
     */
    public static int sizeBits_ANmoteid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: VANs
    //   Field type: short, signed
    //   Offset (bits): 32
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'VANs' is signed (true).
     */
    public static boolean isSigned_VANs() {
        return true;
    }

    /**
     * Return whether the field 'VANs' is an array (false).
     */
    public static boolean isArray_VANs() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'VANs'
     */
    public static int offset_VANs() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'VANs'
     */
    public static int offsetBits_VANs() {
        return 32;
    }

    /**
     * Return the value (as a short) of the field 'VANs'
     */
    public short get_VANs() {
        return (short)getUIntBEElement(offsetBits_VANs(), 8);
    }

    /**
     * Set the value of the field 'VANs'
     */
    public void set_VANs(short value) {
        setUIntBEElement(offsetBits_VANs(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'VANs'
     */
    public static int size_VANs() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'VANs'
     */
    public static int sizeBits_VANs() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: VANr
    //   Field type: short, signed
    //   Offset (bits): 40
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'VANr' is signed (true).
     */
    public static boolean isSigned_VANr() {
        return true;
    }

    /**
     * Return whether the field 'VANr' is an array (false).
     */
    public static boolean isArray_VANr() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'VANr'
     */
    public static int offset_VANr() {
        return (40 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'VANr'
     */
    public static int offsetBits_VANr() {
        return 40;
    }

    /**
     * Return the value (as a short) of the field 'VANr'
     */
    public short get_VANr() {
        return (short)getUIntBEElement(offsetBits_VANr(), 8);
    }

    /**
     * Set the value of the field 'VANr'
     */
    public void set_VANr(short value) {
        setUIntBEElement(offsetBits_VANr(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'VANr'
     */
    public static int size_VANr() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'VANr'
     */
    public static int sizeBits_VANr() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: hopCount
    //   Field type: short, signed
    //   Offset (bits): 48
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'hopCount' is signed (true).
     */
    public static boolean isSigned_hopCount() {
        return true;
    }

    /**
     * Return whether the field 'hopCount' is an array (false).
     */
    public static boolean isArray_hopCount() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'hopCount'
     */
    public static int offset_hopCount() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'hopCount'
     */
    public static int offsetBits_hopCount() {
        return 48;
    }

    /**
     * Return the value (as a short) of the field 'hopCount'
     */
    public short get_hopCount() {
        return (short)getUIntBEElement(offsetBits_hopCount(), 8);
    }

    /**
     * Set the value of the field 'hopCount'
     */
    public void set_hopCount(short value) {
        setUIntBEElement(offsetBits_hopCount(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'hopCount'
     */
    public static int size_hopCount() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'hopCount'
     */
    public static int sizeBits_hopCount() {
        return 8;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: RSSI
    //   Field type: byte, signed
    //   Offset (bits): 56
    //   Size (bits): 8
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'RSSI' is signed (true).
     */
    public static boolean isSigned_RSSI() {
        return true;
    }

    /**
     * Return whether the field 'RSSI' is an array (false).
     */
    public static boolean isArray_RSSI() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'RSSI'
     */
    public static int offset_RSSI() {
        return (56 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'RSSI'
     */
    public static int offsetBits_RSSI() {
        return 56;
    }

    /**
     * Return the value (as a byte) of the field 'RSSI'
     */
    public byte get_RSSI() {
        return (byte)getSIntBEElement(offsetBits_RSSI(), 8);
    }

    /**
     * Set the value of the field 'RSSI'
     */
    public void set_RSSI(byte value) {
        setSIntBEElement(offsetBits_RSSI(), 8, value);
    }

    /**
     * Return the size, in bytes, of the field 'RSSI'
     */
    public static int size_RSSI() {
        return (8 / 8);
    }

    /**
     * Return the size, in bits, of the field 'RSSI'
     */
    public static int sizeBits_RSSI() {
        return 8;
    }

}