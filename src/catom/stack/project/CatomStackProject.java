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
        CustomStack<Integer> customStack1 = new CustomStack();
        CustomStack<Integer> customStack2 = new CustomStack(new Object[]{0,1,23,432,10,322,55});
        
        System.out.println(" Работа с customStack1: ");
        customStack1.Add(0);
        customStack1.Add(1);
        customStack1.Add(2);
        System.out.print("Вывод элементов на экран: ");
        customStack1.Show();
        customStack1.Delete();
        customStack1.Delete();
        System.out.print("\nВывод элементов на экран(удалено 2 элемента): ");
        customStack1.Show();
        System.out.println("\n Работа с customStack2: ");
        System.out.print("Вывод элементов на экран: ");
        customStack2.Show();
        customStack2.Clear();
        System.out.print("\nВывод элементов на экран(после функции clear): ");
        customStack1.Show();
        
    }
    
}
