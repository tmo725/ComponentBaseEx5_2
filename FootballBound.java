/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballBound;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class FootballBound {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LiveScoreBean score = new LiveScoreBean();
        Subscriber somsri = new Subscriber();
        Subscriber somchai = new Subscriber();
        score.addPropertyChangeListener(somsri);
        score.addPropertyChangeListener(somchai);
        
        while(true){
            System.out.print("Enter Score = ");
            String enter = input.nextLine();
            
            if(enter.equals("")){
                break;
            }
            else{
                score.setScoreLine(enter);
            }
        }
    }
    
}
