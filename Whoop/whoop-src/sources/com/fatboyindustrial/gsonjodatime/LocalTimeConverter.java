package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes.dex */
public class LocalTimeConverter implements JsonSerializer<LocalTime>, JsonDeserializer<LocalTime> {

    /* JADX INFO: renamed from: a */
    public static final DateTimeFormatter f20348a = new DateTimeFormatterBuilder().append(ISODateTimeFormat.time().getPrinter(), ISODateTimeFormat.localTimeParser().getParser()).toFormatter();

    @Override // com.google.gson.JsonDeserializer
    public final LocalTime deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return LocalTime.parse(jsonElement.getAsString(), f20348a);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(LocalTime localTime, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(localTime.toString(f20348a));
    }
}
