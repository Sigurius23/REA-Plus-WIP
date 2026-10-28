package p092dh;

import gh.C15845n;
import mc3.AbstractC25444j;
import mc3.C25443i;
import mh.C25545m;

/* JADX INFO: renamed from: dh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C12016c implements InterfaceC12022i {

    /* JADX INFO: renamed from: a */
    public final EnumC12026m f39748a;

    /* JADX INFO: renamed from: b */
    public final C25443i f39749b;

    public C12016c(int i13, EnumC12026m enumC12026m) {
        this.f39748a = enumC12026m;
        this.f39749b = AbstractC25444j.m74674a(i13);
    }

    @Override // p092dh.InterfaceC12022i
    /* JADX INFO: renamed from: a */
    public final InterfaceC12023j mo33147a(C15845n c15845n, C25545m c25545m) {
        return new C12018e(c15845n.f59848a, c25545m, this.f39749b, this.f39748a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof C12016c;
    }

    public final int hashCode() {
        return C12016c.class.hashCode();
    }
}
