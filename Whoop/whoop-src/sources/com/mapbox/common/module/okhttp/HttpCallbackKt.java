package com.mapbox.common.module.okhttp;

import java.util.HashMap;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import ud3.C34850x0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lud3/x0;", "response", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "generateOutputHeaders", "(Lud3/x0;)Ljava/util/HashMap;", "common_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class HttpCallbackKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap<String, String> generateOutputHeaders(C34850x0 c34850x0) {
        HashMap<String, String> map = new HashMap<>();
        C34807d0 c34807d0 = c34850x0.f146777F;
        int size = c34807d0.size();
        for (int i13 = 0; i13 < size; i13++) {
            String lowerCase = c34807d0.m109864c(i13).toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            map.put(lowerCase, c34807d0.m109867g(i13));
        }
        return map;
    }
}
