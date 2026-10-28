package p013ah;

import p000.AbstractC11266d;

/* JADX INFO: renamed from: ah.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C0878m extends AbstractC0869d {

    /* JADX INFO: renamed from: c */
    public final long f3184c;

    public C0878m(long j7) {
        super(8);
        this.f3184c = j7;
    }

    @Override // p013ah.AbstractC0869d
    public final boolean equals(Object obj) {
        if (obj instanceof C0878m) {
            C0878m c0878m = (C0878m) obj;
            if (super.equals(obj) && this.f3184c == c0878m.f3184c) {
                return true;
            }
        }
        return false;
    }

    @Override // p013ah.AbstractC0869d
    public final int hashCode() {
        return super.hashCode() ^ Long.valueOf(this.f3184c).hashCode();
    }

    public final String toString() {
        return AbstractC11266d.m30457k(this.f3184c, ")", new StringBuilder("Tag("));
    }
}
