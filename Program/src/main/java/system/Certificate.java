package system;

import java.time.LocalDate;
import java.util.Objects;

public class Certificate {
    // private course  courseName;
    private String certificationName;
    private String issuingOrganization;
    private LocalDate issuingDate;
    private LocalDate expirationDate;

    boolean checkCertificate(double AverageQuizzesRatings){
         // if(courseWeeks==numberOfPassedWeeks && quizzesRatings>= 70)
        return AverageQuizzesRatings >= 70.0;
    }
    void earn_certificate(boolean earnCertificate){
         if(earnCertificate) {
            String display = toString();
            System.out.println(display);
         } else
           System.out.println("Cannot earn this certificate ");
    }

    public String getIssuingOrganization() {
        return issuingOrganization;
    }

    // Expiration date is equal to issuing date + two years //
    public LocalDate getExpirationDate() {
         expirationDate=issuingDate.plusDays(0).plusMonths(0).plusYears(2);
         return expirationDate;
    }
    public void setIssuingDate(LocalDate issuingDate) {
        this.issuingDate = issuingDate;
    }

    public void setCertificationName(String courseTitle) {
        this.certificationName = courseTitle;
    }

    public void setIssuingOrganization(String issuingOrganization) {
        this.issuingOrganization = issuingOrganization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Certificate that = (Certificate) o;
        return Objects.equals(certificationName, that.certificationName) &&
                Objects.equals(issuingOrganization, that.issuingOrganization) &&
                Objects.equals(issuingDate, that.issuingDate) && Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificationName='" + certificationName + '\'' +
                ", issuingOrganization='" + issuingOrganization + '\'' +
                ", issuingDate=" + issuingDate +
                ", expirationDate=" + expirationDate +
                '}';
    }
}

