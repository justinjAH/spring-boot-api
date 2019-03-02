/**
 * Info about this beanpackagex doing something for package-info.java file.
 */
package beanpackage;
/**  import. */
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**  Entity. */
@Entity
public class Beanclas {
/**  ID. */
@Id
@GeneratedValue
@Column(name = "company_id")
private Integer companyId;
/**  database company_name column. */
@Column(name = "company_name")
private String companyName;
/**  database company_type column. */
@Column(name = "company_type")
private String companyType;
/**  database company_phone column. */
@Column(name = "company_phone")
private BigInteger companyPhone;
/**  database company_email column. */
@Column(name = "company_email")
private String companyEmail;

/**  Beanclas. */

/**  getCompany_id. */
/** @return companyId **this returns companyId **.*/
public Integer getCompanyId() {
return companyId;
}
/**  getCompany_id. */
/** @param companyId **this returns companyId **.*/
public void setCompanyId(final Integer companyId) {
this.companyId = companyId;
}
/**  getCompanyName. */
/** @return companyName **this returns companyName **.*/
public String getCompanyName() {
return companyName;
}
/**  setCompany_name. */
/** @param companyName **this returns companyName **.*/
public void setCompanyName(final String companyName) {
this.companyName = companyName;
}
/**  getCompany_type. */
/** @return companyType **this returns companyType **.*/
public String getCompanytype() {
return companyType;
}
/**  setCompany_type. */
/** @param companyType **this returns companyType **.*/
public void setCompanyType(final String companyType) {
this.companyType = companyType;
}
/**  getCompany_phone. */
/** @return companyPhone **this returns companyPhone **.*/
public BigInteger getCompanyPhone() {
return companyPhone;
}
/**  setCompany_phone. */
/** @param companyPhone **this returns companyPhone **.*/
public void setCompanyPhone(final BigInteger companyPhone) {
this.companyPhone = companyPhone;
}
/**  getCompany_email. */
/** @return companyEmail **this returns companyEmail **.*/
public String getCompanyEmail() {
return companyEmail;
}
/**  setCompany_email. */
/** @param companyEmail **this returns companyEmail **.*/
public void setCompanyEmail(final String companyEmail) {
this.companyEmail = companyEmail;
}
}
