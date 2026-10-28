package ky2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hg3.AbstractC17269i;
import io.sentry.config.AbstractC20301a;
import iz0.AbstractC21048g;
import iz0.C21054m;
import j11.C21214q;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import ku2.C22837a;
import kz2.AbstractC22927d;
import l83.C23454a0;
import ny0.AbstractC27292z;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15166v0;
import p163g1.C15077m1;
import p208i2.AbstractC17911t;
import p208i2.C17903p;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ky2.j */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lky2/g$f;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/whooplabs/feature/navigation/c;", "Ll83/a0;", "onNavEvent", "d", "(Lky2/g$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22901j {
    /* JADX WARN: Code duplicated, block: B:69:0x0298 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x029e  */
    /* JADX WARN: Code duplicated, block: B:75:0x02df  */
    /* JADX INFO: renamed from: d */
    public static final void m66629d(InterfaceC22898g.f viewState, Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        InterfaceC22898g.f fVar;
        Function1 function1;
        boolean z4;
        boolean z13;
        Object objM87133R;
        C28676v0 c28676v0;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1878311377);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onNavEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            int i15 = i14;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(viewState.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, c2314t), null, C39102j.f168199a, 0.4f, null, c28655q, 221616, 72);
            Modifier modifierMo3401b = C1100b.f4583a.mo3401b(c2314t);
            C17909s c17909s = AbstractC17911t.f69612b;
            C17919x c17919x = new C17919x(C17919x.f69636m);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC22989q.m66760a(AbstractC1092a.m3357b(modifierMo3401b, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(c38072d.m121949b(c28655q, i16).getBlack50()), new C17919x(c38072d.m121949b(c28655q, i16).getBlack70()), new C17919x(C17919x.f69625b)), 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q, 0);
            float f13 = 2;
            float f14 = 8;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3395q(AbstractC1102d.m3407d(1.0f, c2314t), f13 * f14, 5 * f14), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
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
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(viewState.getIcon(), c28655q, 0), "", c2314t, null, null, 0.0f, new C17903p(viewState.getIconColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 5), c28655q, 432, 56);
            float f15 = 4;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f13 * f15, c2314t));
            AbstractC21048g.m58807M(AbstractC8693b.m21275i(viewState.getContent(), c28655q, 0), null, false, AbstractC22927d.m66688a(c28655q, 0), null, 0, 0, 0, false, c28655q, C21054m.f79836p << 9, 502);
            AbstractC11266d.m30469w(11, f15, c2314t, c28655q);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM66615c = viewState.getCta();
            C13825t c13825tM48880a = AbstractC17269i.m48880a(f13, c38072d.m121949b(c28655q, i16).getBrandWhite());
            float f16 = f15 * 16;
            C22976l1 c22976l1 = AbstractC15166v0.f56891a;
            C15077m1 c15077m1M43196a = AbstractC15166v0.m43196a(c38072d.m121949b(c28655q, i16).getTransparent(), c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, 0L, c28655q, 0, 12);
            boolean z14 = (i15 & 112) == 32;
            if ((i15 & 14) != 4) {
                if ((i15 & 8) != 0) {
                    fVar = viewState;
                    if (c28655q.m87157i(fVar)) {
                    }
                    z13 = z4 | z14;
                    objM87133R = c28655q.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = new C21214q(28, onNavEvent, fVar);
                        c28655q.m87172p0(objM87133R);
                    }
                    function1 = onNavEvent;
                    AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM66615c, c15077m1M43196a, null, c13825tM48880a, f16, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 18) | 6, 6, 6462);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22837a(23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, true, c28655q, 54, 0);
                } else {
                    fVar = viewState;
                }
                z4 = false;
                z13 = z4 | z14;
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (z13) {
                    objM87133R = new C21214q(28, onNavEvent, fVar);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C21214q(28, onNavEvent, fVar);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = onNavEvent;
                AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM66615c, c15077m1M43196a, null, c13825tM48880a, f16, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 18) | 6, 6, 6462);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22837a(23);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, true, c28655q, 54, 0);
            } else {
                fVar = viewState;
            }
            z4 = true;
            z13 = z4 | z14;
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (z13) {
                objM87133R = new C21214q(28, onNavEvent, fVar);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21214q(28, onNavEvent, fVar);
                c28655q.m87172p0(objM87133R);
            }
            function1 = onNavEvent;
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, textResourceM66615c, c15077m1M43196a, null, c13825tM48880a, f16, null, null, (InterfaceC4339a) objM87133R, c28655q, (TextResource.$stable << 18) | 6, 6, 6462);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C22837a(23);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, true, c28655q, 54, 0);
        } else {
            fVar = viewState;
            function1 = onNavEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(fVar, function1, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m66630e(Function1 function1, InterfaceC22898g.f fVar) {
        function1.invoke(fVar.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m66631f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m66632g(InterfaceC22898g.f fVar, Function1 function1, int i13, Composer composer, int i14) {
        m66629d(fVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
