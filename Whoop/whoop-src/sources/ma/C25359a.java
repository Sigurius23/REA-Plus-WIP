package ma;

import p499t9.C33636j;

/* JADX INFO: renamed from: ma.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C25359a extends C33636j implements InterfaceC25364f {

    /* JADX INFO: renamed from: h */
    public final long f99387h;

    /* JADX INFO: renamed from: i */
    public final int f99388i;

    /* JADX INFO: renamed from: j */
    public final int f99389j;

    /* JADX INFO: renamed from: k */
    public final boolean f99390k;

    /* JADX INFO: renamed from: l */
    public final long f99391l;

    public C25359a(long j7, long j13, int i13, int i14, boolean z4) {
        super(j7, j13, i13, i14, z4);
        long j14 = j7;
        this.f99387h = j13;
        this.f99388i = i13;
        this.f99389j = i14;
        this.f99390k = z4;
        this.f99391l = j14 == -1 ? -1L : j14;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: a */
    public final long mo74415a(long j7) {
        return (Math.max(0L, j7 - this.f140392b) * 8000000) / ((long) this.f140395e);
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: d */
    public final long mo74416d() {
        return this.f99391l;
    }

    @Override // ma.InterfaceC25364f
    /* JADX INFO: renamed from: k */
    public final int mo74417k() {
        return this.f99388i;
    }
}
