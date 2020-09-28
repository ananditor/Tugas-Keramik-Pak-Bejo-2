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
public class ProjectKeramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // mencari harga termurah menggunakan constructor //
        Keramik2 k1 = new Keramik2 (30, 30, 10, 54000);
        k1.hasil();
        
        Keramik2 k2 = new Keramik2 (40, 40, 5, 65000);
        k2.hasil();
        
        Keramik2 k3 = new Keramik2 (30, 40, 8, 60000);
        k3.hasil();
    }
}
