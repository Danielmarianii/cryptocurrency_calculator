package entities;

public class Cryptocurrency {
	public double quantity;
	public double btcprice;
	public double btcToDollar;
	public double dollarToReal;

	public double TotalBTC() {
		return quantity * btcprice;
	}

	public double TotalDollar() {
		return TotalBTC() * btcToDollar;
	}

	public double TotalReais() {
		return TotalDollar() * dollarToReal;
	}

}
