package at.kast.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import at.kast.library.Ensure;

@Entity
@Table(name="Buch")
public class Buch extends BasePersistable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7456310087131800766L;

    @NotNull
    @Column(name = "titel", nullable = false, length = 255)
    private String titel;
    
    @NotNull
    @Column(name = "autor", nullable = false, length = 255)
    private String autor;
    
    @NotNull
    @Column(name = "seitenzahl", nullable = false, length = 255)
    private int seitenzahl;
    
    protected Buch(){
    	//requireed for JPA
    }
    
    public Buch(String titel, String autor, int seitenzahl){
    	Ensure.notEmpty("titel", titel);
    	Ensure.notEmpty("autor", autor);
    	this.titel=titel;
    	this.autor=autor;
    	this.seitenzahl=seitenzahl;
    }
    
    public String getAutor() {
		return autor;
	}

	public int getSeitenzahl() {
		return seitenzahl;
	}

	public String getTitel(){
    	return titel;
    }
    
    

}
