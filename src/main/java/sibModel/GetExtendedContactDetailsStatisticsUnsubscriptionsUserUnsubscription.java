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
import org.threeten.bp.OffsetDateTime;

/**
 * GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription {
  @SerializedName("campaignId")
  private Long campaignId = null;

  @SerializedName("eventTime")
  private OffsetDateTime eventTime = null;

  @SerializedName("ip")
  private String ip = null;

  public GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the campaign which generated the event
   * @return campaignId
  **/
  @ApiModelProperty(example = "3", required = true, value = "ID of the campaign which generated the event")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * UTC date-time of the event
   * @return eventTime
  **/
  @ApiModelProperty(example = "2017-03-12T20:15:13Z", required = true, value = "UTC date-time of the event")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * IP from which the user has unsubscribed
   * @return ip
  **/
  @ApiModelProperty(example = "165.87.3.15", required = true, value = "IP from which the user has unsubscribed")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription getExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription = (GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription) o;
    return ObjectUtils.equals(this.campaignId, getExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription.campaignId) &&
    ObjectUtils.equals(this.eventTime, getExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription.eventTime) &&
    ObjectUtils.equals(this.ip, getExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription.ip);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(campaignId, eventTime, ip);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedContactDetailsStatisticsUnsubscriptionsUserUnsubscription {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

