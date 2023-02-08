package catom.stack.project;


/**
 *
 * @author m_i_r_o_17 | Мирошниченко Владимир 2А
 * 
 * @param <T> - тип стэка.
 */
public class CustomStack<T> {
    
    protected T[] stack = null;

    /**
     * Конструктор по умолчанию. 
     * Создаёт пустой стэк
    */
    public CustomStack(){
        stack = (T[]) new Object[0];
    }
    /**
     *Конструктор с параметрами.
     * @param stack массив элементов, который нужно поместить в стэк
    */
    public CustomStack(T[] stack){
        this.stack = (T[]) new Object[stack.length];
        System.arraycopy(stack,0,this.stack,0,stack.length);
    }
    
    /**
     * Возвращает последний(верхний) элемент массива.
    */
    public T getElement(){
        return stack[stack.length - 1];
    }
    
    /**
     * Добавляет элемент типа T в стэк
    * @param element элемент который нужно положить в конец(вверх) стэка
    */
    public void Add(T element){
        T[] oldStack = (T[]) new Object[stack.length]; 
        System.arraycopy(stack, 0, oldStack, 0, stack.length);
        
        stack = (T[]) new Object[stack.length + 1];
        System.arraycopy(oldStack, 0, stack, 0, stack.length - 1);

        stack[stack.length - 1] = element;
    }
    /**
     * Безопасно удаляет верхний элемент из стэка.
     * Если стэк будет пуст, опирация прервётся.
    */
    public void Delete(){
        
        if(stack.length == 0)
            return;
        
        T[] oldStack = (T[]) new Object[stack.length]; 
        System.arraycopy(stack, 0, oldStack, 0, stack.length);
        stack = (T[]) new Object[stack.length - 1];
        System.arraycopy(oldStack, 0, stack, 0, stack.length);
    }
    /**
     * Функция очистки списка. Данная функция перезатирает список.
    */
    public void Clear(){
        stack = (T[]) new Object[0];
    }
    /**
     * Выводит весь стэк на экран.
     * Вывод происходит в формате: [element_1, element_2, ... , element_n].
    */
    public void Show(){
        System.out.print("[");
        for(int i = 0; i < stack.length; i++)
        {
            System.out.print(stack[i]);
            if(i + 1 != stack.length)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
