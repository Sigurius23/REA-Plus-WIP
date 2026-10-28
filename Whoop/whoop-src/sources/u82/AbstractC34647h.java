package u82;

import ad3.AbstractC0770m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u82.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a)\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, m65681d2 = {"Lkotlinx/serialization/json/JsonElement;", "", "preserveQuotedStrings", "", "d", "(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;", "c", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;", "", "", "b", "(Ljava/util/Map;)Ljava/util/Map;", "a", "serialization_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34647h {
    /* JADX INFO: renamed from: a */
    private static final Object m109486a(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            return jsonElement.toString();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        Object objM1843e = AbstractC0770m.m1843e(jsonPrimitive);
        return (objM1843e == null && (objM1843e = AbstractC0770m.m1849k(jsonPrimitive)) == null && (objM1843e = AbstractC0770m.m1845g(jsonPrimitive)) == null) ? jsonPrimitive.getContent() : objM1843e;
    }

    /* JADX INFO: renamed from: b */
    public static final Map<String, Object> m109487b(Map<String, ? extends JsonElement> map) {
        AbstractC22676k.m65750j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), m109486a((JsonElement) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m109488c(JsonElement jsonElement) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        if (!(jsonElement instanceof JsonPrimitive)) {
            return jsonElement.toString();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        Object objM1843e = AbstractC0770m.m1843e(jsonPrimitive);
        return (objM1843e == null && (objM1843e = AbstractC0770m.m1849k(jsonPrimitive)) == null && (objM1843e = AbstractC0770m.m1845g(jsonPrimitive)) == null) ? jsonPrimitive.getContent() : objM1843e;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m109489d(JsonElement jsonElement, boolean z4) {
        AbstractC22676k.m65750j(jsonElement, "<this>");
        if (jsonElement instanceof JsonNull) {
            return null;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            return jsonElement;
        }
        if (z4) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            if (jsonPrimitive.isString()) {
                return jsonPrimitive.getContent();
            }
        }
        JsonPrimitive jsonPrimitive2 = (JsonPrimitive) jsonElement;
        Object objM1843e = AbstractC0770m.m1843e(jsonPrimitive2);
        return (objM1843e == null && (objM1843e = AbstractC0770m.m1849k(jsonPrimitive2)) == null && (objM1843e = AbstractC0770m.m1845g(jsonPrimitive2)) == null) ? jsonPrimitive2.getContent() : objM1843e;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m109490e(JsonElement jsonElement, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = false;
        }
        return m109489d(jsonElement, z4);
    }
}
