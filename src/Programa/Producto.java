package Programa;

public class Producto {
	private int codigoProducto; //Si en la interfaz no aparece, seria como tipo id
	private String nombreProducto;
	private int cantidadProducto;
	private float precioProducto;
	private String tipoProducto; //Enfoque linea de ventas en producto (que tipos de productos max 3)
	public Producto(int codigoProducto, String nombreProducto, int cantidadProducto, float precioProducto,
			String tipoProducto) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.cantidadProducto = cantidadProducto;
		this.precioProducto = precioProducto;
		this.tipoProducto = tipoProducto;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public float getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(float precioProducto) {
		this.precioProducto = precioProducto;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	@Override
	public String toString() {
		return "Inventario [codigoProducto=" + codigoProducto + ", nombreProducto=" + nombreProducto
				+ ", cantidadProducto=" + cantidadProducto + ", precioProducto=" + precioProducto + ", tipoProducto="
				+ tipoProducto + "]";
	}
	
}
