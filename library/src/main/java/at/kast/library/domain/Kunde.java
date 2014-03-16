package at.kast.library.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import at.kast.library.Ensure;

@Entity
@Table(name="Kunde")
public class Kunde extends BasePersistable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1416181236023299319L;

	
	@NotNull
	@Column(name="KundenID",nullable=false, length=255)
	private int kundenID;
	
    @ManyToOne
    private Person person;
	
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "kunde")
    private Collection<Verleih> Verleih;
    
	protected Kunde(){
		//required for JPA
	}
	
	public Kunde(int kundenID, Person person){
		this.kundenID=kundenID;
		this.person=person;
	}

	public int getKundenID() {
		return kundenID;
	}

	
	
	
	
	
}