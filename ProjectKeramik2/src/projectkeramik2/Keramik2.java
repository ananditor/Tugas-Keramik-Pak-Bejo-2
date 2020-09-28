/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik2;

/**
 *
 * @author anandito K3519013
 */
public class Keramik2 {
    //* atribut *//
    int panjang;
    int lebar;
    int isi;
    int harga;
    
    //* constructor *//
    Keramik2(int p, int l, int isi, int harga){
        this.panjang = p;
        this.lebar = l;
        this.isi = isi;
        this.harga = harga;
    }
    //* method *//
    int Keramik(){
        int jumlahkeramik = this.panjang*this.lebar*this.isi;
        return jumlahkeramik;
    }

    int JumlahBox(){
        int jumlahbox = 1000000/this.Keramik();
        return jumlahbox;              
    }

    int Harga(){
        int totalharga = this.JumlahBox()*this.harga;
        return totalharga;
    }

void hasil(){
    System.out.println("Jumlah keramik              : " +this.Keramik()+ "pcs");
    System.out.println("Jumlah box                  : " +this.JumlahBox()+ "box"); 
    System.out.println("Total harga yang dibayar    : Rp." +this.Harga());
    }
}
