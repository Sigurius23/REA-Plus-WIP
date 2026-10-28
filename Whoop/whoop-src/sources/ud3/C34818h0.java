package ud3;

import j93.AbstractC21478l0;
import java.nio.charset.Charset;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: ud3.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34818h0 {

    /* JADX INFO: renamed from: e */
    public static final C39412p f146589e = new C39412p("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f */
    public static final C39412p f146590f = new C39412p(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a */
    public final String f146591a;

    /* JADX INFO: renamed from: b */
    public final String f146592b;

    /* JADX INFO: renamed from: c */
    public final String f146593c;

    /* JADX INFO: renamed from: d */
    public final String[] f146594d;

    public C34818h0(String mediaType, String str, String str2, String[] parameterNamesAndValues) {
        AbstractC22676k.m65750j(mediaType, "mediaType");
        AbstractC22676k.m65750j(parameterNamesAndValues, "parameterNamesAndValues");
        this.f146591a = mediaType;
        this.f146592b = str;
        this.f146593c = str2;
        this.f146594d = parameterNamesAndValues;
    }

    /* JADX INFO: renamed from: a */
    public final Charset m109889a(Charset charset) {
        String str;
        String[] strArr = this.f146594d;
        int i13 = 0;
        int iM60400F = AbstractC21478l0.m60400F(0, strArr.length - 1, 2);
        if (iM60400F < 0) {
            str = null;
            break;
        }
        while (true) {
            if (!AbstractC39421y.m125921F(strArr[i13], "charset", true)) {
                if (i13 == iM60400F) {
                    str = null;
                    break;
                }
                i13 += 2;
            } else {
                str = strArr[i13 + 1];
                break;
            }
        }
        if (str == null) {
            return charset;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C34818h0) && AbstractC22676k.m65745e(((C34818h0) obj).f146591a, this.f146591a);
    }

    public final int hashCode() {
        return this.f146591a.hashCode();
    }

    public final String toString() {
        return this.f146591a;
    }
}
