package g40;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p095dp.AbstractC12240d;
import p164g2.C15247s;
import p390p1.C28655q;

/* JADX INFO: renamed from: g40.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15338d2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f57632E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C15247s f57633F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f57634G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f57635w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15454z1 f57636x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f57637y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f57638z;

    public C15338d2(boolean z4, C15454z1 c15454z1, Modifier modifier, InterfaceC4351m interfaceC4351m, boolean z13, C15247s c15247s, int i13) {
        this.f57635w = z4;
        this.f57636x = c15454z1;
        this.f57637y = modifier;
        this.f57638z = interfaceC4351m;
        this.f57632E = z13;
        this.f57633F = c15247s;
        this.f57634G = i13;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC12240d.m34070g(this.f57635w, this.f57636x, this.f57637y, this.f57638z, this.f57632E, false, this.f57633F, null, this.f57634G, composer, 0, 128);
            }
        } else {
            AbstractC12240d.m34070g(this.f57635w, this.f57636x, this.f57637y, this.f57638z, this.f57632E, false, this.f57633F, null, this.f57634G, composer, 0, 128);
        }
        return C23454a0.f92919a;
    }
}
