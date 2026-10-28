package e51;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2101a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import do0.C12229c;
import e11.C12582b;
import hy0.AbstractC17755i2;
import ih0.AbstractC18489d0;
import l83.C23454a0;
import l83.InterfaceC23459e;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p31.AbstractC28799j;
import p31.AbstractC28803n;
import p31.AbstractC28805p;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import v41.AbstractC35667g0;
import v41.EnumC35665f0;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e51.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le51/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12727c {

    /* JADX INFO: renamed from: e51.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43534a;

        static {
            int[] iArr = new int[EnumC35665f0.values().length];
            try {
                iArr[EnumC35665f0.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC35665f0.FilledCard.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f43534a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0274  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:107:0x02da  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x0218  */
    /* JADX WARN: Code duplicated, block: B:85:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0237  */
    /* JADX WARN: Code duplicated, block: B:96:0x025a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0271  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    public static final void m35585e(Modifier modifier, C12729e state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier3;
        Object obj;
        Function1 function4;
        AbstractC28805p.a headerState;
        TextResource title;
        boolean zM21270d;
        C2305k c2305k;
        Function1 function5;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C2305k c2305k2;
        C28655q c28655q2;
        ?? r10;
        C0209i c0209i4;
        C0209i c0209i5;
        C2314t c2314t2;
        InterfaceC4339a interfaceC4339a2;
        C28655q c28655q3;
        C28655q c28655q4;
        int iHashCode2;
        C28655q c28655q5;
        int i17;
        Modifier modifierM3394p;
        Object objM87133R;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q6 = (C28655q) composer;
        c28655q6.m87154g0(1323688842);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q6.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q6.m87157i(state) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q6.m87157i(function2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q6.m87135U(i16 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                obj = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R = c28655q6.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = new C12229c(25);
                        c28655q6.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                headerState = state.getHeaderState();
                if (headerState != null) {
                    title = headerState.getTitle();
                } else {
                    title = state.getTitle();
                }
                zM21270d = AbstractC8693b.m21270d(title);
                Modifier modifierM3398t = AbstractC1099a.m3398t(modifier3, state.getLeadingPadding(), 0.0f, state.getTrailingPadding(), 0.0f, 10);
                Modifier modifier4 = modifier3;
                C22957g c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q6, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q6.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q6.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q6, modifierM3398t);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q6.m87158i0();
                if (c28655q6.f115903S) {
                    c28655q6.m87163l(interfaceC4339a);
                } else {
                    c28655q6.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q6.f115903S || !AbstractC22676k.m65745e(c28655q6.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
                }
                C0209i c0209i6 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q6, c0209i6, modifierM118962N);
                if (headerState == null && AbstractC8693b.m21270d(headerState.getTitle())) {
                    c28655q6.m87150e0(-1204831347);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    Object objM87133R2 = c28655q6.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C12229c(26);
                        c28655q6.m87172p0(objM87133R2);
                    }
                    c2305k2 = c2305k;
                    C28655q c28655q7 = c28655q6;
                    AbstractC28803n.m87621p(headerState, modifierM3409f, (Function1) objM87133R2, c28655q7, 432, 0);
                    c28655q7.m87173q(false);
                    r10 = 0;
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q4 = c28655q7;
                } else {
                    c2305k2 = c2305k;
                    c28655q2 = c28655q6;
                    if (headerState == null || !AbstractC8693b.m21270d(state.getTitle())) {
                        r10 = 0;
                        c0209i4 = c0209i2;
                        c0209i5 = c0209i;
                        c2314t2 = c2314t;
                        interfaceC4339a2 = interfaceC4339a;
                        c28655q2.m87150e0(-1204414738);
                        c28655q2.m87173q(false);
                        c28655q4 = c28655q2;
                    } else {
                        c28655q2.m87150e0(-1204582262);
                        c2314t2 = c2314t;
                        interfaceC4339a2 = interfaceC4339a;
                        c0209i5 = c0209i;
                        r10 = 0;
                        c0209i4 = c0209i2;
                        AbstractC17755i2.m50938j(null, null, null, state.getTitle(), null, 0L, 0L, state.getTitleTypography(), c28655q2, 0, 119);
                        c28655q3.m87173q(false);
                    }
                }
                if (zM21270d) {
                    c28655q3 = c28655q2;
                    c28655q4 = c28655q3;
                    if (state.m35593e().isEmpty()) {
                        c28655q3 = c28655q2;
                        c28655q4 = c28655q3;
                        c28655q4.m87150e0(-1204269906);
                        c28655q4.m87173q(r10);
                    } else {
                        c28655q4.m87150e0(-1204355435);
                        AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(AbstractC12730f.m35601b(), c2314t2));
                        c28655q4.m87173q(r10);
                    }
                } else {
                    c28655q3 = c28655q2;
                    c28655q4 = c28655q3;
                    c28655q4.m87150e0(-1204269906);
                    c28655q4.m87173q(r10);
                }
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(state.getSpacingType().getSpacing()), c2305k2, c28655q4, r10);
                iHashCode2 = Long.hashCode(c28655q4.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, c2314t2);
                c28655q4.m87158i0();
                if (c28655q4.f115903S) {
                    c28655q4.m87163l(interfaceC4339a2);
                } else {
                    c28655q4.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m2);
                if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q4, c0209i6, modifierM118962N2);
                c28655q4.m87150e0(-1942248066);
                c28655q5 = c28655q4;
                for (InterfaceC25312u interfaceC25312u : state.m35593e()) {
                    i17 = a.f43534a[AbstractC35667g0.m112966h(interfaceC25312u).ordinal()];
                    if (i17 != 1) {
                        c28655q5.m87150e0(-730692572);
                        c28655q5.m87173q(r10);
                        modifierM3394p = c2314t2;
                    } else {
                        if (i17 == 2) {
                            throw AbstractC11895b.m32003v(-730694876, c28655q5, r10);
                        }
                        c28655q5.m87150e0(-730682928);
                        modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t2), 3, 4), C38072d.f163053a.m121949b(c28655q5, 6).getWhite10(), AbstractC17918w0.f69621a));
                        c28655q5.m87173q(r10);
                    }
                    C28655q c28655q8 = c28655q5;
                    AbstractC25303l.m74291r(interfaceC25312u, null, new C2101a(3, modifierM3394p), function5, c28655q8, (i16 << 3) & 7168, 2);
                    c28655q5 = c28655q8;
                }
                function2 = function5;
                AbstractC25012a.m73392y(c28655q5, r10, true, true);
                modifier2 = modifier4;
                c28655q = c28655q5;
            } else {
                C28655q c28655q9 = c28655q6;
                c28655q9.m87138X();
                c28655q = c28655q9;
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 3, (Object) modifier2, (Object) state, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q6.m87135U(i16 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            obj = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R = c28655q6.m87133R();
                if (objM87133R == obj) {
                    objM87133R = new C12229c(25);
                    c28655q6.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            headerState = state.getHeaderState();
            if (headerState != null) {
                title = headerState.getTitle();
            } else {
                title = state.getTitle();
            }
            zM21270d = AbstractC8693b.m21270d(title);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(modifier3, state.getLeadingPadding(), 0.0f, state.getTrailingPadding(), 0.0f, 10);
            Modifier modifier5 = modifier3;
            C22957g c22957g2 = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q6, 0);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q6.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q6.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q6, modifierM3398t2);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q6.m87158i0();
            if (c28655q6.f115903S) {
                c28655q6.m87163l(interfaceC4339a);
            } else {
                c28655q6.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q6, c0209i, c23010xM66775a3);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q6, c0209i2, interfaceC28653p1M87165m3);
            c0209i3 = C0217k.f732j;
            if (c28655q6.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q6, iHashCode, c0209i3);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q6, c0209i7, modifierM118962N3);
            if (headerState == null) {
                c2305k2 = c2305k;
                c28655q2 = c28655q6;
                if (headerState == null) {
                    r10 = 0;
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q2.m87150e0(-1204414738);
                    c28655q2.m87173q(false);
                    c28655q4 = c28655q2;
                } else {
                    r10 = 0;
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q2.m87150e0(-1204414738);
                    c28655q2.m87173q(false);
                    c28655q4 = c28655q2;
                }
            } else {
                c2305k2 = c2305k;
                c28655q2 = c28655q6;
                if (headerState == null) {
                    r10 = 0;
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q2.m87150e0(-1204414738);
                    c28655q2.m87173q(false);
                    c28655q4 = c28655q2;
                } else {
                    r10 = 0;
                    c0209i4 = c0209i2;
                    c0209i5 = c0209i;
                    c2314t2 = c2314t;
                    interfaceC4339a2 = interfaceC4339a;
                    c28655q2.m87150e0(-1204414738);
                    c28655q2.m87173q(false);
                    c28655q4 = c28655q2;
                }
            }
            if (zM21270d) {
                c28655q3 = c28655q2;
                c28655q4 = c28655q3;
                if (state.m35593e().isEmpty()) {
                    c28655q4.m87150e0(-1204355435);
                    AbstractC22953f.m66715b(c28655q4, AbstractC1102d.m3411h(AbstractC12730f.m35601b(), c2314t2));
                    c28655q4.m87173q(r10);
                } else {
                    c28655q3 = c28655q2;
                    c28655q4 = c28655q3;
                    c28655q4.m87150e0(-1204269906);
                    c28655q4.m87173q(r10);
                }
            } else {
                c28655q3 = c28655q2;
                c28655q4 = c28655q3;
                c28655q4.m87150e0(-1204269906);
                c28655q4.m87173q(r10);
            }
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(state.getSpacingType().getSpacing()), c2305k2, c28655q4, r10);
            iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q4.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q4, c2314t2);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i5, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q4, c0209i4, interfaceC28653p1M87165m4);
            if (c28655q4.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q4, c0209i7, modifierM118962N4);
            c28655q4.m87150e0(-1942248066);
            c28655q5 = c28655q4;
            while (r0.hasNext()) {
                i17 = a.f43534a[AbstractC35667g0.m112966h(interfaceC25312u).ordinal()];
                if (i17 != 1) {
                    c28655q5.m87150e0(-730692572);
                    c28655q5.m87173q(r10);
                    modifierM3394p = c2314t2;
                } else {
                    if (i17 == 2) {
                        throw AbstractC11895b.m32003v(-730694876, c28655q5, r10);
                    }
                    c28655q5.m87150e0(-730682928);
                    modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, c2314t2), 3, 4), C38072d.f163053a.m121949b(c28655q5, 6).getWhite10(), AbstractC17918w0.f69621a));
                    c28655q5.m87173q(r10);
                }
                C28655q c28655q10 = c28655q5;
                AbstractC25303l.m74291r(interfaceC25312u, null, new C2101a(3, modifierM3394p), function5, c28655q10, (i16 << 3) & 7168, 2);
                c28655q5 = c28655q10;
            }
            function2 = function5;
            AbstractC25012a.m73392y(c28655q5, r10, true, true);
            modifier2 = modifier5;
            c28655q = c28655q5;
        } else {
            C28655q c28655q11 = c28655q6;
            c28655q11.m87138X();
            c28655q = c28655q11;
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 3, (Object) modifier2, (Object) state, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m35586f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m35587g(AbstractC28799j it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Modifier m35588h(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(791480908);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m35589i(Modifier modifier, C12729e c12729e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35585e(modifier, c12729e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
