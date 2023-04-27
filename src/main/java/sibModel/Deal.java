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

/**
 * Deal Details
 */
@ApiModel(description = "Deal Details")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class Deal {
  @SerializedName("id")
  private String id = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("linkedContactsIds")
  private List<Integer> linkedContactsIds = null;

  @SerializedName("linkedCompaniesIds")
  private List<String> linkedCompaniesIds = null;

  public Deal id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique deal id
   * @return id
  **/
  @ApiModelProperty(example = "629475917295261d9b1f4403", value = "Unique deal id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Deal attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Deal attributes with values
   * @return attributes
  **/
  @ApiModelProperty(example = "{\"deal_name\":\"testname\",\"deal_owner\":\"6093d2425a9b436e9519d034\",\"amount\":12,\"pipeline\":\"6093d296ad1e9c5cf2140a58\",\"deal_stage\":\"9e577ff7-8e42-4ab3-be26-2b5e01b42518\",\"stage_updated_at\":\"2022-05-30T07:42:05.671Z\",\"created_at\":\"2022-05-30T07:42:05.671Z\",\"number_of_contacts\":1,\"last_updated_date\":\"2022-06-06T08:38:36.761Z\",\"last_activity_date\":\"2022-06-06T08:38:36.000Z\",\"number_of_activities\":0}", value = "Deal attributes with values")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public Deal linkedContactsIds(List<Integer> linkedContactsIds) {
    this.linkedContactsIds = linkedContactsIds;
    return this;
  }

  public Deal addLinkedContactsIdsItem(Integer linkedContactsIdsItem) {
    if (this.linkedContactsIds == null) {
      this.linkedContactsIds = new ArrayList<Integer>();
    }
    this.linkedContactsIds.add(linkedContactsIdsItem);
    return this;
  }

   /**
   * Contact ids for contacts linked to this deal
   * @return linkedContactsIds
  **/
  @ApiModelProperty(example = "[1,2,3]", value = "Contact ids for contacts linked to this deal")
  public List<Integer> getLinkedContactsIds() {
    return linkedContactsIds;
  }

  public void setLinkedContactsIds(List<Integer> linkedContactsIds) {
    this.linkedContactsIds = linkedContactsIds;
  }

  public Deal linkedCompaniesIds(List<String> linkedCompaniesIds) {
    this.linkedCompaniesIds = linkedCompaniesIds;
    return this;
  }

  public Deal addLinkedCompaniesIdsItem(String linkedCompaniesIdsItem) {
    if (this.linkedCompaniesIds == null) {
      this.linkedCompaniesIds = new ArrayList<String>();
    }
    this.linkedCompaniesIds.add(linkedCompaniesIdsItem);
    return this;
  }

   /**
   * Companies ids for companies linked to this deal
   * @return linkedCompaniesIds
  **/
  @ApiModelProperty(example = "[\"61a5ce58c5d4795761045990\",\"61a5ce58c5d4795761045991\",\"61a5ce58c5d4795761045992\"]", value = "Companies ids for companies linked to this deal")
  public List<String> getLinkedCompaniesIds() {
    return linkedCompaniesIds;
  }

  public void setLinkedCompaniesIds(List<String> linkedCompaniesIds) {
    this.linkedCompaniesIds = linkedCompaniesIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    Deal deal = (Deal) o;
    return ObjectUtils.equals(this.id, deal.id) &&
    ObjectUtils.equals(this.attributes, deal.attributes) &&
    ObjectUtils.equals(this.linkedContactsIds, deal.linkedContactsIds) &&
    ObjectUtils.equals(this.linkedCompaniesIds, deal.linkedCompaniesIds);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(id, attributes, linkedContactsIds, linkedCompaniesIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deal {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    linkedContactsIds: ").append(toIndentedString(linkedContactsIds)).append("\n");
    sb.append("    linkedCompaniesIds: ").append(toIndentedString(linkedCompaniesIds)).append("\n");
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

