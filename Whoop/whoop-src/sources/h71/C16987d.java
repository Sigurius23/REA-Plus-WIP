package h71;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import d61.InterfaceC11732a;
import gz0.EnumC16313m0;
import i71.C18198b;
import i91.AbstractC18247a;
import n21.AbstractC26194h;
import n21.EnumC26195i;
import p132f0.C13821r1;
import p291l0.InterfaceC22973k1;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: h71.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C16987d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f65236E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f65237F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f65238G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f65239H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f65240I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f65241J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f65242K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f65243L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f65244M;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f65245w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f65246x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Modifier f65247y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f65248z;

    public /* synthetic */ C16987d(Modifier modifier, C16993j c16993j, C16992i c16992i, C18198b c18198b, long j7, Function1 function1, C13821r1 c13821r1, InterfaceC22973k1 interfaceC22973k1, InterfaceC11732a interfaceC11732a, Function1 function2, int i13, int i14) {
        this.f65247y = modifier;
        this.f65237F = c16993j;
        this.f65238G = c16992i;
        this.f65239H = c18198b;
        this.f65246x = j7;
        this.f65240I = function1;
        this.f65242K = c13821r1;
        this.f65243L = interfaceC22973k1;
        this.f65244M = interfaceC11732a;
        this.f65241J = function2;
        this.f65248z = i13;
        this.f65236E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f65245w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC16990g.m47845x(this.f65247y, (C16993j) this.f65237F, (C16992i) this.f65238G, (C18198b) this.f65239H, this.f65246x, (Function1) this.f65240I, (C13821r1) this.f65242K, (InterfaceC22973k1) this.f65243L, (InterfaceC11732a) this.f65244M, (Function1) this.f65241J, this.f65248z, this.f65236E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26194h.m77788v((AbstractC18247a) this.f65237F, (TextResource) this.f65238G, (EnumC26195i) this.f65239H, (EnumC16313m0) this.f65240I, (AbstractC18247a) this.f65241J, (TextResource) this.f65242K, (EnumC26195i) this.f65243L, (EnumC16313m0) this.f65244M, this.f65246x, this.f65247y, this.f65248z, this.f65236E, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C16987d(AbstractC18247a abstractC18247a, TextResource textResource, EnumC26195i enumC26195i, EnumC16313m0 enumC16313m0, AbstractC18247a abstractC18247a2, TextResource textResource2, EnumC26195i enumC26195i2, EnumC16313m0 enumC16313m1, long j7, Modifier modifier, int i13, int i14) {
        this.f65237F = abstractC18247a;
        this.f65238G = textResource;
        this.f65239H = enumC26195i;
        this.f65240I = enumC16313m0;
        this.f65241J = abstractC18247a2;
        this.f65242K = textResource2;
        this.f65243L = enumC26195i2;
        this.f65244M = enumC16313m1;
        this.f65246x = j7;
        this.f65247y = modifier;
        this.f65248z = i13;
        this.f65236E = i14;
    }
}
