package model;
// Generated 2020/04/04 23:25:09 by Hibernate Tools 3.5.0.Final

/**
 * ProductId generated by hbm2java
 */
public class ProductId implements java.io.Serializable {

	private int id;
	private String code;
	private String name;
	private int cateId;

	public ProductId() {
	}

	public ProductId(int id, String code, String name, int cateId) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.cateId = cateId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCateId() {
		return this.cateId;
	}

	public void setCateId(int cateId) {
		this.cateId = cateId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductId))
			return false;
		ProductId castOther = (ProductId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null && castOther.getCode() != null
						&& this.getCode().equals(castOther.getCode())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null && castOther.getName() != null
						&& this.getName().equals(castOther.getName())))
				&& (this.getCateId() == castOther.getCateId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result + (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result + this.getCateId();
		return result;
	}

}
