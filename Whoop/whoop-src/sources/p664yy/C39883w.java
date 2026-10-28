package p664yy;

import ih0.AbstractC18489d0;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: yy.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C39883w {

    /* JADX INFO: renamed from: a */
    public final String f172207a;

    /* JADX INFO: renamed from: b */
    public final String f172208b;

    public C39883w(String key, String value) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(value, "value");
        this.f172207a = key;
        this.f172208b = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39883w)) {
            return false;
        }
        C39883w c39883w = (C39883w) obj;
        return AbstractC22676k.m65745e(this.f172207a, c39883w.f172207a) && AbstractC22676k.m65745e(this.f172208b, c39883w.f172208b);
    }

    public final int hashCode() {
        return this.f172208b.hashCode() + (this.f172207a.hashCode() * 31);
    }

    public final String toString() throws UnsupportedEncodingException {
        Charset charset = AbstractC39397a.f169546a;
        String strEncode = URLEncoder.encode(this.f172207a, charset.name());
        AbstractC22676k.m65749i(strEncode, "encode(...)");
        String strEncode2 = URLEncoder.encode(this.f172208b, charset.name());
        AbstractC22676k.m65749i(strEncode2, "encode(...)");
        return AbstractC18489d0.m53370k(strEncode, "=", strEncode2);
    }
}
