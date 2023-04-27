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
 * SendSmtpEmailAttachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-02-28T15:16:18.937+05:30")
public class SendSmtpEmailAttachment {
  @SerializedName("url")
  private String url = null;

  @SerializedName("content")
  private byte[] content = null;

  @SerializedName("name")
  private String name = null;

  public SendSmtpEmailAttachment url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Absolute url of the attachment (no local file).
   * @return url
  **/
  @ApiModelProperty(example = "https://attachment.domain.com/myAttachmentFromUrl.jpg", value = "Absolute url of the attachment (no local file).")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SendSmtpEmailAttachment content(byte[] content) {
    this.content = content;
    return this;
  }

   /**
   * Base64 encoded chunk data of the attachment generated on the fly
   * @return content
  **/
  @ApiModelProperty(example = "b3JkZXIucGRm", value = "Base64 encoded chunk data of the attachment generated on the fly")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public SendSmtpEmailAttachment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Required if content is passed. Name of the attachment
   * @return name
  **/
  @ApiModelProperty(example = "myAttachment.png", value = "Required if content is passed. Name of the attachment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    SendSmtpEmailAttachment sendSmtpEmailAttachment = (SendSmtpEmailAttachment) o;
    return ObjectUtils.equals(this.url, sendSmtpEmailAttachment.url) &&
    ObjectUtils.equals(this.content, sendSmtpEmailAttachment.content) &&
    ObjectUtils.equals(this.name, sendSmtpEmailAttachment.name);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(url, content, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendSmtpEmailAttachment {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

