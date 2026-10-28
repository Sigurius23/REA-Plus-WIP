package p324m9;

import p516u8.C34610p;
import p619xl.C38445a;
import p674z8.C40171g;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC25273a extends AbstractC25276d {

    /* JADX INFO: renamed from: J */
    public final long f99164J;

    /* JADX INFO: renamed from: K */
    public final long f99165K;

    /* JADX INFO: renamed from: L */
    public final long f99166L;

    /* JADX INFO: renamed from: M */
    public C38445a f99167M;

    /* JADX INFO: renamed from: N */
    public int[] f99168N;

    public AbstractC25273a(InterfaceC40170f interfaceC40170f, C40171g c40171g, C34610p c34610p, int i13, Object obj, long j7, long j13, long j14, long j15, long j16) {
        super(interfaceC40170f, c40171g, 1, c34610p, i13, obj, j7, j13);
        c34610p.getClass();
        this.f99164J = j16;
        this.f99165K = j14;
        this.f99166L = j15;
    }

    /* JADX INFO: renamed from: a */
    public final int m74167a(int i13) {
        int[] iArr = this.f99168N;
        AbstractC35849g.m113808j(iArr);
        return iArr[i13];
    }

    /* JADX INFO: renamed from: d */
    public long mo74168d() {
        long j7 = this.f99164J;
        if (j7 != -1) {
            return j7 + 1;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo74169e();
}
