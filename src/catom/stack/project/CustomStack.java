package catom.stack.project;


/**
 *
 * @author m_i_r_o_17 | Мирошниченко Владимир 2А
 * 
 * @param <T> - тип стэка.
 */
public class CustomStack<T> {
    
    private T[] stack = null;
    private int curCount = -1;

    /**
     * Конструктор по умолчанию. 
     * Создаёт пустой стэк
    */
    public CustomStack(){
        stack = (T[]) new Object[10];
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
     * @return Последний элемент или null при пустом стэке
    */
    public T peek(){
        if(curCount > -1)
            return stack[curCount];
        return null;
    }
    
    /**
     * Добавляет элемент типа T в стэк
     * @param element элемент который нужно положить в конец(вверх) стэка
     * @return Последний добавленый элемент
    */
    public T push(T element){
        
        curCount = curCount + 1;
        if(curCount < stack.length - 1){
            stack[curCount] = element;
        } 
        else {
            T[] newStack = (T[]) new Object[stack.length+1];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            newStack[curCount] = element;
            stack = newStack;
        }
        
        return peek();

    }
    /**
     * Безопасно удаляет верхний элемент из стэка.
     * Если стэк будет пуст, опирация прервётся.
    */
    public T pop(){
        
        curCount = curCount - 1;
        if(curCount == -1)
            return null;
        return peek();
    }
    /**
     * Функция очистки списка. Данная функция перезатирает список.
    */
    public void Clear(){
        stack = (T[]) new Object[10];
    }
}
