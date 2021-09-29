package utilities;

import java.text.SimpleDateFormat;

import com.github.javafaker.Faker;

public class DataHelper {
	private Faker faker;
	public static DataHelper getDataHelper() {
		return new DataHelper();
	}
	public DataHelper() {
		faker = new Faker();
	}
	public String getEmailAddress() {
		return faker.internet().emailAddress();
	}
	public String getFirstName() {
		return faker.name().firstName();
	}
	public String getLastName() {
		return faker.name().lastName();
	}
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	public String getBirthday() {
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(faker.date().birthday(18, 30));
	}
	public String getCellPhoneNumber() {
		return faker.phoneNumber().cellPhone();
	}
	public String getPassword() {
		return faker.internet().password();
	}
	public int getRandomNumber() {
		return faker.number().numberBetween(1,999);
	}
	public String getRandomSevenDigitsNumber(){
		return faker.number().digits(7);
	}
	public String getRandomTenDigitsNumber(){
		return faker.number().digits(10);
	}
	public String getRandomSixDigitsNumber(){
		return faker.number().digits(6);
	}
	public String getFullAddress() {
		return faker.address().fullAddress();
	}
	public String getStreetAddress() {
		return faker.address().streetAddress();
	}
	public String getCity() {
		return faker.address().cityName();
	}
	public String getState() {
		return faker.address().state();
	}
	public String getPIN(){
		return faker.address().zipCode();
	}
}
