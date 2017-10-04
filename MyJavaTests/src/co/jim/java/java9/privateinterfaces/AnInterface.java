package co.jim.java.java9.privateinterfaces;

/*
* Allows you to break down unwieldy default methods, all interface methods had to be public in Java 8
*
*/
public interface AnInterface {
    public int getIdentifier();
    private static String staticPrivate() {
        return "static private";
    }

    private String instancePrivate() {
        return "instance private";
    }

    default void check() {
        String result = staticPrivate();
        AnInterface pvt = new AnInterface() {
            // anonymous class

            @Override
            public int getIdentifier() {
                return 0;
            }
        };
        result = pvt.instancePrivate();
        System.out.println("Result:"+result);
    }
            ;
}
