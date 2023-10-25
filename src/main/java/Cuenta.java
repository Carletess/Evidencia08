import java.util.ArrayList;

public class Cuenta {
	private int idCuenta;
	private Carrito_de_compras carro;
	public ArrayList<Pedido> pedido = new ArrayList<Pedido>();
	public ArrayList<Medio_de_pago> pago = new ArrayList<Medio_de_pago>();

	public void getIdCuenta() {
		throw new UnsupportedOperationException();
	}
}