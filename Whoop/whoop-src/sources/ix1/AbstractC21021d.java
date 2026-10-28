package ix1;

import io2.C20756e;
import java.util.Map;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ix1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"K", "V", "", "", "", "b", "(Ljava/lang/Iterable;)Ljava/lang/String;", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21021d {
    /* JADX INFO: renamed from: b */
    public static final <K, V> String m58593b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        AbstractC22676k.m65750j(iterable, "<this>");
        return AbstractC25265s.m74110N0(iterable, ",", "{", "}", new C20756e(25), 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final CharSequence m58594c(Map.Entry it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getKey() + ":" + it.getValue();
    }
}
