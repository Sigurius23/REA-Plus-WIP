package p734sl0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import nl0.EnumC26811m;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qk2.C30453i;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.C38072d;

/* JADX INFO: renamed from: sl0.r2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lnl0/m;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "d", "(Lnl0/m;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32667r2 {

    /* JADX INFO: renamed from: sl0.r2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135522a;

        static {
            int[] iArr = new int[EnumC26811m.values().length];
            try {
                iArr[EnumC26811m.MESSAGE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26811m.MESSAGE_FLAGGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135522a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x0127  */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:68:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:74:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0250  */
    /* JADX WARN: Code duplicated, block: B:83:0x0270  */
    /* JADX WARN: Code duplicated, block: B:84:0x0272  */
    /* JADX WARN: Code duplicated, block: B:87:0x0279  */
    /* JADX WARN: Code duplicated, block: B:91:0x0281  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c2  */
    /* JADX INFO: renamed from: d */
    public static final void m102247d(EnumC26811m state, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        C38072d c38072d;
        int i16;
        C39336i c39336iM121949b;
        int[] iArr;
        int i17;
        long jM125394g;
        C39336i c39336iM121949b2;
        int i18;
        long jM125392f;
        int i19;
        C39336i c39336iM121949b3;
        int i24;
        long jM125392f2;
        int i25;
        InterfaceC4339a interfaceC4339a5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i26;
        int iHashCode2;
        InterfaceC4339a interfaceC4339a6;
        boolean z13;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1729534191);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87149e(state.ordinal()) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i27 = i14 & 2;
        if (i27 == 0) {
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
                if (i27 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32581a1(13);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                c39336iM121949b = c38072d.m121949b(c28655q2, i16);
                iArr = a.f135522a;
                i17 = iArr[state.ordinal()];
                if (i17 != 1 || i17 == 2) {
                    jM125394g = c39336iM121949b.getAccentNegativeTrend15();
                } else {
                    jM125394g = c39336iM121949b.getWhite10();
                }
                long j7 = jM125394g;
                c39336iM121949b2 = c38072d.m121949b(c28655q2, i16);
                i18 = iArr[state.ordinal()];
                if (i18 != 1 || i18 == 2) {
                    jM125392f = c39336iM121949b2.getAccentNegativeTrend();
                } else {
                    jM125392f = c39336iM121949b2.getWhite50();
                }
                if (iArr[state.ordinal()] == 1) {
                    i19 = AbstractC37336b.f159705y;
                } else {
                    i19 = AbstractC37336b.f159690q0;
                }
                c39336iM121949b3 = c38072d.m121949b(c28655q2, i16);
                i24 = iArr[state.ordinal()];
                if (i24 != 1 || i24 == 2) {
                    jM125392f2 = c39336iM121949b3.getAccentNegativeTrend();
                } else {
                    jM125392f2 = c39336iM121949b3.getWhite50();
                }
                long j13 = jM125392f2;
                float f13 = 8;
                float f14 = ((float) 1.5d) * f13;
                float f15 = 1;
                float f16 = f15 * f13;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3397s = AbstractC1099a.m3397s(c2314t, f14, f16, f14, f16);
                i25 = i15;
                float f17 = 4;
                interfaceC4339a5 = interfaceC4339a4;
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(2, f17, C2299e.f9108K, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3397s);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M53376q);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    i26 = i19;
                } else {
                    i26 = i19;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f17, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15 * f17)), j7, AbstractC17918w0.f69621a));
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3419p);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAttention(), c28655q2, 6), null, AbstractC1102d.m3415l(3 * f17, c2314t), jM125392f, c28655q2, 432, 0);
                    c28655q2.m87173q(true);
                    String strM21273g = AbstractC8693b.m21273g(i26, c28655q2, 0);
                    Modifier modifierM3397s2 = AbstractC1099a.m3397s(c2314t, f16, f16, ((float) 0.5d) * f13, f16);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC30795n.m94707h(strM21273g, AbstractC11895b.m31988g(modifierM3397s2, true, 1.0f), j13, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB3(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                    c28655q = c28655q2;
                    if (state == EnumC26811m.MESSAGE_ERROR) {
                        c28655q.m87150e0(1686340099);
                        EnumC27284v enumC27284v = EnumC27284v.TextSmall;
                        String strM21273g2 = AbstractC8693b.m21273g(AbstractC37336b.f159704x0, c28655q, 0);
                        long jM125371X = c38072d.m121949b(c28655q, i16).getRecovery();
                        if ((i25 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (!z13 || objM87133R == c28676v0) {
                            interfaceC4339a6 = interfaceC4339a5;
                            objM87133R = new C32579a(interfaceC4339a6, 13);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            interfaceC4339a6 = interfaceC4339a5;
                        }
                        AbstractC27282u.m82292h(null, enumC27284v, strM21273g2, false, jM125371X, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 105);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        c28655q.m87150e0(1686543831);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    interfaceC4339a3 = interfaceC4339a6;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(6 * f17, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(f15 * f17)), j7, AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3419p2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAttention(), c28655q2, 6), null, AbstractC1102d.m3415l(3 * f17, c2314t), jM125392f, c28655q2, 432, 0);
                c28655q2.m87173q(true);
                String strM21273g3 = AbstractC8693b.m21273g(i26, c28655q2, 0);
                Modifier modifierM3397s3 = AbstractC1099a.m3397s(c2314t, f16, f16, ((float) 0.5d) * f13, f16);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(strM21273g3, AbstractC11895b.m31988g(modifierM3397s3, true, 1.0f), j13, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB3(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                c28655q = c28655q2;
                if (state == EnumC26811m.MESSAGE_ERROR) {
                    c28655q.m87150e0(1686340099);
                    EnumC27284v enumC27284v2 = EnumC27284v.TextSmall;
                    String strM21273g4 = AbstractC8693b.m21273g(AbstractC37336b.f159704x0, c28655q, 0);
                    long jM125371X2 = c38072d.m121949b(c28655q, i16).getRecovery();
                    if ((i25 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C32579a(interfaceC4339a6, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C32579a(interfaceC4339a6, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27282u.m82292h(null, enumC27284v2, strM21273g4, false, jM125371X2, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 105);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    c28655q.m87150e0(1686543831);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(state, i13, interfaceC4339a3, i14, 21);
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
            if (i27 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32581a1(13);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            c39336iM121949b = c38072d.m121949b(c28655q2, i16);
            iArr = a.f135522a;
            i17 = iArr[state.ordinal()];
            if (i17 != 1) {
                jM125394g = c39336iM121949b.getAccentNegativeTrend15();
            } else {
                jM125394g = c39336iM121949b.getAccentNegativeTrend15();
            }
            long j14 = jM125394g;
            c39336iM121949b2 = c38072d.m121949b(c28655q2, i16);
            i18 = iArr[state.ordinal()];
            if (i18 != 1) {
                jM125392f = c39336iM121949b2.getAccentNegativeTrend();
            } else {
                jM125392f = c39336iM121949b2.getAccentNegativeTrend();
            }
            if (iArr[state.ordinal()] == 1) {
                i19 = AbstractC37336b.f159705y;
            } else {
                i19 = AbstractC37336b.f159690q0;
            }
            c39336iM121949b3 = c38072d.m121949b(c28655q2, i16);
            i24 = iArr[state.ordinal()];
            if (i24 != 1) {
                jM125392f2 = c39336iM121949b3.getAccentNegativeTrend();
            } else {
                jM125392f2 = c39336iM121949b3.getAccentNegativeTrend();
            }
            long j15 = jM125392f2;
            float f18 = 8;
            float f19 = ((float) 1.5d) * f18;
            float f110 = 1;
            float f111 = f110 * f18;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3397s4 = AbstractC1099a.m3397s(c2314t2, f19, f111, f19, f111);
            i25 = i15;
            float f112 = 4;
            interfaceC4339a5 = interfaceC4339a4;
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(2, f112, C2299e.f9108K, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3397s4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i6, c22994r1M53376q2);
            C0209i c0209i7 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                i26 = i19;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i8 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(6 * f112, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f110 * f112)), j14, AbstractC17918w0.f69621a));
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3419p3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAttention(), c28655q2, 6), null, AbstractC1102d.m3415l(3 * f112, c2314t2), jM125392f, c28655q2, 432, 0);
                c28655q2.m87173q(true);
                String strM21273g5 = AbstractC8693b.m21273g(i26, c28655q2, 0);
                Modifier modifierM3397s5 = AbstractC1099a.m3397s(c2314t2, f111, f111, ((float) 0.5d) * f18, f111);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC30795n.m94707h(strM21273g5, AbstractC11895b.m31988g(modifierM3397s5, true, 1.0f), j15, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB3(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
                c28655q = c28655q2;
                if (state == EnumC26811m.MESSAGE_ERROR) {
                    c28655q.m87150e0(1686340099);
                    EnumC27284v enumC27284v3 = EnumC27284v.TextSmall;
                    String strM21273g6 = AbstractC8693b.m21273g(AbstractC37336b.f159704x0, c28655q, 0);
                    long jM125371X3 = c38072d.m121949b(c28655q, i16).getRecovery();
                    if ((i25 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C32579a(interfaceC4339a6, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        interfaceC4339a6 = interfaceC4339a5;
                        objM87133R = new C32579a(interfaceC4339a6, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC27282u.m82292h(null, enumC27284v3, strM21273g6, false, jM125371X3, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 105);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    c28655q.m87150e0(1686543831);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a6;
            } else {
                i26 = i19;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(6 * f112, AbstractC1092a.m3358c(AbstractC37056f.m118994r(c2314t2, AbstractC33253j.m105489e(f110 * f112)), j14, AbstractC17918w0.f69621a));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3419p4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getAttention(), c28655q2, 6), null, AbstractC1102d.m3415l(3 * f112, c2314t2), jM125392f, c28655q2, 432, 0);
            c28655q2.m87173q(true);
            String strM21273g7 = AbstractC8693b.m21273g(i26, c28655q2, 0);
            Modifier modifierM3397s6 = AbstractC1099a.m3397s(c2314t2, f111, f111, ((float) 0.5d) * f18, f111);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM21273g7, AbstractC11895b.m31988g(modifierM3397s6, true, 1.0f), j15, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB3(), null, c28655q2, 0, C2886a.f11498d << 18, 196088);
            c28655q = c28655q2;
            if (state == EnumC26811m.MESSAGE_ERROR) {
                c28655q.m87150e0(1686340099);
                EnumC27284v enumC27284v4 = EnumC27284v.TextSmall;
                String strM21273g8 = AbstractC8693b.m21273g(AbstractC37336b.f159704x0, c28655q, 0);
                long jM125371X4 = c38072d.m121949b(c28655q, i16).getRecovery();
                if ((i25 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z13) {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C32579a(interfaceC4339a6, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    interfaceC4339a6 = interfaceC4339a5;
                    objM87133R = new C32579a(interfaceC4339a6, 13);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(null, enumC27284v4, strM21273g8, false, jM125371X4, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 105);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                interfaceC4339a6 = interfaceC4339a5;
                c28655q.m87150e0(1686543831);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(state, i13, interfaceC4339a3, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m102248e() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m102249f(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m102250g(EnumC26811m enumC26811m, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m102247d(enumC26811m, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
