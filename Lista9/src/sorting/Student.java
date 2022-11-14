package zad2;

public class Student implements Comparable<Student>{

	int rocznik,srednia;
	String nazwisko;

	public Student(int rocznik,String nazwisko, int srednia)
	{
		this.rocznik=rocznik;
		this.nazwisko=nazwisko;
		this.srednia=srednia;
	}

	public int getRocznik() {
		return rocznik;
	}

	public void setRocznik(int rocznik) {
		this.rocznik = rocznik;
	}

	public int getSrednia() {
		return srednia;
	}

	public void setSrednia(int srednia) {
		this.srednia = srednia;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	@Override
	public int compareTo(Student o) {
		int result = this.rocznik - o.rocznik;
		if(result == 0)
		{
			result = this.srednia - o.srednia;
			if(result == 0)
			{
				return this.nazwisko.compareTo(o.nazwisko);
			}
			return result;
		}
		return result;
	}

	@Override
	public String toString() {
		return " \n Student [rocznik=" + rocznik + ", srednia=" + srednia + ", nazwisko=" + nazwisko + "]";
	}
	
}
