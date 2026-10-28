package kotlin;

import a01.C0089i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq0.C1905p;
import b91.C2886a;
import bu2.AbstractC3646g;
import bu2.AbstractC3654o;
import bu2.C3643d;
import bu2.EnumC3642c0;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27292z;
import o81.C27656a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p555vl.AbstractC36095b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import ws2.AbstractC37617i;
import x81.C38072d;
import y71.C39274g;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.v0 */
/* JADX INFO: loaded from: classes11.dex */
@p715kotlin.Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lys2/e$o;", "viewState", "Lkotlin/Function1;", "Lws2/i;", "Ll83/a0;", "onViewEvent", "i", "(Lys2/e$o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2035v0 {
    /* JADX WARN: Code duplicated, block: B:102:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:104:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x0418  */
    /* JADX WARN: Code duplicated, block: B:114:0x042f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0444  */
    /* JADX WARN: Code duplicated, block: B:118:0x0451  */
    /* JADX WARN: Code duplicated, block: B:120:0x0455  */
    /* JADX WARN: Code duplicated, block: B:123:0x0462  */
    /* JADX WARN: Code duplicated, block: B:126:0x0467  */
    /* JADX WARN: Code duplicated, block: B:127:0x046a  */
    /* JADX WARN: Code duplicated, block: B:132:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:134:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:143:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x0109  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:68:0x0201  */
    /* JADX WARN: Code duplicated, block: B:69:0x0205  */
    /* JADX WARN: Code duplicated, block: B:74:0x0220  */
    /* JADX WARN: Code duplicated, block: B:80:0x0327  */
    /* JADX WARN: Code duplicated, block: B:83:0x033d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0341  */
    /* JADX WARN: Code duplicated, block: B:91:0x0354  */
    /* JADX WARN: Code duplicated, block: B:94:0x0377  */
    /* JADX WARN: Code duplicated, block: B:95:0x0379  */
    /* JADX WARN: Code duplicated, block: B:99:0x0387  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX INFO: renamed from: i */
    public static final void m6352i(final AbstractC39758e.o viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        final AbstractC39758e.o oVar;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Function1 function4;
        int iHashCode2;
        C27656a c27656a;
        int i16;
        boolean z13;
        boolean zM87157i;
        Object objM87133R;
        final Function1 function5;
        Function1 function6;
        int iHashCode3;
        C0209i c0209i2;
        int i17;
        C0209i c0209i3;
        Object objM87133R2;
        boolean z14;
        boolean zM87157i2;
        Object objM87133R3;
        final Function1 function7;
        boolean z15;
        boolean zM87157i3;
        Object objM87133R4;
        Function1 function8;
        int iHashCode4;
        TextResource skipButtonDisplay;
        ?? r10;
        boolean z16;
        boolean zM87157i4;
        Object objM87133R5;
        C28676v0 c28676v1;
        final Function1 function9;
        int i18;
        C28676v0 c28676v2;
        Function1 function10;
        ?? r14;
        ?? r15;
        Object objM87133R6;
        final Function1 function11;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(350960238);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C1905p(25);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function3 = (Function1) objM87133R7;
                } else {
                    function3 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM114675c = AbstractC36095b.m114675c(c2314t, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM114675c);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d);
                C0209i c0209i5 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N);
                Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                function4 = function3;
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N2);
                TextResource navigationTitle = viewState.getHeader().getNavigationTitle();
                if (AbstractC8693b.m21270d(viewState.getHeader().getNavigationSubTitle())) {
                    c27656a = new C27656a(viewState.getHeader().getNavigationSubTitle(), false, 2, null);
                } else {
                    c27656a = null;
                }
                C38072d c38072d = C38072d.f163053a;
                AbstractC6721d.a aVar = new AbstractC6721d.a(navigationTitle, c27656a, new C39274g(AbstractC18489d0.m53357C(c38072d), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i = z13 | c28655q2.m87157i(viewState);
                objM87133R = c28655q2.m87133R();
                if (!zM87157i || objM87133R == c28676v0) {
                    final int i24 = 0;
                    function5 = function4;
                    objM87133R = new InterfaceC4339a() { // from class: at2.t0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC2035v0.m6354k(function5, viewState);
                                case 1:
                                    return AbstractC2035v0.m6357n(function5, viewState);
                                default:
                                    return AbstractC2035v0.m6359p(function5, viewState);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R);
                } else {
                    function5 = function4;
                }
                function6 = function5;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                float f13 = 8;
                float f14 = ((float) 2.5d) * f13;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14), f14, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q2, c0209i5, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S && AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    c0209i2 = c0209i;
                } else {
                    c0209i2 = c0209i;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N3);
                float f15 = 2 * f13;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                TextResource title = viewState.getHeader().getTitle();
                i17 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i17);
                int i25 = C38072d.f163054b;
                long brandWhite = c38072d.m121949b(c28655q2, i25).getBrandWhite();
                C2886a t14 = c38072d.m121952e(c28655q2, i25).getT3();
                int i26 = C2886a.f11498d << 18;
                c0209i3 = c0209i2;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t14, null, c28655q2, 0, i26, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getHeader().getSubTitle(), c28655q2, i17), null, c38072d.m121949b(c28655q2, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i25).getB1(), null, c28655q2, 0, i26, 196602);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f15, c2314t));
                C3643d metricSlider = viewState.getMetricSlider();
                C3643d c3643dM11221a = metricSlider.m11221a((61423 & 1) != 0 ? metricSlider.fillPercentage : 0.0f, (61423 & 2) != 0 ? metricSlider.minFillPercentage : 0.0f, (61423 & 4) != 0 ? metricSlider.maxFillPercentage : 0.0f, (61423 & 8) != 0 ? metricSlider.weeklyTargetDouble : 0.0d, (61423 & 16) != 0 ? metricSlider.weeklyTargetValue : null, (61423 & 32) != 0 ? metricSlider.weeklyTargetValueSuffix : null, (61423 & 64) != 0 ? metricSlider.weeklyTargetLabel : null, (61423 & 128) != 0 ? metricSlider.topText : null, (61423 & 256) != 0 ? metricSlider.bottomText : null, (61423 & 512) != 0 ? metricSlider.recommendedRange : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? metricSlider.levelItemState : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? metricSlider.rangeContent : null, (61423 & 4096) != 0 ? metricSlider.toolTipType : EnumC3642c0.STRAIN, (61423 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? metricSlider.toolTipTitleColor : null, (61423 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? metricSlider.increment : null, (61423 & 32768) != 0 ? metricSlider.color : null);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C1905p(26);
                    c28655q2.m87172p0(objM87133R2);
                }
                Modifier modifierM51774b = AbstractC18032n.m51774b(c2314t, (Function1) objM87133R2);
                if (i16 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i2 = c28655q2.m87157i(viewState) | z14;
                objM87133R3 = c28655q2.m87133R();
                if (!zM87157i2 || objM87133R3 == c28676v0) {
                    final int i27 = 0;
                    function7 = function6;
                    objM87133R3 = new Function1() { // from class: at2.u0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i27) {
                                case 0:
                                    return AbstractC2035v0.m6356m(function7, viewState, obj);
                                default:
                                    return AbstractC2035v0.m6358o(function7, viewState, obj);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    function7 = function6;
                }
                AbstractC3646g.m11242f(c3643dM11221a, modifierM51774b, (Function1) objM87133R3, c28655q2, 0, 0);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                TextResource continueButtonDisplay = viewState.getBottom().getContinueButtonDisplay();
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i3 = c28655q2.m87157i(viewState) | z15;
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    final int i28 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: at2.t0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i28) {
                                case 0:
                                    return AbstractC2035v0.m6354k(function7, viewState);
                                case 1:
                                    return AbstractC2035v0.m6357n(function7, viewState);
                                default:
                                    return AbstractC2035v0.m6359p(function7, viewState);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R4);
                }
                function8 = function7;
                AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, continueButtonDisplay, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (i17 << 18) | 6, 0, 8126);
                c28655q = c28655q2;
                AbstractC18489d0.m53380u((float) 1.5d, f13, c2314t, c28655q);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
                skipButtonDisplay = viewState.getBottom().getSkipButtonDisplay();
                if (skipButtonDisplay == null) {
                    c28655q.m87150e0(-131382608);
                    r10 = 0;
                    c28655q.m87173q(false);
                    i18 = i16;
                    function10 = function8;
                    c28676v2 = c28676v0;
                } else {
                    r10 = 0;
                    c28655q.m87150e0(-131382607);
                    if (i16 == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i4 = c28655q.m87157i(viewState) | z16;
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i4) {
                        c28676v1 = c28676v0;
                    } else {
                        c28676v1 = c28676v0;
                        if (objM87133R5 == c28676v1) {
                            function9 = function8;
                        }
                        i18 = i16;
                        c28676v2 = c28676v1;
                        function10 = function9;
                        AbstractC27265l0.m82217i(null, null, skipButtonDisplay, null, null, false, null, null, false, false, null, null, (Function1) objM87133R5, c28655q, i17 << 6, 0, 4091);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    }
                    final int i29 = 1;
                    function9 = function8;
                    objM87133R5 = new Function1() { // from class: at2.u0
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i29) {
                                case 0:
                                    return AbstractC2035v0.m6356m(function9, viewState, obj);
                                default:
                                    return AbstractC2035v0.m6358o(function9, viewState, obj);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                    i18 = i16;
                    c28676v2 = c28676v1;
                    function10 = function9;
                    AbstractC27265l0.m82217i(null, null, skipButtonDisplay, null, null, false, null, null, false, false, null, null, (Function1) objM87133R5, c28655q, i17 << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                AbstractC17176i.m48516r(c28655q, true, c2314t, f14, c28655q);
                AbstractC25012a.m73392y(c28655q, true, true, true);
                if (i18 == 32) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                oVar = viewState;
                r15 = (c28655q.m87157i(oVar) ? 1 : 0) | r14;
                objM87133R6 = c28655q.m87133R();
                if (r15 == 0 || objM87133R6 == c28676v2) {
                    final int i34 = 2;
                    function11 = function10;
                    objM87133R6 = new InterfaceC4339a() { // from class: at2.t0
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i34) {
                                case 0:
                                    return AbstractC2035v0.m6354k(function11, oVar);
                                case 1:
                                    return AbstractC2035v0.m6357n(function11, oVar);
                                default:
                                    return AbstractC2035v0.m6359p(function11, oVar);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R6);
                } else {
                    function11 = function10;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, r10, c28655q, r10, 1);
                function2 = function11;
            } else {
                oVar = viewState;
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(oVar, i13, function2, i14, 5);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C1905p(25);
                    c28655q2.m87172p0(objM87133R7);
                }
                function3 = (Function1) objM87133R7;
            } else {
                function3 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM114675c2 = AbstractC36095b.m114675c(c2314t2, 1.0f);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM114675c2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i7 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC39127r0M66763d2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m5);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i9 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N5);
            Modifier modifierM66722k2 = AbstractC22953f.m66722k(AbstractC1102d.m3409f(1.0f, c2314t2));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            function4 = function3;
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM66722k2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
            TextResource navigationTitle2 = viewState.getHeader().getNavigationTitle();
            if (AbstractC8693b.m21270d(viewState.getHeader().getNavigationSubTitle())) {
                c27656a = new C27656a(viewState.getHeader().getNavigationSubTitle(), false, 2, null);
            } else {
                c27656a = null;
            }
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(navigationTitle2, c27656a, new C39274g(AbstractC18489d0.m53357C(c38072d2), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i = z13 | c28655q2.m87157i(viewState);
            objM87133R = c28655q2.m87133R();
            if (zM87157i) {
                final int i210 = 0;
                function5 = function4;
                objM87133R = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i210) {
                            case 0:
                                return AbstractC2035v0.m6354k(function5, viewState);
                            case 1:
                                return AbstractC2035v0.m6357n(function5, viewState);
                            default:
                                return AbstractC2035v0.m6359p(function5, viewState);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            } else {
                final int i211 = 0;
                function5 = function4;
                objM87133R = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i211) {
                            case 0:
                                return AbstractC2035v0.m6354k(function5, viewState);
                            case 1:
                                return AbstractC2035v0.m6357n(function5, viewState);
                            default:
                                return AbstractC2035v0.m6359p(function5, viewState);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            function6 = function5;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            float f16 = 8;
            float f17 = ((float) 2.5d) * f16;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC30060g.m92116f0(c2314t2, AbstractC30060g.m92099U(0, c28655q2, 1), 14), f17, 0.0f, 2);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i8, interfaceC28653p1M87165m7);
            if (c28655q2.f115903S) {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                c0209i2 = c0209i;
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N7);
            float f18 = 2 * f16;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t2));
            TextResource title2 = viewState.getHeader().getTitle();
            i17 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(title2, c28655q2, i17);
            int i212 = C38072d.f163054b;
            long brandWhite2 = c38072d2.m121949b(c28655q2, i212).getBrandWhite();
            C2886a t15 = c38072d2.m121952e(c28655q2, i212).getT3();
            int i213 = C2886a.f11498d << 18;
            c0209i3 = c0209i2;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, t15, null, c28655q2, 0, i213, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(1 * f16, c2314t2));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getHeader().getSubTitle(), c28655q2, i17), null, c38072d2.m121949b(c28655q2, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i212).getB1(), null, c28655q2, 0, i213, 196602);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(f18, c2314t2));
            C3643d metricSlider2 = viewState.getMetricSlider();
            C3643d c3643dM11221a2 = metricSlider2.m11221a((61423 & 1) != 0 ? metricSlider2.fillPercentage : 0.0f, (61423 & 2) != 0 ? metricSlider2.minFillPercentage : 0.0f, (61423 & 4) != 0 ? metricSlider2.maxFillPercentage : 0.0f, (61423 & 8) != 0 ? metricSlider2.weeklyTargetDouble : 0.0d, (61423 & 16) != 0 ? metricSlider2.weeklyTargetValue : null, (61423 & 32) != 0 ? metricSlider2.weeklyTargetValueSuffix : null, (61423 & 64) != 0 ? metricSlider2.weeklyTargetLabel : null, (61423 & 128) != 0 ? metricSlider2.topText : null, (61423 & 256) != 0 ? metricSlider2.bottomText : null, (61423 & 512) != 0 ? metricSlider2.recommendedRange : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? metricSlider2.levelItemState : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? metricSlider2.rangeContent : null, (61423 & 4096) != 0 ? metricSlider2.toolTipType : EnumC3642c0.STRAIN, (61423 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? metricSlider2.toolTipTitleColor : null, (61423 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? metricSlider2.increment : null, (61423 & 32768) != 0 ? metricSlider2.color : null);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C1905p(26);
                c28655q2.m87172p0(objM87133R2);
            }
            Modifier modifierM51774b2 = AbstractC18032n.m51774b(c2314t2, (Function1) objM87133R2);
            if (i16 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i2 = c28655q2.m87157i(viewState) | z14;
            objM87133R3 = c28655q2.m87133R();
            if (zM87157i2) {
                final int i214 = 0;
                function7 = function6;
                objM87133R3 = new Function1() { // from class: at2.u0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i214) {
                            case 0:
                                return AbstractC2035v0.m6356m(function7, viewState, obj);
                            default:
                                return AbstractC2035v0.m6358o(function7, viewState, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            } else {
                final int i215 = 0;
                function7 = function6;
                objM87133R3 = new Function1() { // from class: at2.u0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i215) {
                            case 0:
                                return AbstractC2035v0.m6356m(function7, viewState, obj);
                            default:
                                return AbstractC2035v0.m6358o(function7, viewState, obj);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R3);
            }
            AbstractC3646g.m11242f(c3643dM11221a2, modifierM51774b2, (Function1) objM87133R3, c28655q2, 0, 0);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t2);
            TextResource continueButtonDisplay2 = viewState.getBottom().getContinueButtonDisplay();
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i3 = c28655q2.m87157i(viewState) | z15;
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i3) {
                final int i216 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i216) {
                            case 0:
                                return AbstractC2035v0.m6354k(function7, viewState);
                            case 1:
                                return AbstractC2035v0.m6357n(function7, viewState);
                            default:
                                return AbstractC2035v0.m6359p(function7, viewState);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            } else {
                final int i217 = 1;
                objM87133R4 = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i217) {
                            case 0:
                                return AbstractC2035v0.m6354k(function7, viewState);
                            case 1:
                                return AbstractC2035v0.m6357n(function7, viewState);
                            default:
                                return AbstractC2035v0.m6359p(function7, viewState);
                        }
                    }
                };
                c28655q2.m87172p0(objM87133R4);
            }
            function8 = function7;
            AbstractC27292z.m82343j(modifierM3409f3, false, false, null, null, null, continueButtonDisplay2, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q2, (i17 << 18) | 6, 0, 8126);
            c28655q = c28655q2;
            AbstractC18489d0.m53380u((float) 1.5d, f16, c2314t2, c28655q);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i9, modifierM118962N8);
            skipButtonDisplay = viewState.getBottom().getSkipButtonDisplay();
            if (skipButtonDisplay == null) {
                c28655q.m87150e0(-131382608);
                r10 = 0;
                c28655q.m87173q(false);
                i18 = i16;
                function10 = function8;
                c28676v2 = c28676v0;
            } else {
                r10 = 0;
                c28655q.m87150e0(-131382607);
                if (i16 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i4 = c28655q.m87157i(viewState) | z16;
                objM87133R5 = c28655q.m87133R();
                if (zM87157i4) {
                    c28676v1 = c28676v0;
                    if (objM87133R5 == c28676v1) {
                        function9 = function8;
                    }
                    i18 = i16;
                    c28676v2 = c28676v1;
                    function10 = function9;
                    AbstractC27265l0.m82217i(null, null, skipButtonDisplay, null, null, false, null, null, false, false, null, null, (Function1) objM87133R5, c28655q, i17 << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28676v1 = c28676v0;
                }
                final int i218 = 1;
                function9 = function8;
                objM87133R5 = new Function1() { // from class: at2.u0
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i218) {
                            case 0:
                                return AbstractC2035v0.m6356m(function9, viewState, obj);
                            default:
                                return AbstractC2035v0.m6358o(function9, viewState, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
                i18 = i16;
                c28676v2 = c28676v1;
                function10 = function9;
                AbstractC27265l0.m82217i(null, null, skipButtonDisplay, null, null, false, null, null, false, false, null, null, (Function1) objM87133R5, c28655q, i17 << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            AbstractC17176i.m48516r(c28655q, true, c2314t2, f17, c28655q);
            AbstractC25012a.m73392y(c28655q, true, true, true);
            if (i18 == 32) {
                r14 = 1;
            } else {
                r14 = r10;
            }
            oVar = viewState;
            r15 = (c28655q.m87157i(oVar) ? 1 : 0) | r14;
            objM87133R6 = c28655q.m87133R();
            if (r15 == 0) {
                final int i35 = 2;
                function11 = function10;
                objM87133R6 = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i35) {
                            case 0:
                                return AbstractC2035v0.m6354k(function11, oVar);
                            case 1:
                                return AbstractC2035v0.m6357n(function11, oVar);
                            default:
                                return AbstractC2035v0.m6359p(function11, oVar);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            } else {
                final int i36 = 2;
                function11 = function10;
                objM87133R6 = new InterfaceC4339a() { // from class: at2.t0
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i36) {
                            case 0:
                                return AbstractC2035v0.m6354k(function11, oVar);
                            case 1:
                                return AbstractC2035v0.m6357n(function11, oVar);
                            default:
                                return AbstractC2035v0.m6359p(function11, oVar);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, r10, c28655q, r10, 1);
            function2 = function11;
        } else {
            oVar = viewState;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(oVar, i13, function2, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m6353j(AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m6354k(Function1 function1, AbstractC39758e.o oVar) {
        function1.invoke(new AbstractC37617i.a(oVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() == 0, 0, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m6355l(InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        AbstractC18041w.m51806e("SetUpSteps_Body_Slider_Steps", clearAndSetSemantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m6356m(Function1 function1, AbstractC39758e.o oVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC3654o.a) {
            function1.invoke(new AbstractC37617i.m(oVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), ((AbstractC3654o.a) it).getFillPercentage()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m6357n(Function1 function1, AbstractC39758e.o oVar) {
        function1.invoke(new AbstractC37617i.i(oVar.getPlanId(), TargetGoalType.STEPS, oVar.getSaveValue(), false, null, 24, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m6358o(Function1 function1, AbstractC39758e.o oVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC37617i.c(oVar.getPlanId(), oVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m6359p(Function1 function1, AbstractC39758e.o oVar) {
        function1.invoke(new AbstractC37617i.a(oVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() == 0, 0, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m6360q(AbstractC39758e.o oVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6352i(oVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
