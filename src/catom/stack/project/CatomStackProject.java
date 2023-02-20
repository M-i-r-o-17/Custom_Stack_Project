package catom.stack.project;

/**
 *
 * @author m_i_r_o_17 |  Мирошниченко Владимир 2А
 */


public class CatomStackProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomStack<Integer> cs = new CustomStack();
       
        for(int i = 0; i < 12; i++)
            System.out.println(i + ": " + cs.push(i + 1));
        
        for(int i = 0; i < 15; i++)
            System.out.println(cs.pop());
    }
    
}
