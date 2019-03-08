package fr.wuc.repositories.models;

public class Scenario {
private String nomScenario;
private String univers;
private String contenu;

public Scenario() {
	super();
}
public Scenario(String nomScenario, String univers, String contenu) {
	super();
	this.nomScenario = nomScenario;
	this.univers = univers;
	this.contenu = contenu;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Scenario [nomScenario=");
	builder.append(nomScenario);
	builder.append(", univers=");
	builder.append(univers);
	builder.append(", contenu=");
	builder.append(contenu);
	builder.append("]");
	return builder.toString();
}

public String getNomScenario() {
	return nomScenario;
}
public void setNomScenario(String nomScenario) {
	this.nomScenario = nomScenario;
}
public String getUnivers() {
	return univers;
}
public void setUnivers(String univers) {
	this.univers = univers;
}
public String getContenu() {
	return contenu;
}
public void setContenu(String contenu) {
	this.contenu = contenu;
}
	


	
}
