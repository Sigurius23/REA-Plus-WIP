package com.whoop.design.models.binding;

import ad3.AbstractC0770m;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\t"}, m65681d2 = {"resolveStateRef", "", "reference", "", "state", "", "jsonElementToStateValue", "element", "Lkotlinx/serialization/json/JsonElement;", "state-binding-annotations"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StateLookupKt {
    private static final Object jsonElementToStateValue(JsonElement jsonElement) {
        if (!(jsonElement instanceof JsonPrimitive)) {
            if ((jsonElement instanceof JsonObject) || (jsonElement instanceof JsonArray)) {
                return jsonElement;
            }
            if (AbstractC22676k.m65745e(jsonElement, JsonNull.INSTANCE)) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (jsonPrimitive.isString()) {
            return jsonPrimitive.getContent();
        }
        if (AbstractC0770m.m1843e(jsonPrimitive) != null) {
            return AbstractC0770m.m1843e(jsonPrimitive);
        }
        if (AbstractC0770m.m1849k(jsonPrimitive) != null) {
            return AbstractC0770m.m1849k(jsonPrimitive);
        }
        return AbstractC0770m.m1845g(jsonPrimitive) != null ? AbstractC0770m.m1845g(jsonPrimitive) : AbstractC0770m.m1844f(jsonPrimitive);
    }

    public static final Object resolveStateRef(String reference, Map<String, ? extends Object> state) {
        String strSubstring;
        JsonElement jsonElement;
        AbstractC22676k.m65750j(reference, "reference");
        AbstractC22676k.m65750j(state, "state");
        int iM125887f0 = AbstractC39414r.m125887f0(reference, '.', 0, false, 6);
        if (iM125887f0 < 0) {
            return state.get(reference);
        }
        String strSubstring2 = reference.substring(0, iM125887f0);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        Object objJsonElementToStateValue = state.get(strSubstring2);
        if (objJsonElementToStateValue != null) {
            String strSubstring3 = reference.substring(iM125887f0 + 1);
            AbstractC22676k.m65749i(strSubstring3, "substring(...)");
            while (strSubstring3.length() > 0) {
                JsonObject jsonObject = objJsonElementToStateValue instanceof JsonObject ? (JsonObject) objJsonElementToStateValue : null;
                if (jsonObject != null) {
                    int iM125887f1 = AbstractC39414r.m125887f0(strSubstring3, '.', 0, false, 6);
                    if (iM125887f1 < 0) {
                        strSubstring = strSubstring3;
                    } else {
                        strSubstring = strSubstring3.substring(0, iM125887f1);
                        AbstractC22676k.m65749i(strSubstring, "substring(...)");
                    }
                    if (strSubstring.length() != 0 && (jsonElement = (JsonElement) jsonObject.get((Object) strSubstring)) != null) {
                        objJsonElementToStateValue = jsonElement instanceof JsonNull ? null : jsonElementToStateValue(jsonElement);
                        if (iM125887f1 < 0) {
                            strSubstring3 = "";
                        } else {
                            strSubstring3 = strSubstring3.substring(iM125887f1 + 1);
                            AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                        }
                    }
                }
            }
            return objJsonElementToStateValue;
        }
        return null;
    }
}
