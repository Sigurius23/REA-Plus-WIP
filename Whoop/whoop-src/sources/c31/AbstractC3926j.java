package c31;

import a01.C0089i;
import ai1.C0910b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import bs1.C3595n;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p411q2.InterfaceC29805a;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.InterfaceC39332e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c31.j */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lc31/k;", "viewState", "Lkotlin/Function1;", "Lc31/c;", "Ll83/a0;", "onViewEvent", "e", "(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "Li2/x;", "color", "i", "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC3926j {

    /* JADX INFO: renamed from: c31.j$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16019a;

        static {
            int[] iArr = new int[EnumC3920d.values().length];
            try {
                iArr[EnumC3920d.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3920d.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3920d.FILLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3920d.PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16019a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x024e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0260  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:109:0x02de  */
    /* JADX WARN: Code duplicated, block: B:111:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:112:0x031d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0325  */
    /* JADX WARN: Code duplicated, block: B:115:0x0356  */
    /* JADX WARN: Code duplicated, block: B:116:0x0365  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:59:0x015c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0160  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x0204  */
    /* JADX WARN: Code duplicated, block: B:84:0x0206  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0226  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: e */
    public static final void m11931e(C3927k viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function3;
        InterfaceC29805a interfaceC29805a;
        int iHashCode;
        C2314t c2314t;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        TextResource errorMessage;
        C2314t c2314t2;
        C0209i c0209i3;
        ?? r10;
        C28655q c28655q2;
        InterfaceC39332e glowColor;
        C17919x c17919xM31989h;
        Modifier modifierM11935i;
        int iHashCode2;
        boolean z13;
        int iHashCode3;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        long jM53363d;
        Function1 function4;
        C28655q c28655q3;
        int i16;
        Function1 function5;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(-1774702875);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q4.m87153g(viewState) : c28655q4.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q4.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q4.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q4.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C3595n(29);
                        c28655q4.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function2;
                }
                interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q4, 48);
                iHashCode = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
                c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a);
                } else {
                    c28655q4.m87178s0();
                }
                C0209i c0209i4 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q4, c0209i4, c23010xM66775a);
                c0209i = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
                errorMessage = viewState.getErrorMessage();
                if (errorMessage == null) {
                    c28655q4.m87150e0(859120996);
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                    c2314t2 = c2314t;
                    r10 = 0;
                    c0209i3 = c0209i;
                } else {
                    c28655q4.m87150e0(859120997);
                    C28655q c28655q5 = c28655q4;
                    c2314t2 = c2314t;
                    c0209i3 = c0209i;
                    AbstractC3924h.m11918d(errorMessage, viewState.getErrorClickableText(), function3, c28655q5, (i15 << 3) & 896, 0);
                    r10 = 0;
                    AbstractC31061c.m95650z(3, 8, c2314t2, c28655q5, false);
                    c28655q2 = c28655q5;
                }
                glowColor = viewState.getGlowColor();
                if (glowColor == 0) {
                    c28655q2.m87150e0(859426687);
                    c28655q2.m87173q(r10);
                    c17919xM31989h = null;
                } else {
                    c28655q2.m87150e0(581912770);
                    c17919xM31989h = AbstractC11895b.m31989h(c28655q2, r10, glowColor.mo134584toComposableColorWaAFU9c(c28655q2, r10));
                }
                if (c17919xM31989h != null) {
                    modifierM11935i = m11935i(c2314t2, c17919xM31989h.f69639a);
                } else {
                    modifierM11935i = c2314t2;
                }
                C2307m c2307m = C2299e.f9103F;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, r10);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM11935i);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                if (viewState.getEnabled() || viewState.getState() == EnumC3920d.LOADING) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                float f13 = 8;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, ((float) 0.5d) * f13, 0.0f, 11 * f13, 0.0f, 10));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t2, "progress_button_text");
                boolean zM87157i = c28655q2.m87157i(interfaceC29805a);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z17 = zM87157i | z14;
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z17 | z15;
                objM87133R = c28655q2.m87133R();
                if (z16 || objM87133R == obj) {
                    objM87133R = new C3718c(interfaceC29805a, function3, viewState, 23);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3599a, z13, null, null, (InterfaceC4339a) objM87133R, 14);
                String strM21274h = AbstractC8693b.m21274h(viewState.getButtonText(), c28655q2, 0);
                if (viewState.getEnabled()) {
                    c28655q2.m87150e0(-1314592362);
                    jM53363d = viewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(-1314590998);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
                }
                C28655q c28655q6 = c28655q2;
                function4 = function3;
                AbstractC30795n.m94707h(strM21274h, modifierM3362g, jM53363d, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getH5(), null, c28655q6, 0, 3120, 185848);
                c28655q3 = c28655q6;
                c28655q3.m87173q(true);
                i16 = a.f16019a[viewState.getState().ordinal()];
                if (i16 != 1) {
                    function5 = function4;
                    c28655q3.m87150e0(1546244727);
                    AbstractC3932p.m11968j(viewState.getEnabled(), viewState.getTotalCount(), viewState.getFilledCount(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIcon(), true, viewState.getFilledPercentage(), viewState.getTestTag(), function5, c28655q3, 1572864 | (1879048192 & (i15 << 24)), 0);
                    c28655q3.m87173q(false);
                } else if (i16 != 2) {
                    function5 = function4;
                    c28655q3.m87150e0(1019728450);
                    AbstractC3918b.m11900d(c28655q3, 0);
                    c28655q3.m87173q(false);
                } else if (i16 != 3) {
                    c28655q3.m87150e0(1546885528);
                    AbstractC3923g.m11910e(viewState.getEnabled(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIconColor(), viewState.getIcon(), viewState.getTestTag(), function4, c28655q3, (i15 << 15) & 3670016, 0);
                    function5 = function4;
                    c28655q3.m87173q(false);
                } else {
                    if (i16 == 4) {
                        throw AbstractC11895b.m32003v(1019709321, c28655q3, false);
                    }
                    c28655q3.m87150e0(1547312987);
                    function5 = function4;
                    AbstractC3932p.m11968j(viewState.getEnabled(), viewState.getTotalCount(), viewState.getFilledCount(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIcon(), false, viewState.getFilledPercentage(), viewState.getTestTag(), function5, c28655q3, (i15 << 24) & 1879048192, 64);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(true);
                c28655q3.m87173q(true);
                function2 = function5;
                c28655q = c28655q3;
            } else {
                c28655q4.m87138X();
                c28655q = c28655q4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 17);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q4.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q4.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C3595n(29);
                    c28655q4.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function2;
            }
            interfaceC29805a = (InterfaceC29805a) c28655q4.m87161k(AbstractC2453v1.f9573l);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q4, 48);
            iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            c2314t = C2314t.f9131w;
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i6 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i6, c23010xM66775a2);
            c0209i = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i, interfaceC28653p1M87165m4);
            c0209i2 = C0217k.f732j;
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i2);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
            errorMessage = viewState.getErrorMessage();
            if (errorMessage == null) {
                c28655q4.m87150e0(859120996);
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
                c2314t2 = c2314t;
                r10 = 0;
                c0209i3 = c0209i;
            } else {
                c28655q4.m87150e0(859120997);
                C28655q c28655q7 = c28655q4;
                c2314t2 = c2314t;
                c0209i3 = c0209i;
                AbstractC3924h.m11918d(errorMessage, viewState.getErrorClickableText(), function3, c28655q7, (i15 << 3) & 896, 0);
                r10 = 0;
                AbstractC31061c.m95650z(3, 8, c2314t2, c28655q7, false);
                c28655q2 = c28655q7;
            }
            glowColor = viewState.getGlowColor();
            if (glowColor == 0) {
                c28655q2.m87150e0(859426687);
                c28655q2.m87173q(r10);
                c17919xM31989h = null;
            } else {
                c28655q2.m87150e0(581912770);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q2, r10, glowColor.mo134584toComposableColorWaAFU9c(c28655q2, r10));
            }
            if (c17919xM31989h != null) {
                modifierM11935i = m11935i(c2314t2, c17919xM31989h.f69639a);
            } else {
                modifierM11935i = c2314t2;
            }
            C2307m c2307m2 = C2299e.f9103F;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, r10);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM11935i);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N5);
            if (viewState.getEnabled()) {
                z13 = false;
            } else {
                z13 = false;
            }
            float f14 = 8;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, ((float) 0.5d) * f14, 0.0f, 11 * f14, 0.0f, 10));
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(interfaceC4339a);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N6);
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t2, "progress_button_text");
            boolean zM87157i2 = c28655q2.m87157i(interfaceC29805a);
            if ((i15 & 112) == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z18 = zM87157i2 | z14;
            if ((i15 & 14) != 4) {
                z15 = true;
            } else {
                z15 = true;
            }
            z16 = z18 | z15;
            objM87133R = c28655q2.m87133R();
            if (z16) {
                objM87133R = new C3718c(interfaceC29805a, function3, viewState, 23);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C3718c(interfaceC29805a, function3, viewState, 23);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3599a2, z13, null, null, (InterfaceC4339a) objM87133R, 14);
            String strM21274h2 = AbstractC8693b.m21274h(viewState.getButtonText(), c28655q2, 0);
            if (viewState.getEnabled()) {
                c28655q2.m87150e0(-1314592362);
                jM53363d = viewState.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1314590998);
                jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q2, 6, false);
            }
            C28655q c28655q8 = c28655q2;
            function4 = function3;
            AbstractC30795n.m94707h(strM21274h2, modifierM3362g2, jM53363d, 0L, null, null, null, 0L, null, new C36775k(6), 0L, 2, false, 1, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getH5(), null, c28655q8, 0, 3120, 185848);
            c28655q3 = c28655q8;
            c28655q3.m87173q(true);
            i16 = a.f16019a[viewState.getState().ordinal()];
            if (i16 != 1) {
                function5 = function4;
                c28655q3.m87150e0(1546244727);
                AbstractC3932p.m11968j(viewState.getEnabled(), viewState.getTotalCount(), viewState.getFilledCount(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIcon(), true, viewState.getFilledPercentage(), viewState.getTestTag(), function5, c28655q3, 1572864 | (1879048192 & (i15 << 24)), 0);
                c28655q3.m87173q(false);
            } else if (i16 != 2) {
                function5 = function4;
                c28655q3.m87150e0(1019728450);
                AbstractC3918b.m11900d(c28655q3, 0);
                c28655q3.m87173q(false);
            } else if (i16 != 3) {
                c28655q3.m87150e0(1546885528);
                AbstractC3923g.m11910e(viewState.getEnabled(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIconColor(), viewState.getIcon(), viewState.getTestTag(), function4, c28655q3, (i15 << 15) & 3670016, 0);
                function5 = function4;
                c28655q3.m87173q(false);
            } else {
                if (i16 == 4) {
                    throw AbstractC11895b.m32003v(1019709321, c28655q3, false);
                }
                c28655q3.m87150e0(1547312987);
                function5 = function4;
                AbstractC3932p.m11968j(viewState.getEnabled(), viewState.getTotalCount(), viewState.getFilledCount(), viewState.getButtonColor(), viewState.getButtonBrush(), viewState.getIcon(), false, viewState.getFilledPercentage(), viewState.getTestTag(), function5, c28655q3, (i15 << 24) & 1879048192, 64);
                c28655q3.m87173q(false);
            }
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
            function2 = function5;
            c28655q = c28655q3;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m11932f(EnumC3919c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m11933g(InterfaceC29805a interfaceC29805a, Function1 function1, C3927k c3927k) {
        interfaceC29805a.mo7428a(0);
        function1.invoke(c3927k.getState().toButtonClickType());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m11934h(C3927k c3927k, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m11931e(c3927k, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final Modifier m11935i(Modifier modifier, long j7) {
        return AbstractC1125a.m3478a(modifier, new C0910b(j7, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m11936j(long j7, InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        float fMo743q0 = drawBehind.mo743q0(AbstractC3928l.m11957b()) * 6.0f;
        float fMo743q1 = drawBehind.mo743q0(AbstractC3928l.m11957b()) * 5.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float f13 = fMo743q0 / 2.0f;
        float f14 = fMo743q1 / fMo743q0;
        C0237p c0237pMo744t0 = drawBehind.mo744t0();
        long jM670A = c0237pMo744t0.m670A();
        c0237pMo744t0.m716w().mo51426q();
        try {
            ((C0929d) c0237pMo744t0.f812x).m2359w(1.0f, jFloatToRawIntBits, f14);
            InterfaceC22131e.m63375G(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.3f, j7)), new C17919x(C17919x.f69636m)), jFloatToRawIntBits, f13, 8), f13, jFloatToRawIntBits, 0.0f, null, 120);
            return C23454a0.f92919a;
        } finally {
            AbstractC11266d.m30472z(c0237pMo744t0, jM670A);
        }
    }
}
