package p324m9;

import p470rv.AbstractC31834n;
import p499t9.C33638k;
import p499t9.InterfaceC33627e0;
import p516u8.C34610p;
import p619xl.C38445a;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C25281i extends AbstractC25276d {

    /* JADX INFO: renamed from: J */
    public final C25275c f99230J;

    /* JADX INFO: renamed from: K */
    public C38445a f99231K;

    /* JADX INFO: renamed from: L */
    public long f99232L;

    /* JADX INFO: renamed from: M */
    public volatile boolean f99233M;

    public C25281i(InterfaceC40170f interfaceC40170f, C40171g c40171g, C34610p c34610p, int i13, Object obj, C25275c c25275c) {
        super(interfaceC40170f, c40171g, 2, c34610p, i13, obj, -9223372036854775807L, -9223372036854775807L);
        this.f99230J = c25275c;
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public final void mo68093b() {
        if (this.f99232L == 0) {
            this.f99230J.m74170a(this.f99231K, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C40171g c40171gM128887a = this.f99191x.m128887a(this.f99232L);
            C40177m c40177m = this.f99189I;
            C33638k c33638k = new C33638k(c40177m, c40171gM128887a.f173347e, c40177m.open(c40171gM128887a));
            while (!this.f99233M) {
                try {
                    int iMo1543i = this.f99230J.f99181w.mo1543i(c33638k, C25275c.f99175J);
                    boolean z4 = false;
                    AbstractC35849g.m113807i(iMo1543i != 1);
                    if (iMo1543i == 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        break;
                    }
                } catch (Throwable th3) {
                    this.f99232L = c33638k.f140408z - this.f99191x.f173347e;
                    InterfaceC33627e0 interfaceC33627e0 = this.f99230J.f99179H;
                    throw th3;
                }
            }
            this.f99232L = c33638k.f140408z - this.f99191x.f173347e;
            InterfaceC33627e0 interfaceC33627e1 = this.f99230J.f99179H;
            AbstractC31834n.m98896e(this.f99189I);
        } catch (Throwable th4) {
            AbstractC31834n.m98896e(this.f99189I);
            throw th4;
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public final void mo68094c() {
        this.f99233M = true;
    }
}
