package p292l1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p163g1.InterfaceC14948a1;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33085h;
import y71.C39274g;

/* JADX INFO: renamed from: l1.s2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23171s2 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC21083i f91632E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ float f91633F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ float f91634G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f91635H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f91636I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f91637J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f91638K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f91639L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91640w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f91641x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f91642y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f91643z;

    public /* synthetic */ C23171s2(Modifier modifier, boolean z4, Function1 function1, boolean z13, InterfaceC21083i interfaceC21083i, InterfaceC14948a1 interfaceC14948a1, C39274g c39274g, float f13, float f14, int i13, int i14) {
        this.f91641x = modifier;
        this.f91642y = z4;
        this.f91637J = function1;
        this.f91643z = z13;
        this.f91632E = interfaceC21083i;
        this.f91638K = interfaceC14948a1;
        this.f91639L = c39274g;
        this.f91633F = f13;
        this.f91634G = f14;
        this.f91635H = i13;
        this.f91636I = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91640w) {
            case 0:
                ((Integer) obj2).getClass();
                ((C23177t2) this.f91637J).m67140a(this.f91642y, this.f91643z, this.f91632E, this.f91641x, (C23089e4) this.f91638K, (InterfaceC17869a1) this.f91639L, this.f91633F, this.f91634G, (Composer) obj, AbstractC28683x.m87244L(this.f91635H | 1), this.f91636I);
                return C23454a0.f92919a;
            default:
                return AbstractC33085h.m104818h(this.f91641x, this.f91642y, (Function1) this.f91637J, this.f91643z, this.f91632E, (InterfaceC14948a1) this.f91638K, (C39274g) this.f91639L, this.f91633F, this.f91634G, this.f91635H, this.f91636I, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C23171s2(C23177t2 c23177t2, boolean z4, boolean z13, InterfaceC21083i interfaceC21083i, Modifier modifier, C23089e4 c23089e4, InterfaceC17869a1 interfaceC17869a1, float f13, float f14, int i13, int i14) {
        this.f91637J = c23177t2;
        this.f91642y = z4;
        this.f91643z = z13;
        this.f91632E = interfaceC21083i;
        this.f91641x = modifier;
        this.f91638K = c23089e4;
        this.f91639L = interfaceC17869a1;
        this.f91633F = f13;
        this.f91634G = f14;
        this.f91635H = i13;
        this.f91636I = i14;
    }
}
