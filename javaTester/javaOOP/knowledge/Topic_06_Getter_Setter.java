package javaOOP.knowledge;

public class Topic_06_Getter_Setter {
	public String personName;
	public int personAge;
	public int personPhone;
	public float personBankAccountAmount;
	
	public String getPersonName() {
		return personName;
	}
	
	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty()) {
			throw new IllegalArgumentException("Ten khong duoc bo trong!");
		} else {
			this.personName = personName;
		}
	}
	
	public int getPersonAge() {
		return personAge;
	}
	
	public void setPersonAge(int personAge) {
		if (personAge > 0 || personAge < 120) {
			throw new IllegalArgumentException("Tuoi phai hop le!");
		} else {
			this.personAge = personAge;
		}
	}
	
	public int getPersonPhone() {
		return personPhone;
	}
	
	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("So dt khong hop le!");
		} else if (personPhone < 10 || personPhone > 11) {
			throw new IllegalArgumentException("So dt khong hop le!");
		} else {
			this.personPhone = personPhone;			
		}
	}
	
	public float getPersonBankAccountAmount() {
		return personBankAccountAmount;
	}
	
	public void setPersonBankAccountAmount(float personBankAccountAmount) {
		this.personBankAccountAmount = personBankAccountAmount;
	}
	
	
}
