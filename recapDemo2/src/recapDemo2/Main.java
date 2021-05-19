package recapDemo2;

public class Main {

	public static void main(String[] args) {  //javadersi 15
		// double[] myList = new double[4]; ve double[] myList = {1.2,1.3,4.3,5.6}; ayný
		// görevi taþýyor.
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0]; // max bir deðiþken isimi deðil. istersek enBuyuk olarakta isim verebilirdik.Burada max = mylistin 0ýncý elemaný en büyük olarak atýyoruz.
		for (double number : myList) {
			if (max < number) {
				max = number;

			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En Büyük = " + max);
	}

}
