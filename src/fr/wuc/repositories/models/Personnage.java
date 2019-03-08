package fr.wuc.repositories.models;

public class Personnage {
	private String pseudoPerso;
	private String prenomPerso;
	private int agePerso;
	private String talent;
	private String sexe;
	private String occupation;
	private String Residence;
	private String lieuNaissance;
	private String description;
	
	
	
	public Personnage() {
		super();
	}
	
	
	
	public Personnage(String pseudoPerso, String prenomPerso, int agePerso, String talent, String sexe,
			String occupation, String residence, String lieuNaissance, String description) {
		super();
		this.pseudoPerso = pseudoPerso;
		this.prenomPerso = prenomPerso;
		this.agePerso = agePerso;
		this.talent = talent;
		this.sexe = sexe;
		this.occupation = occupation;
		Residence = residence;
		this.lieuNaissance = lieuNaissance;
		this.description = description;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personnage [pseudoPerso=");
		builder.append(pseudoPerso);
		builder.append(", prenomPerso=");
		builder.append(prenomPerso);
		builder.append(", agePerso=");
		builder.append(agePerso);
		builder.append(", talent=");
		builder.append(talent);
		builder.append(", sexe=");
		builder.append(sexe);
		builder.append(", occupation=");
		builder.append(occupation);
		builder.append(", Residence=");
		builder.append(Residence);
		builder.append(", lieuNaissance=");
		builder.append(lieuNaissance);
		builder.append(", description=");
		builder.append(description);
		builder.append("]");
		return builder.toString();
	}



	public String getPseudoPerso() {
		return pseudoPerso;
	}
	public void setPseudoPerso(String pseudoPerso) {
		this.pseudoPerso = pseudoPerso;
	}
	public String getPrenomPerso() {
		return prenomPerso;
	}
	public void setPrenomPerso(String prenomPerso) {
		this.prenomPerso = prenomPerso;
	}
	public int getAgePerso() {
		return agePerso;
	}
	public void setAgePerso(int agePerso) {
		this.agePerso = agePerso;
	}
	public String getTalent() {
		return talent;
	}
	public void setTalent(String talent) {
		this.talent = talent;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getResidence() {
		return Residence;
	}
	public void setResidence(String residence) {
		Residence = residence;
	}
	public String getLieuNaissance() {
		return lieuNaissance;
	}
	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
