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
import java.util.ArrayList;
import java.util.List;
import sibModel.GetExtendedListCampaignStats;
import sibModel.GetList;

/**
 * GetExtendedList
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class GetExtendedList {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("totalBlacklisted")
  private Long totalBlacklisted = null;

  @SerializedName("totalSubscribers")
  private Long totalSubscribers = null;

  @SerializedName("uniqueSubscribers")
  private Long uniqueSubscribers = null;

  @SerializedName("folderId")
  private Long folderId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("campaignStats")
  private List<GetExtendedListCampaignStats> campaignStats = null;

  @SerializedName("dynamicList")
  private Boolean dynamicList = null;

  public GetExtendedList id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the list
   * @return id
  **/
  @ApiModelProperty(example = "23", required = true, value = "ID of the list")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetExtendedList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the list
   * @return name
  **/
  @ApiModelProperty(example = "Magento Customers - EN", required = true, value = "Name of the list")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetExtendedList totalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
    return this;
  }

   /**
   * Number of blacklisted contacts in the list
   * @return totalBlacklisted
  **/
  @ApiModelProperty(example = "13", required = true, value = "Number of blacklisted contacts in the list")
  public Long getTotalBlacklisted() {
    return totalBlacklisted;
  }

  public void setTotalBlacklisted(Long totalBlacklisted) {
    this.totalBlacklisted = totalBlacklisted;
  }

  public GetExtendedList totalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
    return this;
  }

   /**
   * Number of contacts in the list
   * @return totalSubscribers
  **/
  @ApiModelProperty(example = "1776", required = true, value = "Number of contacts in the list")
  public Long getTotalSubscribers() {
    return totalSubscribers;
  }

  public void setTotalSubscribers(Long totalSubscribers) {
    this.totalSubscribers = totalSubscribers;
  }

  public GetExtendedList uniqueSubscribers(Long uniqueSubscribers) {
    this.uniqueSubscribers = uniqueSubscribers;
    return this;
  }

   /**
   * Number of unique contacts in the list
   * @return uniqueSubscribers
  **/
  @ApiModelProperty(example = "1789", required = true, value = "Number of unique contacts in the list")
  public Long getUniqueSubscribers() {
    return uniqueSubscribers;
  }

  public void setUniqueSubscribers(Long uniqueSubscribers) {
    this.uniqueSubscribers = uniqueSubscribers;
  }

  public GetExtendedList folderId(Long folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * ID of the folder
   * @return folderId
  **/
  @ApiModelProperty(example = "2", required = true, value = "ID of the folder")
  public Long getFolderId() {
    return folderId;
  }

  public void setFolderId(Long folderId) {
    this.folderId = folderId;
  }

  public GetExtendedList createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC date-time of the list (YYYY-MM-DDTHH:mm:ss.SSSZ)
   * @return createdAt
  **/
  @ApiModelProperty(example = "2017-03-13T17:05:09Z", required = true, value = "Creation UTC date-time of the list (YYYY-MM-DDTHH:mm:ss.SSSZ)")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public GetExtendedList campaignStats(List<GetExtendedListCampaignStats> campaignStats) {
    this.campaignStats = campaignStats;
    return this;
  }

  public GetExtendedList addCampaignStatsItem(GetExtendedListCampaignStats campaignStatsItem) {
    if (this.campaignStats == null) {
      this.campaignStats = new ArrayList<GetExtendedListCampaignStats>();
    }
    this.campaignStats.add(campaignStatsItem);
    return this;
  }

   /**
   * Get campaignStats
   * @return campaignStats
  **/
  @ApiModelProperty(value = "")
  public List<GetExtendedListCampaignStats> getCampaignStats() {
    return campaignStats;
  }

  public void setCampaignStats(List<GetExtendedListCampaignStats> campaignStats) {
    this.campaignStats = campaignStats;
  }

  public GetExtendedList dynamicList(Boolean dynamicList) {
    this.dynamicList = dynamicList;
    return this;
  }

   /**
   * Status telling if the list is dynamic or not (true&#x3D;dynamic, false&#x3D;not dynamic)
   * @return dynamicList
  **/
  @ApiModelProperty(example = "false", value = "Status telling if the list is dynamic or not (true=dynamic, false=not dynamic)")
  public Boolean isDynamicList() {
    return dynamicList;
  }

  public void setDynamicList(Boolean dynamicList) {
    this.dynamicList = dynamicList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    GetExtendedList getExtendedList = (GetExtendedList) o;
    return ObjectUtils.equals(this.id, getExtendedList.id) &&
    ObjectUtils.equals(this.name, getExtendedList.name) &&
    ObjectUtils.equals(this.totalBlacklisted, getExtendedList.totalBlacklisted) &&
    ObjectUtils.equals(this.totalSubscribers, getExtendedList.totalSubscribers) &&
    ObjectUtils.equals(this.uniqueSubscribers, getExtendedList.uniqueSubscribers) &&
    ObjectUtils.equals(this.folderId, getExtendedList.folderId) &&
    ObjectUtils.equals(this.createdAt, getExtendedList.createdAt) &&
    ObjectUtils.equals(this.campaignStats, getExtendedList.campaignStats) &&
    ObjectUtils.equals(this.dynamicList, getExtendedList.dynamicList);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, name, totalBlacklisted, totalSubscribers, uniqueSubscribers, folderId, createdAt, campaignStats, dynamicList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetExtendedList {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalBlacklisted: ").append(toIndentedString(totalBlacklisted)).append("\n");
    sb.append("    totalSubscribers: ").append(toIndentedString(totalSubscribers)).append("\n");
    sb.append("    uniqueSubscribers: ").append(toIndentedString(uniqueSubscribers)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    campaignStats: ").append(toIndentedString(campaignStats)).append("\n");
    sb.append("    dynamicList: ").append(toIndentedString(dynamicList)).append("\n");
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

