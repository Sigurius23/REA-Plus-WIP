package i63;

import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: i63.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C18181t {

    /* JADX INFO: renamed from: b */
    public static final C18181t f70508b;

    /* JADX INFO: renamed from: c */
    public static final C18181t f70509c;

    /* JADX INFO: renamed from: d */
    public static final C18181t f70510d;

    /* JADX INFO: renamed from: e */
    public static final C18181t f70511e;

    /* JADX INFO: renamed from: f */
    public static final C18181t f70512f;

    /* JADX INFO: renamed from: g */
    public static final C18181t f70513g;

    /* JADX INFO: renamed from: h */
    public static final C18181t f70514h;

    /* JADX INFO: renamed from: a */
    public final String f70515a;

    static {
        C18181t c18181t = new C18181t("GET");
        f70508b = c18181t;
        C18181t c18181t2 = new C18181t("POST");
        f70509c = c18181t2;
        C18181t c18181t3 = new C18181t("PUT");
        f70510d = c18181t3;
        C18181t c18181t4 = new C18181t("PATCH");
        f70511e = c18181t4;
        C18181t c18181t5 = new C18181t("DELETE");
        f70512f = c18181t5;
        C18181t c18181t6 = new C18181t("HEAD");
        f70513g = c18181t6;
        C18181t c18181t7 = new C18181t("OPTIONS");
        f70514h = c18181t7;
        AbstractC37056f.m118959K(c18181t, c18181t2, c18181t3, c18181t4, c18181t5, c18181t6, c18181t7);
    }

    public C18181t(String str) {
        this.f70515a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18181t) && AbstractC22676k.m65745e(this.f70515a, ((C18181t) obj).f70515a);
    }

    public final int hashCode() {
        return this.f70515a.hashCode();
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("HttpMethod(value="), this.f70515a, ')');
    }
}
