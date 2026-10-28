package gh;

import p092dh.AbstractC12037x;
import p092dh.EnumC12020g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gh.n */
/* JADX INFO: loaded from: classes.dex */
public final class C15845n extends AbstractC15837f {

    /* JADX INFO: renamed from: a */
    public final AbstractC12037x f59848a;

    /* JADX INFO: renamed from: b */
    public final String f59849b;

    /* JADX INFO: renamed from: c */
    public final EnumC12020g f59850c;

    public C15845n(AbstractC12037x abstractC12037x, String str, EnumC12020g enumC12020g) {
        this.f59848a = abstractC12037x;
        this.f59849b = str;
        this.f59850c = enumC12020g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15845n)) {
            return false;
        }
        C15845n c15845n = (C15845n) obj;
        return AbstractC22676k.m65745e(this.f59848a, c15845n.f59848a) && AbstractC22676k.m65745e(this.f59849b, c15845n.f59849b) && this.f59850c == c15845n.f59850c;
    }

    public final int hashCode() {
        int iHashCode = this.f59848a.hashCode() * 31;
        String str = this.f59849b;
        return this.f59850c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
