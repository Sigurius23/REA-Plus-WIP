package l83;

import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l83.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C23468n implements Serializable {

    /* JADX INFO: renamed from: w */
    public final Object f92940w;

    public /* synthetic */ C23468n(Object obj) {
        this.f92940w = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m68037a(Object obj) {
        if (obj instanceof C23467m) {
            return ((C23467m) obj).f92939w;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static String m68038b(Object obj) {
        if (obj instanceof C23467m) {
            return ((C23467m) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23468n) {
            return AbstractC22676k.m65745e(this.f92940w, ((C23468n) obj).f92940w);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f92940w;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return m68038b(this.f92940w);
    }
}
