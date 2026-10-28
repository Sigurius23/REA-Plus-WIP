package p510u0;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.relocation.AbstractC1108a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2591o4;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p133f1.AbstractC13994y0;
import p133f1.C13977s1;
import p180h0.EnumC16377d2;
import p294l3.C23283u0;
import p294l3.C23285v0;
import p390p1.C28635l;
import p390p1.C28655q;
import p412q3.C29869e0;
import p412q3.C29891y;
import p412q3.InterfaceC29873g0;
import p412q3.InterfaceC29884r;
import p445r0.InterfaceC30833a;
import p602x1.AbstractC37817c;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import sc0.C32355c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: u0.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C34369y implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C34340n1 f144422E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C29891y f144423F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC29873g0 f144424G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ Modifier f144425H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Modifier f144426I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Modifier f144427J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Modifier f144428K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC30833a f144429L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C13977s1 f144430M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ boolean f144431N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean f144432O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Function1 f144433P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ InterfaceC29884r f144434Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ InterfaceC39171c f144435R;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C34354s0 f144436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C23285v0 f144437x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f144438y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f144439z;

    public C34369y(C34354s0 c34354s0, C23285v0 c23285v0, int i13, int i14, C34340n1 c34340n1, C29891y c29891y, InterfaceC29873g0 interfaceC29873g0, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, InterfaceC30833a interfaceC30833a, C13977s1 c13977s1, boolean z4, boolean z13, Function1 function1, InterfaceC29884r interfaceC29884r, InterfaceC39171c interfaceC39171c) {
        this.f144436w = c34354s0;
        this.f144437x = c23285v0;
        this.f144438y = i13;
        this.f144439z = i14;
        this.f144422E = c34340n1;
        this.f144423F = c29891y;
        this.f144424G = interfaceC29873g0;
        this.f144425H = modifier;
        this.f144426I = modifier2;
        this.f144427J = modifier3;
        this.f144428K = modifier4;
        this.f144429L = interfaceC30833a;
        this.f144430M = c13977s1;
        this.f144431N = z4;
        this.f144432O = z13;
        this.f144433P = function1;
        this.f144434Q = interfaceC29884r;
        this.f144435R = interfaceC39171c;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Modifier c34364v1;
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            C34354s0 c34354s0 = this.f144436w;
            Modifier modifierM3413j = AbstractC1102d.m3413j(C2314t.f9131w, ((C39174f) c34354s0.f144313g.getValue()).f168413w, 0.0f, 2);
            int i13 = this.f144438y;
            int i14 = this.f144439z;
            C23285v0 c23285v0 = this.f144437x;
            Modifier modifierM118997u = AbstractC37056f.m118997u(modifierM3413j, new C34321h0(i13, i14, c23285v0));
            boolean zM87157i = c28655q.m87157i(c34354s0);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C32355c(c34354s0, 12);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            C34340n1 c34340n1 = this.f144422E;
            EnumC16377d2 enumC16377d2 = (EnumC16377d2) c34340n1.f144253f.getValue();
            C29891y c29891y = this.f144423F;
            long j7 = c29891y.f122126b;
            int i15 = C23283u0.f92252c;
            int iM67360f = (int) (j7 >> 32);
            long j13 = c34340n1.f144252e;
            if (iM67360f == ((int) (j13 >> 32)) && (iM67360f = (int) (j7 & 4294967295L)) == ((int) (4294967295L & j13))) {
                iM67360f = C23283u0.m67360f(j7);
            }
            c34340n1.f144252e = c29891y.f122126b;
            C29869e0 c29869e0M108667a = AbstractC34361u1.m108667a(this.f144424G, c29891y.f122125a);
            int iOrdinal = enumC16377d2.ordinal();
            if (iOrdinal == 0) {
                c34364v1 = new C34364v1(c34340n1, iM67360f, c29869e0M108667a, interfaceC4339a);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c34364v1 = new C34324i0(c34340n1, iM67360f, c29869e0M108667a, interfaceC4339a);
            }
            AbstractC13994y0.m39818g(AbstractC1108a.m3443a(AbstractC37056f.m118997u(AbstractC37056f.m118995s(modifierM118997u).mo3471e(c34364v1).mo3471e(this.f144425H).mo3471e(this.f144426I), new C2591o4(c23285v0, 16)).mo3471e(this.f144427J).mo3471e(this.f144428K), this.f144429L), AbstractC37817c.m121344e(1412697320, c28655q, new C34367x(this.f144430M, c34354s0, this.f144431N, this.f144432O, this.f144433P, this.f144423F, this.f144434Q, this.f144435R, this.f144439z)), c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
