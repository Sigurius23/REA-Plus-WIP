package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p026b2.C2314t;
import p208i2.C17875c1;
import p208i2.InterfaceC17869a1;
import p238j0.InterfaceC21083i;
import p294l3.C23285v0;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24913l0;
import p390p1.C28655q;
import p412q3.InterfaceC29873g0;
import p510u0.AbstractC34323i;
import p510u0.C34348q0;
import p510u0.C34351r0;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.a3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23064a3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f90952E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f90953F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C23285v0 f90954G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C34351r0 f90955H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C34348q0 f90956I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ boolean f90957J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f90958K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f90959L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ InterfaceC29873g0 f90960M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC21083i f90961N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ InterfaceC4351m f90962O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ InterfaceC17869a1 f90963P;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90964w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f90965x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23089e4 f90966y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f90967z;

    public /* synthetic */ C23064a3(Modifier modifier, C23089e4 c23089e4, String str, Function1 function1, boolean z4, C23285v0 c23285v0, C34351r0 c34351r0, C34348q0 c34348q0, boolean z13, int i13, int i14, InterfaceC29873g0 interfaceC29873g0, InterfaceC21083i interfaceC21083i, InterfaceC4351m interfaceC4351m, InterfaceC17869a1 interfaceC17869a1, int i15) {
        this.f90964w = i15;
        this.f90965x = modifier;
        this.f90966y = c23089e4;
        this.f90967z = str;
        this.f90952E = function1;
        this.f90953F = z4;
        this.f90954G = c23285v0;
        this.f90955H = c34351r0;
        this.f90956I = c34348q0;
        this.f90957J = z13;
        this.f90958K = i13;
        this.f90959L = i14;
        this.f90960M = interfaceC29873g0;
        this.f90961N = interfaceC21083i;
        this.f90962O = interfaceC4351m;
        this.f90963P = interfaceC17869a1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f90964w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Modifier modifier = this.f90965x;
        switch (i13) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (!c28655q.m87135U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    c28655q.m87138X();
                } else {
                    c28655q.m87150e0(-903106918);
                    c28655q.m87173q(false);
                    Modifier modifierMo3471e = modifier.mo3471e(C2314t.f9131w);
                    AbstractC24899e0.m73002i(c28655q, R.string.default_error_message);
                    float f13 = AbstractC24913l0.f97578a;
                    Modifier modifierM3404a = AbstractC1102d.m3404a(modifierMo3471e, C23177t2.f91690c, C23177t2.f91689b);
                    C23089e4 c23089e4 = this.f90966y;
                    C17875c1 c17875c1 = new C17875c1(c23089e4.f91144i);
                    InterfaceC4351m interfaceC4351m = this.f90962O;
                    InterfaceC17869a1 interfaceC17869a1 = this.f90963P;
                    String str = this.f90967z;
                    boolean z4 = this.f90953F;
                    boolean z13 = this.f90957J;
                    InterfaceC29873g0 interfaceC29873g0 = this.f90960M;
                    InterfaceC21083i interfaceC21083i = this.f90961N;
                    AbstractC34323i.m108619a(str, this.f90952E, modifierM3404a, z4, false, this.f90954G, this.f90955H, this.f90956I, z13, this.f90958K, this.f90959L, interfaceC29873g0, null, interfaceC21083i, c17875c1, AbstractC37817c.m121344e(-1189274459, c28655q, new C23213z2(str, z4, z13, interfaceC29873g0, interfaceC21083i, interfaceC4351m, c23089e4, interfaceC17869a1)), c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 4096);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (!c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c28655q2.m87138X();
                } else {
                    AbstractC24899e0.m73002i(c28655q2, R.string.default_error_message);
                    float f14 = AbstractC24913l0.f97578a;
                    Modifier modifierM3404a2 = AbstractC1102d.m3404a(modifier, C23107h4.f91271c, C23107h4.f91270b);
                    C23089e4 c23089e5 = this.f90966y;
                    C17875c1 c17875c2 = new C17875c1(c23089e5.f91144i);
                    InterfaceC4351m interfaceC4351m2 = this.f90962O;
                    InterfaceC17869a1 interfaceC17869a2 = this.f90963P;
                    String str2 = this.f90967z;
                    boolean z14 = this.f90953F;
                    boolean z15 = this.f90957J;
                    InterfaceC29873g0 interfaceC29873g1 = this.f90960M;
                    InterfaceC21083i interfaceC21083i2 = this.f90961N;
                    AbstractC34323i.m108619a(str2, this.f90952E, modifierM3404a2, z14, false, this.f90954G, this.f90955H, this.f90956I, z15, this.f90958K, this.f90959L, interfaceC29873g1, null, interfaceC21083i2, c17875c2, AbstractC37817c.m121344e(1451491557, c28655q2, new C23213z2(str2, z14, z15, interfaceC29873g1, interfaceC21083i2, interfaceC4351m2, interfaceC17869a2, c23089e5)), c28655q2, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 4096);
                }
                break;
        }
        return c23454a0;
    }
}
