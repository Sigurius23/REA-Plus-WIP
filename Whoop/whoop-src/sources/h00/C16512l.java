package h00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import h20.EnumC16701n1;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import q00.C29731o;

/* JADX INFO: renamed from: h00.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C16512l implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63492w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29731o f63493x;

    public /* synthetic */ C16512l(C29731o c29731o, int i13, int i14) {
        this.f63492w = i14;
        switch (i14) {
            case 1:
                break;
            default:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                break;
        }
        this.f63493x = c29731o;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f63492w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C29731o c29731o = this.f63493x;
        switch (i13) {
            case 0:
                EnumC16701n1 enumC16701n1 = EnumC16701n1.f64226w;
                ((Integer) obj2).getClass();
                AbstractC16518o.m46681e(c29731o, (Composer) obj, AbstractC28683x.m87244L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC16518o.m46682f(c29731o, (Composer) obj, AbstractC28683x.m87244L(1));
                break;
        }
        return c23454a0;
    }
}
