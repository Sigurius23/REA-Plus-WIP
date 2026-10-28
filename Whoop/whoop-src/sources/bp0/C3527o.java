package bp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.AbstractC4072m3;
import c41.C4044i3;
import c93.InterfaceC4351m;
import e61.AbstractC12770m;
import ep0.C13398d;
import h01.AbstractC16549p;
import h01.C16550q;
import j61.C21369c;
import java.util.List;
import k71.AbstractC22269z;
import l83.C23454a0;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p741vn1.AbstractC36209m;
import w61.AbstractC36864d;
import y61.C39261b;

/* JADX INFO: renamed from: bp0.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3527o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14052w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f14053x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f14054y;

    public /* synthetic */ C3527o(Object obj, int i13, int i14) {
        this.f14052w = i14;
        this.f14054y = obj;
        this.f14053x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14052w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3531s.m10426J((Function1) this.f14054y, this.f14053x, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC3531s.m10441Q0((C13398d) this.f14054y, this.f14053x, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC4072m3.m12488h((C4044i3) this.f14054y, this.f14053x, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC12770m.m35797j((C21369c) this.f14054y, this.f14053x, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC16549p.m46791y((C16550q) this.f14054y, this.f14053x, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC22269z.m63956Y((List) this.f14054y, this.f14053x, (Composer) obj, iIntValue6);
            case 6:
                ((Integer) obj2).intValue();
                AbstractC22989q.m66760a((Modifier) this.f14054y, (Composer) obj, AbstractC28683x.m87244L(this.f14053x | 1));
                return C23454a0.f92919a;
            case 7:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC33199m0.m105213E((AbstractC33208p0) this.f14054y, this.f14053x, (Composer) obj, iIntValue7);
            case 8:
                int iIntValue8 = ((Integer) obj2).intValue();
                return AbstractC36209m.m115229f((InterfaceC4351m) this.f14054y, this.f14053x, (Composer) obj, iIntValue8);
            default:
                int iIntValue9 = ((Integer) obj2).intValue();
                return AbstractC36864d.m118239e((C39261b) this.f14054y, this.f14053x, (Composer) obj, iIntValue9);
        }
    }
}
