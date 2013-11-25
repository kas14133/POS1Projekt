package at.kast.library.domain;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


public class Verleih extends BasePersistable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5023514542629650109L;

	@NotNull
	@Column(name="verleihID",nullable=false, length=255)
	private int verleihID;
	
	@NotNull
	@Column(name="datum",nullable=false, length=255)
	private Date datum;
	
	@NotNull
	@Column(name="ausborgdauer",nullable=false, length=255)
	private int ausborgdauer;
	
	@NotNull
	@Column(name="preis",nullable=false, length=255)
	private double preis;
	
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "angestellterID")
    private Angestellter angestellter;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "kundenID")
    private Kunde kunde;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "Buch")
    private Buch buch;
    
    public Verleih(int verleihID, Date datum, int ausborgdauer, double preis, Angestellter angestellter,
    		Kunde kunde, Buch buch)
    {
    	this.verleihID=verleihID;
    	this.datum=datum;
    	this.ausborgdauer=ausborgdauer;
    	this.preis=preis;
    	this.angestellter=angestellter;
    	this.kunde=kunde;
    	this.buch=buch;
    	
    }

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getVerleihID() {
		return verleihID;
	}

	public Date getDatum() {
		return datum;
	}

	public int getAusborgdauer() {
		return ausborgdauer;
	}

	public double getPreis() {
		return preis;
	}

	public Angestellter getAngestellter() {
		return angestellter;
	}

	public Kunde getKunde() {
		return kunde;
	}
    
    
}
