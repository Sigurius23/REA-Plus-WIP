package xw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ge3.AbstractC15751g;
import hy0.AbstractC17755i2;
import hy0.EnumC17740f;
import hy0.EnumC17744g;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import uw1.C35308a;
import wb3.AbstractC37056f;
import wr0.C37526f;
import x81.C38072d;

/* JADX INFO: renamed from: xw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Luw1/a;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "d", "(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38679c {
    /* JADX INFO: renamed from: d */
    public static final void m124067d(Modifier modifier, final C35308a viewState, final Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1335340362);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            Modifier modifierM53364e = AbstractC18489d0.m53364e(modifier2, 3, 4);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            float f13 = 2 * 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC15751g.m44456i(1, AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i17).getWhite5(), AbstractC17918w0.f69621a), C17909s.m51486d(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51515c(16777215)), new C17919x(c38072d.m121949b(c28655q, i17).getWhite5())), 0L, 0L, 14), AbstractC33253j.m105489e(12)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            Modifier modifier3 = modifier2;
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C27256h topButton = viewState.getTopButton();
            int i18 = i15 & 896;
            int i19 = i15 & 112;
            boolean z4 = (i18 == 256) | (i19 == 32 || ((i15 & 64) != 0 && c28655q.m87157i(viewState)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                final int i24 = 0;
                objM87133R = new InterfaceC4339a() { // from class: xw1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i24) {
                            case 0:
                                return AbstractC38679c.m124068e(onViewEvent, viewState);
                            default:
                                return AbstractC38679c.m124069f(onViewEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            int i25 = (C27256h.f109055z << 3) | 6;
            int i26 = i15;
            AbstractC27249e.m82121d(modifierM3409f, topButton, null, (InterfaceC4339a) objM87133R, c28655q, i25, 4);
            EnumC17744g dividerType = viewState.getDivider().getDividerType();
            EnumC17740f dividerTextPosition = viewState.getDivider().getDividerTextPosition();
            TextResource title = viewState.getDivider().getTitle();
            int i27 = TextResource.$stable;
            AbstractC17755i2.m50938j(null, dividerType, dividerTextPosition, title, null, 0L, 0L, null, c28655q, i27 << 9, 241);
            c28655q = c28655q;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C27256h bottomButton = viewState.getBottomButton();
            boolean z13 = (i19 == 32 || ((i26 & 64) != 0 && c28655q.m87157i(viewState))) | (i18 == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                final int i28 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: xw1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i28) {
                            case 0:
                                return AbstractC38679c.m124068e(onViewEvent, viewState);
                            default:
                                return AbstractC38679c.m124069f(onViewEvent, viewState);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27249e.m82121d(modifierM3409f2, bottomButton, null, (InterfaceC4339a) objM87133R2, c28655q, i25, 4);
            TextResource disclaimer = viewState.getDisclaimer();
            if (!AbstractC8693b.m21270d(disclaimer)) {
                disclaimer = null;
            }
            if (disclaimer == null) {
                c28655q.m87150e0(1910906544);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1910906545);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(disclaimer, c28655q, i27), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, C2886a.f11498d << 18, 196090);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 16, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m124068e(Function1 function1, C35308a c35308a) {
        function1.invoke(c35308a.getTopButton().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m124069f(Function1 function1, C35308a c35308a) {
        function1.invoke(c35308a.getBottomButton().getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m124070g(Modifier modifier, C35308a c35308a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m124067d(modifier, c35308a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
