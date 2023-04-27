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
 * Body
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class Body {
  @SerializedName("name")
  private String name = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("countryCode")
  private Long countryCode = null;

  public Body name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of company
   * @return name
  **/
  @ApiModelProperty(example = "company", required = true, value = "Name of company")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Body attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Attributes for company creation
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"domain\":\"https://example.com\",\"industry\":\"Fabric\",\"owner\":\"60e68d60582a3b006f524197\"}", value = "Attributes for company creation")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public Body countryCode(Long countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Country code if phone_number is passed in attributes.
   * @return countryCode
  **/
  @ApiModelProperty(example = "91", value = "Country code if phone_number is passed in attributes.")
  public Long getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(Long countryCode) {
    this.countryCode = countryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Body body = (Body) o;
    return ObjectUtils.equals(this.name, body.name) &&
    ObjectUtils.equals(this.attributes, body.attributes) &&
    ObjectUtils.equals(this.countryCode, body.countryCode);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(name, attributes, countryCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
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

