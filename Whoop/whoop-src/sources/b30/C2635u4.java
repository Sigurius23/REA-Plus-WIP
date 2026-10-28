package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import nq2.AbstractC27062e;
import nq2.C27058a;
import p390p1.AbstractC28683x;

/* JADX INFO: renamed from: b30.u4 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2635u4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10281E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10282w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10283x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10284y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10285z;

    public /* synthetic */ C2635u4(Modifier modifier, C27058a c27058a, boolean z4, boolean z13) {
        this.f10285z = modifier;
        this.f10281E = c27058a;
        this.f10283x = z4;
        this.f10284y = z13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10282w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC2480a5.m7450b(this.f10283x, this.f10284y, (InterfaceC4339a) this.f10285z, (String) this.f10281E, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27062e.m81332r((Modifier) this.f10285z, (C27058a) this.f10281E, this.f10283x, this.f10284y, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C2635u4(boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, String str, int i13) {
        this.f10283x = z4;
        this.f10284y = z13;
        this.f10285z = interfaceC4339a;
        this.f10281E = str;
    }
}
