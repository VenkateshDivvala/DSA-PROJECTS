package StacksAndQueues;

public class StackMain {
    public static void main(String[] args) throws Exception{
        CustomStack st=new DynamicStack();
        st.push(36);
        st.push(27);
        st.push(18);
        st.push(9);
        st.push(54);
        st.push(78);
        st.display();
    }
}
