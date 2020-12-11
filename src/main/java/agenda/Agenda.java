package agenda;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.*;



/**
 * Description : An agenda that stores events
 */
public class Agenda {
    
    private ArrayList<Event> listEvenement;
   
    
    public Agenda(){
        this.listEvenement=new ArrayList();
    }

   
      
    /**
     * Adds an event to this agenda
     *
     
     * @param e the event to add
     */
    public void addEvent(Event e) {
        // TODO : implémenter cette méthode
        
        
        
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        ArrayList <Event> listEvenementDuJour= new ArrayList <Event>() ;
         ArrayList<LocalDateTime> plageHorraire= new ArrayList<LocalDateTime>();
        for( Event value : listEvenement) {
            for( int i=0;i<value.getDuration().toDays(); i+=1){
                plageHorraire.add(value.getStart().plusDays(i));
                for (LocalDateTime a : plageHorraire){
                     LocalDate d =LocalDate.of(a.getYear(),a.getMonthValue (), a.getDayOfYear());  
                      if (d==day){
                listEvenementDuJour.add(value);}
                }
            }
        //LocalDate d =LocalDate.of(value.getStart().getYear(),value.getStart().getMonthValue (), value.getStart().getDayOfYear());  
                }
        return listEvenementDuJour;
    }
}

    


        
  
        
                
            
    
     /**
     * Trouver les événements de l'agenda en fonction de leur titre
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
   
    
    
    
    


    
    
    
    


