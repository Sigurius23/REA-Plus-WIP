package p292l1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import ht2.C17632d;
import kx1.C22881b;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.C15028h4;
import p208i2.C17875c1;
import p208i2.InterfaceC17869a1;
import p209i3.AbstractC18032n;
import p238j0.InterfaceC21083i;
import p294l3.C23285v0;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p390p1.C28635l;
import p390p1.C28655q;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p510u0.AbstractC34323i;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.b3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23070b3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C29891y f91001E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function1 f91002F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ boolean f91003G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C23285v0 f91004H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C34351r0 f91005I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C34348q0 f91006J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ boolean f91007K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f91008L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ int f91009M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC29873g0 f91010N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC21083i f91011O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC4351m f91012P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ InterfaceC4351m f91013Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ InterfaceC17869a1 f91014R;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f91015w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f91016x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f91017y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23089e4 f91018z;

    public C23070b3(Modifier modifier, InterfaceC4351m interfaceC4351m, boolean z4, C23089e4 c23089e4, C29891y c29891y, Function1 function1, boolean z13, C23285v0 c23285v0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z14, int i13, int i14, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m2, InterfaceC4351m interfaceC4351m3, InterfaceC17869a1 interfaceC17869a1) {
        this.f91015w = modifier;
        this.f91016x = interfaceC4351m;
        this.f91017y = z4;
        this.f91018z = c23089e4;
        this.f91001E = c29891y;
        this.f91002F = function1;
        this.f91003G = z13;
        this.f91004H = c23285v0;
        this.f91005I = c34351r0;
        this.f91006J = c34348q0;
        this.f91007K = z14;
        this.f91008L = i13;
        this.f91009M = i14;
        this.f91010N = interfaceC29873g0;
        this.f91011O = interfaceC21083i;
        this.f91012P = interfaceC4351m2;
        this.f91013Q = interfaceC4351m3;
        this.f91014R = interfaceC17869a1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            InterfaceC4351m interfaceC4351m = this.f91016x;
            Modifier modifierM3398t = C2314t.f9131w;
            if (interfaceC4351m != null) {
                c28655q.m87150e0(-1901539802);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C22881b(9);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3398t = AbstractC1099a.m3398t(AbstractC18032n.m51775c(modifierM3398t, true, (Function1) objM87133R), 0.0f, AbstractC24913l0.m73016d(c28655q), 0.0f, 0.0f, 13);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1901156115);
                c28655q.m87173q(false);
            }
            Modifier modifierMo3471e = this.f91015w.mo3471e(modifierM3398t);
            String strM73002i = AbstractC24899e0.m73002i(c28655q, R.string.default_error_message);
            float f13 = AbstractC24913l0.f97578a;
            boolean z4 = this.f91017y;
            if (z4) {
                modifierMo3471e = AbstractC18032n.m51775c(modifierMo3471e, false, new C17632d(strM73002i, 22));
            }
            Modifier modifierM3404a = AbstractC1102d.m3404a(modifierMo3471e, C23177t2.f91690c, C23177t2.f91689b);
            C23089e4 c23089e4 = this.f91018z;
            C17875c1 c17875c1 = new C17875c1(z4 ? c23089e4.f91145j : c23089e4.f91144i);
            InterfaceC4351m interfaceC4351m2 = this.f91013Q;
            InterfaceC17869a1 interfaceC17869a1 = this.f91014R;
            C29891y c29891y = this.f91001E;
            boolean z13 = this.f91003G;
            boolean z14 = this.f91007K;
            InterfaceC29873g0 interfaceC29873g0 = this.f91010N;
            InterfaceC21083i interfaceC21083i = this.f91011O;
            AbstractC34323i.m108620b(c29891y, this.f91002F, modifierM3404a, z13, false, this.f91004H, this.f91005I, this.f91006J, z14, this.f91008L, this.f91009M, interfaceC29873g0, null, interfaceC21083i, c17875c1, AbstractC37817c.m121344e(674541106, c28655q, new C15028h4(c29891y, z13, z14, interfaceC29873g0, interfaceC21083i, this.f91017y, this.f91016x, this.f91012P, interfaceC4351m2, c23089e4, interfaceC17869a1)), c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 4096);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
