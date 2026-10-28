package com.whoop.design.json;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.whoop.design.models.DesignSystemModel;
import j93.InterfaceC21461d;
import java.lang.reflect.Type;
import java.util.Map;
import m83.C25272z;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/design/json/DesignSystemDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/whoop/design/models/DesignSystemModel;", "", "", "Lj93/d;", "additionalModels", "Lcom/whoop/design/json/DesignSystemTypeAdapter;", "adapter", "<init>", "(Ljava/util/Map;Lcom/whoop/design/json/DesignSystemTypeAdapter;)V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", "context", "a", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/json/DesignSystemTypeAdapter;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignSystemDeserializer implements JsonDeserializer<DesignSystemModel> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DesignSystemTypeAdapter adapter;

    /* JADX WARN: Multi-variable type inference failed */
    public DesignSystemDeserializer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.gson.JsonDeserializer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DesignSystemModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(typeOfT, "typeOfT");
        AbstractC22676k.m65750j(context, "context");
        return this.adapter.deserialize(json, typeOfT, context);
    }

    public DesignSystemDeserializer(Map<String, ? extends InterfaceC21461d> additionalModels, DesignSystemTypeAdapter adapter) {
        AbstractC22676k.m65750j(additionalModels, "additionalModels");
        AbstractC22676k.m65750j(adapter, "adapter");
        this.adapter = adapter;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DesignSystemDeserializer(Map map, DesignSystemTypeAdapter designSystemTypeAdapter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        map = (i13 & 1) != 0 ? C25272z.f99163w : map;
        this(map, (i13 & 2) != 0 ? new DesignSystemTypeAdapter(map) : designSystemTypeAdapter);
    }
}
