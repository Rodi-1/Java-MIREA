package ru.mirea.PR3.TASK2;

public class Doubles {
    public static void main(String[] args) {
        Double doubleObj1 = Double.valueOf(3.14);
        Double doubleObj2 = Double.valueOf("42.0");

        String strValue = "7.5";
        double doubleValue = Double.parseDouble(strValue);

        Double doubleObj = Double.valueOf(2.71828);

        double primitiveDouble = doubleObj.doubleValue();
        float primitiveFloat = doubleObj.floatValue();
        long primitiveLong = doubleObj.longValue();
        int primitiveInt = doubleObj.intValue();
        short primitiveShort = doubleObj.shortValue();
        byte primitiveByte = doubleObj.byteValue();

        System.out.println("Значение объекта Double: " + doubleObj);

        String d = Double.toString(3.14);


    }
}
