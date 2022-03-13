package fp.utiles.sneakers.test;

import java.time.LocalDate;

import fp.utiles.sneakers.Sneakers;

public class SneakersTest {
    
    public static void main(String[] args) {
        
        try{
        Sneakers s1 = new Sneakers(LocalDate.of(2019,05,20), 0);
        Sneakers s2 = new Sneakers(LocalDate.of(2017,04,8), 200);

        System.out.println(s1);
        System.out.println(s2);
       
        }catch (IllegalArgumentException e){
            System.out.println("Se ha lanzado una excepción: " + e.getMessage());
        }


        
    }
    
}
