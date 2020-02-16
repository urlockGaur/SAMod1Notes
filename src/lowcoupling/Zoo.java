package lowcoupling;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    /*
    Modify the Zoo class. A Zoo should be able to
    contain a Lion and a Monkey in a single list.
     */

    private List<Lion> lions = new ArrayList<>();


    public void addLion(Lion lion) {
        lions.add(lion);
    }

}
