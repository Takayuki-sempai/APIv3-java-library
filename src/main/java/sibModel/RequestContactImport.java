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
import java.util.ArrayList;
import java.util.List;
import sibModel.RequestContactImportNewList;

/**
 * RequestContactImport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-23T10:53:13.078+05:30")
public class RequestContactImport {
  @SerializedName("fileUrl")
  private String fileUrl = null;

  @SerializedName("fileBody")
  private String fileBody = null;

  @SerializedName("listIds")
  private List<Long> listIds = null;

  @SerializedName("notifyUrl")
  private String notifyUrl = null;

  @SerializedName("newList")
  private RequestContactImportNewList newList = null;

  public RequestContactImport fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
  }

   /**
   * Mandatory if fileBody not defined. URL of the file to be imported (no local file). Possible file types: .txt, .csv
   * @return fileUrl
  **/
  @ApiModelProperty(example = "https://importfile.domain.com", value = "Mandatory if fileBody not defined. URL of the file to be imported (no local file). Possible file types: .txt, .csv")
  public String getFileUrl() {
    return fileUrl;
  }

  public void setFileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
  }

  public RequestContactImport fileBody(String fileBody) {
    this.fileBody = fileBody;
    return this;
  }

   /**
   * Mandatory if fileUrl is not defined. CSV content to be imported. Use semicolon to separate multiple attributes
   * @return fileBody
  **/
  @ApiModelProperty(example = "NAME;SURNAME;EMAIL\\n\"Smith\";\"John\";\"john.smith@example.com\"\\n\"Roger\";\"Ellie\";\"ellie36@example.com", value = "Mandatory if fileUrl is not defined. CSV content to be imported. Use semicolon to separate multiple attributes")
  public String getFileBody() {
    return fileBody;
  }

  public void setFileBody(String fileBody) {
    this.fileBody = fileBody;
  }

  public RequestContactImport listIds(List<Long> listIds) {
    this.listIds = listIds;
    return this;
  }

  public RequestContactImport addListIdsItem(Long listIdsItem) {
    if (this.listIds == null) {
      this.listIds = new ArrayList<Long>();
    }
    this.listIds.add(listIdsItem);
    return this;
  }

   /**
   * Manadatory if newList is not defined. Ids of the lists in which to add the contacts
   * @return listIds
  **/
  @ApiModelProperty(value = "Manadatory if newList is not defined. Ids of the lists in which to add the contacts")
  public List<Long> getListIds() {
    return listIds;
  }

  public void setListIds(List<Long> listIds) {
    this.listIds = listIds;
  }

  public RequestContactImport notifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * URL that will be called once the export process is finished
   * @return notifyUrl
  **/
  @ApiModelProperty(example = "http://requestb.in/173lyyx1", value = "URL that will be called once the export process is finished")
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }

  public RequestContactImport newList(RequestContactImportNewList newList) {
    this.newList = newList;
    return this;
  }

   /**
   * Get newList
   * @return newList
  **/
  @ApiModelProperty(value = "")
  public RequestContactImportNewList getNewList() {
    return newList;
  }

  public void setNewList(RequestContactImportNewList newList) {
    this.newList = newList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    RequestContactImport requestContactImport = (RequestContactImport) o;
    return ObjectUtils.equals(this.fileUrl, requestContactImport.fileUrl) &&
    ObjectUtils.equals(this.fileBody, requestContactImport.fileBody) &&
    ObjectUtils.equals(this.listIds, requestContactImport.listIds) &&
    ObjectUtils.equals(this.notifyUrl, requestContactImport.notifyUrl) &&
    ObjectUtils.equals(this.newList, requestContactImport.newList);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(fileUrl, fileBody, listIds, notifyUrl, newList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestContactImport {\n");
    
    sb.append("    fileUrl: ").append(toIndentedString(fileUrl)).append("\n");
    sb.append("    fileBody: ").append(toIndentedString(fileBody)).append("\n");
    sb.append("    listIds: ").append(toIndentedString(listIds)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    newList: ").append(toIndentedString(newList)).append("\n");
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

