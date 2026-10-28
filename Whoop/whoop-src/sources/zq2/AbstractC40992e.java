package zq2;

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
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p714k80.C22283l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40674e0;

/* JADX INFO: renamed from: zq2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "text", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "c", "(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "isPressed", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40992e {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0074  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:43:0x009c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:55:0x012e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0199  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m133110c(TextResource text, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        Object objM87133R;
        long jM95628d;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-883431381);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(text) : c28655q2.m87157i(text) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C40674e0(6);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q2);
                }
                if (m133112e(AbstractC15751g.m44460m((InterfaceC21083i) objM87133R, c28655q2, 6))) {
                    c28655q2.m87150e0(1425975634);
                    jM95628d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                } else {
                    c28655q2.m87150e0(1425976626);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 2 * 8;
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, 0.0f, 13), 3, 4, jM95628d);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM95629e, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a4, 28);
                interfaceC4339a3 = interfaceC4339a4;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3360e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
                String strM21274h = AbstractC8693b.m21274h(text, c28655q2, (i15 & 14) | TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, modifierM3394p, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getT3(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22283l(text, interfaceC4339a3, i13, i14, 3);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C40674e0(6);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            if (m133112e(AbstractC15751g.m44460m((InterfaceC21083i) objM87133R, c28655q2, 6))) {
                c28655q2.m87150e0(1425975634);
                jM95628d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(1425976626);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 2 * 8;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f14, 0.0f, 0.0f, 13), 3, 4, jM95628d);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q2);
            }
            Modifier modifierM3360e2 = AbstractC1092a.m3360e(modifierM95629e2, (InterfaceC21083i) objM87133R2, null, false, null, interfaceC4339a4, 28);
            interfaceC4339a3 = interfaceC4339a4;
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3360e2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f14, c2314t2);
            String strM21274h2 = AbstractC8693b.m21274h(text, c28655q2, (i15 & 14) | TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, modifierM3394p2, c38072d2.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i18).getT3(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22283l(text, interfaceC4339a3, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m133111d() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    private static final boolean m133112e(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m133113f(TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m133110c(textResource, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
