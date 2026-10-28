package p664yy;

import ih0.AbstractC18489d0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: yy.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C39853d {

    /* JADX INFO: renamed from: a */
    public final String f172122a;

    /* JADX INFO: renamed from: b */
    public final String f172123b;

    public C39853d(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f172122a = key;
        this.f172123b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39853d)) {
            return false;
        }
        C39853d c39853d = (C39853d) obj;
        return AbstractC22676k.m65745e(this.f172122a, c39853d.f172122a) && AbstractC22676k.m65745e(this.f172123b, c39853d.f172123b);
    }

    public final int hashCode() {
        return this.f172123b.hashCode() + (this.f172122a.hashCode() * 31);
    }

    public final String toString() throws UnsupportedEncodingException {
        Charset charset = AbstractC39397a.f169546a;
        String strEncode = URLEncoder.encode(this.f172122a, charset.name());
        AbstractC22676k.m65749i(strEncode, "encode(...)");
        String strEncode2 = URLEncoder.encode(this.f172123b, charset.name());
        AbstractC22676k.m65749i(strEncode2, "encode(...)");
        return AbstractC18489d0.m53370k(strEncode, "=", strEncode2);
    }
}
