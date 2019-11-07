/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan58_tambahkurang;

/**
 *
 * @author syhar
 */
public class SelisihBilangan extends Bilangan{
    
    public void tampilSelisih(){
        int selisih = getX() - getY();
        System.out.println("Hasil Selisih "+getX()+" - "+getY()+" = "+ selisih);
    }
    
}
