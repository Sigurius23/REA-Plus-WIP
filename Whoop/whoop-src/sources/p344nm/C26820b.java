package p344nm;

import gm.C15980h;
import gm.C15981i;

/* JADX INFO: renamed from: nm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C26820b {

    /* JADX INFO: renamed from: a */
    public final long f106978a;

    /* JADX INFO: renamed from: b */
    public final C15981i f106979b;

    /* JADX INFO: renamed from: c */
    public final C15980h f106980c;

    public C26820b(long j7, C15981i c15981i, C15980h c15980h) {
        this.f106978a = j7;
        this.f106979b = c15981i;
        this.f106980c = c15980h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C26820b) {
            C26820b c26820b = (C26820b) obj;
            if (this.f106978a == c26820b.f106978a && this.f106979b.equals(c26820b.f106979b) && this.f106980c.equals(c26820b.f106980c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.f106978a;
        return ((((((int) ((j7 >>> 32) ^ j7)) ^ 1000003) * 1000003) ^ this.f106979b.hashCode()) * 1000003) ^ this.f106980c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f106978a + ", transportContext=" + this.f106979b + ", event=" + this.f106980c + "}";
    }
}
