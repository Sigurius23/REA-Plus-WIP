package vy0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import e93.AbstractC12889b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p043c4.AbstractC3975r;
import p043c4.C3966j0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14983d3;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.EnumC22935a1;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p734sl0.C32632k2;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import re1.C31324k;
import te0.AbstractC33745d;
import v31.C35608d;
import vs2.C36478d;
import vv2.C36537c;
import vw0.C36541a;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: vy0.c0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aG\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a9\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lvy0/d0;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lvy0/y;", "Ll83/a0;", "onEvent", "m", "(Lvy0/d0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onDismiss", "z", "(Lvy0/d0;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lvy0/z;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lvy0/z;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lt0/i;", "a", "Lt0/i;", "fabMenuShape", "b", "Landroidx/compose/ui/Modifier;", "getFabMenuBackgroundModifier", "()Landroidx/compose/ui/Modifier;", "fabMenuBackgroundModifier", "", "c", "Ljava/util/List;", "previewItems", "", "expanded", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36568c0 {

    /* JADX INFO: renamed from: a */
    private static final C33252i f156606a;

    /* JADX INFO: renamed from: b */
    private static final Modifier f156607b;

    /* JADX INFO: renamed from: c */
    private static final List<C36598z> f156608c;

    static {
        float f13 = 4;
        C33252i c33252iM105489e = AbstractC33253j.m105489e(5 * f13);
        f156606a = c33252iM105489e;
        float f14 = 6 * f13;
        long j7 = C17919x.f69625b;
        f156607b = AbstractC1092a.m3357b(AbstractC12889b.m36262a0(C2314t.f9131w, f14, c33252iM105489e, false, C17919x.m51541c(0.2f, j7), C17919x.m51541c(0.2f, j7), 4), AbstractC15673b0.m44012U(), c33252iM105489e, 0.0f, 4);
        EnumC16313m0 enumC16313m0 = EnumC16313m0.ADD;
        int i13 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        f156608c = AbstractC37056f.m118959K(new C36598z("Add Period", null, enumC16313m0, 2, null), new C36598z("Add Ovulation", null, enumC16313m0, i13, defaultConstructorMarker), new C36598z("Add Symptoms & Behaviors", null, enumC16313m0, i13, defaultConstructorMarker));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m117293A() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m117294B(AbstractC36597y it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m117295C(C36570d0 c36570d0, Modifier modifier, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117321z(c36570d0, modifier, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00da  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:63:0x0109  */
    /* JADX WARN: Code duplicated, block: B:66:0x011f  */
    /* JADX WARN: Code duplicated, block: B:67:0x012d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0167  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m117308m(C36570d0 state, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        C36570d0 c36570d0;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        int iMo724F;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        long jM95624D;
        Function1 function5;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1835160892);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i18 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C36478d(23);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function4 = (Function1) objM87133R4;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    float f13 = 8;
                    float f14 = 4;
                    float f15 = f13 * f14;
                    float f16 = 1 * f13;
                    iMo724F = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(f15 + f16);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
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
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36564a0(0, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                    Modifier modifierM3419p = AbstractC1102d.m3419p(f15, c2314t);
                    if (m117310o(interfaceC28601c1)) {
                        c28655q.m87150e0(-171810767);
                        jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                    } else {
                        c28655q.m87150e0(-171809772);
                        jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                    }
                    function5 = function4;
                    AbstractC14983d3.m43104a(interfaceC4339a, AbstractC1099a.m3394p(f16, AbstractC31061c.m95629e(modifierM3419p, 3, f14, jM95624D)), false, AbstractC37817c.m121344e(1915745894, c28655q, new C36587o(interfaceC28601c1, 3)), c28655q, 24582, 12);
                    if (m117310o(interfaceC28601c1)) {
                        c28655q.m87150e0(-1030448054);
                        C2307m c2307m = C2299e.f9116y;
                        long j7 = (((long) iMo724F) & 4294967295L) | (((long) 0) << 32);
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C36564a0(1, interfaceC28601c1);
                            c28655q.m87172p0(objM87133R3);
                        }
                        c36570d0 = state;
                        AbstractC3975r.m12005b(c2307m, j7, (InterfaceC4339a) objM87133R3, new C3966j0(true, 14), AbstractC37817c.m121344e(-114343646, c28655q, new C36566b0(c36570d0, function5, interfaceC28601c1, 0)), c28655q, 28038, 0);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        c36570d0 = state;
                        c28655q.m87150e0(-1030004072);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    function3 = function5;
                    modifier3 = modifier4;
                } else {
                    c36570d0 = state;
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C35608d(i13, i14, 17, modifier3, c36570d0, function3);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36478d(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                float f17 = 8;
                float f18 = 4;
                float f19 = f17 * f18;
                float f110 = 1 * f17;
                iMo724F = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(f19 + f110);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier4);
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
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36564a0(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f19, c2314t);
                if (m117310o(interfaceC28601c1)) {
                    c28655q.m87150e0(-171810767);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-171809772);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                function5 = function4;
                AbstractC14983d3.m43104a(interfaceC4339a2, AbstractC1099a.m3394p(f110, AbstractC31061c.m95629e(modifierM3419p2, 3, f18, jM95624D)), false, AbstractC37817c.m121344e(1915745894, c28655q, new C36587o(interfaceC28601c1, 3)), c28655q, 24582, 12);
                if (m117310o(interfaceC28601c1)) {
                    c28655q.m87150e0(-1030448054);
                    C2307m c2307m2 = C2299e.f9116y;
                    long j13 = (((long) iMo724F) & 4294967295L) | (((long) 0) << 32);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36564a0(1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c36570d0 = state;
                    AbstractC3975r.m12005b(c2307m2, j13, (InterfaceC4339a) objM87133R3, new C3966j0(true, 14), AbstractC37817c.m121344e(-114343646, c28655q, new C36566b0(c36570d0, function5, interfaceC28601c1, 0)), c28655q, 28038, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c36570d0 = state;
                    c28655q.m87150e0(-1030004072);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c36570d0 = state;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(i13, i14, 17, modifier3, c36570d0, function3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C36478d(23);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function4 = (Function1) objM87133R4;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                float f111 = 8;
                float f112 = 4;
                float f113 = f111 * f112;
                float f114 = 1 * f111;
                iMo724F = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(f113 + f114);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifier4);
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
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36564a0(0, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                Modifier modifierM3419p3 = AbstractC1102d.m3419p(f113, c2314t);
                if (m117310o(interfaceC28601c1)) {
                    c28655q.m87150e0(-171810767);
                    jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                } else {
                    c28655q.m87150e0(-171809772);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
                }
                function5 = function4;
                AbstractC14983d3.m43104a(interfaceC4339a3, AbstractC1099a.m3394p(f114, AbstractC31061c.m95629e(modifierM3419p3, 3, f112, jM95624D)), false, AbstractC37817c.m121344e(1915745894, c28655q, new C36587o(interfaceC28601c1, 3)), c28655q, 24582, 12);
                if (m117310o(interfaceC28601c1)) {
                    c28655q.m87150e0(-1030448054);
                    C2307m c2307m3 = C2299e.f9116y;
                    long j14 = (((long) iMo724F) & 4294967295L) | (((long) 0) << 32);
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C36564a0(1, interfaceC28601c1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    c36570d0 = state;
                    AbstractC3975r.m12005b(c2307m3, j14, (InterfaceC4339a) objM87133R3, new C3966j0(true, 14), AbstractC37817c.m121344e(-114343646, c28655q, new C36566b0(c36570d0, function5, interfaceC28601c1, 0)), c28655q, 28038, 0);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c36570d0 = state;
                    c28655q.m87150e0(-1030004072);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                function3 = function5;
                modifier3 = modifier4;
            } else {
                c36570d0 = state;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35608d(i13, i14, 17, modifier3, c36570d0, function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C36478d(23);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = (Function1) objM87133R4;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            float f115 = 8;
            float f116 = 4;
            float f117 = f115 * f116;
            float f118 = 1 * f115;
            iMo724F = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo724F(f117 + f118);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifier4);
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
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C36564a0(0, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f117, c2314t);
            if (m117310o(interfaceC28601c1)) {
                c28655q.m87150e0(-171810767);
                jM95624D = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-171809772);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            function5 = function4;
            AbstractC14983d3.m43104a(interfaceC4339a4, AbstractC1099a.m3394p(f118, AbstractC31061c.m95629e(modifierM3419p4, 3, f116, jM95624D)), false, AbstractC37817c.m121344e(1915745894, c28655q, new C36587o(interfaceC28601c1, 3)), c28655q, 24582, 12);
            if (m117310o(interfaceC28601c1)) {
                c28655q.m87150e0(-1030448054);
                C2307m c2307m4 = C2299e.f9116y;
                long j15 = (((long) iMo724F) & 4294967295L) | (((long) 0) << 32);
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C36564a0(1, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R3);
                }
                c36570d0 = state;
                AbstractC3975r.m12005b(c2307m4, j15, (InterfaceC4339a) objM87133R3, new C3966j0(true, 14), AbstractC37817c.m121344e(-114343646, c28655q, new C36566b0(c36570d0, function5, interfaceC28601c1, 0)), c28655q, 28038, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c36570d0 = state;
                c28655q.m87150e0(-1030004072);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function3 = function5;
            modifier3 = modifier4;
        } else {
            c36570d0 = state;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35608d(i13, i14, 17, modifier3, c36570d0, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m117309n(AbstractC36597y it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m117310o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m117311p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m117312q(InterfaceC28601c1 interfaceC28601c1) {
        m117311p(interfaceC28601c1, !m117310o(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m117313r(InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        String strM92103Y;
        long jM31986e;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(m117310o(interfaceC28601c1) ? AbstractC39383f.m125595a(C38072d.f163053a) : AbstractC25012a.m73365A(C38072d.f163053a), c28655q, 0);
            if (m117310o(interfaceC28601c1)) {
                c28655q.m87150e0(460737329);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62332h1);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(460817650);
                strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62336i1);
                c28655q.m87173q(false);
            }
            String str = strM92103Y;
            if (m117310o(interfaceC28601c1)) {
                c28655q.m87150e0(-1509151440);
                jM31986e = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(-1509150352);
                jM31986e = AbstractC11895b.m31986e(C38072d.f163053a, c28655q, 6, false);
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I, str, null, jM31986e, c28655q, 0, 4);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m117314s(InterfaceC28601c1 interfaceC28601c1) {
        m117311p(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m117315t(C36570d0 c36570d0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C36564a0(2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            m117321z(c36570d0, null, (InterfaceC4339a) objM87133R, function1, c28655q, 384, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117316u(InterfaceC28601c1 interfaceC28601c1) {
        m117311p(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117317v(C36570d0 c36570d0, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m117308m(c36570d0, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final void m117318w(C36598z c36598z, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-82289763);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c36598z) : c28655q.m87157i(c36598z) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean z4 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(c36598z))) | ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31324k(interfaceC4339a, function1, c36598z, 17);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3395q = AbstractC1099a.m3395q(modifierM3362g, 2 * f13, f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            float f15 = 4;
            Modifier modifierM3419p = AbstractC1102d.m3419p(f15 * f15, c2314t);
            AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(c36598z.getIcon().toWhoopIcon(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            String upperCase = c36598z.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(upperCase, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getBtS(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(c36598z, interfaceC4339a, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m117319x(InterfaceC4339a interfaceC4339a, Function1 function1, C36598z c36598z) {
        interfaceC4339a.invoke();
        function1.invoke(new AbstractC36597y.a(c36598z.getInteraction()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m117320y(C36598z c36598z, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m117318w(c36598z, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b  */
    /* JADX WARN: Code duplicated, block: B:79:0x0166  */
    /* JADX WARN: Code duplicated, block: B:80:0x0171  */
    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: z */
    public static final void m117321z(C36570d0 state, Modifier modifier, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        int i17;
        Function1 function2;
        int i18;
        boolean z4;
        Modifier modifier3;
        InterfaceC4339a interfaceC4339a3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        C28676v0 c28676v0;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i19;
        int i24;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1049146628);
        int i25 = (i13 & 6) == 0 ? (c28655q.m87157i(state) ? 4 : 2) | i13 : i13;
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i25 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i25 |= i16;
                }
                i17 = i14 & 8;
                if (i17 != 0) {
                    if ((i13 & 3072) == 0) {
                        function2 = function1;
                        if (c28655q.m87157i(function2)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i25 |= i18;
                    }
                    if ((i25 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i25 & 1, z4)) {
                        c2314t = C2314t.f9131w;
                        if (i26 != 0) {
                            modifier2 = c2314t;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i15 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C36541a(21);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                        }
                        if (i17 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C36478d(24);
                                c28655q.m87172p0(objM87133R);
                            }
                            function2 = (Function1) objM87133R;
                        }
                        f13 = 1 * 8;
                        Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
                        c28655q.m87150e0(-758007227);
                        i19 = 0;
                        for (Object obj : state.m117322a()) {
                            i24 = i19 + 1;
                            if (i19 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            int i27 = i25 >> 3;
                            m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i27 & 112) | (i27 & 896));
                            if (i19 < state.m117322a().size() - 1) {
                                AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(934896755);
                                c28655q.m87173q(false);
                            }
                            i19 = i24;
                        }
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                    } else {
                        c28655q.m87138X();
                    }
                    modifier3 = modifier2;
                    interfaceC4339a3 = interfaceC4339a2;
                    function3 = function2;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
                    }
                }
                i25 |= 3072;
                function2 = function1;
                if ((i25 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i25 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36541a(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    f13 = 1 * 8;
                    Modifier modifierM3395q2 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q2);
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
                    c28655q.m87150e0(-758007227);
                    i19 = 0;
                    while (r3.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        int i28 = i25 >> 3;
                        m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i28 & 112) | (i28 & 896));
                        if (i19 < state.m117322a().size() - 1) {
                            AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(934896755);
                            c28655q.m87173q(false);
                        }
                        i19 = i24;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
                }
            }
            i25 |= 384;
            interfaceC4339a2 = interfaceC4339a;
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i25 |= i18;
                }
                if ((i25 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i25 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36541a(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    f13 = 1 * 8;
                    Modifier modifierM3395q3 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3395q3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    c28655q.m87150e0(-758007227);
                    i19 = 0;
                    while (r3.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        int i29 = i25 >> 3;
                        m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i29 & 112) | (i29 & 896));
                        if (i19 < state.m117322a().size() - 1) {
                            AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(934896755);
                            c28655q.m87173q(false);
                        }
                        i19 = i24;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
                }
            }
            i25 |= 3072;
            function2 = function1;
            if ((i25 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i25 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36541a(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                f13 = 1 * 8;
                Modifier modifierM3395q4 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3395q4);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a4);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                c28655q.m87150e0(-758007227);
                i19 = 0;
                while (r3.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    int i210 = i25 >> 3;
                    m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i210 & 112) | (i210 & 896));
                    if (i19 < state.m117322a().size() - 1) {
                        AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(934896755);
                        c28655q.m87173q(false);
                    }
                    i19 = i24;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
            }
        }
        i25 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i25 |= i16;
            }
            i17 = i14 & 8;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i25 |= i18;
                }
                if ((i25 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i25 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i26 != 0) {
                        modifier2 = c2314t;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36541a(21);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                    }
                    if (i17 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C36478d(24);
                            c28655q.m87172p0(objM87133R);
                        }
                        function2 = (Function1) objM87133R;
                    }
                    f13 = 1 * 8;
                    Modifier modifierM3395q5 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3395q5);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                    c28655q.m87150e0(-758007227);
                    i19 = 0;
                    while (r3.hasNext()) {
                        i24 = i19 + 1;
                        if (i19 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        int i211 = i25 >> 3;
                        m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i211 & 112) | (i211 & 896));
                        if (i19 < state.m117322a().size() - 1) {
                            AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(934896755);
                            c28655q.m87173q(false);
                        }
                        i19 = i24;
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                modifier3 = modifier2;
                interfaceC4339a3 = interfaceC4339a2;
                function3 = function2;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
                }
            }
            i25 |= 3072;
            function2 = function1;
            if ((i25 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i25 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36541a(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                f13 = 1 * 8;
                Modifier modifierM3395q6 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3395q6);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                c28655q.m87150e0(-758007227);
                i19 = 0;
                while (r3.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    int i212 = i25 >> 3;
                    m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i212 & 112) | (i212 & 896));
                    if (i19 < state.m117322a().size() - 1) {
                        AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(934896755);
                        c28655q.m87173q(false);
                    }
                    i19 = i24;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
            }
        }
        i25 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        i17 = i14 & 8;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i25 |= i18;
            }
            if ((i25 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i25 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i26 != 0) {
                    modifier2 = c2314t;
                }
                c28676v0 = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36541a(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C36478d(24);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                f13 = 1 * 8;
                Modifier modifierM3395q7 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3395q7);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a7);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                c28655q.m87150e0(-758007227);
                i19 = 0;
                while (r3.hasNext()) {
                    i24 = i19 + 1;
                    if (i19 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    int i213 = i25 >> 3;
                    m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i213 & 112) | (i213 & 896));
                    if (i19 < state.m117322a().size() - 1) {
                        AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(934896755);
                        c28655q.m87173q(false);
                    }
                    i19 = i24;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            modifier3 = modifier2;
            interfaceC4339a3 = interfaceC4339a2;
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
            }
        }
        i25 |= 3072;
        function2 = function1;
        if ((i25 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i25 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i26 != 0) {
                modifier2 = c2314t;
            }
            c28676v0 = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36541a(21);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C36478d(24);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            }
            f13 = 1 * 8;
            Modifier modifierM3395q8 = AbstractC1099a.m3395q(AbstractC1099a.m3399u(AbstractC1102d.m3425v(modifier2, 48 * 4, 0.0f, 2), EnumC22935a1.f90538x).mo3471e(f156607b), f13, f13);
            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3395q8);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a8);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
            c28655q.m87150e0(-758007227);
            i19 = 0;
            while (r3.hasNext()) {
                i24 = i19 + 1;
                if (i19 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                int i214 = i25 >> 3;
                m117318w((C36598z) obj, interfaceC4339a2, function2, c28655q, GenericInteraction.$stable | (i214 & 112) | (i214 & 896));
                if (i19 < state.m117322a().size() - 1) {
                    AbstractC33745d.m106667z(c28655q, 934820836, c2314t, f13, c28655q);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(934896755);
                    c28655q.m87173q(false);
                }
                i19 = i24;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        modifier3 = modifier2;
        interfaceC4339a3 = interfaceC4339a2;
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(state, modifier3, interfaceC4339a3, function3, i13, i14, 24);
        }
    }
}
