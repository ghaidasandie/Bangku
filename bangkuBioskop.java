package TugasBesar;

import java.util.Scanner;

public class bangkuBioskop {
    public String film, mulai, film1, baris;
    public int saf;
    public String [] bangku1 = {"A1", "A2", "A3", "A4", "A5"};
    public String [] bangku2 = {"B1", "B2", "B3", "B4", "B5"};
    public String [] bangku3 = {"C1", "C2", "C3", "C4", "C5"};
    public String [] bangku4 = {"D1", "D2", "D3", "D4", "D5"};
    public String [] bangku5 = {"E1", "E2", "E3", "E4", "E5"};
    public Scanner scan = new Scanner (System.in);
    public void dataBangku (){
        System.out.println(bangku1[0] + "\t\t" + bangku1[1] + "\t\t" + bangku1[2] + "\t\t" + bangku1[3] + "\t\t" + bangku1[4]);
        System.out.println(bangku2[0] + "\t\t" + bangku2[1] + "\t\t" + bangku2[2] + "\t\t" + bangku2[3] + "\t\t" + bangku2[4]);
        System.out.println(bangku3[0] + "\t\t" + bangku3[1] + "\t\t" + bangku3[2] + "\t\t" + bangku3[3] + "\t\t" + bangku3[4]);
        System.out.println(bangku4[0] + "\t\t" + bangku4[1] + "\t\t" + bangku4[2] + "\t\t" + bangku4[3] + "\t\t" + bangku4[4]);
        System.out.println(bangku5[0] + "\t\t" + bangku5[1] + "\t\t" + bangku5[2] + "\t\t" + bangku5[3] + "\t\t" + bangku5[4]);
        System.out.println("------LAYAR BIOSKOP DI SINI------\n");
    }
    public String sambutan (){
        System.out.println("====SELAMAT DATANG DI APLIKASI BANGKU BIOSKOP====\n");
        System.out.println("Film apa yang mau kamu tonton?");
        film = scan.nextLine();
        System.out.println("Anda Memilih : " +film);
        dataBangku();
        proses();
        return "Program selesai";
    }
    public void proses(){
        Scanner scan = new Scanner(System.in);
        System.out.println("===Mohon pilih bangku anda===");
        System.out.println("Silakan pilih bangku yang ingin di tempati(A/B/C/D/E) : ");
        baris = scan.nextLine();
        if (baris.equalsIgnoreCase("A")){
            baris1();
        } else if (baris.equalsIgnoreCase("B")){
            baris2();
        } else if (baris.equalsIgnoreCase("C")){
            baris3();
        } else if (baris.equalsIgnoreCase("D")){
            baris4();
        } else if (baris.equalsIgnoreCase("E")){
            baris5();
        }
    }
    public void baris1() {
        System.out.println("Silakan pilih di baris bangku berapa yang ingin di tempati(1/2/3/4/5) :");
        saf = scan.nextInt();
        if (saf == 1){
            if (bangku1[0].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku1[0] = "X";
                mulaiFilm();
            }
        } else if (saf == 2){
            if (bangku1[1].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku1[1] = "X";
                mulaiFilm();
            }
        } else if (saf == 3){
            if (bangku1[2].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku1[2] = "X";
                mulaiFilm();
            }
        } else if (saf == 4){
            if (bangku1[3].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku1[3] = "X";
                mulaiFilm();
            }
        } else if (saf == 5){
            if (bangku1[4].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku1[4] = "X";
                mulaiFilm();
            }
        }
    }
    public void baris2() {
        System.out.println("Silakan pilih di baris bangku berapa yang ingin di tempati(1/2/3/4/5) :");
        saf = scan.nextInt();
        if (saf == 1){
            if (bangku2[0].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku2[0] = "X";
                mulaiFilm();
            }
        } else if (saf == 2){
            if (bangku2[1].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku2[1] = "X";
                mulaiFilm();
            }
        } else if (saf == 3){
            if (bangku2[2].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku2[2] = "X";
                mulaiFilm();
            }
        } else if (saf == 4){
            if (bangku2[3].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku2[3] = "X";
                mulaiFilm();
            }
        } else if (saf == 5){
            if (bangku2[4].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku2[4] = "X";
                mulaiFilm();
            }
        }
    }
    public void baris3() {
        System.out.println("Silakan pilih di baris bangku berapa yang ingin di tempati(1/2/3/4/5) :");
        saf = scan.nextInt();
        if (saf == 1){
            if (bangku3[0].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku3[0] = "X";
                mulaiFilm();
            }
        } else if (saf == 2){
            if (bangku3[1].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku3[1] = "X";
                mulaiFilm();
            }
        } else if (saf == 3){
            if (bangku3[2].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku3[2] = "X";
                mulaiFilm();
            }
        } else if (saf == 4){
            if (bangku3[3].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku3[3] = "X";
                mulaiFilm();
            }
        } else if (saf == 5){
            if (bangku3[4].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku3[4] = "X";
                mulaiFilm();
            }
        }
    }
    public void baris4() {
        System.out.println("Silakan pilih di baris bangku berapa yang ingin di tempati(1/2/3/4/5) :");
        saf = scan.nextInt();
        if (saf == 1){
            if (bangku4[0].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku4[0] = "X";
                mulaiFilm();
            }
        } else if (saf == 2){
            if (bangku4[1].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku4[1] = "X";
                mulaiFilm();
            }
        } else if (saf == 3){
            if (bangku4[2].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku4[2] = "X";
                mulaiFilm();
            }
        } else if (saf == 4){
            if (bangku4[3].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku4[3] = "X";
                mulaiFilm();
            }
        } else if (saf == 5){
            if (bangku4[4].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku4[4] = "X";
                mulaiFilm();
            }
        }
    }
    public void baris5() {
        System.out.println("Silakan pilih di baris bangku berapa yang ingin di tempati(1/2/3/4/5) :");
        saf = scan.nextInt();
        if (saf == 1){
            if (bangku5[0].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku5[0] = "X";
                mulaiFilm();
            }
        } else if (saf == 2){
            if (bangku5[1].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku5[1] = "X";
                mulaiFilm();
            }
        } else if (saf == 3){
            if (bangku5[2].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku5[2] = "X";
                mulaiFilm();
            }
        } else if (saf == 4){
            if (bangku5[3].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku5[3] = "X";
                mulaiFilm();
            }
        } else if (saf == 5){
            if (bangku5[4].equalsIgnoreCase("X")){
                System.out.println("Bangku Sudah penuh!");
                System.out.println("Silahkan pilih bangku Lain");
                dataBangku();
                proses();
            } else {
                bangku5[4] = "X";
                mulaiFilm();
            }
        }
    }
    public void mulaiFilm(){
        Scanner sc = new Scanner(System.in);
        dataBangku();
        System.out.println("Silahkan tekan tombol K untuk mulai film");
        System.out.println("Silahkan tekan tombol L untuk memesan tempat duduk kembali");
        mulai = sc.nextLine();
        if (mulai.equalsIgnoreCase("K")){
            System.out.println("Film sedang di mulai .....");
            end();
        } else if (mulai.equalsIgnoreCase("L")){
            dataBangku();
            proses();
        }
    }
    private void end() {
        System.out.println("Selamat Menonton ^-^");
    }

  }

