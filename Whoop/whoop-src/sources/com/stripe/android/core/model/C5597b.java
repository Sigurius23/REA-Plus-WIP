package com.stripe.android.core.model;

import java.util.Locale;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: com.stripe.android.core.model.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C5597b {
    /* JADX INFO: renamed from: a */
    public static CountryCode m16833a(String value) {
        AbstractC22676k.m65750j(value, "value");
        String upperCase = value.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return new CountryCode(upperCase);
    }

    public final InterfaceC37138c serializer() {
        return CountryCode$$serializer.INSTANCE;
    }
}
