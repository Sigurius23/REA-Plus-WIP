package p016an;

import p588wm.C37373o;
import p588wm.C37375q;
import p588wm.InterfaceC37374p;

/* JADX INFO: renamed from: an.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C1054e implements InterfaceC37374p {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC37374p f4100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1053d f4101b;

    public C1054e(C1053d c1053d, InterfaceC37374p interfaceC37374p) {
        this.f4101b = c1053d;
        this.f4100a = interfaceC37374p;
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: c */
    public final C37373o mo3112c(long j7) {
        C37373o c37373oMo3112c = this.f4100a.mo3112c(j7);
        C37375q c37375q = c37373oMo3112c.f159867a;
        long j13 = c37375q.f159870a;
        long j14 = c37375q.f159871b;
        long j15 = this.f4101b.f4098x;
        C37375q c37375q2 = new C37375q(j13, j14 + j15);
        C37375q c37375q3 = c37373oMo3112c.f159868b;
        return new C37373o(c37375q2, new C37375q(c37375q3.f159870a, c37375q3.f159871b + j15));
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: e */
    public final boolean mo3113e() {
        return this.f4100a.mo3113e();
    }

    @Override // p588wm.InterfaceC37374p
    /* JADX INFO: renamed from: f */
    public final long mo3114f() {
        return this.f4100a.mo3114f();
    }
}
