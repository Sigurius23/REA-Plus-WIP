package w71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import ep1.C13421p;
import gy0.AbstractC16277f;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27283u0;
import ny0.AbstractC27285v0;
import ny0.EnumC27251e1;
import p00.C28569f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import p745y81.AbstractC39330c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;
import x81.C38070b;
import x81.C38072d;

/* JADX INFO: renamed from: w71.b0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/design/util/TextResource;", "question", "", "timeString", "", "isSubQuestion", "enabled", "Lkotlin/Function0;", "Ll83/a0;", "tapAction", "d", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36874b0 {
    /* JADX WARN: Code duplicated, block: B:104:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x0257  */
    /* JADX WARN: Code duplicated, block: B:109:0x0260  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:33:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:45:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:76:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Code duplicated, block: B:82:0x0196  */
    /* JADX WARN: Code duplicated, block: B:83:0x019c  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020d  */
    /* JADX INFO: renamed from: d */
    public static final void m118265d(TextResource question, String timeString, boolean z4, boolean z13, InterfaceC4339a tapAction, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        C36875c c36875c;
        float fM118269a;
        long jM125318d;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        C0213j c0213j2;
        C0213j c0213j3;
        int iHashCode3;
        int i16;
        int i17;
        AbstractC22676k.m65750j(question, "question");
        AbstractC22676k.m65750j(timeString, "timeString");
        AbstractC22676k.m65750j(tapAction, "tapAction");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1451966288);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(question) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(timeString) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            if ((i13 & 3072) == 0) {
                if (c28655q.m87155h(z13)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(tapAction)) {
                    i16 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i16;
            }
            if ((i15 & 9363) != 9362) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q.m87135U(i15 & 1, z15)) {
                if (i18 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                c36875c = C36875c.f157714a;
                if (z16) {
                    fM118269a = c36875c.m118270b();
                } else {
                    fM118269a = c36875c.m118269a();
                }
                float f13 = fM118269a;
                if (timeString.length() > 0) {
                    c28655q.m87150e0(-524756680);
                    jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                    c28655q.m87173q(false);
                } else if (timeString.length() > 0) {
                    c28655q.m87150e0(-524754685);
                    jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-524752840);
                    jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                    c28655q.m87173q(false);
                }
                long j7 = jM125318d;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13, 0.0f, 0.0f, 0.0f, 14);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (2.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
                C2305k c2305k = C2299e.f9110M;
                C22957g c22957g = AbstractC22977m.f90652c;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    c28655q.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c0213j3 = c0213j2;
                AbstractC36907z.m118520c(question, null, false, null, c28655q, i15 & 14, 14);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q, 48);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j3);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC39330c.m125320b(0L, j7, 0L, 0L, AbstractC37817c.m121344e(-1582705976, c28655q, new C28569f(tapAction, timeString, z13)), c28655q, 24576, 13);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z14 = z16;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(question, timeString, z14, z13, tapAction, i13, i14, 15);
            }
        }
        i15 |= 384;
        z14 = z4;
        if ((i13 & 3072) == 0) {
            if (c28655q.m87155h(z13)) {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            } else {
                i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i15 |= i17;
        }
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(tapAction)) {
                i16 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i16 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i16;
        }
        if ((i15 & 9363) != 9362) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q.m87135U(i15 & 1, z15)) {
            if (i18 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            c36875c = C36875c.f157714a;
            if (z16) {
                fM118269a = c36875c.m118270b();
            } else {
                fM118269a = c36875c.m118269a();
            }
            float f14 = fM118269a;
            if (timeString.length() > 0) {
                c28655q.m87150e0(-524756680);
                jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getRecovery();
                c28655q.m87173q(false);
            } else if (timeString.length() > 0) {
                c28655q.m87150e0(-524754685);
                jM125318d = C38072d.f163053a.m121949b(c28655q, 6).getAccentPositiveTrend();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-524752840);
                jM125318d = C38070b.f163049a.m121943a(c28655q, 6).getNegative();
                c28655q.m87173q(false);
            }
            long j13 = jM125318d;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f14, 0.0f, 0.0f, 0.0f, 14);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (2.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true);
            C2305k c2305k2 = C2299e.f9110M;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j2 = c0213j;
                c28655q.m87163l(c0213j2);
            } else {
                c0213j2 = c0213j;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            c0213j3 = c0213j2;
            AbstractC36907z.m118520c(question, null, false, null, c28655q, i15 & 14, 14);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement4 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, C2299e.f9112O, c28655q, 48);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, layoutWeightElement4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            AbstractC39330c.m125320b(0L, j13, 0L, 0L, AbstractC37817c.m121344e(-1582705976, c28655q, new C28569f(tapAction, timeString, z13)), c28655q, 24576, 13);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z14 = z16;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(question, timeString, z14, z13, tapAction, i13, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m118266e(String str, boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            c28655q.m87150e0(-562017668);
            String strM92103Y = str.length() == 0 ? AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62405z2) : str;
            c28655q.m87173q(false);
            AbstractC27285v0.c cVar = new AbstractC27285v0.c(EnumC27251e1.FLEXIBLE, null, 2, null);
            boolean z13 = str.length() > 0;
            boolean zM87153g = c28655q.m87153g(interfaceC4339a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 22);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27283u0.m82318q(null, strM92103Y, null, null, cVar, z13, z4, 0.0f, null, (InterfaceC4339a) objM87133R, c28655q, 0, 397);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m118267f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m118268g(TextResource textResource, String str, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m118265d(textResource, str, z4, z13, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
