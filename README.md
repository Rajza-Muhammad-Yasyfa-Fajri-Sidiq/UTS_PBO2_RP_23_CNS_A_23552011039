# UTS_PBO2_RP_23_CNS_A_23552011039
UTS Pemrograman Berorientasi Obyek 2
Mata Kuliah: Pemrograman Berorientasi Obyek 2

Dosen Pengampu: Muhammad Ikhwan Fathulloh

Profil
Nama: Rajza Muhammad Yasyfa Fajri Sidiq
NIM: 23552011039
Studi Kasus: Kasir untuk pengelolaan premi dan klaim asuransi

Judul Studi Kasus
Aplikasi Kasir Asuransi untuk mengelola data Nasabah, Polis, dan Klaim menggunakan konsep Pemrograman Berorientasi Objek (OOP).

Penjelasan Studi Kasus
Aplikasi ini dibuat untuk membantu pengelolaan data nasabah, polis asuransi, dan klaim secara sederhana. Program berjalan di console dengan menu-menu untuk:

Menampilkan data nasabah
Menambah data polis
Menghitung premi asuransi (dengan perhitungan berbeda tiap jenis asuransi)
Melihat data polis
Semua data disimpan di database MySQL.

Penjelasan 4 Pilar OOP dalam Studi Kasus
1. Inheritance
Superclass: Asuransi

Subclass: Kesehatan, Jiwa
Kedua subclass ini mewarisi atribut dan method dari Asuransi. Setiap jenis asuransi bisa memiliki logika premi yang berbeda.

2. Encapsulation
Informasi nasabah disimpan dalam atribut private.
Akses data hanya bisa melalui method getter dan setter.
Contoh: atribut nama, umur di kelas Nasabah.

3. Polymorphism
Method hitungPremi() di kelas Asuransi di-override di subclass Kesehatan dan Jiwa dengan perhitungan premi masing-masing.
Saat dijalankan, objek Asuransi bisa menunjuk ke subclass yang sesuai (dynamic dispatch).

4. Abstraction (Interface)
Dibuat interface LayananAsuransi yang mendefinisikan method:
tambahPolis()
hitungPremi()
tampilkanPolis()
Implementasi detail method dilakukan di kelas AsuransiService.

Demo Proyek
Github: https://github.com/Rajza-Muhammad-Yasyfa-Fajri-Sidiq/UTS_PBO2_RP_23_CNS_A_23552011039  

Youtube: https://youtu.be/wSrN-HCO1Ww
