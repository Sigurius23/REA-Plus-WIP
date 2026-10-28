package ep1;

import a80.C0542f;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.profile.view.edit.C9790n;
import cp1.AbstractC11022i;
import cp1.C11016c;
import cp1.C11021h;
import d30.C11546l;
import d30.C11558r;
import d62.C11736b;
import dn0.C12211k;
import eo2.C13390j;
import gb1.AbstractC15673b0;
import hp1.C17543c;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC22996s0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28621h1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import zo1.C40925b;

/* JADX INFO: renamed from: ep1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcp1/h;", "viewState", "Lkotlin/Function1;", "Lcp1/i;", "Ll83/a0;", "onViewEvent", "j", "(Lcp1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "optionLimit", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13414i {

    /* JADX INFO: renamed from: ep1.i$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46979a;

        static {
            int[] iArr = new int[HormonalScreenId.values().length];
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_GOALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HormonalScreenId.MENSTRUAL_CYCLE_SYMPTOMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46979a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x038c  */
    /* JADX WARN: Code duplicated, block: B:102:0x038e  */
    /* JADX WARN: Code duplicated, block: B:105:0x039a  */
    /* JADX WARN: Code duplicated, block: B:108:0x039f  */
    /* JADX WARN: Code duplicated, block: B:109:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:113:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:115:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:118:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x0406  */
    /* JADX WARN: Code duplicated, block: B:121:0x042f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0431  */
    /* JADX WARN: Code duplicated, block: B:125:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x043f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0480  */
    /* JADX WARN: Code duplicated, block: B:134:0x049c  */
    /* JADX WARN: Code duplicated, block: B:135:0x049e  */
    /* JADX WARN: Code duplicated, block: B:138:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:142:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:147:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:62:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:76:0x014c  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x029c  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static final void m37967j(C11021h viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        Object objM87133R2;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        TextResource textResourceM29616k;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R3;
        boolean z15;
        Object objM87133R4;
        int i17;
        Function1 function4;
        float f13;
        int iHashCode2;
        C38072d c38072d;
        int i18;
        int i19;
        C28655q c28655q2;
        float f14;
        float f15;
        int i24;
        C2314t c2314t2;
        boolean z16;
        boolean zM87157i;
        Object objM87133R5;
        C28676v0 c28676v1;
        Function1 function5;
        C28676v0 c28676v2;
        int i25;
        boolean z17;
        Object objM87133R6;
        Function1 function6;
        TextResource textResourceM29616k2;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R7;
        boolean z19;
        Object objM87133R8;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-1340018521);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q3.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C13406a(8);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    function3 = (Function1) objM87133R8;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC31061c.m95646v(viewState.getOptionLimit(), c28655q3);
                }
                InterfaceC28593a1 interfaceC28593a1 = (InterfaceC28593a1) objM87133R;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C39967p();
                    c28655q3.m87172p0(objM87133R2);
                }
                C39967p c39967p = (C39967p) objM87133R2;
                c2314t = C2314t.f9131w;
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66722k);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                TextResource textResourceM29609d = viewState.getNavigationTitle();
                TextResource textResourceM29608c = viewState.getNavigationSubtitle();
                textResourceM29616k = viewState.getSkipTitle();
                if (textResourceM29616k != null || viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null || viewState.getSkipNextId() == null || !AbstractC8693b.m21270d(textResourceM29616k)) {
                    textResourceM29616k = null;
                }
                boolean zM87157i3 = c28655q3.m87157i(viewState);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i3 | z13;
                objM87133R3 = c28655q3.m87133R();
                if (z14 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C11546l(19, viewState, function3);
                    c28655q3.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objM87133R4 = c28655q3.m87133R();
                if (z15 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C13390j(function3, 8);
                    c28655q3.m87172p0(objM87133R4);
                }
                i17 = TextResource.$stable;
                int i27 = i17 | (i17 << 3);
                function4 = function3;
                AbstractC13424s.m38062e(textResourceM29609d, textResourceM29608c, 0, textResourceM29616k, interfaceC4339a, (InterfaceC4339a) objM87133R4, c28655q3, i27 | (i17 << 9), 4);
                f13 = 3;
                float f16 = 8;
                float f17 = f13 * f16;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f17, c2314t), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierMo3471e = modifierM92116f0.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k, c28655q3, 6);
                iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
                c38072d = C38072d.f163053a;
                i18 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q3, i18).getBrandWhite();
                C2886a c2886aM8416N = c38072d.m121952e(c28655q3, i18).getT1();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C36775k c36775k = new C36775k(5);
                i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, modifierM3409f, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q3, 48, i19, 196088);
                c28655q2 = c28655q3;
                f14 = 4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f14, c2314t));
                if (viewState.getDescription() == null) {
                    c28655q2.m87150e0(-632810279);
                    c28655q2.m87173q(false);
                    f15 = f14;
                } else {
                    c28655q2.m87150e0(-632810278);
                    f15 = f14;
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 48, i19, 196088);
                    c28655q2 = c28655q2;
                    c28655q2.m87173q(false);
                }
                AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q2);
                i24 = 2;
                float f18 = 2;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f18 * f16, 0.0f, 0.0f, 13);
                c2314t2 = c2314t;
                float f19 = f18 * f15;
                C28655q c28655q4 = c28655q2;
                AbstractC22960g2.m66729a(modifierM3398t, AbstractC22977m.m66746i(f19), AbstractC22977m.m66746i(f19), null, 0, 0, AbstractC37817c.m121344e(1139056568, c28655q2, new C0542f(viewState, c39967p, interfaceC28593a1, 13)), c28655q4, 1573302, 56);
                c28655q = c28655q4;
                c28655q.m87173q(true);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f17, ((float) 0.5d) * f16, f17, 0.0f, 8);
                C11016c c11016cM29613h = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
                TextResource textResourceM29606a = viewState.getButtonTitle();
                boolean z24 = !c39967p.isEmpty();
                if (i16 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R5 == c28676v1) {
                        function5 = function4;
                    }
                    c28676v2 = c28676v1;
                    AbstractC13410e.m37926c(c11016cM29613h, textResourceM29606a, modifierM3398t2, z24, (InterfaceC4339a) objM87133R5, c28655q, i27, 0);
                    if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                        c28655q.m87150e0(1903030437);
                        if (viewState.getSkipNextId() == null) {
                            c28655q.m87150e0(-1135598596);
                            c28655q.m87173q(false);
                            i25 = i16;
                            function5 = function5;
                            c28676v2 = c28676v2;
                            c2314t2 = c2314t2;
                            z19 = false;
                        } else {
                            c28655q.m87150e0(-1135598595);
                            textResourceM29616k2 = viewState.getSkipTitle();
                            if (textResourceM29616k2 == null) {
                                c28655q.m87150e0(1561057046);
                                c28655q.m87173q(false);
                                i25 = i16;
                                z19 = false;
                            } else {
                                c28655q.m87150e0(1561057047);
                                Modifier modifierM3398t3 = AbstractC1099a.m3398t(new HorizontalAlignElement(C2299e.f9111N), 0.0f, f13 * f15, 0.0f, 0.0f, 13);
                                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, i24, 0 == true ? 1 : 0);
                                if (i16 == 32) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zM87157i2 = c28655q.m87157i(viewState) | z18;
                                objM87133R7 = c28655q.m87133R();
                                if (zM87157i2 || objM87133R7 == c28676v2) {
                                    objM87133R7 = new C9790n(19, function5, viewState);
                                    c28655q.m87172p0(objM87133R7);
                                }
                                i25 = i16;
                                AbstractC27265l0.m82217i(modifierM3398t3, null, textResourceM29616k2, null, c39274g, false, null, null, false, false, null, null, (Function1) objM87133R7, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                                c28655q = c28655q;
                                z19 = false;
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(z19);
                        }
                        c28655q.m87173q(z19);
                    } else {
                        i25 = i16;
                        function5 = function5;
                        c28676v2 = c28676v2;
                        c2314t2 = c2314t2;
                        c28655q.m87150e0(-1135058203);
                        c28655q.m87173q(false);
                    }
                    AbstractC30007c.m91851u(c2314t2, f17, c28655q, true);
                    if (i25 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    objM87133R6 = c28655q.m87133R();
                    if (!z17 || objM87133R6 == c28676v2) {
                        function6 = function5;
                        objM87133R6 = new C13390j(function6, 9);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function6 = function5;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                    function2 = function6;
                }
                function5 = function4;
                objM87133R5 = new C11558r(function5, viewState, c39967p, 9);
                c28655q.m87172p0(objM87133R5);
                c28676v2 = c28676v1;
                AbstractC13410e.m37926c(c11016cM29613h, textResourceM29606a, modifierM3398t2, z24, (InterfaceC4339a) objM87133R5, c28655q, i27, 0);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    c28655q.m87150e0(1903030437);
                    if (viewState.getSkipNextId() == null) {
                        c28655q.m87150e0(-1135598596);
                        c28655q.m87173q(false);
                        i25 = i16;
                        function5 = function5;
                        c28676v2 = c28676v2;
                        c2314t2 = c2314t2;
                        z19 = false;
                    } else {
                        c28655q.m87150e0(-1135598595);
                        textResourceM29616k2 = viewState.getSkipTitle();
                        if (textResourceM29616k2 == null) {
                            c28655q.m87150e0(1561057046);
                            c28655q.m87173q(false);
                            i25 = i16;
                            z19 = false;
                        } else {
                            c28655q.m87150e0(1561057047);
                            Modifier modifierM3398t4 = AbstractC1099a.m3398t(new HorizontalAlignElement(C2299e.f9111N), 0.0f, f13 * f15, 0.0f, 0.0f, 13);
                            C39274g c39274g2 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, i24, 0 == true ? 1 : 0);
                            if (i16 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i2 = c28655q.m87157i(viewState) | z18;
                            objM87133R7 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R7 = new C9790n(19, function5, viewState);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C9790n(19, function5, viewState);
                                c28655q.m87172p0(objM87133R7);
                            }
                            i25 = i16;
                            AbstractC27265l0.m82217i(modifierM3398t4, null, textResourceM29616k2, null, c39274g2, false, null, null, false, false, null, null, (Function1) objM87133R7, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                            c28655q = c28655q;
                            z19 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z19);
                    }
                    c28655q.m87173q(z19);
                } else {
                    i25 = i16;
                    function5 = function5;
                    c28676v2 = c28676v2;
                    c2314t2 = c2314t2;
                    c28655q.m87150e0(-1135058203);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t2, f17, c28655q, true);
                if (i25 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z17) {
                    function6 = function5;
                    objM87133R6 = new C13390j(function6, 9);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function6 = function5;
                    objM87133R6 = new C13390j(function6, 9);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function6;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 15);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C13406a(8);
                    c28655q3.m87172p0(objM87133R8);
                }
                function3 = (Function1) objM87133R8;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC31061c.m95646v(viewState.getOptionLimit(), c28655q3);
            }
            InterfaceC28593a1 interfaceC28593a2 = (InterfaceC28593a1) objM87133R;
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C39967p();
                c28655q3.m87172p0(objM87133R2);
            }
            C39967p c39967p2 = (C39967p) objM87133R2;
            c2314t = C2314t.f9131w;
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM66722k2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
            TextResource textResourceM29609d2 = viewState.getNavigationTitle();
            TextResource textResourceM29608c2 = viewState.getNavigationSubtitle();
            textResourceM29616k = viewState.getSkipTitle();
            if (textResourceM29616k != null) {
                textResourceM29616k = null;
            } else {
                textResourceM29616k = null;
            }
            boolean zM87157i4 = c28655q3.m87157i(viewState);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i4 | z13;
            objM87133R3 = c28655q3.m87133R();
            if (z14) {
                objM87133R3 = new C11546l(19, viewState, function3);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C11546l(19, viewState, function3);
                c28655q3.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            objM87133R4 = c28655q3.m87133R();
            if (z15) {
                objM87133R4 = new C13390j(function3, 8);
                c28655q3.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C13390j(function3, 8);
                c28655q3.m87172p0(objM87133R4);
            }
            i17 = TextResource.$stable;
            int i28 = i17 | (i17 << 3);
            function4 = function3;
            AbstractC13424s.m38062e(textResourceM29609d2, textResourceM29608c2, 0, textResourceM29616k, interfaceC4339a2, (InterfaceC4339a) objM87133R4, c28655q3, i28 | (i17 << 9), 4);
            f13 = 3;
            float f110 = 8;
            float f111 = f13 * f110;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f111, c2314t), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierMo3471e2 = modifierM92116f1.mo3471e(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90653d, c2305k2, c28655q3, 6);
            iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierMo3471e2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q3, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getTitle(), c28655q3, i17);
            c38072d = C38072d.f163053a;
            i18 = C38072d.f163054b;
            long jM125430y2 = c38072d.m121949b(c28655q3, i18).getBrandWhite();
            C2886a c2886aM8416N2 = c38072d.m121952e(c28655q3, i18).getT1();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C36775k c36775k2 = new C36775k(5);
            i19 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, modifierM3409f2, jM125430y2, 0L, null, null, null, 0L, null, c36775k2, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q3, 48, i19, 196088);
            c28655q2 = c28655q3;
            f14 = 4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f14, c2314t));
            if (viewState.getDescription() == null) {
                c28655q2.m87150e0(-632810279);
                c28655q2.m87173q(false);
                f15 = f14;
            } else {
                c28655q2.m87150e0(-632810278);
                f15 = f14;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getDescription(), c28655q2, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q2, i18).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 48, i19, 196088);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            AbstractC18489d0.m53380u(f15, f15, c2314t, c28655q2);
            i24 = 2;
            float f112 = 2;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, f112 * f110, 0.0f, 0.0f, 13);
            c2314t2 = c2314t;
            float f113 = f112 * f15;
            C28655q c28655q5 = c28655q2;
            AbstractC22960g2.m66729a(modifierM3398t5, AbstractC22977m.m66746i(f113), AbstractC22977m.m66746i(f113), null, 0, 0, AbstractC37817c.m121344e(1139056568, c28655q2, new C0542f(viewState, c39967p2, interfaceC28593a2, 13)), c28655q5, 1573302, 56);
            c28655q = c28655q5;
            c28655q.m87173q(true);
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t2), f111, ((float) 0.5d) * f110, f111, 0.0f, 8);
            C11016c c11016cM29613h2 = viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String();
            TextResource textResourceM29606a2 = viewState.getButtonTitle();
            boolean z25 = !c39967p2.isEmpty();
            if (i16 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = z16 | c28655q.m87157i(viewState);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                c28676v1 = c28676v0;
                if (objM87133R5 == c28676v1) {
                    function5 = function4;
                }
                c28676v2 = c28676v1;
                AbstractC13410e.m37926c(c11016cM29613h2, textResourceM29606a2, modifierM3398t6, z25, (InterfaceC4339a) objM87133R5, c28655q, i28, 0);
                if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                    c28655q.m87150e0(1903030437);
                    if (viewState.getSkipNextId() == null) {
                        c28655q.m87150e0(-1135598596);
                        c28655q.m87173q(false);
                        i25 = i16;
                        function5 = function5;
                        c28676v2 = c28676v2;
                        c2314t2 = c2314t2;
                        z19 = false;
                    } else {
                        c28655q.m87150e0(-1135598595);
                        textResourceM29616k2 = viewState.getSkipTitle();
                        if (textResourceM29616k2 == null) {
                            c28655q.m87150e0(1561057046);
                            c28655q.m87173q(false);
                            i25 = i16;
                            z19 = false;
                        } else {
                            c28655q.m87150e0(1561057047);
                            Modifier modifierM3398t7 = AbstractC1099a.m3398t(new HorizontalAlignElement(C2299e.f9111N), 0.0f, f13 * f15, 0.0f, 0.0f, 13);
                            C39274g c39274g3 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, i24, 0 == true ? 1 : 0);
                            if (i16 == 32) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i2 = c28655q.m87157i(viewState) | z18;
                            objM87133R7 = c28655q.m87133R();
                            if (zM87157i2) {
                                objM87133R7 = new C9790n(19, function5, viewState);
                                c28655q.m87172p0(objM87133R7);
                            } else {
                                objM87133R7 = new C9790n(19, function5, viewState);
                                c28655q.m87172p0(objM87133R7);
                            }
                            i25 = i16;
                            AbstractC27265l0.m82217i(modifierM3398t7, null, textResourceM29616k2, null, c39274g3, false, null, null, false, false, null, null, (Function1) objM87133R7, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                            c28655q = c28655q;
                            z19 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z19);
                    }
                    c28655q.m87173q(z19);
                } else {
                    i25 = i16;
                    function5 = function5;
                    c28676v2 = c28676v2;
                    c2314t2 = c2314t2;
                    c28655q.m87150e0(-1135058203);
                    c28655q.m87173q(false);
                }
                AbstractC30007c.m91851u(c2314t2, f111, c28655q, true);
                if (i25 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objM87133R6 = c28655q.m87133R();
                if (z17) {
                    function6 = function5;
                    objM87133R6 = new C13390j(function6, 9);
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function6 = function5;
                    objM87133R6 = new C13390j(function6, 9);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function2 = function6;
            } else {
                c28676v1 = c28676v0;
            }
            function5 = function4;
            objM87133R5 = new C11558r(function5, viewState, c39967p2, 9);
            c28655q.m87172p0(objM87133R5);
            c28676v2 = c28676v1;
            AbstractC13410e.m37926c(c11016cM29613h2, textResourceM29606a2, modifierM3398t6, z25, (InterfaceC4339a) objM87133R5, c28655q, i28, 0);
            if (viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String() == null) {
                c28655q.m87150e0(1903030437);
                if (viewState.getSkipNextId() == null) {
                    c28655q.m87150e0(-1135598596);
                    c28655q.m87173q(false);
                    i25 = i16;
                    function5 = function5;
                    c28676v2 = c28676v2;
                    c2314t2 = c2314t2;
                    z19 = false;
                } else {
                    c28655q.m87150e0(-1135598595);
                    textResourceM29616k2 = viewState.getSkipTitle();
                    if (textResourceM29616k2 == null) {
                        c28655q.m87150e0(1561057046);
                        c28655q.m87173q(false);
                        i25 = i16;
                        z19 = false;
                    } else {
                        c28655q.m87150e0(1561057047);
                        Modifier modifierM3398t8 = AbstractC1099a.m3398t(new HorizontalAlignElement(C2299e.f9111N), 0.0f, f13 * f15, 0.0f, 0.0f, 13);
                        C39274g c39274g4 = new C39274g(AbstractC18489d0.m53359E(c38072d), null, i24, 0 == true ? 1 : 0);
                        if (i16 == 32) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = c28655q.m87157i(viewState) | z18;
                        objM87133R7 = c28655q.m87133R();
                        if (zM87157i2) {
                            objM87133R7 = new C9790n(19, function5, viewState);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C9790n(19, function5, viewState);
                            c28655q.m87172p0(objM87133R7);
                        }
                        i25 = i16;
                        AbstractC27265l0.m82217i(modifierM3398t8, null, textResourceM29616k2, null, c39274g4, false, null, null, false, false, null, null, (Function1) objM87133R7, c28655q, (i17 << 6) | (C39274g.f168929c << 12), 0, 4074);
                        c28655q = c28655q;
                        z19 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z19);
                }
                c28655q.m87173q(z19);
            } else {
                i25 = i16;
                function5 = function5;
                c28676v2 = c28676v2;
                c2314t2 = c2314t2;
                c28655q.m87150e0(-1135058203);
                c28655q.m87173q(false);
            }
            AbstractC30007c.m91851u(c2314t2, f111, c28655q, true);
            if (i25 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            objM87133R6 = c28655q.m87133R();
            if (z17) {
                function6 = function5;
                objM87133R6 = new C13390j(function6, 9);
                c28655q.m87172p0(objM87133R6);
            } else {
                function6 = function5;
                objM87133R6 = new C13390j(function6, 9);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
            function2 = function6;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(viewState, i13, function2, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m37968k(AbstractC11022i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final int m37969l(InterfaceC28593a1 interfaceC28593a1) {
        return ((C28621h1) interfaceC28593a1).m87024x();
    }

    /* JADX INFO: renamed from: m */
    private static final void m37970m(InterfaceC28593a1 interfaceC28593a1, int i13) {
        ((C28621h1) interfaceC28593a1).m87025y(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m37971n(C11021h c11021h, Function1 function1) {
        HormonalScreenId hormonalScreenIdM29615j = c11021h.getSkipNextId();
        if (hormonalScreenIdM29615j != null) {
            function1.invoke(new AbstractC11022i.f(hormonalScreenIdM29615j));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m37972o(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m37973p(C11021h c11021h, C39967p c39967p, InterfaceC28593a1 interfaceC28593a1, InterfaceC22996s0 FlowRow, Composer composer, int i13) {
        long jM95628d;
        long jM73366B;
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            for (C17543c c17543c : c11021h.m29612g()) {
                boolean zContains = c39967p.contains(c17543c.getValue());
                float f13 = 4;
                float f14 = 3 * f13;
                Modifier modifierM118994r = AbstractC37056f.m118994r(C2314t.f9131w, AbstractC33253j.m105489e(f14));
                if (zContains) {
                    c28655q.m87150e0(124039629);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getSleepLightSleep();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(124040869);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1092a.m3358c(modifierM118994r, jM95628d, AbstractC17918w0.f69621a), f14, 2 * f13);
                boolean zM87155h = c28655q.m87155h(zContains) | c28655q.m87157i(c17543c);
                Object objM87133R = c28655q.m87133R();
                if (zM87155h || objM87133R == C28635l.f115821a) {
                    objM87133R = new C12211k(zContains, c39967p, c17543c, interfaceC28593a1, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3395q, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(c17543c.getTitle(), c28655q, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i14 = C38072d.f163054b;
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
                if (zContains) {
                    c28655q.m87150e0(1549846402);
                    jM73366B = c38072d.m121949b(c28655q, i14).getBrandBlack();
                } else {
                    jM73366B = AbstractC25012a.m73366B(c28655q, 1549847490, c38072d, c28655q, i14);
                }
                c28655q.m87173q(false);
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                c28655q2.m87173q(true);
                c28655q = c28655q2;
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m37974q(boolean z4, C39967p c39967p, C17543c c17543c, InterfaceC28593a1 interfaceC28593a1) {
        if (z4) {
            m37970m(interfaceC28593a1, m37969l(interfaceC28593a1) + 1);
            c39967p.remove(c17543c.getValue());
        } else if (m37969l(interfaceC28593a1) > 0) {
            c39967p.add(c17543c.getValue());
            m37970m(interfaceC28593a1, m37969l(interfaceC28593a1) - 1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m37975r(Function1 function1, C11021h c11021h, C39967p c39967p) {
        C40925b c40925b;
        C40925b c40925b2;
        HormonalScreenId hormonalScreenIdM29610e = c11021h.getNextId();
        int i13 = a.f46979a[c11021h.getScreenId().ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                c40925b2 = new C40925b(null, null, null, null, null, c39967p, null, 95, null);
            } else {
                c40925b = new C40925b(null, null, null, null, null, c39967p, null, 95, null);
            }
            function1.invoke(new AbstractC11022i.d(hormonalScreenIdM29610e, c40925b2));
            return C23454a0.f92919a;
        }
        c40925b = new C40925b(null, null, null, null, null, null, c39967p, 63, null);
        c40925b2 = c40925b;
        function1.invoke(new AbstractC11022i.d(hormonalScreenIdM29610e, c40925b2));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m37976s(Function1 function1, C11021h c11021h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC11022i.f(c11021h.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m37977t(Function1 function1) {
        function1.invoke(AbstractC11022i.a.f34542a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m37978u(C11021h c11021h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37967j(c11021h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
