package le0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import be1.C3172f;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import ie0.AbstractC18441a;
import io.sentry.config.AbstractC20301a;
import io2.C20769k0;
import io2.C20778p;
import java.util.List;
import je0.AbstractC21620c;
import ky2.C22892a;
import l83.C23454a0;
import lc0.C23825g;
import md0.AbstractC25448c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: le0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001aS\u0010\u0012\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lje0/c;", "viewState", "Lkotlin/Function1;", "Lie0/a;", "Ll83/a0;", "onNavigationEvent", "s", "(Lje0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "subtitle", "", "Lm91/u;", "items", "Lc31/k;", "button", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lc31/k;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "p", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23873b {
    /* JADX WARN: Code duplicated, block: B:149:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:150:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c9  */
    /* JADX INFO: renamed from: j */
    private static final void m70134j(String str, String str2, List<? extends InterfaceC25312u> list, C3927k c3927k, C9598e c9598e, Function1 function1, Composer composer, int i13) {
        C2314t c2314t;
        Modifier modifierMo3471e;
        C2314t c2314t2;
        C28676v0 c28676v0;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C3927k c3927k2 = c3927k;
        C9598e c9598e2 = c9598e;
        Function1 function2 = function1;
        C2307m c2307m = C2299e.f9114w;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1247727643);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(str) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(list) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= (i13 & 4096) == 0 ? c28655q.m87153g(c3927k2) : c28655q.m87157i(c3927k2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (i13 & 32768) == 0 ? c28655q.m87153g(c9598e2) : c28655q.m87157i(c9598e2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(function2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 74899) != 74898)) {
            int i16 = i15 & 458752;
            boolean z16 = i16 == 131072;
            Object objM87133R2 = c28655q.m87133R();
            boolean z17 = z16;
            C28676v0 c28676v1 = C28635l.f115821a;
            if (z17 || objM87133R2 == c28676v1) {
                objM87133R2 = new C22892a(function2, 19);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, false, c28655q, 0, 1);
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t3)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
            float f13 = 8;
            float f14 = 4;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), ((float) 1.5d) * f14, 2 * f13, ((float) 2.5d) * f14, 0.0f, 8);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3419p = AbstractC1102d.m3419p(12 * f14, c2314t3);
            C27270o c27270o = new C27270o(AbstractC27274q.a.f109136f, EnumC16313m0.CARET_BACKWARD.toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E);
            boolean z18 = i16 == 131072;
            Object objM87133R3 = c28655q.m87133R();
            if (z18 || objM87133R3 == c28676v1) {
                objM87133R3 = new C22892a(function2, 20);
                c28655q.m87172p0(objM87133R3);
            }
            C28676v0 c28676v2 = c28676v1;
            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3419p, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 384, 8);
            c28655q.m87173q(true);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
            C2307m c2307m2 = C2299e.f9104G;
            C1100b c1100b = C1100b.f4583a;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c1100b.mo3400a(modifierM3409f, c2307m2), 3 * f13, 0.0f, 2);
            List<? extends InterfaceC25312u> list2 = list;
            if (list2.isEmpty()) {
                c2314t = c2314t3;
                modifierMo3471e = modifierM3396r.mo3471e(AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 24 * f13, 7));
            } else {
                modifierMo3471e = modifierM3396r.mo3471e(AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, 0.0f, 18 * f13, 7));
                c2314t = c2314t3;
            }
            float f15 = 6;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f15);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 54);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i18 = C2886a.f11498d << 18;
            C2314t c2314t4 = c2314t;
            AbstractC30795n.m94707h(str, AbstractC1102d.m3409f(1.0f, c2314t), jM125430y, 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, (i15 & 14) | 48, i18, 196088);
            AbstractC30795n.m94707h(str2, AbstractC1102d.m3409f(1.0f, c2314t4), c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, ((i15 >> 3) & 14) | 48, i18, 196088);
            c28655q = c28655q;
            if (list2.isEmpty()) {
                c2314t2 = c2314t4;
                c28676v0 = c28676v2;
                z4 = false;
                z13 = true;
                c28655q.m87150e0(-106614877);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-107152076);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t4, 0.0f, 24, 0.0f, 0.0f, 13);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                int iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c2314t2 = c2314t4;
                    c28655q.m87163l(c0213j);
                } else {
                    c2314t2 = c2314t4;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                c28655q.m87150e0(-1629049815);
                for (InterfaceC25312u interfaceC25312u : list) {
                    C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
                    Object objM87133R4 = c28655q.m87133R();
                    C28676v0 c28676v3 = c28676v2;
                    if (objM87133R4 == c28676v3) {
                        objM87133R4 = new C23825g(4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, null, (Function1) objM87133R4, c28655q, (C25307p.f99300b << 3) | 3072, 4);
                    AbstractC11266d.m30469w(f14, f14, c2314t2, c28655q);
                    c28676v2 = c28676v3;
                }
                c28676v0 = c28676v2;
                z4 = false;
                z13 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            c28655q.m87173q(z13);
            float f16 = f15 * f13;
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t2, C2299e.f9106I), 0.0f, 0.0f, f16, f16, 3);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, z4);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
            if ((i15 & 57344) != 16384) {
                c9598e2 = c9598e;
                boolean z19 = (i15 & 32768) != 0 && c28655q.m87157i(c9598e2);
                if (i16 == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z19;
                objM87133R = c28655q.m87133R();
                if (!z15 || objM87133R == c28676v0) {
                    function2 = function1;
                    objM87133R = new C20778p(c9598e2, function2, 2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function2 = function1;
                }
                c3927k2 = c3927k;
                AbstractC3926j.m11931e(c3927k2, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 9) & 14), 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
            } else {
                c9598e2 = c9598e;
            }
            if (i16 == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z14 | z19;
            objM87133R = c28655q.m87133R();
            if (z15) {
                function2 = function1;
                objM87133R = new C20778p(c9598e2, function2, 2);
                c28655q.m87172p0(objM87133R);
            } else {
                function2 = function1;
                objM87133R = new C20778p(c9598e2, function2, 2);
                c28655q.m87172p0(objM87133R);
            }
            c3927k2 = c3927k;
            AbstractC3926j.m11931e(c3927k2, (Function1) objM87133R, c28655q, C3927k.f16020r | ((i15 >> 9) & 14), 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f((Object) str, (Object) str2, (Object) list, (Object) c3927k2, (Object) c9598e2, function2, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m70135k(Function1 function1) {
        function1.invoke(AbstractC18441a.a.f71799a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m70136l(Function1 function1) {
        function1.invoke(AbstractC18441a.a.f71799a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m70137m(Object event) {
        AbstractC22676k.m65750j(event, "event");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m70138n(C9598e c9598e, Function1 function1, EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        if (c9598e != null) {
            function1.invoke(new AbstractC18441a.c(c9598e));
        } else {
            function1.invoke(AbstractC18441a.b.f71800a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70139o(String str, String str2, List list, C3927k c3927k, C9598e c9598e, Function1 function1, int i13, Composer composer, int i14) {
        m70134j(str, str2, list, c3927k, c9598e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private static final void m70140p(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1126886439);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, null, i15, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource textResourceM21267a = AbstractC8693b.m21267a();
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C22892a(function1, 18);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 4068);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70141q(Function1 function1) {
        function1.invoke(AbstractC18441a.a.f71799a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70142r(Function1 function1, int i13, Composer composer, int i14) {
        m70140p(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:45:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0124  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x0162  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final void m70143s(AbstractC21620c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        AbstractC21620c abstractC21620c;
        C28677v1 c28677v1M87180u;
        Function1 function3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-805934318);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87153g(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(3);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function2;
                }
                AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_step", c28655q, (i15 & 14) | 48);
                if (viewState instanceof AbstractC21620c.b) {
                    c28655q.m87150e0(-721775655);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    abstractC21620c = viewState;
                    function2 = function3;
                } else {
                    abstractC21620c = viewState;
                    function2 = function3;
                    if (abstractC21620c instanceof AbstractC21620c.a) {
                        c28655q.m87150e0(-721398695);
                        m70140p(function2, c28655q, (i15 >> 3) & 14);
                        c28655q.m87173q(false);
                    } else {
                        if (abstractC21620c instanceof AbstractC21620c.c) {
                            throw AbstractC11895b.m32003v(-1408757900, c28655q, false);
                        }
                        c28655q.m87150e0(-721258017);
                        AbstractC21620c.c cVar = (AbstractC21620c.c) abstractC21620c;
                        m70134j(cVar.getTitle(), cVar.getSubtitle(), cVar.m60805c(), cVar.getButton(), cVar.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String(), function2, c28655q, (C3927k.f16020r << 9) | (C9598e.f28134d << 12) | ((i15 << 12) & 458752));
                        function2 = function2;
                        c28655q.m87173q(false);
                    }
                }
            } else {
                abstractC21620c = viewState;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C20769k0(abstractC21620c, i13, function2, i14, 21);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C23825g(3);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function2;
            }
            AbstractC14874j.m42904c(viewState, "advanced_labs_scheduling_step", c28655q, (i15 & 14) | 48);
            if (viewState instanceof AbstractC21620c.b) {
                c28655q.m87150e0(-721775655);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
                abstractC21620c = viewState;
                function2 = function3;
            } else {
                abstractC21620c = viewState;
                function2 = function3;
                if (abstractC21620c instanceof AbstractC21620c.a) {
                    c28655q.m87150e0(-721398695);
                    m70140p(function2, c28655q, (i15 >> 3) & 14);
                    c28655q.m87173q(false);
                } else {
                    if (abstractC21620c instanceof AbstractC21620c.c) {
                        throw AbstractC11895b.m32003v(-1408757900, c28655q, false);
                    }
                    c28655q.m87150e0(-721258017);
                    AbstractC21620c.c cVar2 = (AbstractC21620c.c) abstractC21620c;
                    m70134j(cVar2.getTitle(), cVar2.getSubtitle(), cVar2.m60805c(), cVar2.getButton(), cVar2.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String(), function2, c28655q, (C3927k.f16020r << 9) | (C9598e.f28134d << 12) | ((i15 << 12) & 458752));
                    function2 = function2;
                    c28655q.m87173q(false);
                }
            }
        } else {
            abstractC21620c = viewState;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20769k0(abstractC21620c, i13, function2, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70144t(AbstractC18441a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m70145u(AbstractC21620c abstractC21620c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70143s(abstractC21620c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
