package p312lx;

import mx.AbstractC25990c;
import p036bq.RunnableC3543b;
import p264jx.InterfaceC21995b;
import se.AbstractC32411b;

/* JADX INFO: renamed from: lx.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24782c implements InterfaceC21995b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f96959a = 0;

    /* JADX INFO: renamed from: b */
    public Object f96960b;

    public /* synthetic */ C24782c() {
    }

    @Override // p264jx.InterfaceC21995b
    /* JADX INFO: renamed from: a */
    public final void mo62847a(int i13, int i14) {
        switch (this.f96959a) {
            case 0:
                AbstractC32411b.m101086b0(new RunnableC24781b(this, i13, i14, 1));
                break;
            default:
                AbstractC25990c abstractC25990c = (AbstractC25990c) this.f96960b;
                abstractC25990c.m77104R(abstractC25990c.m77117o() + i13, i14);
                break;
        }
    }

    @Override // p264jx.InterfaceC21995b
    /* JADX INFO: renamed from: b */
    public final void mo62848b(int i13, int i14) {
        switch (this.f96959a) {
            case 0:
                AbstractC32411b.m101086b0(new RunnableC24781b(this, i13, i14, 0));
                break;
            default:
                AbstractC25990c abstractC25990c = (AbstractC25990c) this.f96960b;
                abstractC25990c.m77103Q(abstractC25990c.m77117o() + i13, i14);
                break;
        }
    }

    @Override // p264jx.InterfaceC21995b
    /* JADX INFO: renamed from: c */
    public final void mo62849c() {
        switch (this.f96959a) {
            case 0:
                AbstractC32411b.m101086b0(new RunnableC3543b(this, 16));
                break;
            default:
                ((AbstractC25990c) this.f96960b).m77100N();
                break;
        }
    }

    @Override // p264jx.InterfaceC21995b
    /* JADX INFO: renamed from: d */
    public final void mo62850d(int i13, int i14) {
        switch (this.f96959a) {
            case 0:
                AbstractC32411b.m101086b0(new RunnableC24781b(this, i13, i14, 2));
                break;
            default:
                AbstractC25990c abstractC25990c = (AbstractC25990c) this.f96960b;
                abstractC25990c.m77105S(abstractC25990c.m77117o() + i13, i14);
                break;
        }
    }

    public C24782c(AbstractC25990c abstractC25990c) {
        this.f96960b = abstractC25990c;
    }
}
