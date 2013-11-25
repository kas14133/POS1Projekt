package at.kast.library.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import at.kast.library.Ensure;

@Entity
@Table(name="Person")
public class Person extends BasePersistable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5201931993955129242L;

	@NotNull
	@Column(name="name",nullable=false, length=255)
	private String name;
	
	@NotNull
	@Column(name="alter",nullable=false, length=255)
	private int alter;
	
	@NotNull
	@Column(name="email",nullable=false, length=255)
	private String email;
	
	@NotNull
	@Column(name="addresse",nullable=false, length=255)
	private String addresse;
	
	@OneToMany
    private Collection<Angestellter> angestellter;
	
	@OneToMany
    private Collection<Kunde> kunde;
	
	protected Person(){
		//required for JPA
	}
	
	public Person(String name,int alter, String addresse, String email){
		Ensure.notEmpty("name", name);
		Ensure.notEmpty("email", email);
		Ensure.notEmpty("addresse", addresse);
		this.name=name;
		this.alter=alter;
		this.email=email;
		this.addresse=addresse;
        this.angestellter = new ArrayList<Angestellter>();
        this.kunde=new ArrayList<Kunde>();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getName() {
		return name;
	}

	public int getAlter() {
		return alter;
	}

	public String getEmail() {
		return email;
	}

	public String getAddresse() {
		return addresse;
	}

	
}
