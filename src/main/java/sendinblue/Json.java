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

package sendinblue;

import com.google.gson.*;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gsonfire.GsonFireBuilder;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Base64;
import java.util.Date;
import java.util.Map;

public class Json {
private Gson gson;
private boolean isLenientOnJson = false;
private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
private ByteArrayToBase64TypeAdapter byteArrayToBase64TypeAdapter = new ByteArrayToBase64TypeAdapter();
private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();

public Json() {
gson = createGson()
        .registerTypeAdapter(Date.class, dateTypeAdapter)
        .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
        .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
        .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
        .registerTypeHierarchyAdapter(byte[].class, byteArrayToBase64TypeAdapter)
        .create();
}

public static GsonBuilder createGson() {
GsonFireBuilder fireBuilder = new GsonFireBuilder();
return fireBuilder.createGsonBuilder();
}

private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
if (null == element) {
    throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
}
return element.getAsString();
}

private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue.toUpperCase());
if (null == clazz) {
    throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
}
return clazz;
}

/**
* Get Gson.
*
* @return Gson
*/
public Gson getGson() {
return gson;
}

/**
* Set Gson.
*
* @param gson Gson
* @return Json
*/
public Json setGson(Gson gson) {
this.gson = gson;
return this;
}

public Json setLenientOnJson(boolean lenientOnJson) {
isLenientOnJson = lenientOnJson;
return this;
}

/**
* Serialize the given Java object into Json string.
*
* @param obj Object
* @return String representation of the Json
*/
public String serialize(Object obj) {
return gson.toJson(obj);
}

/**
* Deserialize the given Json string to Java object.
*
* @param <T>        Type
* @param body       The Json string
* @param returnType The type to deserialize into
* @return The deserialized Java object
*/
@SuppressWarnings("unchecked")
public <T> T deserialize(String body, Type returnType) {
try {
    if (isLenientOnJson) {
        JsonReader jsonReader = new JsonReader(new StringReader(body));
        // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
        jsonReader.setLenient(true);
        return gson.fromJson(jsonReader, returnType);
    } else {
        return gson.fromJson(body, returnType);
    }
} catch (JsonParseException e) {
    // Fallback processing when failed to parse Json form response body:
    // return the response body string directly for the String return type;
    if (returnType.equals(String.class))
        return (T) body;
    else throw (e);
}
}

public Json setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
offsetDateTimeTypeAdapter.setFormat(dateFormat);
return this;
}

public Json setLocalDateFormat(DateTimeFormatter dateFormat) {
localDateTypeAdapter.setFormat(dateFormat);
return this;
}

public Json setDateFormat(DateFormat dateFormat) {
dateTypeAdapter.setFormat(dateFormat);
return this;
}

public Json setSqlDateFormat(DateFormat dateFormat) {
sqlDateTypeAdapter.setFormat(dateFormat);
return this;
}

/**
* Gson TypeAdapter for JSR310 OffsetDateTime type
*/
public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

private DateTimeFormatter formatter;

public OffsetDateTimeTypeAdapter() {
    this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
}

public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
    this.formatter = formatter;
}

public void setFormat(DateTimeFormatter dateFormat) {
    this.formatter = dateFormat;
}

@Override
public void write(JsonWriter out, OffsetDateTime date) throws IOException {
    if (date == null) {
        out.nullValue();
    } else {
        out.value(formatter.format(date));
    }
}

@Override
public OffsetDateTime read(JsonReader in) throws IOException {
    switch (in.peek()) {
        case NULL:
            in.nextNull();
            return null;
        default:
            String date = in.nextString();
            if (date.endsWith("+0000")) {
                date = date.substring(0, date.length() - 5) + "Z";
            }
            return OffsetDateTime.parse(date, formatter);
    }
}
}

public static class ByteArrayToBase64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
    return Base64.getDecoder().decode(json.getAsString());
}

public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
    return new JsonPrimitive(Base64.getEncoder().encodeToString(src));
}
}

/**
* Gson TypeAdapter for java.sql.Date type
* If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
* (more efficient than SimpleDateFormat).
*/
public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

private DateFormat dateFormat;

public SqlDateTypeAdapter() {
}

public SqlDateTypeAdapter(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
}

public void setFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
}

@Override
public void write(JsonWriter out, java.sql.Date date) throws IOException {
    if (date == null) {
        out.nullValue();
    } else {
        String value;
        if (dateFormat != null) {
            value = dateFormat.format(date);
        } else {
            value = date.toString();
        }
        out.value(value);
    }
}

@Override
public java.sql.Date read(JsonReader in) throws IOException {
    switch (in.peek()) {
        case NULL:
            in.nextNull();
            return null;
        default:
            String date = in.nextString();
            try {
                if (dateFormat != null) {
                    return new java.sql.Date(dateFormat.parse(date).getTime());
                }
                return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
            } catch (ParseException e) {
                throw new JsonParseException(e);
            }
    }
}
}

/**
* Gson TypeAdapter for java.util.Date type
* If the dateFormat is null, ISO8601Utils will be used.
*/
public static class DateTypeAdapter extends TypeAdapter<Date> {

private DateFormat dateFormat;

public DateTypeAdapter() {
}

public DateTypeAdapter(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
}

public void setFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
}

@Override
public void write(JsonWriter out, Date date) throws IOException {
    if (date == null) {
        out.nullValue();
    } else {
        String value;
        if (dateFormat != null) {
            value = dateFormat.format(date);
        } else {
            value = ISO8601Utils.format(date, true);
        }
        out.value(value);
    }
}

@Override
public Date read(JsonReader in) throws IOException {
    try {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                try {
                    if (dateFormat != null) {
                        return dateFormat.parse(date);
                    }
                    return ISO8601Utils.parse(date, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new JsonParseException(e);
                }
        }
    } catch (IllegalArgumentException e) {
        throw new JsonParseException(e);
    }
}
}

/**
* Gson TypeAdapter for JSR310 LocalDate type
*/
public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

private DateTimeFormatter formatter;

public LocalDateTypeAdapter() {
    this(DateTimeFormatter.ISO_LOCAL_DATE);
}

public LocalDateTypeAdapter(DateTimeFormatter formatter) {
    this.formatter = formatter;
}

public void setFormat(DateTimeFormatter dateFormat) {
    this.formatter = dateFormat;
}

@Override
public void write(JsonWriter out, LocalDate date) throws IOException {
    if (date == null) {
        out.nullValue();
    } else {
        out.value(formatter.format(date));
    }
}

@Override
public LocalDate read(JsonReader in) throws IOException {
    switch (in.peek()) {
        case NULL:
            in.nextNull();
            return null;
        default:
            String date = in.nextString();
            return LocalDate.parse(date, formatter);
    }
}
}

}