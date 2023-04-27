/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  |   | 406  | Error. Not Acceptable  | 
 *
 * OpenAPI spec version: 3.0.0
 * Contact: contact@sendinblue.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package sibModel;

import org.apache.commons.lang3.ObjectUtils;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RemoveCredits
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class RemoveCredits {
  @SerializedName("sms")
  private Long sms = null;

  @SerializedName("email")
  private Long email = null;

  public RemoveCredits sms(Long sms) {
    this.sms = sms;
    return this;
  }

   /**
   * Required if email credits are empty. SMS credits to be removed from the child account
   * @return sms
  **/
  @ApiModelProperty(example = "300", value = "Required if email credits are empty. SMS credits to be removed from the child account")
  public Long getSms() {
    return sms;
  }

  public void setSms(Long sms) {
    this.sms = sms;
  }

  public RemoveCredits email(Long email) {
    this.email = email;
    return this;
  }

   /**
   * Required if sms credits are empty. Email credits to be removed from the child account
   * @return email
  **/
  @ApiModelProperty(example = "500", value = "Required if sms credits are empty. Email credits to be removed from the child account")
  public Long getEmail() {
    return email;
  }

  public void setEmail(Long email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RemoveCredits removeCredits = (RemoveCredits) o;
    return ObjectUtils.equals(this.sms, removeCredits.sms) &&
    ObjectUtils.equals(this.email, removeCredits.email);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(sms, email);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoveCredits {\n");
    
    sb.append("    sms: ").append(toIndentedString(sms)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

