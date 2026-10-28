package j01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bg0.C3226h;
import c41.C4104r0;
import c41.C4118t0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import e93.AbstractC12889b;
import f01.C13857f;
import gb1.AbstractC15680h;
import hy0.AbstractC17755i2;
import hy0.C17748h;
import hy0.C17794v;
import i01.C17841d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import iz0.C21045d;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: j01.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lj01/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Lj01/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "icon", "", "time", "title", "", "hasTheme", "g", "(ILjava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21125b {
    /* JADX INFO: renamed from: g */
    private static final void m58941g(int i13, String str, String str2, boolean z4, Composer composer, int i14) {
        int i15;
        long jM53358D;
        long jM95624D;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2006155665);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87153g(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87155h(z4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            if (z4) {
                c28655q.m87150e0(913598538);
                jM53358D = C38072d.f163053a.m121949b(c28655q, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(913643240);
                jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
            }
            if (z4) {
                c28655q.m87150e0(913718570);
                jM95624D = C38072d.f163053a.m121949b(c28655q, 6).getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(913763365);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j7 = jM95624D;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            long j13 = jM53358D;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i15 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, c2314t), j13, c28655q, 432, 0);
            String strM21275i = AbstractC8693b.m21275i(str, c28655q, (i15 >> 3) & 14);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21275i, null, j7, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196090);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(str2, c28655q, (i15 >> 6) & 14), AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * 8, 0.0f, 0.0f, 13), j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH6(), null, c28655q, 48, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(i13, i14, str, str2, z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m58942h(int i13, String str, String str2, boolean z4, int i14, Composer composer, int i15) {
        m58941g(i13, str, str2, z4, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0100  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m58943i(Modifier modifier, C21127d viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        Function1 function4;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1610025823);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i16 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C21045d(11);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                long white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C17841d(29, viewState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), c33252iM105489e, white10, null, 0 * f13, AbstractC37817c.m121344e(416632540, c28655q, new C13857f(29, viewState, function4)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 23, modifier3, (Object) viewState, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C21045d(11);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            long white11 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
            zM87157i = c28655q.m87157i(viewState) | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new C17841d(29, viewState, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C17841d(29, viewState, function4);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12889b.m36263b(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15).mo3471e(modifier2), c33252iM105489e2, white11, null, 0 * f14, AbstractC37817c.m121344e(416632540, c28655q, new C13857f(29, viewState, function4)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 23, modifier3, (Object) viewState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m58944j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m58945k(C21127d c21127d, Function1 function1) {
        C9598e c9598eM58953e = c21127d.getDestination();
        if (c9598eM58953e != null) {
            function1.invoke(c9598eM58953e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m58946l(C21127d c21127d, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            float f14 = 2 * f13;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, ((float) 0.5d) * f13, 0.0f, f14, 5));
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21275i = AbstractC8693b.m21275i(c21127d.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21275i, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            if (c21127d.getDestination() != null) {
                c28655q2.m87150e0(273054889);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q2, 6), AbstractC8693b.m21275i("navigate", c28655q2, 6), AbstractC1102d.m3419p(5 * 4, AbstractC15680h.m44112a(c2314t, true)), c38072d.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 0, 0);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(273476768);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q2, 48);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            m58941g(c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getBedtime(), c21127d.getBedTime(), c21127d.getBedTimeLabel(), false, c28655q2, 3072);
            float f15 = 1 * f13;
            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3394p(f15, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C28655q c28655q3 = c28655q2;
            AbstractC17755i2.m50938j(AbstractC1092a.m3358c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c38072d.m121949b(c28655q2, 6).getWhite30(), new C17748h(f13, null)), null, null, null, null, 0L, 0L, null, c28655q3, 0, 254);
            AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3394p(f15, c2314t));
            m58941g(c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c21127d.getTimeInBed(), c21127d.getTimeInBedLabel(), true, c28655q3, 3072);
            AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3394p(f15, c2314t));
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC17755i2.m50938j(AbstractC1092a.m3358c(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c38072d.m121949b(c28655q3, 6).getWhite30(), new C17748h(f13, null)), null, null, null, null, 0L, 0L, null, c28655q3, 0, 254);
            AbstractC22953f.m66715b(c28655q3, AbstractC1099a.m3394p(f15, c2314t));
            m58941g(c38072d.m121951d().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getWaketime(), c21127d.getWakeTime(), c21127d.getWakeTimeLabel(), false, c28655q3, 3072);
            c28655q3.m87173q(true);
            C4104r0 c4104r0 = new C4104r0();
            C4118t0 c4118t0M58950a = c21127d.getAlarmStatus();
            boolean zM87157i = c28655q3.m87157i(c21127d) | c28655q3.m87153g(function1);
            Object objM87133R = c28655q3.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C19223a(25, c21127d, function1);
                c28655q3.m87172p0(objM87133R);
            }
            c4104r0.Compose(c4118t0M58950a, (Function1) objM87133R, c28655q3, 0);
            c28655q3.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m58947m(C21127d c21127d, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM58953e = c21127d.getDestination();
        if (c9598eM58953e != null) {
            function1.invoke(c9598eM58953e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m58948n(Modifier modifier, C21127d c21127d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m58943i(modifier, c21127d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
