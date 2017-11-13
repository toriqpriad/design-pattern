

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
		System.out.println("Menghitung Neraca");
	}

	public void hitungSaldo(){
		System.out.println("Menghitung Saldo");
	}

	public static void main(String[] args) {
		BukuBesar buku1 = BukuBesar.AksesDetail();
		buku1.hitungSaldo();
	}

}



