# Penjelasan
![alt text](https://github.com/RizwandaaK/ProgramToko-InheritEnkap/blob/master/codingan%20Toko.jpeg?raw=true)
## Toko.java | ParentClass
Di parentclass bernama "Toko", saya mendeklarasikan variabel admin dengan modifier private dan bertipe data String, lalu 3 variabel selanjutnya bermodifier public, 
yaitu: merk(String), harga(int), dan total(int). 

Kemudian di bawahnya, saya membuat method Void setter untuk Admin, namanya "setAdmin" dengan parameter di dalamnya, fungsinya untuk mengatur data yang terkandung dalam variabel admin. Kata kunci this pada this.admin = admin digunakan untuk menyatakan data variabel admin agar bisa digunakan di method lain. Lalu ada method non-Void String getter namanya "getAdmin", yang berfungsi untuk memanggil data yang terkandung dalam variabel admin. Kata kunci "return" berfungsi untuk mengembalikan nilai ke variabel admin yang dideklarasikan di awal tadi. Kata kunci tersebut dipakai di method non-Void. Terakhir, ada method Void bernama "Display" yang berguna sbg penampil judul dan awalan output.

![alt text](https://github.com/RizwandaaK/ProgramToko-InheritEnkap/blob/master/codingan%20Smartphone.jpeg?raw=true)
## Smartphone.java | extends Toko.java ChildClass
