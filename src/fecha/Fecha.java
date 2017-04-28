
package fecha;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Fecha {
     //Hora
     public String dameFecha(){
       Calendar fecha = new GregorianCalendar();
       int hora, minutos, segundos,dia,mes,ano;
       
       hora =  fecha.get(Calendar.HOUR);
       minutos = fecha.get(Calendar.MINUTE);
       segundos = fecha.get(Calendar.SECOND);
       dia = fecha.get(Calendar.DAY_OF_MONTH);
       mes = fecha.get(Calendar.MONTH);
       ano = fecha.get(Calendar.YEAR);
       String  tiempo  = dia+"/" + mes + "/" +ano + "   " + hora + ":" + minutos + ":" + segundos;
       return tiempo;
     }
}
