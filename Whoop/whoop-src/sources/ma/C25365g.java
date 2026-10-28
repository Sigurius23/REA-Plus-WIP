package ma;

import p499t9.C33625d0;
import p499t9.C33629f0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: ma.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C25365g implements InterfaceC25364f {

    /* JADX INFO: renamed from: a */
    public final long[] f99415a;

    /* JADX INFO: renamed from: b */
    public final long[] f99416b;

    /* JADX INFO: renamed from: c */
    public final long f99417c;

    /* JADX INFO: renamed from: d */
    public final long f99418d;

    /* JADX INFO: renamed from: e */
    public final int f99419e;

    public C25365g(long[] jArr, long[] jArr2, long j7, long j13, int i13) {
        this.f99415a = jArr;
        this.f99416b = jArr2;
        this.f99417c = j7;
        this.f99418d = j13;
        this.f99419e = i13;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: a */
    public final long mo74415a(long j7) {
        return this.f99415a[AbstractC38065t.m121911d(this.f99416b, j7, true)];
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: c */
    public final C33625d0 mo8456c(long j7) {
        long[] jArr = this.f99415a;
        int iM121911d = AbstractC38065t.m121911d(jArr, j7, true);
        long j13 = jArr[iM121911d];
        long[] jArr2 = this.f99416b;
        C33629f0 c33629f0 = new C33629f0(j13, jArr2[iM121911d]);
        if (j13 >= j7 || iM121911d == jArr.length - 1) {
            return new C33625d0(c33629f0, c33629f0);
        }
        int i13 = iM121911d + 1;
        return new C33625d0(c33629f0, new C33629f0(jArr[i13], jArr2[i13]));
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: d */
    public final long mo74416d() {
        return this.f99418d;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: e */
    public final boolean mo8509e() {
        return true;
    }

    @Override // p499t9.InterfaceC33627e0
    /* JADX INFO: renamed from: f */
    public final long mo8510f() {
        return this.f99417c;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: k */
    public final int mo74417k() {
        return this.f99419e;
    }
}
