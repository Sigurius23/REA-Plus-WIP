package gi;

import r80.AbstractC31061c;

/* JADX INFO: renamed from: gi.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C15870a implements InterfaceC15872c {

    /* JADX INFO: renamed from: a */
    public final int f59978a;

    public /* synthetic */ C15870a(int i13) {
        this.f59978a = i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C15870a) {
            return this.f59978a == ((C15870a) obj).f59978a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59978a);
    }

    public final String toString() {
        return AbstractC31061c.m95639o("Pixels(px=", this.f59978a, ')');
    }
}
