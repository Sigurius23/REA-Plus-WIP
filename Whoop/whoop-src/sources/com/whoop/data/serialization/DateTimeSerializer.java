package com.whoop.data.serialization;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.ISODateTimeFormat;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\u000f\u001a\n \u000e*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lcom/whoop/data/serialization/DateTimeSerializer;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/DateTime;", "Lcom/google/gson/JsonSerializer;", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lzr2/a;)V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "kotlin.jvm.PlatformType", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lorg/joda/time/DateTime;", "src", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", "Lcom/google/gson/JsonPrimitive;", "serialize", "(Lorg/joda/time/DateTime;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonPrimitive;", "Lzr2/a;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DateTimeSerializer implements JsonDeserializer<DateTime>, JsonSerializer<DateTime> {
    private final InterfaceC41070a dateAndTimeProvider;

    public DateTimeSerializer(InterfaceC41070a dateAndTimeProvider) {
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.dateAndTimeProvider = dateAndTimeProvider;
    }

    @Override // com.google.gson.JsonDeserializer
    public DateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        return ISODateTimeFormat.dateTimeParser().parseDateTime(json.getAsString()).withZone(this.dateAndTimeProvider.mo133366e());
    }

    @Override // com.google.gson.JsonSerializer
    public JsonPrimitive serialize(DateTime src, Type typeOfSrc, JsonSerializationContext context) {
        AbstractC22676k.m65750j(src, "src");
        AbstractC22676k.m65750j(typeOfSrc, "typeOfSrc");
        AbstractC22676k.m65750j(context, "context");
        return new JsonPrimitive(ISODateTimeFormat.dateTime().print(src.withZone(DateTimeZone.UTC)));
    }
}
