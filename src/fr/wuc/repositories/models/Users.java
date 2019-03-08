package fr.wuc.repositories.models;

public class Users {
	private String nom;
	private String prenom;
	private String mail;
	private String dateN;
	private String pseudo;
	private String avatar;
	private String login;
	private String password;
	private boolean maitreJeu;
	


	public Users() {
		super();
	}

	public Users(String nom, String prenom, String mail, String dateN, String pseudo, String avatar, String login,
			String password, boolean maitreJeu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.dateN = dateN;
		this.pseudo = pseudo;
		this.avatar = avatar;
		this.login = login;
		this.password = password;
		this.maitreJeu = maitreJeu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Users [nom=");
		builder.append(nom);
		builder.append(", prenom=");
		builder.append(prenom);
		builder.append(", mail=");
		builder.append(mail);
		builder.append(", dateN=");
		builder.append(dateN);
		builder.append(", pseudo=");
		builder.append(pseudo);
		builder.append(", avatar=");
		builder.append(avatar);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append(", maitreJeu=");
		builder.append(maitreJeu);
		builder.append("]");
		return builder.toString();
	}


	public boolean isMaitreJeu() {
		return maitreJeu;
	}

	public void setMaitreJeu(boolean maitreJeu) {
		this.maitreJeu = maitreJeu;
	}


	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDateN() {
		return dateN;
	}
	public void setDateN(String dateN) {
		this.dateN = dateN;
	}
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
