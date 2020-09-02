package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	public TV (Marca marca,boolean estado) {
		setMarca(marca);
		setEstado(estado);
		setNumTV(getNumTV() + 1);
	}
	public void setMarca (Marca marca) {
		this.marca=marca;
	}public Marca getMarca () {
		return marca;
	}public void setCanal (int canal) {
		if(this.estado==true) {
			if(canal<=120&&canal>=1) {
				this.canal=canal;
			}
		}
	}public int getCanal () {
		return canal;
	}public void setPrecio (int precio) {
		this.precio=precio;
	}public int getPrecio () {
		return precio;
	}public void setEstado (boolean estado) {
		this.estado=estado;
	}public boolean getEstado () {
		return estado;
	}public void setVolumen (int volumen) {
		if(this.estado==true) {
			if(volumen<=7&&volumen>=0) {
				this.volumen=volumen;
			}
		}
	}public int getVolumen () {
		return volumen;
	}public void setControl (Control control) {
		this.control=control;
	}public Control getControl () {
		return control;
	}public void turnOn () {
		estado=true;	
	}public void turnOff () {
		estado=false;
	}public void canalUp () {
		if(estado==true) {
			if (canal==120) {
			canal=1;
			}else {
			canal++;
			}
		}
	}public void canalDown () {
		if(estado==true) {
			if (canal==1) {
			canal=120;
			}else {
			canal--;
			}
		}
	}public void volumenUp () {
		if(estado==true) {
			if (volumen<7) {
				volumen++;
			}
		}
	}public void volumenDown () {
		if(estado==true) {
			if (volumen>0) {
				volumen--;
			}
		}
	}public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
}
