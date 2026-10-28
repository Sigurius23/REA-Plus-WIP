package p733ry2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import lz2.C24826b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rx0.C31901f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ry2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Llz2/b;", "viewState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Llz2/b;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "whooplabs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31912a {
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:64:0x011c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static final void m99275d(C24826b viewState, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        long jM95624D;
        long jM95628d;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-475681825);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2);
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
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31901f(3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState.getIsConnecting()) {
                    c28655q2.m87150e0(-1863695258);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                } else if (viewState.getIsConnected()) {
                    c28655q2.m87150e0(-1863693370);
                    jM95624D = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70();
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1863692023);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                if (viewState.getIsConnected()) {
                    c28655q2.m87150e0(-1863688791);
                    jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                } else {
                    c28655q2.m87150e0(-1863687354);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
                }
                C2314t c2314t = C2314t.f9131w;
                float f13 = 2 * 8;
                Modifier modifierM95629e = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f13, 0.0f, 0.0f, 13), 3, 4, jM95628d);
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q2.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C30599e(20, viewState, interfaceC4339a4);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
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
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getName(), c28655q2, TextResource.$stable), AbstractC1099a.m3394p(f13, c2314t), jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getT3(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, interfaceC4339a3, i14, 10);
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
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31901f(3);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (viewState.getIsConnecting()) {
                c28655q2.m87150e0(-1863695258);
                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else if (viewState.getIsConnected()) {
                c28655q2.m87150e0(-1863693370);
                jM95624D = C38072d.f163053a.m121949b(c28655q2, C38072d.f163054b).getBlack70();
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1863692023);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            if (viewState.getIsConnected()) {
                c28655q2.m87150e0(-1863688791);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            } else {
                c28655q2.m87150e0(-1863687354);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, C38072d.f163054b, false);
            }
            C2314t c2314t2 = C2314t.f9131w;
            float f14 = 2 * 8;
            Modifier modifierM95629e2 = AbstractC31061c.m95629e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f14, 0.0f, 0.0f, 13), 3, 4, jM95628d);
            if ((i15 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z13;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                objM87133R = new C30599e(20, viewState, interfaceC4339a4);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C30599e(20, viewState, interfaceC4339a4);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM95629e2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3362g2);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getName(), c28655q2, TextResource.$stable), AbstractC1099a.m3394p(f14, c2314t2), jM95624D, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, C38072d.f163054b).getT3(), null, c28655q2, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, interfaceC4339a3, i14, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m99276e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m99277f(C24826b c24826b, InterfaceC4339a interfaceC4339a) {
        if (!c24826b.getIsConnecting()) {
            interfaceC4339a.invoke();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m99278g(C24826b c24826b, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m99275d(c24826b, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
