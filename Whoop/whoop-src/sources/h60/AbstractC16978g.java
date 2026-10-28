package h60;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm2.C3427b0;
import c31.AbstractC3926j;
import c31.C3927k;
import c31.EnumC3919c;
import c31.EnumC3920d;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import cp0.C10941a;
import f60.C14138c;
import f60.InterfaceC14136a;
import fc0.C14361e;
import gb1.AbstractC15673b0;
import ge0.C15728c;
import h00.C16513l0;
import h02.C16574h;
import k11.AbstractC22121d;
import k11.AbstractC22122e;
import k11.C22123f;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C22931l;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p132f0.C13821r1;
import p178gz.C16283a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.InterfaceC23004v;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: h60.g */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\f\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lf60/c$c;", "viewState", "Lkotlin/Function1;", "Lf60/a;", "Ll83/a0;", "onEvent", "p", "(Lf60/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lc31/c;", "", "y", "(Lc31/c;)Z", "v", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "imageUrl", "m", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "title", "subtitle", "k", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "access_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16978g {

    /* JADX INFO: renamed from: h60.g$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65143a;

        static {
            int[] iArr = new int[EnumC3919c.values().length];
            try {
                iArr[EnumC3919c.FILLED_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3919c.PROGRESS_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3919c.ERROR_BUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3919c.ERROR_MESSAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3919c.BACK_BUTTON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f65143a = iArr;
        }
    }

    /* JADX INFO: renamed from: k */
    private static final void m47772k(String str, String str2, Composer composer, int i13) {
        int i14;
        String str3;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1974817105);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, modifierM3409f2, c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, (i15 & 14) | 48, i17, 196088);
            str3 = str2;
            AbstractC30795n.m94707h(str3, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, ((i15 >> 3) & 14) | 48, i17, 196088);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            str3 = str2;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3427b0(str, str3, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47773l(String str, String str2, int i13, Composer composer, int i14) {
        m47772k(str, str2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m47774m(String str, Composer composer, int i13) {
        int i14;
        C10941a c10941a;
        C28677v1 c28677v1M87180u;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1332980919);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            if (str == null || AbstractC39414r.m125890i0(str)) {
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c10941a = new C10941a(str, i13, 5);
                }
            } else {
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(str, 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), null, AbstractC1102d.m3419p(25 * 4, C2314t.f9131w), C2299e.f9117z, C39102j.f168200b, 0.0f, null, c28655q, 28080, 96);
            }
            c28677v1M87180u.f115982d = c10941a;
        }
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c10941a = new C10941a(str, i13, 4);
            c28677v1M87180u.f115982d = c10941a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47775n(String str, int i13, Composer composer, int i14) {
        m47774m(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m47776o(String str, int i13, Composer composer, int i14) {
        m47774m(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:0x0190  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m47777p(C14138c.c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int i16;
        int iHashCode2;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1339036362);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C16513l0(22);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66720i = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)))));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66720i);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                m47783v(function3, c28655q, (i15 >> 3) & 14);
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                i16 = i15;
                AbstractC22953f.m66714a(new LayoutWeightElement(1.0f, true), null, false, AbstractC37817c.m121344e(-701524866, c28655q, new C22931l(28, viewState, function3)), c28655q, 3072, 6);
                float f13 = 8;
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 4 * f13, 2 * f13, 0.0f, 9);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C3927k c3927kM40254c = viewState.getProgressButton();
                if ((i16 & 14) != 4 || ((i16 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i16 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z16 || objM87133R == c28676v0) {
                    objM87133R = new C16574h(2, viewState, function3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC3926j.m11931e(c3927kM40254c, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function2 = function3;
            } else {
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, function2, i14, 15);
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16513l0(22);
                    c28655q.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66720i2 = AbstractC22953f.m66720i(AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)))));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66720i2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            m47783v(function3, c28655q, (i15 >> 3) & 14);
            if (1.0f > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            i16 = i15;
            AbstractC22953f.m66714a(new LayoutWeightElement(1.0f, true), null, false, AbstractC37817c.m121344e(-701524866, c28655q, new C22931l(28, viewState, function3)), c28655q, 3072, 6);
            float f14 = 8;
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, 4 * f14, 2 * f14, 0.0f, 9);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            C3927k c3927kM40254c2 = viewState.getProgressButton();
            if ((i16 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            if ((i16 & 112) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z16) {
                objM87133R = new C16574h(2, viewState, function3);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C16574h(2, viewState, function3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC3926j.m11931e(c3927kM40254c2, (Function1) objM87133R, c28655q, C3927k.f16020r, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, function2, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m47778q(InterfaceC14136a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m47779r(C14138c.c cVar, Function1 function1, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float fM3402c = ((C1101c) BoxWithConstraints).m3402c();
            C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3413j(AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14), fM3402c, 0.0f, 2)));
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(4 * f13, C2299e.f9109L), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m47774m(cVar.getImageUrl(), c28655q, 0);
            m47772k(cVar.getTitle(), cVar.getSubtitle(), c28655q, 0);
            C4092p2 c4092p2M40252a = cVar.getCallout();
            if (c4092p2M40252a == null) {
                c28655q.m87150e0(1030428088);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1030428089);
                AbstractC4106r2.m12647f(AbstractC1102d.m3409f(1.0f, c2314t), c4092p2M40252a, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                c28655q.m87173q(false);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22123f c22123fM40256e = cVar.getTile();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C15728c(function1, 19);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC22121d.m63331h(modifierM3409f, c22123fM40256e, (Function1) objM87133R, c28655q, (C22123f.f85827n << 3) | 6, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m47780s(Function1 function1, Object tileEvent) {
        AbstractC22676k.m65750j(tileEvent, "tileEvent");
        AbstractC22122e abstractC22122e = tileEvent instanceof AbstractC22122e ? (AbstractC22122e) tileEvent : null;
        String strMo63345a = abstractC22122e != null ? abstractC22122e.getButtonId() : null;
        if (AbstractC22676k.m65745e(strMo63345a, "reconfirm-labs-file-button")) {
            function1.invoke(InterfaceC14136a.h.f50845a);
        } else if (AbstractC22676k.m65745e(strMo63345a, "reconfirm-labs-image-button")) {
            function1.invoke(InterfaceC14136a.i.f50846a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m47781t(C14138c.c cVar, Function1 function1, EnumC3919c clickType) {
        AbstractC22676k.m65750j(clickType, "clickType");
        if (m47786y(clickType) && cVar.getProgressButton().getState() != EnumC3920d.LOADING) {
            function1.invoke(InterfaceC14136a.h.f50845a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m47782u(C14138c.c cVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47777p(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final void m47783v(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1260555474);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(""), null, AbstractC13673n.m38561h(C38072d.f163053a), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 8, C2314t.f9131w);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C16283a(function1, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3394p, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m47784w(Function1 function1) {
        function1.invoke(InterfaceC14136a.c.f50841a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m47785x(Function1 function1, int i13, Composer composer, int i14) {
        m47783v(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m47786y(EnumC3919c enumC3919c) {
        int i13 = a.f65143a[enumC3919c.ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return true;
        }
        if (i13 == 4 || i13 == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
