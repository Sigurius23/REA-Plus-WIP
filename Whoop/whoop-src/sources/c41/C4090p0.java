package c41;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1585g0;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ok2.C28004j;
import p132f0.C13825t;
import q81.AbstractC30043a;
import q81.C30044b;
import qk2.AbstractC30446b;

/* JADX INFO: renamed from: c41.p0 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4090p0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f16584E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f16585F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f16586G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f16587H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16588w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f16589x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f16590y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f16591z;

    public /* synthetic */ C4090p0(Modifier modifier, AbstractC4125u0 abstractC4125u0, long j7, C13825t c13825t, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f16589x = modifier;
        this.f16585F = abstractC4125u0;
        this.f16590y = j7;
        this.f16586G = c13825t;
        this.f16587H = interfaceC4339a;
        this.f16591z = i13;
        this.f16584E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16588w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC4097q0.m12605t(this.f16589x, (AbstractC4125u0) this.f16585F, this.f16590y, (C13825t) this.f16586G, (InterfaceC4339a) this.f16587H, this.f16591z, this.f16584E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30043a.m91986f(this.f16589x, (C30044b) this.f16585F, (InterfaceC1585g0) this.f16586G, (C2886a) this.f16587H, this.f16590y, this.f16591z, this.f16584E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC30446b.m93131A((C28004j) this.f16585F, this.f16590y, (C2886a) this.f16586G, (C2886a) this.f16587H, this.f16589x, this.f16591z, this.f16584E, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C4090p0(Modifier modifier, C30044b c30044b, InterfaceC1585g0 interfaceC1585g0, C2886a c2886a, long j7, int i13, int i14) {
        this.f16589x = modifier;
        this.f16585F = c30044b;
        this.f16586G = interfaceC1585g0;
        this.f16587H = c2886a;
        this.f16590y = j7;
        this.f16591z = i13;
        this.f16584E = i14;
    }

    public /* synthetic */ C4090p0(C28004j c28004j, long j7, C2886a c2886a, C2886a c2886a2, Modifier modifier, int i13, int i14) {
        this.f16585F = c28004j;
        this.f16590y = j7;
        this.f16586G = c2886a;
        this.f16587H = c2886a2;
        this.f16589x = modifier;
        this.f16591z = i13;
        this.f16584E = i14;
    }
}
