
# SendSmtpEmail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sender** | [**SendSmtpEmailSender**](SendSmtpEmailSender.md) |  |  [optional]
**to** | [**List&lt;SendSmtpEmailTo&gt;**](SendSmtpEmailTo.md) | Email addresses and names of the recipients | 
**bcc** | [**List&lt;SendSmtpEmailBcc&gt;**](SendSmtpEmailBcc.md) | Email addresses and names of the recipients in bcc |  [optional]
**cc** | [**List&lt;SendSmtpEmailCc&gt;**](SendSmtpEmailCc.md) | Email addresses and names of the recipients in cc |  [optional]
**htmlContent** | **String** | HTML body of the message ( Mandatory if &#39;templateId&#39; is not passed, ignored if &#39;templateId&#39; is passed ) |  [optional]
**textContent** | **String** | Plain Text body of the message ( Ignored if &#39;templateId&#39; is passed ) |  [optional]
**subject** | **String** | Subject of the message. Mandatory if &#39;templateId&#39; is not passed |  [optional]
**replyTo** | [**SendSmtpEmailReplyTo**](SendSmtpEmailReplyTo.md) |  |  [optional]
**attachment** | [**List&lt;SendSmtpEmailAttachment&gt;**](SendSmtpEmailAttachment.md) | Pass the absolute URL (no local file) or the or the byte array of the attachment. Name can be used in both cases to define the attachment name. It is mandatory in case of content. Extension allowed: xlsx, xls, ods, docx, docm, doc, csv, pdf, txt, gif, jpg, jpeg, png, tif, tiff, rtf, bmp, cgm, css, shtml, html, htm, zip, xml, ppt, pptx, tar, ez, ics, mobi, msg, pub and eps ( Ignored if &#39;templateId&#39; is passed ) |  [optional]
**headers** | **Map&lt;String, String&gt;** |  |  [optional]
**templateId** | **Long** | Id of the template |  [optional]
**params** | **Map&lt;String, String&gt;** |  |  [optional]



