package p000;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import pv0.C29577d;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C16342h implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f62846w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29577d f62847x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f62848y;

    public /* synthetic */ C16342h(C29577d c29577d, Function1 function1, int i13, int i14) {
        this.f62846w = i14;
        this.f62847x = c29577d;
        this.f62848y = function1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f62846w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC37785x.m121284e(this.f62847x, this.f62848y, composer, AbstractC28683x.m87244L(1));
                break;
            default:
                AbstractC37785x.m121280a(this.f62847x, this.f62848y, composer, AbstractC28683x.m87244L(1));
                break;
        }
        return C23454a0.f92919a;
    }
}
