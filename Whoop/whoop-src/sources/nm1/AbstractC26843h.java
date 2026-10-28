package nm1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bz0.C3711a;
import c41.C4004c5;
import c51.C4231h;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import l83.C23465k;
import md0.C25447b;
import o01.AbstractC27348d;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p714k80.C22275d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nm1.h */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\b*\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lnm1/i;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Lnm1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "Li2/t;", "brush", "l", "(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;", "Lnm1/f;", "style", "n", "(Landroidx/compose/ui/Modifier;Lnm1/f;)Landroidx/compose/ui/Modifier;", "o", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26843h {

    /* JADX INFO: renamed from: nm1.h$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f107116a;

        static {
            int[] iArr = new int[EnumC26841f.values().length];
            try {
                iArr[EnumC26841f.GENERAL_CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26841f.WAKE_UP_REPORT_OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26841f.WIND_DOWN_REPORT_OPENED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC26841f.WAKE_UP_REPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC26841f.WIND_DOWN_REPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f107116a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029f  */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x019c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:81:0x022b  */
    /* JADX WARN: Code duplicated, block: B:82:0x022d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0234  */
    /* JADX INFO: renamed from: g */
    public static final void m80107g(C26844i viewState, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function5;
        boolean z16;
        boolean z17;
        C38072d c38072d;
        int i16;
        boolean z18;
        Object objM87133R2;
        int i17;
        long jM95627c;
        boolean z19;
        long jM53358D;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1080782397);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
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
                if (i18 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C25447b(29);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z14 | z13;
                objM87133R = c28655q.m87133R();
                if (z15 || objM87133R == c28676v0) {
                    objM87133R = new C22275d(4, function4, viewState);
                    c28655q.m87172p0(objM87133R);
                }
                float f13 = 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * f13, m80114n(AbstractC1092a.m3362g(modifierM3407d, false, null, null, (InterfaceC4339a) objM87133R, 15), viewState.getStyle()));
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(1, f13, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                if (viewState.getLeftIcon() != null || viewState.getStyle() == EnumC26841f.GENERAL_CHAT) {
                    function5 = function4;
                    z16 = false;
                    c28655q.m87150e0(-557475296);
                    AbstractC27348d.m82519c(null, c28655q, 0, 1);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-557797448);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(5 * 4, c2314t);
                    C27430e c27430eM107874S = AbstractC34132o.m107874S(viewState.getLeftIcon().toWhoopIcon(), c28655q, 6);
                    if (viewState.getGradient()) {
                        c28655q.m87150e0(120561691);
                        z19 = false;
                        jM53358D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    } else {
                        z19 = false;
                        c28655q.m87150e0(120562776);
                        jM53358D = AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                    }
                    function5 = function4;
                    z16 = z19;
                    AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, jM53358D, c28655q, 432, 0);
                    c28655q.m87173q(z16);
                }
                if (((double) r4) > 0.0d) {
                    z17 = true;
                } else {
                    z17 = z16;
                }
                if (!z17) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                float f14 = 4;
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f14 * f14, c2314t);
                if (viewState.getStyle() == EnumC26841f.WIND_DOWN_REPORT) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C26842g(0);
                    c28655q.m87172p0(objM87133R2);
                }
                Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3419p2, z18, (Function1) objM87133R2);
                C27430e c27430eM107874S2 = AbstractC34132o.m107874S(viewState.getRightIcon().toWhoopIcon(), c28655q, 6);
                i17 = a.f107116a[viewState.getStyle().ordinal()];
                if (i17 != 1 || i17 == 2 || i17 == 3) {
                    jM95627c = AbstractC31061c.m95627c(c28655q, 120594072, c38072d, c28655q, i16);
                    c28655q.m87173q(false);
                } else if (i17 == 4) {
                    c28655q.m87150e0(120596290);
                    c28655q.m87173q(false);
                    jM95627c = AbstractC17918w0.m51517e(4293906843L);
                } else {
                    if (i17 != 5) {
                        throw AbstractC11895b.m32003v(120587036, c28655q, false);
                    }
                    c28655q.m87150e0(120599418);
                    jM95627c = c38072d.m121949b(c28655q, i16).getCoachBlue();
                    c28655q.m87173q(false);
                }
                AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM44099b, jM95627c, c28655q, 48, 0);
                c28655q.m87173q(true);
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3711a(viewState, i13, function3, i14, 4);
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
            if (i18 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C25447b(29);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((i15 & 14) != 4) {
                z14 = true;
            } else {
                z14 = true;
            }
            z15 = z14 | z13;
            objM87133R = c28655q.m87133R();
            if (z15) {
                objM87133R = new C22275d(4, function4, viewState);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C22275d(4, function4, viewState);
                c28655q.m87172p0(objM87133R);
            }
            float f15 = 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) 1.5d) * f15, m80114n(AbstractC1092a.m3362g(modifierM3407d2, false, null, null, (InterfaceC4339a) objM87133R, 15), viewState.getStyle()));
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(1, f15, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            if (viewState.getLeftIcon() != null) {
                function5 = function4;
                z16 = false;
                c28655q.m87150e0(-557475296);
                AbstractC27348d.m82519c(null, c28655q, 0, 1);
                c28655q.m87173q(false);
            } else {
                function5 = function4;
                z16 = false;
                c28655q.m87150e0(-557475296);
                AbstractC27348d.m82519c(null, c28655q, 0, 1);
                c28655q.m87173q(false);
            }
            if (((double) r4) > 0.0d) {
                z17 = true;
            } else {
                z17 = z16;
            }
            if (!z17) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q, TextResource.$stable);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            float f16 = 4;
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f16 * f16, c2314t2);
            if (viewState.getStyle() == EnumC26841f.WIND_DOWN_REPORT) {
                z18 = true;
            } else {
                z18 = false;
            }
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C26842g(0);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM44099b2 = AbstractC15676d.m44099b(modifierM3419p3, z18, (Function1) objM87133R2);
            C27430e c27430eM107874S3 = AbstractC34132o.m107874S(viewState.getRightIcon().toWhoopIcon(), c28655q, 6);
            i17 = a.f107116a[viewState.getStyle().ordinal()];
            if (i17 != 1) {
                jM95627c = AbstractC31061c.m95627c(c28655q, 120594072, c38072d, c28655q, i16);
                c28655q.m87173q(false);
            } else {
                jM95627c = AbstractC31061c.m95627c(c28655q, 120594072, c38072d, c28655q, i16);
                c28655q.m87173q(false);
            }
            AbstractC15005f3.m43108b(c27430eM107874S3, null, modifierM44099b2, jM95627c, c28655q, 48, 0);
            c28655q.m87173q(true);
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(viewState, i13, function3, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m80108h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m80109i(Function1 function1, C26844i c26844i) {
        function1.invoke(c26844i.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final Modifier m80110j(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m80112l(C2314t.f9131w, AbstractC15673b0.m43972A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m80111k(C26844i c26844i, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m80107g(c26844i, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final Modifier m80112l(Modifier modifier, AbstractC17911t abstractC17911t) {
        return modifier.mo3471e(AbstractC1125a.m3480c(AbstractC1127a.m3488c(C2314t.f9131w, 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0.0f, null, null, 0, 524283), new C4231h(abstractC17911t, 7)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m80113m(AbstractC17911t abstractC17911t, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        ((C0238p0) drawWithContent).m728a();
        InterfaceC22131e.m63385u(drawWithContent, abstractC17911t, 0L, 0L, 0.0f, null, 9, 62);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final Modifier m80114n(Modifier modifier, EnumC26841f enumC26841f) {
        Modifier modifierM3357b;
        int i13 = a.f107116a[enumC26841f.ordinal()];
        C2314t c2314t = C2314t.f9131w;
        if (i13 != 4) {
            modifierM3357b = i13 != 5 ? m80115o(modifier) : AbstractC1092a.m3356a(0.2f, c2314t, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * 4));
        } else {
            modifierM3357b = AbstractC1092a.m3357b(c2314t, C17909s.m51487e(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(2164253634L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51515c(1083035135)))}, 0L, 0L, 14), AbstractC33253j.m105489e(3 * 4), 0.0f, 4);
        }
        return modifier.mo3471e(modifierM3357b);
    }

    /* JADX INFO: renamed from: o */
    private static final Modifier m80115o(Modifier modifier) {
        return AbstractC37056f.m118997u(modifier, new C4004c5(7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m80116p(Modifier composed, Composer composer, int i13) {
        AbstractC22676k.m65750j(composed, "$this$composed");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1545099772);
        Modifier modifierMo3471e = composed.mo3471e(AbstractC11895b.m31987f(3, 4, C2314t.f9131w, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10()));
        c28655q.m87173q(false);
        return modifierMo3471e;
    }
}
