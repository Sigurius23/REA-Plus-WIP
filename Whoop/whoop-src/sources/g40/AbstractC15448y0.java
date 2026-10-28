package g40;

import android.content.Context;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.focus.AbstractC1126a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2478a3;
import c93.InterfaceC4339a;
import com.whoop.android.R;
import d40.AbstractC11673r;
import d40.C11662g;
import d42.C11699o;
import ec3.C13045h2;
import g11.C15218b;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p132f0.C13821r1;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15002f0;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15067l1;
import p163g1.C14970c1;
import p163g1.C15160u4;
import p163g1.C15197y1;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22949e;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p412q3.C29891y;
import p475s0.C32034a;
import p558vp.AbstractC36259c;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g40.y0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC15448y0 {

    /* JADX INFO: renamed from: a */
    public static final float f58036a = 280;

    /* JADX INFO: renamed from: b */
    public static final float f58037b = 48;

    /* JADX WARN: Code duplicated, block: B:102:0x029d  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:110:0x030d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0225  */
    /* JADX WARN: Code duplicated, block: B:84:0x0231  */
    /* JADX WARN: Code duplicated, block: B:86:0x0245  */
    /* JADX WARN: Code duplicated, block: B:89:0x024e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0251  */
    /* JADX WARN: Code duplicated, block: B:93:0x0276  */
    /* JADX WARN: Code duplicated, block: B:94:0x027a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0295  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX INFO: renamed from: a */
    public static final void m43610a(C15413r0 controller, boolean z4, Modifier modifier, boolean z13, Composer composer, int i13) {
        int i14;
        Object objMo855e;
        long jM51541c;
        boolean z14;
        List list;
        Object objM87133R;
        Object objM87133R2;
        Modifier modifierM3361f;
        boolean zHasSystemFeature;
        boolean z15;
        String str;
        int iHashCode;
        ?? r10;
        boolean z16;
        long j7;
        int i15;
        C28655q c28655q;
        Object objM87133R3;
        boolean z17;
        Object objM87133R4;
        C28655q c28655q2;
        AbstractC22676k.m65750j(controller, "controller");
        boolean z18 = controller.f57911l;
        C13045h2 c13045h2 = controller.f57906g;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(958043205);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(controller) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87153g(modifier) ? 256 : 128;
        }
        int i16 = i14 | 3072;
        if ((i16 & 1171) == 1170 && c28655q3.m87121F()) {
            c28655q3.m87138X();
            z17 = z13;
            c28655q2 = c28655q3;
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(controller.f57907h, c28655q3, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c13045h2, c28655q3, 0);
            List list2 = controller.f57901b;
            boolean z19 = list2.size() == 1 && controller.f57902c;
            boolean z24 = z4 && !z19;
            c28655q3.m87150e0(468498338);
            Object objM87133R5 = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (objM87133R5 == obj) {
                objM87133R5 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R5);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R5;
            c28655q3.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M83597t3 = C27648a.m83597t(controller.f57909j, c28655q3, 0);
            Object obj2 = (Integer) C27648a.m83597t(c13045h2, c28655q3, 0).getValue();
            c28655q3.m87150e0(468504698);
            boolean zM87153g = c28655q3.m87153g(obj2);
            Object objM87133R6 = c28655q3.m87133R();
            if (zM87153g || objM87133R6 == obj) {
                Integer num = (Integer) interfaceC28601c1M83597t2.getValue();
                if (num == null || (objMo855e = controller.f57900a.mo855e(num.intValue())) == null) {
                    objMo855e = "";
                }
                objM87133R6 = objMo855e;
                c28655q3.m87172p0(objM87133R6);
            }
            String str2 = (String) objM87133R6;
            c28655q3.m87173q(false);
            if (z24) {
                c28655q3.m87150e0(1638878540);
                jM51541c = AbstractC11673r.m31082k(c28655q3).f37671d;
                z14 = false;
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1638939176);
                long j13 = AbstractC11673r.m31082k(c28655q3).f37671d;
                long j14 = ((C17919x) c28655q3.m87161k(AbstractC15067l1.f56420a)).f69639a;
                if (((C14970c1) c28655q3.m87161k(AbstractC14981d1.f55997a)).m43094i()) {
                    AbstractC17918w0.m51536x(j14);
                } else {
                    AbstractC17918w0.m51536x(j14);
                }
                jM51541c = C17919x.m51541c(0.38f, j13);
                z14 = false;
                c28655q3.m87173q(false);
            }
            C2307m c2307m = C2299e.f9114w;
            C2314t c2314t = C2314t.f9131w;
            long j15 = jM51541c;
            Modifier modifierM3428y = AbstractC1102d.m3428y(c2314t, c2307m, z14, 2);
            long j16 = AbstractC11673r.m31082k(c28655q3).f37668a;
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            Modifier modifierMo3471e = AbstractC1092a.m3358c(modifierM3428y, j16, c17916v0).mo3471e(modifier);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S) {
                list = list2;
            } else {
                list = list2;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                c28655q3.m87150e0(-438250805);
                c28655q3.m87150e0(-438259277);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == obj) {
                    objM87133R = new C15160u4(23);
                    c28655q3.m87172p0(objM87133R);
                }
                c28655q3.m87173q(false);
                Modifier modifierM3482a = AbstractC1126a.m3482a(c2314t, (Function1) objM87133R);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q3, R.string.stripe_change);
                c28655q3.m87150e0(-438252942);
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C15218b(1, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R2);
                }
                c28655q3.m87173q(false);
                modifierM3361f = AbstractC1092a.m3361f(modifierM3482a, z24, strM92103Y, (InterfaceC4339a) objM87133R2, 4);
                c28655q3.m87150e0(-438250017);
                c28655q3.m87150e0(431307837);
                zHasSystemFeature = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getPackageManager().hasSystemFeature("android.software.leanback");
                c28655q3.m87173q(false);
                if (zHasSystemFeature) {
                    c28655q3.m87150e0(646346929);
                    objM87133R4 = c28655q3.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = new C15218b(2, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    z15 = false;
                    c28655q3.m87173q(false);
                    modifierM3361f = AbstractC37056f.m118997u(modifierM3361f, new C32034a(false, z24, (InterfaceC4339a) objM87133R4));
                } else {
                    z15 = false;
                }
                c28655q3.m87173q(z15);
                c28655q3.m87173q(z15);
                if (z18 != 0) {
                    str = "tiny";
                } else {
                    str = "normal";
                }
                Modifier modifierM3599a = AbstractC1136a.m3599a(modifierM3361f, "DropDown:".concat(str));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z15);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3599a);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                if (z18) {
                    c28655q3.m87150e0(-1437796417);
                    j7 = j15;
                    r10 = 1;
                    m43613d(str2, j7, z19, c28655q3, i16 & 7168);
                    i15 = 0;
                    c28655q3.m87173q(false);
                    c28655q = c28655q3;
                } else {
                    r10 = 1;
                    c28655q3.m87150e0(-1437465523);
                    InterfaceC41211c interfaceC41211c = (InterfaceC41211c) interfaceC28601c1M83597t.getValue();
                    if (((InterfaceC15361h1) interfaceC28601c1M83597t3.getValue()) != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    m43612c(interfaceC41211c, z16, str2, j15, z19, c28655q3, (i16 << 6) & 458752);
                    j7 = j15;
                    C28655q c28655q4 = c28655q3;
                    i15 = 0;
                    c28655q4.m87173q(false);
                    c28655q = c28655q4;
                }
                c28655q.m87173q(r10);
                C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(i15, c28655q, r10);
                boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
                c28655q.m87150e0(-438206829);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = new C15218b(3, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                c28655q.m87173q(false);
                C28655q c28655q5 = c28655q;
                AbstractC15002f0.m43105a(zBooleanValue, (InterfaceC4339a) objM87133R3, AbstractC1102d.m3417n(AbstractC1102d.m3424u(f58036a, AbstractC1092a.m3358c(c2314t, AbstractC11673r.m31082k(c28655q).f37668a, c17916v0)), 0.0f, 0.0f, 0.0f, f58037b * 8.9f, 7), 0L, c13821r1M92099U, null, AbstractC37817c.m121344e(1362403838, c28655q, new C15433v0(list, j7, controller, interfaceC28601c1M83597t2, interfaceC28601c1, c13821r1M92099U)), c28655q5, 1572912, 40);
                C28655q c28655q6 = c28655q5;
                c28655q6.m87173q(r10);
                z17 = r10;
                c28655q2 = c28655q6;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            c28655q3.m87150e0(-438250805);
            c28655q3.m87150e0(-438259277);
            objM87133R = c28655q3.m87133R();
            if (objM87133R == obj) {
                objM87133R = new C15160u4(23);
                c28655q3.m87172p0(objM87133R);
            }
            c28655q3.m87173q(false);
            Modifier modifierM3482a2 = AbstractC1126a.m3482a(c2314t, (Function1) objM87133R);
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q3, R.string.stripe_change);
            c28655q3.m87150e0(-438252942);
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == obj) {
                objM87133R2 = new C15218b(1, interfaceC28601c1);
                c28655q3.m87172p0(objM87133R2);
            }
            c28655q3.m87173q(false);
            modifierM3361f = AbstractC1092a.m3361f(modifierM3482a2, z24, strM92103Y2, (InterfaceC4339a) objM87133R2, 4);
            c28655q3.m87150e0(-438250017);
            c28655q3.m87150e0(431307837);
            zHasSystemFeature = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getPackageManager().hasSystemFeature("android.software.leanback");
            c28655q3.m87173q(false);
            if (zHasSystemFeature) {
                c28655q3.m87150e0(646346929);
                objM87133R4 = c28655q3.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = new C15218b(2, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R4);
                }
                z15 = false;
                c28655q3.m87173q(false);
                modifierM3361f = AbstractC37056f.m118997u(modifierM3361f, new C32034a(false, z24, (InterfaceC4339a) objM87133R4));
            } else {
                z15 = false;
            }
            c28655q3.m87173q(z15);
            c28655q3.m87173q(z15);
            if (z18 != 0) {
                str = "tiny";
            } else {
                str = "normal";
            }
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(modifierM3361f, "DropDown:".concat(str));
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, z15);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3599a2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
            if (z18) {
                c28655q3.m87150e0(-1437796417);
                j7 = j15;
                r10 = 1;
                m43613d(str2, j7, z19, c28655q3, i16 & 7168);
                i15 = 0;
                c28655q3.m87173q(false);
                c28655q = c28655q3;
            } else {
                r10 = 1;
                c28655q3.m87150e0(-1437465523);
                InterfaceC41211c interfaceC41211c2 = (InterfaceC41211c) interfaceC28601c1M83597t.getValue();
                if (((InterfaceC15361h1) interfaceC28601c1M83597t3.getValue()) != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                m43612c(interfaceC41211c2, z16, str2, j15, z19, c28655q3, (i16 << 6) & 458752);
                j7 = j15;
                C28655q c28655q7 = c28655q3;
                i15 = 0;
                c28655q7.m87173q(false);
                c28655q = c28655q7;
            }
            c28655q.m87173q(r10);
            C13821r1 c13821r1M92099U2 = AbstractC30060g.m92099U(i15, c28655q, r10);
            boolean zBooleanValue2 = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            c28655q.m87150e0(-438206829);
            objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == obj) {
                objM87133R3 = new C15218b(3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            C28655q c28655q8 = c28655q;
            AbstractC15002f0.m43105a(zBooleanValue2, (InterfaceC4339a) objM87133R3, AbstractC1102d.m3417n(AbstractC1102d.m3424u(f58036a, AbstractC1092a.m3358c(c2314t, AbstractC11673r.m31082k(c28655q).f37668a, c17916v0)), 0.0f, 0.0f, 0.0f, f58037b * 8.9f, 7), 0L, c13821r1M92099U2, null, AbstractC37817c.m121344e(1362403838, c28655q, new C15433v0(list, j7, controller, interfaceC28601c1M83597t2, interfaceC28601c1, c13821r1M92099U2)), c28655q8, 1572912, 40);
            C28655q c28655q9 = c28655q8;
            c28655q9.m87173q(r10);
            z17 = r10;
            c28655q2 = c28655q9;
        }
        C28677v1 c28677v1M87180u = c28655q2.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15418s0(controller, z4, modifier, z17, i13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43611b(String displayValue, boolean z4, long j7, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        boolean z13;
        AbstractC22676k.m65750j(displayValue, "displayValue");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-206606);
        int i14 = i13 | (c28655q.m87153g(displayValue) ? 4 : 2) | (c28655q.m87155h(z4) ? 32 : 16) | (c28655q.m87151f(j7) ? 256 : 128) | (c28655q.m87153g(modifier) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) | (c28655q.m87157i(interfaceC4339a) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK);
        if ((i14 & 9363) == 9362 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C2306l c2306l = C2299e.f9108K;
            C22949e c22949e = AbstractC22977m.f90650a;
            Modifier modifierM3417n = AbstractC1102d.m3417n(AbstractC1102d.m3409f(1.0f, modifier), 0.0f, f58037b, 0.0f, 0.0f, 13);
            c28655q.m87150e0(1058873179);
            boolean z14 = (57344 & i14) == 16384;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11699o(interfaceC4339a, 29);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            Modifier modifierM3361f = AbstractC1092a.m3361f(modifierM3417n, false, null, (InterfaceC4339a) objM87133R, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3361f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(0.8f, AbstractC1099a.m3398t(c2314t, 13, 0.0f, 0.0f, 0.0f, 14));
            c28655q.m87150e0(1166184563);
            long jM43091f = z4 ? ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f() : j7;
            c28655q.m87173q(false);
            AbstractC15011f9.m43114b(displayValue, modifierM3409f, jM43091f, 0L, null, z4 ? C28780r.f116542I : C28780r.f116539F, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 & 14) | 48, 0, 131032);
            c28655q = c28655q;
            c28655q.m87150e0(1166194174);
            if (z4) {
                z13 = false;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_checkmark, c28655q, 0), null, AbstractC1102d.m3411h(24, c2314t), ((C14970c1) c28655q.m87161k(AbstractC14981d1.f55997a)).m43091f(), c28655q, 432, 0);
            } else {
                z13 = false;
            }
            c28655q.m87173q(z13);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15428u0(displayValue, z4, j7, modifier, interfaceC4339a, i13);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m43612c(InterfaceC41211c interfaceC41211c, boolean z4, String str, long j7, boolean z13, Composer composer, int i13) {
        int i14;
        EnumC15343e1 enumC15343e1;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-27203176);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(interfaceC41211c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87151f(j7) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87155h(true) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((74899 & i14) == 74898 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            c28655q = c28655q2;
        } else {
            C11662g c11662g = (C11662g) c28655q2.m87161k(AbstractC11673r.f37718j);
            C29891y c29891y = new C29891y(6, str == null ? "" : str, 0L);
            c28655q2.m87150e0(-2109627734);
            C37816b c37816bM121344e = !z13 ? AbstractC37817c.m121344e(-1357937345, c28655q2, new C15438w0(j7, 0)) : null;
            c28655q2.m87173q(false);
            C22976l1 c22976l1M31070a = c11662g.m31070a();
            if (z4) {
                enumC15343e1 = EnumC15343e1.f57653x;
            } else {
                if (z4) {
                    throw new NoWhenBranchMatchedException();
                }
                enumC15343e1 = EnumC15343e1.f57652w;
            }
            EnumC15343e1 enumC15343e2 = enumC15343e1;
            c28655q2.m87150e0(-2109605675);
            long jM43088c = z4 ? ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43088c() : C17919x.f69636m;
            c28655q2.m87173q(false);
            int i15 = (i14 >> 6) & 112;
            int i16 = i14 >> 3;
            C15197y1 c15197y1M43588d = AbstractC15376j4.m43588d(enumC15343e2, j7, j7, 0L, jM43088c, c28655q2, i15 | (i16 & 896), 8);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            c28655q2.m87150e0(-2109632967);
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C15160u4(24);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q2.m87173q(false);
            AbstractC36259c.m115692h(c29891y, (Function1) objM87133R, modifierM3409f, false, null, AbstractC37817c.m121344e(1236608478, c28655q2, new C15443x0(interfaceC41211c, 0)), null, c37816bM121344e, z4, null, null, null, null, false, 0, 0, null, null, c15197y1M43588d, c22976l1M31070a, c28655q2, 1576368, (i16 & 14) | 48, 1044912);
            c28655q = c28655q2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15423t0(interfaceC41211c, z4, str, j7, z13, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m43613d(String str, long j7, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1262178129);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87151f(j7) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87155h(true) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC15011f9.m43114b(str, null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 & 14) | ((i14 << 3) & 896), 0, 131066);
            c28655q = c28655q;
            c28655q.m87150e0(-2061740406);
            if (!z4) {
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_chevron_down, c28655q, 0), null, AbstractC1102d.m3411h(24, c2314t), AbstractC11673r.m31082k(c28655q).f37674g, c28655q, 432, 0);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2478a3(i13, str, z4, j7);
        }
    }
}
