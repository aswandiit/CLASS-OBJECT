
public class main {
	public static void main(String[] args) {
		System.out.println("------Object Kelas Kotak------");
		// membuat object dari class kotak
		kotak main = new kotak();
			
		// method setter kotak
		main.setpanjang(12.07);
		main.setlebar(6.45);
			
		// method getter kotak
		System.out.println("panjang : " + main.getpanjang());
		System.out.println("lebar : " + main.getlebar());
		System.out.println("luas : " + main.getpanjang()*main.getlebar());
		System.out.println("keliling : " + main.getlebar()*main.getpanjang()*main.getlebar()*main.getpanjang());
			
		System.out.println("------Object Kelas mahasiswa------");
		//membuat object dari class mahasiswa
		mahasiswa mahasiswa = new mahasiswa();
		
		//method setter mahasiswa
		mahasiswa.nama = "Aswandi";
		mahasiswa.nim = "D0217011";
		mahasiswa.alamat = "Sendana";
		mahasiswa.golonganDarah = "O";
		mahasiswa.status = "mahasiswa";
		mahasiswa.tinggiBadan = "164";
		mahasiswa.beratBadan = "57";
		
		//method getter mahasiswa
		System.out.println("nama : " + mahasiswa.getnama());
		System.out.println("nim : " + mahasiswa.getnim());
		System.out.println("alamat : " + mahasiswa.getalamat());
		System.out.println("golongan Darah : " + mahasiswa.getgolongnDarah());
		System.out.println("Status : " + mahasiswa.getstatus());
		System.out.println("tinggi badan : " + mahasiswa.gettinggiBadan());
		System.out.println("berat badan : " + mahasiswa.getberatBadan());

		System.out.println("------Object Kelas node------");
		//membuat object dari kelas node
        node node = new node();
		
		//method setter node
		node.label = "MOUSE";
		node.Value = 1;
		
		//method getter node
		System.out.println("Nama Label : " + node.getlabel());
		System.out.println("jumlah label : " + node.getValue());

		System.out.println("------Object Kelas stack------");
		//membuat object dari kelas stack
		stack stack = new stack();
		
		stack.value[0] = "Aswandi";
		stack.value[1] = "Wandhy";
		stack.value[2]= "Nadra";
		stack.value[3]= "faer";
		stack.value[4]= "cippe";
		stack.value[5]= "uswa";
		stack.value[6]= "mesing";
		stack.value[7]= "ecing";
		stack.value[8]= "aswar";
		stack.value[9]= "ramadhana";
		stack.value[10]= "fira";
		stack.value[11]= "fitra";
		stack.value[12]= "fais";
		stack.value[13]= "nila";
		stack.value[14]= "dini";
		stack.value[15]= "inul";
		stack.value[16]= "afit";
		stack.value[17]= "fiqih";
		stack.value[18]= "hariadi";
		stack.value[19]= "bobi";
		stack.value[20]= "zainab";
		stack.value[21]= "mail";
		stack.value[22]= "suhaena";
		stack.value[23]= "adiba";
		stack.value[24]= "sri";
		stack.value[25]= "sadra";
		stack.value[26]= "risma";
		stack.value[27]= "ramli";
		stack.value[28]= "musmus";
		stack.value[29]= "narti";
		stack.value[30]= "musliana";
		stack.value[31]= "askur";
		stack.value[32]= "akku";
		stack.value[33]= "tiara";
		stack.value[34]= "mutiara";
		stack.value[35]= "oda";
		stack.value[36]= "arjulida";
		stack.value[37]= "muhammadiyah";
		stack.value[38]= "aksan";
		stack.value[39]= "hardoyo";
		stack.value[40]= "suajir";
		stack.value[41]= "rahma";
		stack.value[42]= "putri";
		stack.value[43]= "nahda";
		stack.value[44]= "zainuddin";
		stack.value[45]= "wulandari";
		stack.value[46]= "nengsih";
		stack.value[47]= "sudarmin";
		stack.value[48]= "nusra";
		stack.value[49]= "andri";
		stack.value[50]= "yani";
		stack.value[51]= "maulana";
		stack.value[52]= "arham";
		stack.value[53]= "latifa";
		stack.value[54]= "kaila";
		stack.value[55]= "nadia";
		stack.value[56]= "asma";
		stack.value[57]= "aulia";
		stack.value[58]= "sultan";
		stack.value[59]= "marda";
		stack.value[60]= "ismail";
		stack.value[61]= "mohdar";
		stack.value[62]= "mida";
		stack.value[63]= "mukhlis";
		stack.value[64]= "maldini";
		stack.value[65]= "hargianto";
		stack.value[66]= "fulan";
		stack.value[67]= "ekki";
		stack.value[68]= "nurhidayah";
		stack.value[69]= "nindi";
		stack.value[70]= "ardi";
		stack.value[71]= "agam";
		stack.value[72]= "alfatih";
		stack.value[73]= "firmansyah";
		stack.value[74]= "hapsa";
		stack.value[75]= "hasriah";
		stack.value[76]= "aisyah";
		stack.value[77]= "aslamiah";
		stack.value[78]= "nur";
		stack.value[79]= "mawan";
		stack.value[80]= "indra";
		stack.value[81]= "fuad";
		stack.value[82]= "ayu";
		stack.value[83]= "linda";
		stack.value[84]= "rusman";
		stack.value[85]= "rezaldi";
		stack.value[86]= "fajri";
		stack.value[87]= "adriawan";
		stack.value[88]= "icca";
		stack.value[89]= "egha";
		stack.value[90]= "adi";
		stack.value[91]= "sumarni";
		stack.value[92]= "asrul";
		stack.value[93]= "rifal";
		stack.value[94]= "naufal";
		stack.value[95]= "fatur";
		stack.value[96]= "wati";
		stack.value[97]= "umam";
		stack.value[98]= "sahruna";
		stack.value[99]= "afriandi";
		stack.setvalueAt(4 ,"Aswandi");

		//menampilkan stack
		for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};


	}
}
