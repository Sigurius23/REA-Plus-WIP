package p133f1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p602x1.C37816b;

/* JADX INFO: renamed from: f1.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13925b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49642w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f49643x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f49644y;

    public /* synthetic */ C13925b0(Modifier modifier, C37816b c37816b, int i13, int i14) {
        this.f49642w = i14;
        this.f49643x = modifier;
        this.f49644y = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f49642w;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i13) {
            case 0:
                AbstractC13994y0.m39815d(this.f49643x, this.f49644y, composer, AbstractC28683x.m87244L(49));
                break;
            default:
                AbstractC13994y0.m39818g(this.f49643x, this.f49644y, composer, AbstractC28683x.m87244L(49));
                break;
        }
        return C23454a0.f92919a;
    }
}
