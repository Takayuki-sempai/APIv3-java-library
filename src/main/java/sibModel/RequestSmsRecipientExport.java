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
 * RequestSmsRecipientExport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class RequestSmsRecipientExport {
  @SerializedName("notifyURL")
  private String notifyURL = null;

  /**
   * Filter the recipients based on how they interacted with the campaign
   */
  @JsonAdapter(RecipientsTypeEnum.Adapter.class)
  public enum RecipientsTypeEnum {
    ALL("all"),
    
    DELIVERED("delivered"),
    
    ANSWERED("answered"),
    
    SOFTBOUNCES("softBounces"),
    
    HARDBOUNCES("hardBounces"),
    
    UNSUBSCRIBED("unsubscribed");

    private String value;

    RecipientsTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RecipientsTypeEnum fromValue(String text) {
      for (RecipientsTypeEnum b : RecipientsTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RecipientsTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RecipientsTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RecipientsTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return RecipientsTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("recipientsType")
  private RecipientsTypeEnum recipientsType = null;

  public RequestSmsRecipientExport notifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * URL that will be called once the export process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479
   * @return notifyURL
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", value = "URL that will be called once the export process is finished. For reference, https://help.sendinblue.com/hc/en-us/articles/360007666479")
  public String getNotifyURL() {
    return notifyURL;
  }

  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }

  public RequestSmsRecipientExport recipientsType(RecipientsTypeEnum recipientsType) {
    this.recipientsType = recipientsType;
    return this;
  }

   /**
   * Filter the recipients based on how they interacted with the campaign
   * @return recipientsType
  **/
  @ApiModelProperty(example = "answered", required = true, value = "Filter the recipients based on how they interacted with the campaign")
  public RecipientsTypeEnum getRecipientsType() {
    return recipientsType;
  }

  public void setRecipientsType(RecipientsTypeEnum recipientsType) {
    this.recipientsType = recipientsType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RequestSmsRecipientExport requestSmsRecipientExport = (RequestSmsRecipientExport) o;
    return ObjectUtils.equals(this.notifyURL, requestSmsRecipientExport.notifyURL) &&
    ObjectUtils.equals(this.recipientsType, requestSmsRecipientExport.recipientsType);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(notifyURL, recipientsType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSmsRecipientExport {\n");
    
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
    sb.append("    recipientsType: ").append(toIndentedString(recipientsType)).append("\n");
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

