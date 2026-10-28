package kp2;

import java.util.Locale;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp2.g */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"", "", "key", "a", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "", "b", "(Ljava/lang/String;)Z", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22764g {
    /* JADX INFO: renamed from: a */
    public static final String m65963a(Map<String, String> map, String key) {
        AbstractC22676k.m65750j(map, "<this>");
        AbstractC22676k.m65750j(key, "key");
        String lowerCase = key.toLowerCase(Locale.ROOT);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        return map.get(lowerCase);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m65964b(String str) {
        return str != null && str.equalsIgnoreCase("other");
    }
}
