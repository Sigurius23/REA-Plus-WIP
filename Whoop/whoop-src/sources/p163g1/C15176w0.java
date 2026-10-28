package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c03.C3815c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ep0.C13404j;
import fm1.C14600d;
import fm1.C14602f;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p098dt.AbstractC12350b;
import p132f0.C13821r1;
import p132f0.C13825t;
import p208i2.InterfaceC17869a1;
import p291l0.InterfaceC22973k1;
import p390p1.AbstractC28683x;
import p710im1.AbstractC18677j0;
import p710im1.C18665d0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p741vn1.AbstractC36203g;
import un1.AbstractC35098d;

/* JADX INFO: renamed from: g1.w0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C15176w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f56945E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f56946F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f56947G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Object f56948H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f56949I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Object f56950J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f56951K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC23459e f56952L;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56953w = 2;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f56954x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f56955y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f56956z;

    public /* synthetic */ C15176w0(Modifier modifier, AbstractC36203g abstractC36203g, boolean z4, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, int i13, int i14) {
        this.f56946F = modifier;
        this.f56947G = abstractC36203g;
        this.f56954x = z4;
        this.f56945E = interfaceC4339a;
        this.f56948H = function1;
        this.f56949I = interfaceC4351m;
        this.f56950J = function2;
        this.f56951K = interfaceC4339a2;
        this.f56952L = function3;
        this.f56955y = i13;
        this.f56956z = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56953w) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC12350b.m34578a((InterfaceC4339a) this.f56945E, (Modifier) this.f56946F, this.f56954x, (C15117q1) this.f56947G, (InterfaceC17869a1) this.f56948H, (C13825t) this.f56949I, (InterfaceC15156u0) this.f56950J, (InterfaceC22973k1) this.f56951K, (Function3) this.f56952L, (Composer) obj, AbstractC28683x.m87244L(this.f56955y | 1), this.f56956z);
                return C23454a0.f92919a;
            case 1:
                return AbstractC18677j0.m54237x((C14602f) this.f56945E, (C13821r1) this.f56946F, (C13404j) this.f56947G, (C18665d0) this.f56948H, (C14600d) this.f56949I, (C3815c) this.f56950J, this.f56954x, (Function1) this.f56951K, (Function1) this.f56952L, this.f56955y, this.f56956z, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return AbstractC35098d.m111017o((Modifier) this.f56946F, (AbstractC36203g) this.f56947G, this.f56954x, (InterfaceC4339a) this.f56945E, (Function1) this.f56948H, (InterfaceC4351m) this.f56949I, (Function1) this.f56950J, (InterfaceC4339a) this.f56951K, (Function1) this.f56952L, this.f56955y, this.f56956z, (Composer) obj, ((Integer) obj2).intValue());
        }
    }

    public /* synthetic */ C15176w0(InterfaceC4339a interfaceC4339a, Modifier modifier, boolean z4, C15117q1 c15117q1, InterfaceC17869a1 interfaceC17869a1, C13825t c13825t, InterfaceC15156u0 interfaceC15156u0, InterfaceC22973k1 interfaceC22973k1, Function3 function3, int i13, int i14) {
        this.f56945E = interfaceC4339a;
        this.f56946F = modifier;
        this.f56954x = z4;
        this.f56947G = c15117q1;
        this.f56948H = interfaceC17869a1;
        this.f56949I = c13825t;
        this.f56950J = interfaceC15156u0;
        this.f56951K = interfaceC22973k1;
        this.f56952L = function3;
        this.f56955y = i13;
        this.f56956z = i14;
    }

    public /* synthetic */ C15176w0(C14602f c14602f, C13821r1 c13821r1, C13404j c13404j, C18665d0 c18665d0, C14600d c14600d, C3815c c3815c, boolean z4, Function1 function1, Function1 function2, int i13, int i14) {
        this.f56945E = c14602f;
        this.f56946F = c13821r1;
        this.f56947G = c13404j;
        this.f56948H = c18665d0;
        this.f56949I = c14600d;
        this.f56950J = c3815c;
        this.f56954x = z4;
        this.f56951K = function1;
        this.f56952L = function2;
        this.f56955y = i13;
        this.f56956z = i14;
    }
}
