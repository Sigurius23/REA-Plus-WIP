package w43;

import c93.InterfaceC4351m;
import p000.AbstractC11266d;
import p507tx.C34230a;

/* JADX INFO: renamed from: w43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C36828b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4351m f157535a;

    /* JADX INFO: renamed from: b */
    public final C34230a f157536b;

    public C36828b(InterfaceC4351m interfaceC4351m, C34230a c34230a) {
        this.f157535a = interfaceC4351m;
        this.f157536b = c34230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36828b)) {
            return false;
        }
        C36828b c36828b = (C36828b) obj;
        return this.f157535a.equals(c36828b.f157535a) && this.f157536b.equals(c36828b.f157536b);
    }

    public final int hashCode() {
        return this.f157536b.hashCode() + ((this.f157535a.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30448b(3, Integer.hashCode(1) * 31, 31), 250L, 31), 2000L, 31), 0L, 31)) * 31);
    }

    public final String toString() {
        return "StreamRetryPolicy(minRetries=1, maxRetries=3, minBackoffMills=250, maxBackoffMills=2000, initialDelayMillis=0, giveUpFunction=" + this.f157535a + ", nextBackOffDelayFunction=" + this.f157536b + ")";
    }
}
