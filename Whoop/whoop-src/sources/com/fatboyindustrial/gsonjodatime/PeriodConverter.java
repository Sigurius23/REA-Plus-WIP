package com.fatboyindustrial.gsonjodatime;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.Period;
import org.joda.time.format.ISOPeriodFormat;

/* JADX INFO: loaded from: classes.dex */
public class PeriodConverter implements JsonSerializer<Period>, JsonDeserializer<Period> {
    @Override // com.google.gson.JsonDeserializer
    public final Period deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.getAsString() == null || jsonElement.getAsString().isEmpty()) {
            return null;
        }
        return ISOPeriodFormat.standard().parsePeriod(jsonElement.getAsString());
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Period period, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(ISOPeriodFormat.standard().print(period));
    }
}
