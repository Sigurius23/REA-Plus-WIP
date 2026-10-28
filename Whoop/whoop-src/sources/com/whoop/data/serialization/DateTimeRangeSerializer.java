package com.whoop.data.serialization;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.lang.reflect.Type;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J(\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\b0\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/data/serialization/DateTimeRangeSerializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "serialize", "kotlin.jvm.PlatformType", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DateTimeRangeSerializer implements JsonDeserializer<DateTimeRange>, JsonSerializer<DateTimeRange> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public DateTimeRange deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        String asString = json.getAsString();
        AbstractC22676k.m65749i(asString, "getAsString(...)");
        return new DateTimeRange(asString);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(DateTimeRange src, Type typeOfSrc, JsonSerializationContext context) {
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(typeOfSrc, "typeOfSrc");
        AbstractC22676k.m65750j(context, "context");
        return context.serialize(src.getDuring());
    }
}
