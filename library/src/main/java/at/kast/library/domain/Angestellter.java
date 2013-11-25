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



@Entity
@Table(name="Angestellter")
public class Angestellter extends BasePersistable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3393613813293805573L;


	@NotNull
	@Column(name="angestelltenID",nullable=false, length=255)
	private int angestelltenID;
	
	@NotNull
	@Column(name="gehalt",nullable=false, length=255)
	private double gehalt;
	
    @ManyToOne
    private Person person;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "angestellter")
    private Collection<Verleih> Verleih;
	
	protected Angestellter(){
		//required for JPA
	}
	
	public Angestellter(int angestellenID, double gehalt,Person person){
		this.angestelltenID=angestellenID;
		this.gehalt=gehalt;
		this.person=person;
	}

	
}
