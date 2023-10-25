import java.util.ArrayList;

public class Pedido {
	private int idPedido;
	public Cuenta cuenta;
	public Carrito_de_compras carro;
	public Estado_Pedido _estadoPedido;
	public ArrayList<Medio_de_pago> pago = new ArrayList<Medio_de_pago>();

	public void getIdPedido() {
		throw new UnsupportedOperationException();
	}
}