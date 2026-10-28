package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public class InstantConverter implements JsonSerializer<Instant>, JsonDeserializer<Instant> {

    /* JADX INFO: renamed from: a */
    public static final DateTimeFormatter f20346a = ISODateTimeFormat.dateTime().withZoneUTC();

    /* JADX INFO: renamed from: b */
    public static final DateTimeFormatter f20347b = ISODateTimeFormat.dateTimeParser().withZoneUTC();

    @Override // com.google.gson.JsonDeserializer
    public final Instant deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return Instant.parse(jsonElement.getAsString(), f20347b);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Instant instant, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(f20346a.print(instant));
    }
}
