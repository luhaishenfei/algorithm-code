package tuJieSheJiMoShi.p4Prototype.A1.framework;

public abstract class Product implements Cloneable{
    public abstract void use(String s);

    public final Product createClone(){
        Product p=null;

        try {
            p= (Product) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return p;
    }
}
