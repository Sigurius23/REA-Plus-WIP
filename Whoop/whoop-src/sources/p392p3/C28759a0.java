package p392p3;

import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p3.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28759a0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC28771i f116493a;

    /* JADX INFO: renamed from: b */
    public final C28780r f116494b;

    /* JADX INFO: renamed from: c */
    public final int f116495c;

    /* JADX INFO: renamed from: d */
    public final int f116496d;

    /* JADX INFO: renamed from: e */
    public final Object f116497e;

    public C28759a0(AbstractC28771i abstractC28771i, C28780r c28780r, int i13, int i14, Object obj) {
        this.f116493a = abstractC28771i;
        this.f116494b = c28780r;
        this.f116495c = i13;
        this.f116496d = i14;
        this.f116497e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28759a0)) {
            return false;
        }
        C28759a0 c28759a0 = (C28759a0) obj;
        return AbstractC22676k.m65745e(this.f116493a, c28759a0.f116493a) && AbstractC22676k.m65745e(this.f116494b, c28759a0.f116494b) && this.f116495c == c28759a0.f116495c && this.f116496d == c28759a0.f116496d && AbstractC22676k.m65745e(this.f116497e, c28759a0.f116497e);
    }

    public final int hashCode() {
        AbstractC28771i abstractC28771i = this.f116493a;
        int iM30448b = AbstractC11266d.m30448b(this.f116496d, AbstractC11266d.m30448b(this.f116495c, (((abstractC28771i == null ? 0 : abstractC28771i.hashCode()) * 31) + this.f116494b.f116547w) * 31, 31), 31);
        Object obj = this.f116497e;
        return iM30448b + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb4.append(this.f116493a);
        sb4.append(", fontWeight=");
        sb4.append(this.f116494b);
        sb4.append(", fontStyle=");
        sb4.append((Object) C28776n.m87530a(this.f116495c));
        sb4.append(", fontSynthesis=");
        int i13 = this.f116496d;
        if (i13 == 0) {
            str = "None";
        } else if (i13 == 1) {
            str = "Weight";
        } else if (i13 == 2) {
            str = "Style";
        } else {
            str = i13 == 65535 ? "All" : "Invalid";
        }
        sb4.append((Object) str);
        sb4.append(", resourceLoaderCacheKey=");
        return AbstractC11478a.m30860l(sb4, this.f116497e, ')');
    }
}
