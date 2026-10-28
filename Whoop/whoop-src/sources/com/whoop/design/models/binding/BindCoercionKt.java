package com.whoop.design.models.binding;

import ad3.AbstractC0770m;
import cd3.AbstractC4454f;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¨\u0006\u0006"}, m65681d2 = {"coerceToType", "T", "value", "", "(Ljava/lang/Object;)Ljava/lang/Object;", "unwrapForCoercion", "design-models_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BindCoercionKt {
    public static final <T> T coerceToType(Object obj) {
        Object objUnwrapForCoercion = unwrapForCoercion(obj);
        if (objUnwrapForCoercion == null) {
            return null;
        }
        if (!(objUnwrapForCoercion instanceof JsonElement)) {
            AbstractC22676k.m65756p();
            throw null;
        }
        try {
            AbstractC4454f abstractC4454f = StateBindingDeserializerKt.getStateBindingJson().f2764b;
            AbstractC22676k.m65756p();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object unwrapForCoercion(Object obj) {
        if (obj == null || (obj instanceof JsonNull)) {
            return null;
        }
        if (!(obj instanceof JsonPrimitive)) {
            return obj;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (jsonPrimitive.isString()) {
            return AbstractC0770m.m1844f(jsonPrimitive);
        }
        if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
            return AbstractC0770m.m1843e(jsonPrimitive);
        }
        if (AbstractC0770m.m1849k(jsonPrimitive) != null) {
            return AbstractC0770m.m1849k(jsonPrimitive);
        }
        return AbstractC0770m.m1845g(jsonPrimitive) != null ? AbstractC0770m.m1845g(jsonPrimitive) : AbstractC0770m.m1844f(jsonPrimitive);
    }
}
