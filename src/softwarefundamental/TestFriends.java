

package softwarefundamental;
/**
 *
 * @author Gopika Kalathiya
 */
public class TestFriends {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Friends[] f=new Friends[3];
        f[0] = new Friends("John",20);
        f[1] = new Friends("peter",19);
        f[2] = new Friends("Siva",19);

        for(Friends fr: f)
        {
            System.out.println(fr);
        }
    }
}