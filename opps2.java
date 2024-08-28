class pen{
        String color ;
        String price;
        
        //inside a class if we create a function its called method 
        
        public void write(){
            System.out.println("its pen chacking program for opps concept revied ");
        }
        
        public void printColor(){
            System.out.println(this.color);
            
            //this batata h kondi object call kar rahi h 
            
        }
        
}



class HelloWorld {
    public static void main(String[] args) {
        pen p1 = new pen();
        
        p1.color = "blue";
        p1.price = "ten";
        
        p1.write();
        
        pen p2 = new pen();
        
        p2.color ="black";
        p1.prince = " two";
        
        p2.write();
        
        
    }
}
