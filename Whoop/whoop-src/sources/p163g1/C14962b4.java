package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p208i2.InterfaceC17869a1;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p715kotlin.jvm.functions.Function1;
import q00.C29720i0;
import se.AbstractC32417h;

/* JADX INFO: renamed from: g1.b4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14962b4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f55828E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f55829F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f55830G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f55831H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC23459e f55832I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f55833J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f55834K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ Object f55835L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ Object f55836M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ Object f55837N;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55838w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f55839x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f55840y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f55841z;

    public /* synthetic */ C14962b4(C29720i0 c29720i0, boolean z4, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function1 function3, Function1 function4, Function1 function5, InterfaceC4339a interfaceC4339a2, Function1 function6, Function1 function7, int i13, int i14) {
        this.f55829F = c29720i0;
        this.f55839x = z4;
        this.f55840y = function1;
        this.f55830G = function2;
        this.f55831H = interfaceC4339a;
        this.f55832I = function3;
        this.f55833J = function4;
        this.f55834K = function5;
        this.f55835L = interfaceC4339a2;
        this.f55836M = function6;
        this.f55837N = function7;
        this.f55841z = i13;
        this.f55828E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55838w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC15050j4.m43136b((C29891y) this.f55829F, this.f55840y, (Modifier) this.f55830G, this.f55839x, (C23285v0) this.f55831H, (InterfaceC4351m) this.f55832I, (InterfaceC29873g0) this.f55833J, (C34351r0) this.f55834K, (C34348q0) this.f55835L, this.f55841z, this.f55828E, (InterfaceC17869a1) this.f55836M, (InterfaceC14999e8) this.f55837N, (Composer) obj, iM87244L);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM87244L2 = AbstractC28683x.m87244L(this.f55841z | 1);
                int iM87244L3 = AbstractC28683x.m87244L(this.f55828E);
                AbstractC32417h.m101207p((C29720i0) this.f55829F, this.f55839x, this.f55840y, (Function1) this.f55830G, (InterfaceC4339a) this.f55831H, (Function1) this.f55832I, (Function1) this.f55833J, (Function1) this.f55834K, (InterfaceC4339a) this.f55835L, (Function1) this.f55836M, (Function1) this.f55837N, (Composer) obj, iM87244L2, iM87244L3);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C14962b4(C29891y c29891y, Function1 function1, Modifier modifier, boolean z4, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m, InterfaceC29873g0 interfaceC29873g0, C34351r0 c34351r0, C34348q0 c34348q0, int i13, int i14, InterfaceC17869a1 interfaceC17869a1, InterfaceC14999e8 interfaceC14999e8, int i15) {
        this.f55829F = c29891y;
        this.f55840y = function1;
        this.f55830G = modifier;
        this.f55839x = z4;
        this.f55831H = c23285v0;
        this.f55832I = interfaceC4351m;
        this.f55833J = interfaceC29873g0;
        this.f55834K = c34351r0;
        this.f55835L = c34348q0;
        this.f55841z = i13;
        this.f55828E = i14;
        this.f55836M = interfaceC17869a1;
        this.f55837N = interfaceC14999e8;
    }
}
