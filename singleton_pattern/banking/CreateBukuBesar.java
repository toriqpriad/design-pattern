class BukuBesar{
	int kasMasuk;
	int kasKeluar;
	int saldo;

	private static BukuBesar instance = new BukuBesar();

	private BukuBesar(){

	}

	public static BukuBesar AksesDetail(){

		return instance;
	}

	public void hitungNeraca(){
		System.out.println("Melakukan Perhitungan Neraca");
	}

	public void hitungSaldo(){
		System.out.println("Melakukan Perhitungan Saldo");
	}

	public static void main(String[] args) {
		BukuBesar buku1 = BukuBesar.AksesDetail();
		System.out.print("1. ");
		buku1.hitungSaldo();
		System.out.println("");
		System.out.print("2. ");
     		buku1.hitungNeraca();

	}

}






