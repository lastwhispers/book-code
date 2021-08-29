package chapter1.v8;

public abstract class Price {
	abstract int getPriceCode(); // 取得价格代号

	abstract double getCharge(int daysRented);
}
