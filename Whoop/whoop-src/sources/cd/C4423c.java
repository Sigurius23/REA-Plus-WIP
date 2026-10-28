package cd;

import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;

/* JADX INFO: renamed from: cd.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C4423c {

    /* JADX INFO: renamed from: a */
    public final C4424d f17891a;

    public C4423c(C31624i c31624i) {
        this.f17891a = (C4424d) c31624i.f130665x;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4423c.class == obj.getClass() && AbstractC22676k.m65745e(this.f17891a, ((C4423c) obj).f17891a);
    }

    public final int hashCode() {
        C4424d c4424d = this.f17891a;
        if (c4424d != null) {
            return c4424d.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreateOAuth2TokenRequest(");
        sb4.append("tokenInput=" + this.f17891a);
        sb4.append(")");
        return sb4.toString();
    }
}
