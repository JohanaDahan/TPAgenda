package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
    public ChronoUnit frequency;
    public Duration duree;
    public ArrayList<LocalDate> exception;
    
    /**
     * Constructs a repetitive event
     *
     * @param title the title of this event
     * @param start the start of this event
     * @param duration myDuration in seconds
     * @param frequency one of :
     * <UL>
     * <LI>ChronoUnit.DAYS for daily repetitions</LI>
     * <LI>ChronoUnit.WEEKS for weekly repetitions</LI>
     * <LI>ChronoUnit.MONTHS for monthly repetitions</LI>
     * </UL>
     */
    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        this.frequency = frequency;
        this.exception=new ArrayList();        // TODO : implémenter cette méthode
        
        
        
    }

    
        
    
    

    /**
     * Adds an exception to the occurrence of this repetitive event
     *
     * @param date the event will not occur at this date
     */
    public void addException(LocalDate date){
        this.exception.add(date);
    }
        {
            
        
    
        
    
    
    /**
     *
     * @return the type of repetition
     */
    
      
    
    public ChronoUnit getFrequency() {
        // TODO : implémenter cette méthode
            
    }

    @Override
    public String toString() {
        return this.getTitle()+" "+this.getStart()+" "+this.getDuration()+" "+this.getFrequency();
    }

}
