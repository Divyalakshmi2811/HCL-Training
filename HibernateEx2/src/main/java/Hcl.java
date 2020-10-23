import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Hcl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eno;
	@Column(name="ename")
	private String name;
	private String address;
	public Hcl() {
		
	}
	public Hcl(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

