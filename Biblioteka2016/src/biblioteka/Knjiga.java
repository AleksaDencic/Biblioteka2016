package biblioteka;

import java.util.LinkedList;

public class Knjiga {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((autori == null) ? 0 : autori.hashCode());
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		result = prime * result + ((naslov == null) ? 0 : naslov.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (autori == null) {
			if (other.autori != null)
				return false;
		} else if (!autori.equals(other.autori))
			return false;
		if (isbn != other.isbn)
			return false;
		if (naslov == null) {
			if (other.naslov != null)
				return false;
		} else if (!naslov.equals(other.naslov))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
	}
	private String naslov;
	private long isbn;
	private LinkedList<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		if(naslov.isEmpty() || naslov=="")
			throw new RuntimeException("Morate uneti naslov knjige!");
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		if(isbn<=0)
			throw new RuntimeException("ISBN mora biti veci od 0!");
		this.isbn = isbn;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		if(izdavac.isEmpty() || izdavac=="")
			throw new RuntimeException("Morate uneti izdavaca knjige!");
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		if(izdanje<=0)
			throw new RuntimeException("Izdanje knjige mora biti vece od 0!");
		this.izdanje = izdanje;
	}
	
	
}
