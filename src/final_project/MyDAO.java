package final_project;

public abstract class MyDAO<T> {
   abstract void readInData() throws MyException;
   abstract void  verifyData();
    abstract void add(T obj);
   abstract T get(int id)throws MyException;
   abstract void set(int id, T obj) throws MyException;
    abstract T remove(int id) throws MyException;
   abstract T remove(T obj) throws MyException;
}
