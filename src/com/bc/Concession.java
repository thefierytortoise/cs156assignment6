package com.bc;

//Concession class represents a concession product
public class Concession extends Product {

	private double unitCost;
	private int quanity;
	private String associatedRepair;

	public Concession(String code, char type, String label, double unitCost) {
		super(code, type, label);
		this.unitCost = unitCost;
	}

	public double getUnitCost() {
		return unitCost;
	}
	
	public int getQuanity() {
		return quanity;
	}

	public void setQuanity(int quanity) {
		this.quanity = quanity;
	}

	public String getAssociatedRepair() {
		return associatedRepair;
	}

	public void setAssociatedRepair(String associatedRepair) {
		this.associatedRepair = associatedRepair;
	}
	
	@Override
	public double getSubtotal() {
		double total = (getQuanity()*unitCost);
		return total;
	}

	@Override
	public String toString() {
		return "Concession [unitCost=" + unitCost + ", quanity=" + quanity + ", associatedRepair=" + associatedRepair
				+ "]";
	}

	@Override
	public double getDiscount(Invoice invoice) {
		if(this.getAssociatedRepair() != null) {
			return getSubtotal() * 0.1;
		}
		return 0;
	}

	@Override
	public double getTaxes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
