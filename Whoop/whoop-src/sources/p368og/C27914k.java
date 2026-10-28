package p368og;

import java.util.Map;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;

/* JADX INFO: renamed from: og.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C27914k extends AbstractC30054a {

    /* JADX INFO: renamed from: x */
    public static final C27907d f112511x = new C27907d();

    /* JADX INFO: renamed from: w */
    public final Map f112512w;

    public C27914k(Map map) {
        super(f112511x);
        this.f112512w = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27914k) && AbstractC22676k.m65745e(this.f112512w, ((C27914k) obj).f112512w);
    }

    public final int hashCode() {
        return this.f112512w.hashCode();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("LoggingContextElement("), this.f112512w, ')');
    }
}
