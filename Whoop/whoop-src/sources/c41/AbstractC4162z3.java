package c41;

import a01.C0089i;
import a80.C0539c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bs1.C3603v;
import c31.C3929m;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16315n0;
import ih0.AbstractC18489d0;
import iz0.AbstractC21048g;
import iz0.C21053l;
import l83.C23454a0;
import m41.AbstractC25053e;
import n41.C26271b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p132f0.C13825t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.z3 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lc41/a4;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Lc41/a4;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4162z3 {

    /* JADX INFO: renamed from: c41.z3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16932a;

        static {
            int[] iArr = new int[EnumC3996b4.values().length];
            try {
                iArr[EnumC3996b4.GOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3996b4.ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16932a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m12991e(C3989a4 viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i16;
        AbstractC17911t abstractC17911tM43996M;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-93613930);
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
                        objM87133R2 = new C3929m(19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 112) == 32);
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C3603v(viewState, function4, 15);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                long white10 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
                float f13 = 1;
                i16 = a.f16932a[viewState.getBorderStyle().ordinal()];
                if (i16 != 1) {
                    abstractC17911tM43996M = AbstractC15673b0.m43996M();
                } else {
                    if (i16 == 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC17911tM43996M = AbstractC15673b0.m44000O();
                }
                AbstractC31926e.m99375j(modifierM3362g, null, white10, AbstractC33253j.m105489e(3 * 4), new C13825t(f13, abstractC17911tM43996M), null, 0.0f, AbstractC37817c.m121344e(790105126, c28655q, new C0539c(viewState, 26)), c28655q, 12582912, 98);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 19);
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
                    objM87133R2 = new C3929m(19);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            if ((i15 & 14) != 4) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13 | ((i15 & 112) == 32);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C3603v(viewState, function4, 15);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C3603v(viewState, function4, 15);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            long white11 = C38072d.f163053a.m121949b(c28655q, 6).getWhite10();
            float f14 = 1;
            i16 = a.f16932a[viewState.getBorderStyle().ordinal()];
            if (i16 != 1) {
                abstractC17911tM43996M = AbstractC15673b0.m43996M();
            } else {
                if (i16 == 2) {
                    throw new NoWhenBranchMatchedException();
                }
                abstractC17911tM43996M = AbstractC15673b0.m44000O();
            }
            AbstractC31926e.m99375j(modifierM3362g2, null, white11, AbstractC33253j.m105489e(3 * 4), new C13825t(f14, abstractC17911tM43996M), null, 0.0f, AbstractC37817c.m121344e(790105126, c28655q, new C0539c(viewState, 26)), c28655q, 12582912, 98);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function3, i14, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m12992f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m12993g(C3989a4 c3989a4, Function1 function1) {
        if (c3989a4.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String() != null) {
            function1.invoke(c3989a4.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String());
        }
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
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m12994h(C3989a4 c3989a4, Composer composer, int i13) {
        C0209i c0209i;
        int i14;
        float f13;
        C0209i c0209i2;
        float f14;
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        C2314t c2314t = C2314t.f9131w;
        float f15 = 2;
        float f16 = 8;
        Modifier modifierM3394p = AbstractC1099a.m3394p(f15 * f16, AbstractC1102d.m3409f(1.0f, c2314t));
        float f17 = 4;
        C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(f15, f17, C2299e.f9108K, c28655q, 54);
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
        C0209i c0209i3 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M53376q);
        C0209i c0209i4 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
        C0209i c0209i5 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
        }
        C0209i c0209i6 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
        String strM12041b = c3989a4.getLeadingIcon();
        Object obj = null;
        Integer numM46376a = strM12041b != null ? AbstractC16315n0.m46376a(strM12041b) : null;
        if (numM46376a == null) {
            c28655q.m87150e0(-930577608);
            c28655q.m87173q(false);
            f14 = 1.0f;
            c0209i = c0209i5;
            f13 = f16;
            c0209i2 = c0209i6;
            i14 = 6;
        } else {
            c28655q.m87150e0(-930577607);
            int iIntValue = numM46376a.intValue();
            Modifier modifierM3419p = AbstractC1102d.m3419p(5 * f17, c2314t);
            c0209i = c0209i5;
            i14 = 6;
            f13 = f16;
            c0209i2 = c0209i6;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(iIntValue, c28655q, 6), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), modifierM3419p, C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 384, 0);
            c28655q.m87173q(false);
            f14 = 1.0f;
        }
        if (f14 <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f14, true);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 0.5d) * f13), C2299e.f9110M, c28655q, i14);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
        }
        AbstractC28683x.m87239G(c28655q, c0209i2, modifierM118962N2);
        String strM12042c = c3989a4.getMarkdownTitle();
        if (strM12042c == null) {
            c28655q.m87150e0(355297108);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(355297109);
            C21053l c21053l = C21053l.f79834a;
            C38072d c38072d = C38072d.f163053a;
            AbstractC21048g.m58807M(strM12042c, null, false, c21053l.m58880a(c38072d.m121952e(c28655q, i14).getSh4().getStyle(), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, 0L, null, 0L, 0, 0L, null, 0L, 0.0f, 0.0f, false, false, 0.0f, c28655q, 0, ProfileVerifier.CompilationStatus.f6515xf2722a21, 32764), null, 0, 0, 0, false, c28655q, 0, 502);
            c28655q.m87173q(false);
            obj = c23454a0;
        }
        if (obj == null) {
            c28655q = c28655q;
            c28655q.m87150e0(355662444);
            TextResource textResourceM12048i = c3989a4.getTitle();
            if (textResourceM12048i == null) {
                c28655q.m87150e0(-1343706304);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1343706303);
                String strM21274h = AbstractC8693b.m21274h(textResourceM12048i, c28655q, 0);
                C38072d c38072d2 = C38072d.f163053a;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(strM21274h, null, c38072d2.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i14).getSh4(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        } else {
            c28655q = c28655q;
            c28655q.m87150e0(11460768);
            c28655q.m87173q(false);
        }
        TextResource textResourceM12043d = c3989a4.getSubtitle();
        if (textResourceM12043d == null) {
            c28655q.m87150e0(356035838);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(356035839);
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM12043d, c28655q, 0);
            C38072d c38072d3 = C38072d.f163053a;
            C28655q c28655q3 = c28655q;
            AbstractC30795n.m94707h(strM21274h2, null, c38072d3.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i14).getB2(), null, c28655q3, 0, 0, 196602);
            c28655q = c28655q3;
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        C26271b c26271bM12047h = c3989a4.getTimerState();
        if (c26271bM12047h == null) {
            c28655q.m87150e0(-928966352);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-928966351);
            C28655q c28655q4 = c28655q;
            AbstractC25053e.m73524z(c2314t, c26271bM12047h, null, c28655q4, 6, 4);
            c28655q = c28655q4;
            c28655q.m87173q(false);
        }
        if (c3989a4.getShowChevron()) {
            Modifier modifierM53365f = AbstractC18489d0.m53365f(c28655q, -928736548, f17, f17, c2314t);
            C38072d c38072d4 = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d4.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationForward(), c28655q, i14), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62278S), modifierM53365f, c38072d4.m121949b(c28655q, i14).getBrandWhite(), c28655q, 384, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-928388232);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m12995i(C3989a4 c3989a4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m12991e(c3989a4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
