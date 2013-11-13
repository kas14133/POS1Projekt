package at.kast.library.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@Size(max=255)
	@NotNull
	@Column(name="Name", nullable=false, length=255)
	private String name;
	
	@NotNull
	@Column(name="KundenID",nullable=false, length=255)
	private int kundenID;
	
	@NotNull
	@Column(name="Addresse", nullable=false,length=255)
	private String addresse;
	
	protected Kunde(){
		//required for JPA
	}
	
	public Kunde(String name, String addresse, int kundenID){
		Ensure.notEmpty("name", name);
		Ensure.notEmpty("addresse", addresse);
		this.name=name;
		this.addresse=addresse;
		this.kundenID=kundenID;
	}

	public String getName() {
		return name;
	}

	public int getKundenID() {
		return kundenID;
	}

	public String getAddresse() {
		return addresse;
	}
	
	
	
	
	
}