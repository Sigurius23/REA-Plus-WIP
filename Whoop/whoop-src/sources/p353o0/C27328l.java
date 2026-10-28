package p353o0;

import androidx.compose.foundation.lazy.layout.C1106b;
import java.util.List;
import p004a2.AbstractC0152a;
import p268k0.AbstractC22086a;
import p389p0.C28515d0;
import p389p0.InterfaceC28518e0;
import p636y3.C39169a;
import p636y3.EnumC39181m;

/* JADX INFO: renamed from: o0.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C27328l extends AbstractC0152a {

    /* JADX INFO: renamed from: E */
    public final int f109405E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C28515d0 f109406F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C27341y f109407G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f109408H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f109409I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ long f109410J;

    /* JADX INFO: renamed from: y */
    public final C27324h f109411y;

    /* JADX INFO: renamed from: z */
    public final C28515d0 f109412z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27328l(C27324h c27324h, C28515d0 c28515d0, int i13, C27341y c27341y, int i14, int i15, long j7) {
        super(4);
        this.f109406F = c28515d0;
        this.f109407G = c27341y;
        this.f109408H = i14;
        this.f109409I = i15;
        this.f109410J = j7;
        this.f109411y = c27324h;
        this.f109412z = c28515d0;
        this.f109405E = i13;
    }

    /* JADX INFO: renamed from: Q */
    public final C27332p m82468Q(int i13, int i14, int i15, long j7, int i16) {
        int iM124766j;
        C27324h c27324h = this.f109411y;
        Object objMo77532c = c27324h.mo77532c(i13);
        Object objM86887l = c27324h.f109400b.m86887l(i13);
        List listM400y = m400y(this.f109412z, i13, j7);
        if (C39169a.m124763g(j7)) {
            iM124766j = C39169a.m124767k(j7);
        } else {
            if (!C39169a.m124762f(j7)) {
                AbstractC22086a.m63158a("does not have fixed height");
            }
            iM124766j = C39169a.m124766j(j7);
        }
        int i17 = iM124766j;
        EnumC39181m layoutDirection = this.f109406F.f115413x.getLayoutDirection();
        C1106b c1106b = this.f109407G.f109509m;
        return new C27332p(i13, objMo77532c, i17, i16, layoutDirection, this.f109408H, this.f109409I, listM400y, this.f109410J, objM86887l, c1106b, j7, i14, i15);
    }

    @Override // p004a2.AbstractC0152a
    /* JADX INFO: renamed from: w */
    public final InterfaceC28518e0 mo398w(int i13, int i14, long j7, int i15) {
        return m82468Q(i13, i14, i15, j7, this.f109405E);
    }
}
