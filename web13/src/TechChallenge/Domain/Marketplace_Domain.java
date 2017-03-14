package TechChallenge.Domain;

public class Marketplace_Domain implements Maketplace_Domain_Interface{
private String baseUrl;
private String partner;
private String uuid;
public String getBaseUrl() {
	return baseUrl;
}
public void setBaseUrl(String baseUrl) {
	this.baseUrl = baseUrl;
}
public String getPartner() {
	return partner;
}
public void setPartner(String partner) {
	this.partner = partner;
}
public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
}
