package com.whoop.design.models.binding;

import java.util.List;
import kotlinx.serialization.json.JsonElement;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a,\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, m65681d2 = {"setNestedValue", "Lkotlinx/serialization/json/JsonElement;", "path", "", "", "value", "createMissingObjects", "", "setNestedValueOrLeaf", "tail", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class JsonPathSetterKt {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r6 == null) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.json.JsonElement setNestedValue(kotlinx.serialization.json.JsonElement r4, java.util.List<java.lang.String> r5, kotlinx.serialization.json.JsonElement r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r4, r0)
            java.lang.String r0 = "path"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r5, r0)
            java.lang.String r0 = "value"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r6, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L16
            return r6
        L16:
            r0 = 0
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            r2 = 0
            if (r1 != 0) goto L26
            goto La0
        L26:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r1 = 1
            java.util.List r5 = m83.AbstractC25265s.m74161z0(r5, r1)
            boolean r1 = r4 instanceof kotlinx.serialization.json.JsonArray
            if (r1 == 0) goto L6b
            java.lang.Integer r0 = yb3.AbstractC39421y.m125932Q(r0)
            if (r0 == 0) goto La0
            int r1 = r0.intValue()
            if (r1 < 0) goto L47
            r3 = r4
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            if (r1 >= r3) goto L47
            goto L48
        L47:
            r0 = r2
        L48:
            if (r0 == 0) goto La0
            int r0 = r0.intValue()
            r1 = r4
            kotlinx.serialization.json.JsonArray r1 = (kotlinx.serialization.json.JsonArray) r1
            kotlinx.serialization.json.JsonElement r1 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r5 = setNestedValueOrLeaf(r1, r5, r6, r7)
            if (r5 != 0) goto L5c
            goto La0
        L5c:
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.ArrayList r4 = m83.AbstractC25265s.m74097F1(r4)
            r4.set(r0, r5)
            kotlinx.serialization.json.JsonArray r5 = new kotlinx.serialization.json.JsonArray
            r5.<init>(r4)
            return r5
        L6b:
            boolean r1 = r4 instanceof kotlinx.serialization.json.JsonObject
            if (r1 == 0) goto La0
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L76
            goto L91
        L76:
            r1 = r4
            kotlinx.serialization.json.JsonObject r1 = (kotlinx.serialization.json.JsonObject) r1
            java.lang.Object r1 = r1.get(r0)
            kotlinx.serialization.json.JsonElement r1 = (kotlinx.serialization.json.JsonElement) r1
            if (r1 != 0) goto L8a
            if (r7 == 0) goto La0
            kotlinx.serialization.json.JsonObject r1 = new kotlinx.serialization.json.JsonObject
            m83.z r3 = m83.C25272z.f99163w
            r1.<init>(r3)
        L8a:
            kotlinx.serialization.json.JsonElement r6 = setNestedValue(r1, r5, r6, r7)
            if (r6 != 0) goto L91
            goto La0
        L91:
            java.util.Map r4 = (java.util.Map) r4
            java.util.LinkedHashMap r4 = m83.AbstractC25247g0.m74003l0(r4)
            r4.put(r0, r6)
            kotlinx.serialization.json.JsonObject r5 = new kotlinx.serialization.json.JsonObject
            r5.<init>(r4)
            return r5
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.design.models.binding.JsonPathSetterKt.setNestedValue(kotlinx.serialization.json.JsonElement, java.util.List, kotlinx.serialization.json.JsonElement, boolean):kotlinx.serialization.json.JsonElement");
    }

    public static /* synthetic */ JsonElement setNestedValue$default(JsonElement jsonElement, List list, JsonElement jsonElement2, boolean z4, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z4 = false;
        }
        return setNestedValue(jsonElement, list, jsonElement2, z4);
    }

    private static final JsonElement setNestedValueOrLeaf(JsonElement jsonElement, List<String> list, JsonElement jsonElement2, boolean z4) {
        return list.isEmpty() ? jsonElement2 : setNestedValue(jsonElement, list, jsonElement2, z4);
    }
}
