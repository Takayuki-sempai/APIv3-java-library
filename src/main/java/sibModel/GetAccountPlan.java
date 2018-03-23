/*
 * SendinBlue API
 * SendinBlue provide a RESTFul API that can be used with any languages. With this API, you will be able to :   - Manage your campaigns and get the statistics   - Manage your contacts   - Send transactional Emails and SMS   - and much more...  You can download our wrappers at https://github.com/orgs/sendinblue  **Possible responses**   | Code | Message |   | :-------------: | ------------- |   | 200  | OK. Successful Request  |   | 201  | OK. Successful Creation |   | 202  | OK. Request accepted |   | 204  | OK. Successful Update/Deletion  |   | 400  | Error. Bad Request  |   | 401  | Error. Authentication Needed  |   | 402  | Error. Not enough credit, plan upgrade needed  |   | 403  | Error. Permission denied  |   | 404  | Error. Object does not exist |   | 405  | Error. Method not allowed  | 
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
import org.threeten.bp.LocalDate;

/**
 * GetAccountPlan
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class GetAccountPlan {
  /**
   * Displays the plan type of the user
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYASYOUGO("payAsYouGo"),
    
    UNLIMITED("unlimited"),
    
    FREE("free"),
    
    SUBSCRIPTION("subscription"),
    
    SMS("sms"),
    
    RESELLER("reseller");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * This is the type of the credit, \&quot;User Limit\&quot; or \&quot;Send Limit\&quot; are two possible types of credit of a user. \&quot;User Limit\&quot; implies the total number of subscribers you can add to your account, and \&quot;Send Limit\&quot; implies the total number of emails you can send to the subscribers in your account.
   */
  @JsonAdapter(CreditsTypeEnum.Adapter.class)
  public enum CreditsTypeEnum {
    USERLIMIT("userLimit"),
    
    SENDLIMIT("sendLimit");

    private String value;

    CreditsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreditsTypeEnum fromValue(String text) {
      for (CreditsTypeEnum b : CreditsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreditsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreditsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreditsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreditsTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("creditsType")
  private CreditsTypeEnum creditsType = null;

  @SerializedName("credits")
  private Float credits = null;

  @SerializedName("startDate")
  private LocalDate startDate = null;

  @SerializedName("endDate")
  private LocalDate endDate = null;

  public GetAccountPlan type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Displays the plan type of the user
   * @return type
  **/
  @ApiModelProperty(example = "subscription", required = true, value = "Displays the plan type of the user")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetAccountPlan creditsType(CreditsTypeEnum creditsType) {
    this.creditsType = creditsType;
    return this;
  }

   /**
   * This is the type of the credit, \&quot;User Limit\&quot; or \&quot;Send Limit\&quot; are two possible types of credit of a user. \&quot;User Limit\&quot; implies the total number of subscribers you can add to your account, and \&quot;Send Limit\&quot; implies the total number of emails you can send to the subscribers in your account.
   * @return creditsType
  **/
  @ApiModelProperty(example = "sendLimit", required = true, value = "This is the type of the credit, \"User Limit\" or \"Send Limit\" are two possible types of credit of a user. \"User Limit\" implies the total number of subscribers you can add to your account, and \"Send Limit\" implies the total number of emails you can send to the subscribers in your account.")
  public CreditsTypeEnum getCreditsType() {
    return creditsType;
  }

  public void setCreditsType(CreditsTypeEnum creditsType) {
    this.creditsType = creditsType;
  }

  public GetAccountPlan credits(Float credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Remaining credits of the user. This can either be \&quot;User Limit\&quot; or \&quot;Send Limit\&quot; depending on the plan.
   * @return credits
  **/
  @ApiModelProperty(example = "8755.0", required = true, value = "Remaining credits of the user. This can either be \"User Limit\" or \"Send Limit\" depending on the plan.")
  public Float getCredits() {
    return credits;
  }

  public void setCredits(Float credits) {
    this.credits = credits;
  }

  public GetAccountPlan startDate(LocalDate startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Date of the period from which the plan will start (only available for \&quot;subscription\&quot;, \&quot;unlimited\&quot; and \&quot;reseller\&quot; plan type)
   * @return startDate
  **/
  @ApiModelProperty(example = "2016-12-31", value = "Date of the period from which the plan will start (only available for \"subscription\", \"unlimited\" and \"reseller\" plan type)")
  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public GetAccountPlan endDate(LocalDate endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Date of the period from which the plan will end (only available for \&quot;subscription\&quot;, \&quot;unlimited\&quot; and \&quot;reseller\&quot; plan type)
   * @return endDate
  **/
  @ApiModelProperty(example = "2017-01-31", value = "Date of the period from which the plan will end (only available for \"subscription\", \"unlimited\" and \"reseller\" plan type)")
  public LocalDate getEndDate() {
    return endDate;
  }

  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetAccountPlan getAccountPlan = (GetAccountPlan) o;
    return ObjectUtils.equals(this.type, getAccountPlan.type) &&
    ObjectUtils.equals(this.creditsType, getAccountPlan.creditsType) &&
    ObjectUtils.equals(this.credits, getAccountPlan.credits) &&
    ObjectUtils.equals(this.startDate, getAccountPlan.startDate) &&
    ObjectUtils.equals(this.endDate, getAccountPlan.endDate);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(type, creditsType, credits, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountPlan {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    creditsType: ").append(toIndentedString(creditsType)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

