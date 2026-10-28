package com.whoop.membership.extensions.domain.models;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lcom/whoop/membership/extensions/domain/models/CtaActionAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcom/whoop/membership/extensions/domain/models/CtaAction;", "<init>", "()V", "Lcom/google/gson/stream/JsonWriter;", "out", "value", "Ll83/a0;", "write", "(Lcom/google/gson/stream/JsonWriter;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V", "Lcom/google/gson/stream/JsonReader;", "inValue", "read", "(Lcom/google/gson/stream/JsonReader;)Lcom/whoop/membership/extensions/domain/models/CtaAction;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class CtaActionAdapter extends TypeAdapter<CtaAction> {
    public static final int $stable = 8;

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034 A[RETURN] */
    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: read */
    public CtaAction read2(JsonReader inValue) {
        String upperCase;
        String strNextString;
        if (inValue == null || (strNextString = inValue.nextString()) == null) {
            upperCase = "";
        } else {
            upperCase = strNextString.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        }
        for (CtaAction ctaAction : CtaAction.values()) {
            if (AbstractC22676k.m65745e(ctaAction.name(), upperCase)) {
                if (ctaAction == null) {
                    return CtaAction.UNKNOWN;
                }
                return ctaAction;
            }
        }
        ctaAction = null;
        if (ctaAction == null) {
            return CtaAction.UNKNOWN;
        }
        return ctaAction;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter out, CtaAction value) throws IOException {
        if (out != null) {
            out.value(value != null ? value.name() : null);
        }
    }
}
