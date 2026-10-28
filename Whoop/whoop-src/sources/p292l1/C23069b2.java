package p292l1;

import android.content.Context;
import android.view.Window;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kk1.C22541b;
import p027b3.AbstractC2346a;
import p043c4.InterfaceC3950b0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28655q;
import p390p1.C28677v1;

/* JADX INFO: renamed from: l1.b2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23069b2 extends AbstractC2346a implements InterfaceC3950b0 {

    /* JADX INFO: renamed from: J */
    public final Window f90998J;

    /* JADX INFO: renamed from: K */
    public final C28633k1 f90999K;

    /* JADX INFO: renamed from: L */
    public boolean f91000L;

    public C23069b2(Context context, Window window) {
        super(context);
        this.f90998J = window;
        this.f90999K = AbstractC28683x.m87272z(AbstractC23156q.f91584a);
    }

    @Override // p027b3.AbstractC2346a
    /* JADX INFO: renamed from: a */
    public final void mo3598a(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(576708319);
        int i14 = (c28655q.m87157i(this) ? 4 : 2) | i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            ((InterfaceC4351m) this.f90999K.getValue()).invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22541b(this, i13, 9);
        }
    }

    @Override // p027b3.AbstractC2346a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f91000L;
    }

    @Override // p043c4.InterfaceC3950b0
    public final Window getWindow() {
        return this.f90998J;
    }
}
