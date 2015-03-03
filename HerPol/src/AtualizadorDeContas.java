public class AtualizadorDeContas {
	private double selic;
	private double saldoTotal = 0;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public void roda(Conta c) {
		System.out.println(c.getSaldo());
		c.atualiza(selic);
		saldoTotal += c.getSaldo();
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}
}
