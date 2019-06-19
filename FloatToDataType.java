public class FloatToDateType{

  public static void main(String[] args) {

    Float fObj = new Float("10.50");
    byte b = fObj.byteValue();
    System.out.println(b);

    short s = fObj.shortValue();
    System.out.println(s);

    int i = fObj.intValue();
    System.out.println(i);

    float f = fObj.floatValue();
    System.out.println(f);

    double d = fObj.doubleValue();
    System.out.println(d);

  }
}
