
public class ImagenReal implements Imagen {

	   private String nombreArchivo;

	   public ImagenReal(String nombreArchivo){
	      this.nombreArchivo = nombreArchivo;
	      cargaDesdeDisco(nombreArchivo);
	   }

	   @Override
	   public void display() {
	      System.out.println("Mostrando " + nombreArchivo);
	   }

	   private void cargaDesdeDisco(String nombreArchivo){
	      System.out.println("Cargando..." + nombreArchivo);
	   }
	}