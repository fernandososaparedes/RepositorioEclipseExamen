
public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;// Cambiar nombre de variable
		double saldoActual;

		cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es" + saldoActual);

		operativa_cuenta(cuenta1, 0);// Seleccionar desde try hasta la llave que cierra catch
	}

	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {// Refactor, Extract method
		try {
			cuenta1.retirar(2300);
			// modificado
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}
}
