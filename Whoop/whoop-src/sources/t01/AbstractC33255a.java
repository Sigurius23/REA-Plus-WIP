package t01;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import gz0.EnumC16313m0;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.C22949e;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import s51.C32205b;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: t01.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lt01/k;", "state", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "b", "(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33255a {

    /* JADX INFO: renamed from: t01.a$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f138661a;

        static {
            int[] iArr = new int[EnumC33264j.values().length];
            try {
                iArr[EnumC33264j.FILLED_LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33264j.MUTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC33264j.OUTLINED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f138661a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x030f  */
    /* JADX WARN: Code duplicated, block: B:104:0x035b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0365  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:46:0x009f  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:62:0x0121  */
    /* JADX WARN: Code duplicated, block: B:65:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x0162  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x020d  */
    /* JADX WARN: Code duplicated, block: B:81:0x023d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0241  */
    /* JADX WARN: Code duplicated, block: B:87:0x0262  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x0293  */
    /* JADX WARN: Code duplicated, block: B:93:0x0297  */
    /* JADX WARN: Code duplicated, block: B:98:0x02b2  */
    /* JADX INFO: renamed from: b */
    public static final void m105494b(C33265k state, InterfaceC4339a interfaceC4339a, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        float f13;
        int i16;
        long jM95624D;
        int i17;
        long jM31986e;
        long j7;
        Modifier modifierM3358c;
        Modifier modifierM3599a;
        float f14;
        Modifier modifierM3395q;
        C22949e c22949e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z13;
        int iHashCode2;
        int iHashCode3;
        C0213j c0213j2;
        C0209i c0209i5;
        EnumC16313m0 icon;
        boolean z14;
        boolean z15;
        long j13;
        C2306l c2306l = C2299e.f9108K;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-774422020);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier2 = c2314t;
                } else {
                    modifier2 = modifier2;
                }
                f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
                EnumC33264j style = state.getStyle();
                int[] iArr = a.f138661a;
                i16 = iArr[style.ordinal()];
                if (i16 != 1) {
                    c28655q.m87150e0(-1190209946);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else if (i16 != 2) {
                    c28655q.m87150e0(-1190207933);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    if (i16 == 3) {
                        throw AbstractC11895b.m32003v(-1190212297, c28655q, false);
                    }
                    c28655q.m87150e0(-1190205917);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                long j14 = jM95624D;
                i17 = iArr[state.getStyle().ordinal()];
                if (i17 != 1) {
                    c28655q.m87150e0(-1190202266);
                    jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else if (i17 != 2) {
                    c28655q.m87150e0(-1190200250);
                    jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                } else {
                    if (i17 == 3) {
                        throw AbstractC11895b.m32003v(-1190204611, c28655q, false);
                    }
                    c28655q.m87150e0(-1190198138);
                    jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                j7 = jM31986e;
                modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier2, c33252iM105489e), j14, AbstractC17918w0.f69621a);
                if (state.getIsClickable() || interfaceC4339a == null) {
                    modifierM3599a = modifierM3358c;
                } else {
                    modifierM3599a = AbstractC1136a.m3599a(AbstractC1092a.m3362g(modifierM3358c, false, null, null, interfaceC4339a, 15), "CollapsibleRowEndItem");
                }
                float f15 = 8;
                f14 = 1 * f15;
                modifierM3395q = AbstractC1099a.m3395q(modifierM3599a, ((float) 1.5d) * f15, f14);
                if (state.getIsTextActionChip()) {
                    c28655q.m87150e0(1759010315);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                    InterfaceC0221l.f734a.getClass();
                    c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i5 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    icon = state.getIcon();
                    if (icon == null) {
                        c28655q.m87150e0(1705408382);
                        c28655q.m87173q(false);
                        z15 = true;
                        z14 = false;
                        j13 = j7;
                    } else {
                        c28655q.m87150e0(1705408383);
                        z14 = false;
                        z15 = true;
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(icon.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * f13, c2314t), j7, c28655q, 432, 0);
                        j13 = j7;
                        c28655q.m87173q(false);
                    }
                    AbstractC30795n.m94707h(state.getDisplayText(), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getSh5(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(z15);
                    c28655q.m87173q(z14);
                } else {
                    modifier2 = modifier2;
                    c28655q.m87150e0(1759691013);
                    c22949e = AbstractC22977m.f90650a;
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                    if (state.getTimeSecondsSuffix() != null) {
                        c28655q.m87150e0(-2084226484);
                        C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q, 48);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        String displayText = state.getDisplayText();
                        C38072d c38072d = C38072d.f163053a;
                        AbstractC30795n.m94707h(displayText, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                        AbstractC30795n.m94707h(state.getTimeSecondsSuffix(), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN7(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        z13 = false;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-2083712225);
                        AbstractC30795n.m94707h(state.getDisplayText(), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                        c28655q = c28655q;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(z13);
                }
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32205b((Object) state, (InterfaceC23459e) interfaceC4339a, modifier3, i13, i14, 29);
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier2 = c2314t;
            } else {
                modifier2 = modifier2;
            }
            f13 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(2 * f13);
            EnumC33264j style2 = state.getStyle();
            int[] iArr2 = a.f138661a;
            i16 = iArr2[style2.ordinal()];
            if (i16 != 1) {
                c28655q.m87150e0(-1190209946);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else if (i16 != 2) {
                c28655q.m87150e0(-1190207933);
                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            } else {
                if (i16 == 3) {
                    throw AbstractC11895b.m32003v(-1190212297, c28655q, false);
                }
                c28655q.m87150e0(-1190205917);
                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            long j15 = jM95624D;
            i17 = iArr2[state.getStyle().ordinal()];
            if (i17 != 1) {
                c28655q.m87150e0(-1190202266);
                jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else if (i17 != 2) {
                c28655q.m87150e0(-1190200250);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                if (i17 == 3) {
                    throw AbstractC11895b.m32003v(-1190204611, c28655q, false);
                }
                c28655q.m87150e0(-1190198138);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            j7 = jM31986e;
            modifierM3358c = AbstractC1092a.m3358c(AbstractC37056f.m118994r(modifier2, c33252iM105489e2), j15, AbstractC17918w0.f69621a);
            if (state.getIsClickable()) {
                modifierM3599a = modifierM3358c;
            } else {
                modifierM3599a = modifierM3358c;
            }
            float f16 = 8;
            f14 = 1 * f16;
            modifierM3395q = AbstractC1099a.m3395q(modifierM3599a, ((float) 1.5d) * f16, f14);
            if (state.getIsTextActionChip()) {
                c28655q.m87150e0(1759010315);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i5 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                icon = state.getIcon();
                if (icon == null) {
                    c28655q.m87150e0(1705408382);
                    c28655q.m87173q(false);
                    z15 = true;
                    z14 = false;
                    j13 = j7;
                } else {
                    c28655q.m87150e0(1705408383);
                    z14 = false;
                    z15 = true;
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(icon.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f13 * f13, c2314t), j7, c28655q, 432, 0);
                    j13 = j7;
                    c28655q.m87173q(false);
                }
                AbstractC30795n.m94707h(state.getDisplayText(), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getSh5(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(z15);
                c28655q.m87173q(z14);
            } else {
                modifier2 = modifier2;
                c28655q.m87150e0(1759691013);
                c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a5 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a5);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                if (state.getTimeSecondsSuffix() != null) {
                    c28655q.m87150e0(-2084226484);
                    C22994r1 c22994r1M66759a6 = AbstractC22988p1.m66759a(c22949e, C2299e.f9109L, c28655q, 48);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    String displayText2 = state.getDisplayText();
                    C38072d c38072d2 = C38072d.f163053a;
                    AbstractC30795n.m94707h(displayText2, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                    AbstractC30795n.m94707h(state.getTimeSecondsSuffix(), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, 6).getN7(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    z13 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2083712225);
                    AbstractC30795n.m94707h(state.getDisplayText(), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getN6(), null, c28655q, 0, 0, 196602);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z13);
            }
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32205b((Object) state, (InterfaceC23459e) interfaceC4339a, modifier3, i13, i14, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m105495c(C33265k c33265k, InterfaceC4339a interfaceC4339a, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m105494b(c33265k, interfaceC4339a, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
