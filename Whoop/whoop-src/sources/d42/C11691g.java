package d42;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c42.C4167d;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import gz0.EnumC16313m0;
import l83.InterfaceC23459e;
import mf0.AbstractC25506e;
import mf0.C25508g;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p734sl0.AbstractC32686w;
import p734sl0.C32645n0;
import p734sl0.C32659q;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: d42.g */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C11691g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f37795E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23459e f37796F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f37797G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f37798H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f37799I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f37800J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f37801K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f37802L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37803w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f37804x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f37805y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f37806z;

    public /* synthetic */ C11691g(Modifier modifier, C25508g c25508g, InterfaceC41070a interfaceC41070a, boolean z4, EnumC16313m0 enumC16313m0, boolean z13, boolean z14, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14) {
        this.f37799I = modifier;
        this.f37800J = c25508g;
        this.f37801K = interfaceC41070a;
        this.f37804x = z4;
        this.f37802L = enumC16313m0;
        this.f37805y = z13;
        this.f37806z = z14;
        this.f37795E = interfaceC4339a;
        this.f37796F = function1;
        this.f37797G = i13;
        this.f37798H = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37803w) {
            case 0:
                return AbstractC11694j.m31186H(this.f37804x, this.f37805y, this.f37806z, (C4167d) this.f37799I, (Function1) this.f37796F, this.f37795E, (InterfaceC4339a) this.f37800J, (InterfaceC4339a) this.f37801K, (InterfaceC4339a) this.f37802L, this.f37797G, this.f37798H, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC25506e.m74943d0((Modifier) this.f37799I, (C25508g) this.f37800J, (InterfaceC41070a) this.f37801K, this.f37804x, (EnumC16313m0) this.f37802L, this.f37805y, this.f37806z, this.f37795E, (Function1) this.f37796F, this.f37797G, this.f37798H, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC32686w.m102512R((C32645n0) this.f37799I, this.f37795E, (InterfaceC4353o) this.f37796F, (InterfaceC4339a) this.f37800J, this.f37804x, this.f37805y, (Function3) this.f37801K, this.f37806z, (C32659q) this.f37802L, this.f37797G, this.f37798H, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C11691g(C32645n0 c32645n0, InterfaceC4339a interfaceC4339a, InterfaceC4353o interfaceC4353o, InterfaceC4339a interfaceC4339a2, boolean z4, boolean z13, Function3 function3, boolean z14, C32659q c32659q, int i13, int i14) {
        this.f37799I = c32645n0;
        this.f37795E = interfaceC4339a;
        this.f37796F = interfaceC4353o;
        this.f37800J = interfaceC4339a2;
        this.f37804x = z4;
        this.f37805y = z13;
        this.f37801K = function3;
        this.f37806z = z14;
        this.f37802L = c32659q;
        this.f37797G = i13;
        this.f37798H = i14;
    }

    public /* synthetic */ C11691g(boolean z4, boolean z13, boolean z14, C4167d c4167d, Function1 function1, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, int i13, int i14) {
        this.f37804x = z4;
        this.f37805y = z13;
        this.f37806z = z14;
        this.f37799I = c4167d;
        this.f37796F = function1;
        this.f37795E = interfaceC4339a;
        this.f37800J = interfaceC4339a2;
        this.f37801K = interfaceC4339a3;
        this.f37802L = interfaceC4339a4;
        this.f37797G = i13;
        this.f37798H = i14;
    }
}
