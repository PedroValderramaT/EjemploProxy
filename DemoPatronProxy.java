
public class DemoPatronProxy {
	
	   public static void main(String[] args) {
	      Imagen imagen = new ImagenProxy("test_10mb.jpg");

	      //image will be loaded from disk
	      imagen.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      imagen.display(); 	
	   }
	}