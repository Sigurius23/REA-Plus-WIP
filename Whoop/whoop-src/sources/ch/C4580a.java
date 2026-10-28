package ch;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import ep0.C13404j;
import java.util.List;
import kk1.AbstractC22546g;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p048ce.AbstractC4482w;
import p132f0.C13821r1;
import p390p1.AbstractC28683x;
import p635y2.InterfaceC39105k;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ch.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C4580a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f18442E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f18443F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f18444G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f18445H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f18446I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f18447J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f18448K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f18449w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f18450x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f18451y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Function1 f18452z;

    public /* synthetic */ C4580a(Modifier modifier, List list, float f13, C13821r1 c13821r1, Function1 function1, Function1 function2, Function1 function3, C13404j c13404j, int i13, int i14) {
        this.f18450x = modifier;
        this.f18445H = list;
        this.f18451y = f13;
        this.f18446I = c13821r1;
        this.f18452z = function1;
        this.f18442E = function2;
        this.f18447J = function3;
        this.f18448K = c13404j;
        this.f18443F = i13;
        this.f18444G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18449w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC4482w.m13998k((C4591l) this.f18445H, (String) this.f18446I, this.f18450x, this.f18452z, this.f18442E, (InterfaceC2302h) this.f18447J, (InterfaceC39105k) this.f18448K, this.f18451y, (Composer) obj, AbstractC28683x.m87244L(this.f18443F | 1), AbstractC28683x.m87244L(this.f18444G));
                return C23454a0.f92919a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22546g.m65219Y(this.f18450x, (List) this.f18445H, this.f18451y, (C13821r1) this.f18446I, this.f18452z, this.f18442E, (Function1) this.f18447J, (C13404j) this.f18448K, this.f18443F, this.f18444G, (Composer) obj, iIntValue);
        }
    }

    public /* synthetic */ C4580a(C4591l c4591l, String str, Modifier modifier, Function1 function1, Function1 function2, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, int i13, int i14) {
        this.f18445H = c4591l;
        this.f18446I = str;
        this.f18450x = modifier;
        this.f18452z = function1;
        this.f18442E = function2;
        this.f18447J = interfaceC2302h;
        this.f18448K = interfaceC39105k;
        this.f18451y = f13;
        this.f18443F = i13;
        this.f18444G = i14;
    }
}
