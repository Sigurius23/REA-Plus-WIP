package b30;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g40.InterfaceC15391m3;
import l83.C23454a0;
import n00.EnumC26076d;
import nq2.AbstractC27062e;
import nq2.C27058a;
import p077d0.C11393q0;
import p163g1.InterfaceC14999e8;
import p164g2.C15247s;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import qz0.AbstractC30792k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: b30.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2655x3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10371E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10372F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10373w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10374x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10375y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10376z;

    public /* synthetic */ C2655x3(C11393q0 c11393q0, Modifier modifier, C27058a c27058a, boolean z4, boolean z13) {
        this.f10376z = c11393q0;
        this.f10371E = modifier;
        this.f10372F = c27058a;
        this.f10374x = z4;
        this.f10375y = z13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10373w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC2495c4.m7455b((String) this.f10376z, (InterfaceC2527g4) this.f10371E, this.f10374x, this.f10375y, (InterfaceC4339a) this.f10372F, (Composer) obj, iM87244L);
                return C23454a0.f92919a;
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(24577);
                AbstractC32411b.m101091e(this.f10374x, this.f10375y, (InterfaceC15391m3) this.f10376z, (EnumC26076d) this.f10371E, (C15247s) this.f10372F, (Composer) obj, iM87244L2);
                return C23454a0.f92919a;
            case 2:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC27062e.m81331q((C11393q0) this.f10376z, (Modifier) this.f10371E, (C27058a) this.f10372F, this.f10374x, this.f10375y, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30792k.m94687u(this.f10374x, this.f10375y, (InterfaceC21083i) this.f10376z, (InterfaceC14999e8) this.f10371E, (InterfaceC17869a1) this.f10372F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C2655x3(String str, InterfaceC2527g4 interfaceC2527g4, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13) {
        this.f10376z = str;
        this.f10371E = interfaceC2527g4;
        this.f10374x = z4;
        this.f10375y = z13;
        this.f10372F = interfaceC4339a;
    }

    public /* synthetic */ C2655x3(boolean z4, boolean z13, InterfaceC15391m3 interfaceC15391m3, EnumC26076d enumC26076d, C15247s c15247s, int i13) {
        this.f10374x = z4;
        this.f10375y = z13;
        this.f10376z = interfaceC15391m3;
        this.f10371E = enumC26076d;
        this.f10372F = c15247s;
    }

    public /* synthetic */ C2655x3(boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14999e8 interfaceC14999e8, InterfaceC17869a1 interfaceC17869a1) {
        this.f10374x = z4;
        this.f10375y = z13;
        this.f10376z = interfaceC21083i;
        this.f10371E = interfaceC14999e8;
        this.f10372F = interfaceC17869a1;
    }
}
