package com.whoop.design.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import java.lang.reflect.Type;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/design/json/TextResourceDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/design/util/TextResource;", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/util/TextResource;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TextResourceDeserializer implements JsonDeserializer<TextResource> {
    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TextResource deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        return AbstractC8693b.m21278l(json.getAsString());
    }
}
