package p529uo;

import android.os.Bundle;
import com.google.android.gms.common.C4969a;
import p656yp.C39698e;

/* JADX INFO: renamed from: uo.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C35108c0 extends AbstractC35133u {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC35107c f148985g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35108c0(AbstractC35107c abstractC35107c, int i13, Bundle bundle) {
        super(abstractC35107c, i13, bundle);
        this.f148985g = abstractC35107c;
    }

    @Override // p529uo.AbstractC35133u
    /* JADX INFO: renamed from: a */
    public final boolean mo111056a() {
        this.f148985g.f148970i.mo13941b(C4969a.f20478E);
        return true;
    }

    @Override // p529uo.AbstractC35133u
    /* JADX INFO: renamed from: b */
    public final void mo111057b(C4969a c4969a) {
        AbstractC35107c abstractC35107c = this.f148985g;
        abstractC35107c.getClass();
        if ((abstractC35107c instanceof C39698e) && abstractC35107c.m111066s()) {
            abstractC35107c.m111065r();
        } else {
            abstractC35107c.f148970i.mo13941b(c4969a);
            System.currentTimeMillis();
        }
    }
}
