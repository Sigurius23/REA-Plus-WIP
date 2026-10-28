package zi1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import kd1.C22411w;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p208i2.C17903p;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p714k80.C22283l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;
import y71.C39272e;

/* JADX INFO: renamed from: zi1.f0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "buttonText", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "kennel_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40676f0 {
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m132043d(TextResource buttonText, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(buttonText, "buttonText");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-290648373);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(buttonText) : c28655q.m87157i(buttonText) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C40674e0(0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125401j0 = c38072d.m121949b(c28655q, i17).getSleepRemSleep();
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C39272e(interfaceC4339a4, 21);
                    c28655q.m87172p0(objM87133R);
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15)), C17919x.m51541c(0.15f, jM125401j0), C22411w.f87680a.m64535a().m64090c());
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.75d) * f13, modifierM3358c);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC29125c.m88522c(AbstractC29125c.m88500I(c38072d.m121951d().getAction().getAdd(), c28655q, 0), null, null, null, null, 0.0f, new C17903p(jM125401j0, 5), c28655q, 48, 60);
                AbstractC38963t7.m124386p(2, f13, c2314t, c28655q);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | (i15 & 14)), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22283l(buttonText, interfaceC4339a3, i13, i14, 2);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C40674e0(0);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            long jM125401j1 = c38072d2.m121949b(c28655q, i18).getSleepRemSleep();
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C39272e(interfaceC4339a4, 21);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C39272e(interfaceC4339a4, 21);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15)), C17919x.m51541c(0.15f, jM125401j1), C22411w.f87680a.m64535a().m64090c());
            float f14 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.75d) * f14, modifierM3358c2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC29125c.m88522c(AbstractC29125c.m88500I(c38072d2.m121951d().getAction().getAdd(), c28655q, 0), null, null, null, null, 0.0f, new C17903p(jM125401j1, 5), c28655q, 48, 60);
            AbstractC38963t7.m124386p(2, f14, c2314t2, c28655q);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(buttonText, c28655q, TextResource.$stable | (i15 & 14)), null, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getH4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22283l(buttonText, interfaceC4339a3, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m132044e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m132045f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132046g(TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m132043d(textResource, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
