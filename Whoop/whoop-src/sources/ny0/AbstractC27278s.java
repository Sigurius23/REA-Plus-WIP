package ny0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1112d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import gb1.AbstractC15680h;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26957l;
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
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: ny0.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Ly71/g;", "icon", "Li2/x;", "toggleBackgroundColor", "", "enabled", "initialToggle", "Lkotlin/Function1;", "Ll83/a0;", "onToggle", "c", "(Ly71/g;JZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27278s {
    /* JADX WARN: Code duplicated, block: B:102:0x01de  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7 A[PHI: r0 r4 r9
      0x00b7: PHI (r0v30 int) = (r0v13 int), (r0v11 int), (r0v31 int) binds: [B:70:0x00cf, B:62:0x00b3, B:63:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r4v11 long) = (r4v5 long), (r4v2 long), (r4v2 long) binds: [B:70:0x00cf, B:62:0x00b3, B:63:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r9v9 boolean) = (r9v4 boolean), (r9v2 boolean), (r9v2 boolean) binds: [B:70:0x00cf, B:62:0x00b3, B:63:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x0126  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:86:0x012f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:91:0x0177  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x018e  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    /* JADX INFO: renamed from: c */
    public static final void m82282c(C39274g icon, long j7, boolean z4, boolean z13, Function1 onToggle, Composer composer, int i13, int i14) {
        int i15;
        long accentAction;
        boolean z14;
        int i16;
        boolean z15;
        int i17;
        boolean z16;
        long j13;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        boolean z24;
        long jM95628d;
        long jM95624D;
        boolean z25;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i18;
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(onToggle, "onToggle");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2112750753);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(icon) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            if ((i14 & 2) == 0) {
                accentAction = j7;
                int i19 = c28655q.m87151f(accentAction) ? 32 : 16;
                i15 |= i19;
            } else {
                accentAction = j7;
            }
            i15 |= i19;
        } else {
            accentAction = j7;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                i15 |= c28655q.m87155h(z14) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(onToggle)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28655q.m87140Z();
                    if ((i13 & 1) != 0 || c28655q.m87118C()) {
                        if ((i14 & 2) != 0) {
                            accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                            i15 &= -113;
                        }
                        if (i24 != 0) {
                            z14 = true;
                        }
                        if (i16 != 0) {
                            z19 = z14;
                            z24 = false;
                        }
                        c28655q.m87175r();
                        if (z24) {
                            c28655q.m87150e0(1166065780);
                            c28655q.m87173q(false);
                            jM95628d = accentAction;
                        } else {
                            c28655q.m87150e0(1166067206);
                            jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                        }
                        if (z24) {
                            c28655q.m87150e0(1166069129);
                            jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                        } else {
                            c28655q.m87150e0(1166070217);
                            jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                        }
                        long j14 = jM95624D;
                        float f13 = 4;
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(8 * f13, c2314t), 2, f13);
                        if ((i15 & 57344) == 16384) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z25 || objM87133R == C28635l.f115821a) {
                            objM87133R = new C26957l(onToggle, 13);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM3448b = AbstractC1112d.m3448b(modifierM53364e, z24, z19, null, (Function1) objM87133R, 12);
                        boolean z26 = z19;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC15680h.m44112a(modifierM3448b, z26), jM95628d, AbstractC17918w0.f69621a);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3358c);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                        AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), AbstractC8693b.m21274h(icon.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(3 * f13, AbstractC15680h.m44112a(c2314t, z26)), j14, c28655q, 0, 0);
                        c28655q.m87173q(true);
                        long j15 = accentAction;
                        z17 = z26;
                        j13 = j15;
                        z18 = z24;
                    } else {
                        c28655q.m87138X();
                        if ((i14 & 2) != 0) {
                            i15 &= -113;
                        }
                    }
                    z19 = z14;
                    z24 = z15;
                    c28655q.m87175r();
                    if (z24) {
                        c28655q.m87150e0(1166065780);
                        c28655q.m87173q(false);
                        jM95628d = accentAction;
                    } else {
                        c28655q.m87150e0(1166067206);
                        jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    }
                    if (z24) {
                        c28655q.m87150e0(1166069129);
                        jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(1166070217);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    long j16 = jM95624D;
                    float f14 = 4;
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM53364e2 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(8 * f14, c2314t2), 2, f14);
                    if ((i15 & 57344) == 16384) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z25) {
                        objM87133R = new C26957l(onToggle, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C26957l(onToggle, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM3448b2 = AbstractC1112d.m3448b(modifierM53364e2, z24, z19, null, (Function1) objM87133R, 12);
                    boolean z27 = z19;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(modifierM3448b2, z27), jM95628d, AbstractC17918w0.f69621a);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                    AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), AbstractC8693b.m21274h(icon.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(3 * f14, AbstractC15680h.m44112a(c2314t2, z27)), j16, c28655q, 0, 0);
                    c28655q.m87173q(true);
                    long j17 = accentAction;
                    z17 = z27;
                    j13 = j17;
                    z18 = z24;
                } else {
                    c28655q.m87138X();
                    j13 = accentAction;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C27276r(icon, j13, z17, z18, onToggle, i13, i14);
                }
            }
            i15 |= 3072;
            z15 = z13;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                        i15 &= -113;
                    }
                    if (i24 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z19 = z14;
                        z24 = false;
                    } else {
                        z19 = z14;
                        z24 = z15;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                        i15 &= -113;
                    }
                    if (i24 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z19 = z14;
                        z24 = false;
                    } else {
                        z19 = z14;
                        z24 = z15;
                    }
                }
                c28655q.m87175r();
                if (z24) {
                    c28655q.m87150e0(1166065780);
                    c28655q.m87173q(false);
                    jM95628d = accentAction;
                } else {
                    c28655q.m87150e0(1166067206);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z24) {
                    c28655q.m87150e0(1166069129);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(1166070217);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j18 = jM95624D;
                float f15 = 4;
                C2314t c2314t3 = C2314t.f9131w;
                Modifier modifierM53364e3 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(8 * f15, c2314t3), 2, f15);
                if ((i15 & 57344) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C26957l(onToggle, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26957l(onToggle, 13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3448b3 = AbstractC1112d.m3448b(modifierM53364e3, z24, z19, null, (Function1) objM87133R, 12);
                boolean z28 = z19;
                Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(modifierM3448b3, z28), jM95628d, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3358c3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), AbstractC8693b.m21274h(icon.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(3 * f15, AbstractC15680h.m44112a(c2314t3, z28)), j18, c28655q, 0, 0);
                c28655q.m87173q(true);
                long j19 = accentAction;
                z17 = z28;
                j13 = j19;
                z18 = z24;
            } else {
                c28655q.m87138X();
                j13 = accentAction;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27276r(icon, j13, z17, z18, onToggle, i13, i14);
            }
        }
        i15 |= 384;
        z14 = z4;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(onToggle)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28655q.m87140Z();
                if ((i13 & 1) != 0) {
                    if ((i14 & 2) != 0) {
                        accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                        i15 &= -113;
                    }
                    if (i24 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z19 = z14;
                        z24 = false;
                    } else {
                        z19 = z14;
                        z24 = z15;
                    }
                } else {
                    if ((i14 & 2) != 0) {
                        accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                        i15 &= -113;
                    }
                    if (i24 != 0) {
                        z14 = true;
                    }
                    if (i16 != 0) {
                        z19 = z14;
                        z24 = false;
                    } else {
                        z19 = z14;
                        z24 = z15;
                    }
                }
                c28655q.m87175r();
                if (z24) {
                    c28655q.m87150e0(1166065780);
                    c28655q.m87173q(false);
                    jM95628d = accentAction;
                } else {
                    c28655q.m87150e0(1166067206);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                if (z24) {
                    c28655q.m87150e0(1166069129);
                    jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(1166070217);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                long j110 = jM95624D;
                float f16 = 4;
                C2314t c2314t4 = C2314t.f9131w;
                Modifier modifierM53364e4 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(8 * f16, c2314t4), 2, f16);
                if ((i15 & 57344) == 16384) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z25) {
                    objM87133R = new C26957l(onToggle, 13);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C26957l(onToggle, 13);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3448b4 = AbstractC1112d.m3448b(modifierM53364e4, z24, z19, null, (Function1) objM87133R, 12);
                boolean z29 = z19;
                Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(modifierM3448b4, z29), jM95628d, AbstractC17918w0.f69621a);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3358c4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), AbstractC8693b.m21274h(icon.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(3 * f16, AbstractC15680h.m44112a(c2314t4, z29)), j110, c28655q, 0, 0);
                c28655q.m87173q(true);
                long j111 = accentAction;
                z17 = z29;
                j13 = j111;
                z18 = z24;
            } else {
                c28655q.m87138X();
                j13 = accentAction;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27276r(icon, j13, z17, z18, onToggle, i13, i14);
            }
        }
        i15 |= 3072;
        z15 = z13;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(onToggle)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28655q.m87140Z();
            if ((i13 & 1) != 0) {
                if ((i14 & 2) != 0) {
                    accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                    i15 &= -113;
                }
                if (i24 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z19 = z14;
                    z24 = false;
                } else {
                    z19 = z14;
                    z24 = z15;
                }
            } else {
                if ((i14 & 2) != 0) {
                    accentAction = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                    i15 &= -113;
                }
                if (i24 != 0) {
                    z14 = true;
                }
                if (i16 != 0) {
                    z19 = z14;
                    z24 = false;
                } else {
                    z19 = z14;
                    z24 = z15;
                }
            }
            c28655q.m87175r();
            if (z24) {
                c28655q.m87150e0(1166065780);
                c28655q.m87173q(false);
                jM95628d = accentAction;
            } else {
                c28655q.m87150e0(1166067206);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            if (z24) {
                c28655q.m87150e0(1166069129);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(1166070217);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j112 = jM95624D;
            float f17 = 4;
            C2314t c2314t5 = C2314t.f9131w;
            Modifier modifierM53364e5 = AbstractC18489d0.m53364e(AbstractC1102d.m3419p(8 * f17, c2314t5), 2, f17);
            if ((i15 & 57344) == 16384) {
                z25 = true;
            } else {
                z25 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z25) {
                objM87133R = new C26957l(onToggle, 13);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C26957l(onToggle, 13);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3448b5 = AbstractC1112d.m3448b(modifierM53364e5, z24, z19, null, (Function1) objM87133R, 12);
            boolean z210 = z19;
            Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC15680h.m44112a(modifierM3448b5, z210), jM95628d, AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3358c5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(icon.getIcon(), c28655q, 6), AbstractC8693b.m21274h(icon.getContentDescription(), c28655q, 0), AbstractC1102d.m3419p(3 * f17, AbstractC15680h.m44112a(c2314t5, z210)), j112, c28655q, 0, 0);
            c28655q.m87173q(true);
            long j113 = accentAction;
            z17 = z210;
            j13 = j113;
            z18 = z24;
        } else {
            c28655q.m87138X();
            j13 = accentAction;
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27276r(icon, j13, z17, z18, onToggle, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m82283d(Function1 function1, boolean z4) {
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m82284e(C39274g c39274g, long j7, boolean z4, boolean z13, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m82282c(c39274g, j7, z4, z13, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
