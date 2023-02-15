package prodto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patientdto {
	@Id
	private int id;
	private String name;
	private String blood_grp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBlood_grp() {
		return blood_grp;
	}
	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	
	

}
