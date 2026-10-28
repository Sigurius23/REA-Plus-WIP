package t10;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.AbstractC2495c4;
import b30.AbstractC2526g3;
import c93.InterfaceC4339a;
import d30.C11534g1;
import d30.C11566v;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import g40.C15438w0;
import io.sentry.config.AbstractC20301a;
import jp1.C21859k;
import k20.C22136a;
import kotlin.C1990b0;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p132f0.C13821r1;
import p163g1.AbstractC14983d3;
import p291l0.AbstractC22989q;
import p291l0.C22976l1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p477s2.AbstractC32069a;
import p547v8.AbstractC35785b;
import p550vd.AbstractC35903f;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import s10.C32061c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t10.o */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC33295o {

    /* JADX INFO: renamed from: a */
    public static final C32061c f138855a = new C32061c(4);

    /* JADX INFO: renamed from: b */
    public static final C32061c f138856b = new C32061c(5);

    /* JADX INFO: renamed from: a */
    public static final void m105603a(C33290j state, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358244546);
        if ((((c28655q.m87157i(state) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC41211c interfaceC41211c = state.f138840f;
            if (interfaceC41211c != null) {
                String strM113396S = AbstractC35785b.m113396S(interfaceC41211c, c28655q);
                Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 8, 1);
                C11669n c11669n = C11671p.f37680a;
                AbstractC35903f.m114006a(strM113396S, AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r), c28655q, 0);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33292l(state, i13, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m105604b(C33290j state, InterfaceC4339a interfaceC4339a, InterfaceC4339a onClick, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1520623326);
        int i14 = i13 | (c28655q.m87157i(state) ? 4 : 2) | (c28655q.m87157i(interfaceC4339a) ? 32 : 16) | (c28655q.m87157i(onClick) ? 256 : 128);
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3393o = AbstractC1099a.m3393o(c22976l1M31081j, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i15 = i14 << 12;
            AbstractC2495c4.m7457d(AbstractC35785b.m113396S(state.f138835a, c28655q), state.f138839e, state.f138836b, AbstractC1136a.m3599a(c2314t, "EMBEDDED_FORM_ACTIVITY_PRIMARY_BUTTON"), state.f138837c, interfaceC4339a, onClick, c28655q, (458752 & i15) | 3072 | (i15 & 3670016), 0);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(state, interfaceC4339a, onClick, i13, 22);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m105605c(boolean z4, InterfaceC4339a onDismissed, Composer composer, int i13) {
        InterfaceC4339a interfaceC4339a;
        AbstractC22676k.m65750j(onDismissed, "onDismissed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(731344249);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87157i(onDismissed) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            interfaceC4339a = onDismissed;
        } else {
            long j7 = AbstractC11673r.m31082k(c28655q).f37675h;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), C11671p.f37685f.f37644a, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(293537523);
            if (!z4) {
                AbstractC2526g3.m7465d(c28655q, 0);
            }
            c28655q.m87173q(false);
            interfaceC4339a = onDismissed;
            AbstractC14983d3.m43104a(interfaceC4339a, C1100b.f4583a.mo3400a(c2314t, C2299e.f9103F), true, AbstractC37817c.m121344e(754772631, c28655q, new C15438w0(j7, 1)), c28655q, ((i14 >> 3) & 14) | 24960, 8);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33291k(z4, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m105606d(C11566v interactor, C22136a c22136a, InterfaceC4339a onClick, InterfaceC4339a onProcessingCompleted, C33290j state, InterfaceC4339a onDismissed, Composer composer, int i13) {
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(onClick, "onClick");
        AbstractC22676k.m65750j(onProcessingCompleted, "onProcessingCompleted");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onDismissed, "onDismissed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1745641878);
        int i14 = i13 | (c28655q.m87157i(interactor) ? 4 : 2) | (c28655q.m87153g(c22136a) ? 32 : 16) | (c28655q.m87157i(onClick) ? 256 : 128) | (c28655q.m87157i(onProcessingCompleted) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(state) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK) | (c28655q.m87157i(onDismissed) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST);
        if ((74899 & i14) == 74898 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            AbstractC12313p.m34275a(((C11534g1) C27648a.m83597t(interactor.f37328l, c28655q, 0).getValue()).f37177b, c28655q, 0);
            AbstractC20301a.m56336e(c22136a, AbstractC37817c.m121344e(1972493450, c28655q, new C33293m(c13821r1M92099U, interactor, onDismissed, state, onProcessingCompleted, onClick)), c28655q, ((i14 >> 3) & 14) | 48);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1990b0(interactor, c22136a, onClick, onProcessingCompleted, state, onDismissed, i13, 9);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m105607e(C33290j state, Composer composer, int i13) {
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1582674586);
        if ((((c28655q.m87157i(state) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC41211c interfaceC41211c = state.f138841g;
            if (interfaceC41211c != null) {
                String strM113396S = AbstractC35785b.m113396S(interfaceC41211c, c28655q);
                Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 8, 1);
                C11669n c11669n = C11671p.f37680a;
                AbstractC32069a.m99663a(strM113396S, AbstractC1099a.m3393o(AbstractC11673r.m31081j(), modifierM3396r), 0, 0, null, c28655q, 0, 28);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33292l(state, i13, 1);
        }
    }
}
