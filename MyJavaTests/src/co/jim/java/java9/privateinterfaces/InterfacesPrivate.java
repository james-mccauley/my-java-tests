package co.jim.java.java9.privateinterfaces;

public class InterfacesPrivate implements AnInterface {

    @Override
    public int getIdentifier() {
        return 9;
    }
    public void check(){
        System.out.println("Implementation");
    }
    public static void main(String[] args) {
        InterfacesPrivate ip = new InterfacesPrivate();
        ip.check();
    }


}