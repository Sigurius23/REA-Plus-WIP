package com.whoop.design.json;

import c93.InterfaceC4351m;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.whoop.design.models.DesignSystemModel;
import j93.InterfaceC21461d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p249jc.AbstractC21598x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.whoop.design.json.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00070\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t*0\b\u0002\u0010\n\"\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¨\u0006\u000b"}, m65681d2 = {"", "", "Lj93/d;", "Lkotlin/Function2;", "Lcom/google/gson/JsonDeserializationContext;", "Lcom/google/gson/JsonObject;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/json/DesignSystemModelFactory;", "c", "(Ljava/util/Map;)Ljava/util/Map;", "DesignSystemModelFactory", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6736j {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final Map<String, InterfaceC4351m> m20392c(Map<String, ? extends InterfaceC21461d> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), new C6735i(1, entry));
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final DesignSystemModel m20393d(Map.Entry entry, JsonDeserializationContext context, JsonObject content) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(content, "content");
        return (DesignSystemModel) context.deserialize(content, AbstractC21598x.m60663S((InterfaceC21461d) entry.getValue()));
    }
}
