
public class ImagenProxy implements Imagen {

	   private ImagenReal imagenReal;
	   private String nombreArchivo;

	   public ImagenProxy(String nombreArchivo){
	      this.nombreArchivo = nombreArchivo;
	   }

	   @Override
	   public void display() {
	      if(imagenReal == null){
	         imagenReal= new ImagenReal(nombreArchivo);
	      }
	      imagenReal.display();
	   }
	}