package attackforce.shareplan.domain;

import java.io.Serializable;

public class Plan implements Serializable {

	private static final long serialVersionUID = 1520961851058396786L;
	private long id;
	private Person person;
	private String subject;
	private String description;
	private String memo;
	private String status;
	private String startDate;
	private String reportDate;
	private String expiryDate;

	public Plan() {
	}

	public Plan(Person person, String subject, String description, String memo, String status, String startDate,
			String reportDate, String expiryDate) {
		super();
		this.person = person;
		this.subject = subject;
		this.description = description;
		this.memo = memo;
		this.status = status;
		this.startDate = startDate;
		this.reportDate = reportDate;
		this.expiryDate = expiryDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descreption) {
		this.description = descreption;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", person=" + person.getName() + ", subject=" + subject + ", description=" + description
				+ ", memo=" + memo + ", status=" + status + ", startDate=" + startDate + ", reportDate=" + reportDate
				+ ", expiryDate=" + expiryDate + "]";
	}	
}
