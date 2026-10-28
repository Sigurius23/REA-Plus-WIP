package mp;

import gp.C16057t;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: mp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C25765f extends AbstractC25762e {

    /* JADX INFO: renamed from: w */
    public final C16057t f101480w;

    public C25765f(C16057t c16057t) {
        this.f101480w = c16057t;
    }

    @Override // mp.AbstractC25762e
    /* JADX INFO: renamed from: a */
    public final Object mo76008a() {
        return this.f101480w;
    }

    @Override // mp.AbstractC25762e
    /* JADX INFO: renamed from: b */
    public final boolean mo76009b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25765f) {
            return this.f101480w.equals(((C25765f) obj).f101480w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f101480w.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Optional.of(", this.f101480w.toString(), ")");
    }
}
