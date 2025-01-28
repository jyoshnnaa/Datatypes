public class Datatypes{
        public static void main(String[] args) {
            byte byteValue = 100;
            System.out.println("byte value: " + byteValue);
    
            short shortValue = 30000;
            System.out.println("short value: " + shortValue);
    
            int intValue = 2000000000;
            System.out.println("int value: " + intValue);
    
            long longValue = 9000000000000000000L;
            System.out.println("long value: " + longValue);
    
            float floatValue = 3.14f;
            System.out.println("float value: " + floatValue);
    
            double doubleValue = 3.141592653589793;
            System.out.println("double value: " + doubleValue);
    
            char charValue = 'A';
            System.out.println("char value: " + charValue);
    
            boolean booleanValue = true;
            System.out.println("boolean value: " + booleanValue);
    
            System.out.println("\nTypecasting Example:");
            int intFromByte = byteValue; 
            System.out.println("int from byte: " + intFromByte);
    
            byte byteFromInt = (byte) intValue; 
            System.out.println("byte from int: " + byteFromInt); 
        }
    }

