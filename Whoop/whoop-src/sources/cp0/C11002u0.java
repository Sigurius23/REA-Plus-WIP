package cp0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.InterfaceC23459e;
import p208i2.C17919x;
import p715kotlin.jvm.functions.Function1;
import r51.AbstractC30937e;
import r51.C30938f;

/* JADX INFO: renamed from: cp0.u0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C11002u0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f34407E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f34408F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f34409G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f34410H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC23459e f34411I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f34412w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f34413x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f34414y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f34415z;

    public /* synthetic */ C11002u0(Modifier modifier, C30938f c30938f, C2886a c2886a, C17919x c17919x, float f13, Function1 function1, int i13, int i14) {
        this.f34413x = modifier;
        this.f34408F = c30938f;
        this.f34409G = c2886a;
        this.f34410H = c17919x;
        this.f34414y = f13;
        this.f34411I = function1;
        this.f34415z = i13;
        this.f34407E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f34412w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC11009x0.m29449R((String) this.f34408F, (String) this.f34409G, (InterfaceC4339a) this.f34410H, this.f34413x, this.f34414y, (InterfaceC4351m) this.f34411I, this.f34415z, this.f34407E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC30937e.m95161o(this.f34413x, (C30938f) this.f34408F, (C2886a) this.f34409G, (C17919x) this.f34410H, this.f34414y, (Function1) this.f34411I, this.f34415z, this.f34407E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C11002u0(String str, String str2, InterfaceC4339a interfaceC4339a, Modifier modifier, float f13, InterfaceC4351m interfaceC4351m, int i13, int i14) {
        this.f34408F = str;
        this.f34409G = str2;
        this.f34410H = interfaceC4339a;
        this.f34413x = modifier;
        this.f34414y = f13;
        this.f34411I = interfaceC4351m;
        this.f34415z = i13;
        this.f34407E = i14;
    }
}
