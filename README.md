# Tugas Simulasi UTS
Jadi saya memiliki table buku yang dimana memiliki atribute antara lain ISBN, Judul Buku, Tahun Terbit, dan Penerbit. Berikut adalah step CRUD dalam table buku :
## create table
ini adalah table buku yang berisi sebagai berikut

![create table](https://github.com/user-attachments/assets/427f32ad-7152-422d-a91b-983dc2820f12)

## Tampilan Table Buku
berikut adalah hasil table buku yang sudah kita buat

![table buku](https://github.com/user-attachments/assets/57acaebe-02ad-43e0-a406-ce143a5a8b51)

## Koneksi Database
step selanjutnya kita melakukan kodingan untuk menyambungkan netbeans ke postgre, berikut kodingannya

![kodingan koneksi netbeans ke postgree](https://github.com/user-attachments/assets/2d88f595-6ade-477c-a0b8-b5cd5f5254b4)

## Label
selanjutnya kita membuat tampilan, pertama kita menambahkan label dari menu palette ke form kita

![membuat label](https://github.com/user-attachments/assets/714f646f-2f56-4ab8-a2ca-1e316e0d63c3)

## Text Field
Step selanjutnya kita menambahkan text field untuk tempat kita mengisi data

![menambahkan textfield](https://github.com/user-attachments/assets/0f5f680a-38eb-4625-8eaf-72ebbee9cdeb)

## Button
selanjutnya kita tambahkan button dengan nama insert, update, dan delete untuk mengolah data

![menambahkan button](https://github.com/user-attachments/assets/aa48a8ae-8129-4028-a259-b09bbc8379b3)

## table
selanjutnya kita menambahkan jtable untuk menampilkan data kita

![menambahkan table](https://github.com/user-attachments/assets/3c7f5ae5-12a2-4a34-9504-57cebf0abac0)

## Kodingan Insert
berikut untuk kodingan dalam button insert untuk menambahkan data kita dalam table dengan memanggil method insertDb

![isi dalam button insert](https://github.com/user-attachments/assets/30dd41e3-a324-4d07-a2af-f049df2d67c1)
dan berikut isi kodingan dalam method insertDb

![kodingan insert](https://github.com/user-attachments/assets/10687441-da7e-4d66-9697-36c86aa7a43f)

## kodingan Update
berikut untuk kodingan dalam button update untuk mengubah data kita dalam table dengan memanggil method updateDb

![isi dalam button update](https://github.com/user-attachments/assets/09a346e4-2103-4f19-a0e7-90296b559ec4)
dan berikut isi kodingan dalam method updateDb
![kodingan update](https://github.com/user-attachments/assets/c50f29b4-070c-4924-889d-90c08fa62880)

## Kodingan Delete
berikut untuk kodingan dalam button delete untuk menghapus data kita dalam table dengan memanggil method deleteDb

![isi dalam button delete](https://github.com/user-attachments/assets/6f0875af-c1f7-4e3e-896f-dc64c4a5c376)
dan berikut isi kodingan dalam method deleteDb
![kodingan update](https://github.com/user-attachments/assets/c50f29b4-070c-4924-889d-90c08fa62880)

## Menampilkan Data
selanjutnya kita membuat method show table untuk menampilkan data di dalam table dan dengan bantuan memanggil method selectDb

![isi show table](https://github.com/user-attachments/assets/258de1af-16bb-4a8f-9c1d-a6f6b3cb62a0)
dan berikut isi kodingan dalam method selectDb
![kodingan select](https://github.com/user-attachments/assets/5823eaa9-cd03-4bb5-aa35-bf6e34b2553c)

## Hasil Tampilan
dan berikut hasil dari tampilannya
![Sebelum Insert](https://github.com/user-attachments/assets/4359a7cb-b857-41bb-9209-3844c655cd42)

## Praktek

## Tampilan Insert
kita akan mencoba memasukkan data dalam tabel
**sebelum**
![Sebelum Insert](https://github.com/user-attachments/assets/4359a7cb-b857-41bb-9209-3844c655cd42)
**sesudah**
![sesudah insert](https://github.com/user-attachments/assets/a30a35db-9461-486b-b571-02b2291bb19f)

## Tampilan Update
Kita akan mencoba mengubah data dalam table dari laskar pelangi menjadi jendral soedirman
**sebelum**
![sesudah insert](https://github.com/user-attachments/assets/a30a35db-9461-486b-b571-02b2291bb19f)
**sesudah**
![sesudah update dan sebelum delete](https://github.com/user-attachments/assets/c83c479f-82cb-45da-a39c-b945f3942351)

## Tampilan Delete
kita akan mencoba menghapus data yang ada dalam table
**sebelum**
![sesudah update dan sebelum delete](https://github.com/user-attachments/assets/c83c479f-82cb-45da-a39c-b945f3942351)
**sesudah**
![sesudah delete](https://github.com/user-attachments/assets/6f6d7444-130f-4ec7-8767-ddbdffdf69e8)

Semoga langkah-langkah yang saya berikan dan dapat dipahami sekian terimakasih
