import java.util.Scanner;
class miniproject {
	public static void main (String args []){
		Scanner project= new Scanner(System.in);
		int rateSuisei, rateMatsuri, rateLaplus, rateNoel, rateMoona, rateSubaru;
		String  normPoint=("a"), psychoPoint=("a"), boba=("a"), loli=("a");
		int loliPoint, bobaPoint;
		System.out.println("\t\t--Sistem Rating Vtuber--");
		System.out.println("Silahkan Rating Beberapa Vtuber dibawah ini dengan skala 1-5");
		System.out.print("Natsuiro Matsuri : ");
		rateMatsuri= project.nextInt();
		System.out.print("Shirogane Noel : ");
		rateNoel= project.nextInt();
		System.out.print("Laplus : ");
		rateLaplus= project.nextInt();
		System.out.print("Oozora Subaru : ");
		rateSubaru= project.nextInt();
		System.out.print("Hoshimachi Suisei : ");
		rateSuisei= project.nextInt();
		System.out.print("Moona Hoshinova : ");
		rateMoona= project.nextInt();
		project.nextLine();
		if (rateSuisei<=5 && rateSuisei>0 && rateMoona<=5 && rateMoona>0 && rateSubaru<=5 && rateSubaru>0 && rateNoel<=5 && rateNoel>0 && rateLaplus<=5 && rateLaplus>0 && rateMatsuri<=5 && rateMatsuri>0) {
		switch (rateSuisei) {
		case 1: psychoPoint=("anda bukan sikopat");
			break;
		case 2: psychoPoint=("anda hanya suka mid-gore");
			break;
		case 3:	psychoPoint=("anda penyuka gore");
			break;
		case 4: psychoPoint=("suisei akan insta-kill anda tanpa rasa sakit");
			break;
		case 5:	psychoPoint =("suisei akan menyiksa anda menuju kematian");
			break;
		}
		switch (rateSubaru) {
		case 1: normPoint=("anda gila");
			break;
		case 2: normPoint=("anda kurang waras");
			break;
		case 3:	normPoint=("anda harus cari pacar");
			break;
		case 4: normPoint=("sedikit lagi anda sudah normal");
			break;
		case 5:	normPoint=("anda normal");
			break;	
		}
		
		bobaPoint=rateNoel+rateMoona;
		if (bobaPoint>=2 && bobaPoint<=4) {
			boba=("anda pasti gay ya?");
		}
		else if (bobaPoint>=5 && bobaPoint<=7) {
			boba=("anda pasti pedo");
		}
		else if (bobaPoint>=8 && bobaPoint<=9) {
			boba=("welcome to moms lovers");
		}
		else if (bobaPoint==10) {
			boba=("you got a good taste bro");
		}
		loliPoint=rateLaplus+rateMatsuri;
		if (loliPoint>=2 && loliPoint<=3) {
			loli=("korban bocil");
		}
		else if (loliPoint>=4 && loliPoint<=6) {
			loli=("sayang anak");
		}
		else if (loliPoint>=7 && loliPoint<=9) {
			loli=("tertarik jadi pedo?");
		}
		else if (loliPoint==10) {
			loli=("CUuNNYYYYY-(ToT)-(ToT)");
		}		
		System.out.println("--------------------");
		System.out.println("stats affection anda");
		System.out.println("Normal    : "+normPoint);
		System.out.println("Big Booba : "+boba);
		System.out.println("Loli      : "+loli);
		System.out.println("Sikopat   : "+psychoPoint);
		}
		else{
			System.out.println("--------------------");
			System.out.println("stats affection tidak dapat diproses");
			System.out.println("data salah");
			System.out.println("hanya masukkan nilai 1-5 !");
		}
	}
}		
		