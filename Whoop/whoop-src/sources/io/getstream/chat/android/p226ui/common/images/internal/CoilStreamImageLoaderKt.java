package io.getstream.chat.android.p226ui.common.images.internal;

import bi.C3279q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"", "", "Lbi/q;", "toNetworkHeaders", "(Ljava/util/Map;)Lbi/q;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CoilStreamImageLoaderKt {
    public static final C3279q toNetworkHeaders(Map<String, String> map) {
        AbstractC22676k.m65750j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String lowerCase = key.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            Object arrayList = linkedHashMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(value);
        }
        return new C3279q(AbstractC25247g0.m74001j0(linkedHashMap));
    }
}
