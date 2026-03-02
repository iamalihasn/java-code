public class MyGenerics {

    public static void main(String[] args) {
        
        // object of Myclass

		MyClass<Integer> m = new MyClass<>(200);
		
		MyClass<Integer> m2 = new MyClass<>(200);
		
		System.out.println(m2.getValue().equals(m.getValue()));
        
        Integer a = 200;
        Integer b = 200;
        
        System.out.println(a.equals(b));
		
	}
    
}

// Bound class type

class MyClass<E extends Number>{
    E value;
    
    MyClass (E value){
        this.value =  value;
    }
    
    E getValue(){
        return this.value;
    }    
}
