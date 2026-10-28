package rm1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import p077d0.C11421z1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import w71.C36893l;
import w71.C36906y;
import w81.AbstractC36945c;
import z51.C40101l;

/* JADX INFO: renamed from: rm1.l */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C31598l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f130580E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f130581F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f130582G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f130583H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f130584I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130585w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f130586x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f130587y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f130588z;

    public /* synthetic */ C31598l(Modifier modifier, int i13, int i14, Function1 function1, Function1 function2, Function3 function3, int i15, int i16) {
        this.f130582G = modifier;
        this.f130586x = i13;
        this.f130587y = i14;
        this.f130588z = function1;
        this.f130583H = function2;
        this.f130584I = function3;
        this.f130580E = i15;
        this.f130581F = i16;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f130585w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC31599m.m97526w((Modifier) this.f130582G, (C40101l) this.f130583H, (C11421z1) this.f130584I, this.f130586x, this.f130587y, this.f130588z, this.f130580E, this.f130581F, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C36893l.m118415h0((C36893l) this.f130582G, (C36906y) this.f130583H, this.f130586x, this.f130587y, (Integer) this.f130584I, this.f130588z, this.f130580E, this.f130581F, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC36945c.m118629r((Modifier) this.f130582G, this.f130586x, this.f130587y, this.f130588z, (Function1) this.f130583H, (Function3) this.f130584I, this.f130580E, this.f130581F, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ C31598l(Modifier modifier, C40101l c40101l, C11421z1 c11421z1, int i13, int i14, Function1 function1, int i15, int i16) {
        this.f130582G = modifier;
        this.f130583H = c40101l;
        this.f130584I = c11421z1;
        this.f130586x = i13;
        this.f130587y = i14;
        this.f130588z = function1;
        this.f130580E = i15;
        this.f130581F = i16;
    }

    public /* synthetic */ C31598l(C36893l c36893l, C36906y c36906y, int i13, int i14, Integer num, Function1 function1, int i15, int i16) {
        this.f130582G = c36893l;
        this.f130583H = c36906y;
        this.f130586x = i13;
        this.f130587y = i14;
        this.f130584I = num;
        this.f130588z = function1;
        this.f130580E = i15;
        this.f130581F = i16;
    }
}
