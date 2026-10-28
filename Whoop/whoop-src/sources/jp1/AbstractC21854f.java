package jp1;

import am2.C1012d;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.CalendarView;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.viewinterop.AbstractC1137a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cp1.AbstractC11022i;
import cp1.EnumC11017d;
import fp1.C14676d;
import gb1.AbstractC15673b0;
import hp1.AbstractC17546f;
import hp1.C17542b;
import if0.C18451b;
import ig0.C18468h;
import io.sentry.config.AbstractC20301a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import l83.C23454a0;
import l83.C23464j;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p251jg.C21650c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import xn1.AbstractC38481d;

/* JADX INFO: renamed from: jp1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lhp1/b;", "viewState", "Lcp1/d;", "type", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Lhp1/b;Lcp1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "hormonal-insights_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21854f {

    /* JADX INFO: renamed from: jp1.f$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84407a;

        static {
            int[] iArr = new int[EnumC11017d.values().length];
            try {
                iArr[EnumC11017d.POSTPARTUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC11017d.MCI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84407a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:106:0x0325  */
    /* JADX WARN: Code duplicated, block: B:107:0x0327  */
    /* JADX WARN: Code duplicated, block: B:111:0x0330  */
    /* JADX WARN: Code duplicated, block: B:113:0x0343  */
    /* JADX WARN: Code duplicated, block: B:116:0x034f  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:65:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0132  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:91:0x025b  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    /* JADX INFO: renamed from: j */
    public static final void m61849j(C17542b c17542b, EnumC11017d enumC11017d, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        EnumC11017d enumC11017d2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        EnumC11017d enumC11017d3;
        C28676v0 c28676v0;
        Function1 function4;
        Calendar calendar;
        Function1 function5;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R;
        Function1 function6;
        int i17;
        Function1 function7;
        int iHashCode2;
        boolean zM87157i;
        Object objM87133R2;
        ?? r10;
        int i18;
        boolean z16;
        boolean zM87157i2;
        Object objM87133R3;
        ?? r14;
        Object objM87133R4;
        Object objM87133R5;
        C17542b viewState = c17542b;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1890550730);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87149e(enumC11017d == null ? -1 : enumC11017d.ordinal()) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    enumC11017d3 = EnumC11017d.POSTPARTUM;
                } else {
                    enumC11017d3 = enumC11017d;
                }
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C21650c(18);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                calendar = Calendar.getInstance();
                C22669g0 c22669g0 = new C22669g0();
                calendar.setTime(viewState.getStartDate());
                c22669g0.f89336w = simpleDateFormat.format(calendar.getTime());
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM66725n = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                function5 = function4;
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66725n);
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
                TextResource textResourceM49870e = viewState.getNavigationTitle();
                TextResource textResourceM49869d = viewState.getNavigationSubtitle();
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i16 = i15 & 896;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objM87133R = c28655q.m87133R();
                if (!z15 || objM87133R == c28676v0) {
                    function6 = function5;
                    objM87133R = new C21850b(enumC11017d3, function6, 0);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function6 = function5;
                }
                i17 = TextResource.$stable;
                function7 = function6;
                EnumC11017d enumC11017d4 = enumC11017d3;
                AbstractC21865q.m61949e(textResourceM49870e, textResourceM49869d, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i17 | (i17 << 3), 28);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC11895b.m32006y(1.0f, true, c28655q);
                float f13 = 3;
                Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, c2314t);
                C23010x c23010xM73381n = AbstractC25012a.m73381n(f13, 4, C2299e.f9111N, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                String strM21274h = AbstractC8693b.m21274h(c17542b.getTitle(), c28655q, i17);
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM21274h, AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i25).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getT1(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
                zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(c17542b);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C21851c(0, calendar, c17542b);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC1137a.m3601a((Function1) objM87133R2, AbstractC1102d.m3429z(c2314t, null, 3), new C18468h(calendar, c22669g0, simpleDateFormat, 25), c28655q, 48, 0);
                viewState = c17542b;
                AbstractC27282u.m82292h(AbstractC1102d.m3409f(1.0f, c2314t), EnumC27284v.TextLarge, AbstractC8693b.m21274h(c17542b.getButtonTitle(), c28655q, i17), false, c38072d.m121949b(c28655q, i25).getSleepLightSleep(), null, false, new C1012d((Object) enumC11017d4, function7, (Object) c17542b, (Object) c22669g0, 17), c28655q, 54, 104);
                c28655q = c28655q;
                if (viewState.getSkipNextId() == null) {
                    c28655q.m87150e0(1817990668);
                    r10 = 0;
                    c28655q.m87173q(false);
                    i18 = 256;
                } else {
                    r10 = 0;
                    c28655q.m87150e0(1817990669);
                    TextResource textResourceM49873h = viewState.getSkipTitle();
                    i18 = 256;
                    if (i16 == 256) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i2 = c28655q.m87157i(viewState) | z16;
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C21851c(1, function7, viewState);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC27265l0.m82217i(null, null, textResourceM49873h, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q, i17 << 6, 0, 4091);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (i16 == i18) {
                    r14 = 1;
                } else {
                    r14 = r10;
                }
                objM87133R4 = c28655q.m87133R();
                if (r14 == 0 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C18451b(function7, 26);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, r10, c28655q, r10, 1);
                function3 = function7;
                enumC11017d2 = enumC11017d4;
            } else {
                c28655q.m87138X();
                enumC11017d2 = enumC11017d;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(viewState, enumC11017d2, function3, i13, i14, 0);
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
            if (i19 != 0) {
                enumC11017d3 = EnumC11017d.POSTPARTUM;
            } else {
                enumC11017d3 = enumC11017d;
            }
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C21650c(18);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
            calendar = Calendar.getInstance();
            C22669g0 c22669g1 = new C22669g0();
            calendar.setTime(viewState.getStartDate());
            c22669g1.f89336w = simpleDateFormat2.format(calendar.getTime());
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM66725n2 = AbstractC22953f.m66725n(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            function5 = function4;
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM66725n2);
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
            TextResource textResourceM49870e2 = viewState.getNavigationTitle();
            TextResource textResourceM49869d2 = viewState.getNavigationSubtitle();
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            i16 = i15 & 896;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objM87133R = c28655q.m87133R();
            if (z15) {
                function6 = function5;
                objM87133R = new C21850b(enumC11017d3, function6, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                function6 = function5;
                objM87133R = new C21850b(enumC11017d3, function6, 0);
                c28655q.m87172p0(objM87133R);
            }
            i17 = TextResource.$stable;
            function7 = function6;
            EnumC11017d enumC11017d5 = enumC11017d3;
            AbstractC21865q.m61949e(textResourceM49870e2, textResourceM49869d2, 0, null, null, (InterfaceC4339a) objM87133R, c28655q, i17 | (i17 << 3), 28);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            float f14 = 3;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(8 * f14, c2314t2);
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(f14, 4, C2299e.f9111N, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM73381n2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            String strM21274h2 = AbstractC8693b.m21274h(c17542b.getTitle(), c28655q, i17);
            C38072d c38072d2 = C38072d.f163053a;
            int i26 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h2, AbstractC1102d.m3409f(1.0f, c2314t2), c38072d2.m121949b(c28655q, i26).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i26).getT1(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
            zM87157i = c28655q.m87157i(calendar) | c28655q.m87157i(c17542b);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C21851c(0, calendar, c17542b);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21851c(0, calendar, c17542b);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC1137a.m3601a((Function1) objM87133R2, AbstractC1102d.m3429z(c2314t2, null, 3), new C18468h(calendar, c22669g1, simpleDateFormat2, 25), c28655q, 48, 0);
            viewState = c17542b;
            AbstractC27282u.m82292h(AbstractC1102d.m3409f(1.0f, c2314t2), EnumC27284v.TextLarge, AbstractC8693b.m21274h(c17542b.getButtonTitle(), c28655q, i17), false, c38072d2.m121949b(c28655q, i26).getSleepLightSleep(), null, false, new C1012d((Object) enumC11017d5, function7, (Object) c17542b, (Object) c22669g1, 17), c28655q, 54, 104);
            c28655q = c28655q;
            if (viewState.getSkipNextId() == null) {
                c28655q.m87150e0(1817990668);
                r10 = 0;
                c28655q.m87173q(false);
                i18 = 256;
            } else {
                r10 = 0;
                c28655q.m87150e0(1817990669);
                TextResource textResourceM49873h2 = viewState.getSkipTitle();
                i18 = 256;
                if (i16 == 256) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i2 = c28655q.m87157i(viewState) | z16;
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R3 = new C21851c(1, function7, viewState);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C21851c(1, function7, viewState);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM49873h2, null, null, false, null, null, false, false, null, null, (Function1) objM87133R3, c28655q, i17 << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (i16 == i18) {
                r14 = 1;
            } else {
                r14 = r10;
            }
            objM87133R4 = c28655q.m87133R();
            if (r14 == 0) {
                objM87133R4 = new C18451b(function7, 26);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C18451b(function7, 26);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R4, r10, c28655q, r10, 1);
            function3 = function7;
            enumC11017d2 = enumC11017d5;
        } else {
            c28655q.m87138X();
            enumC11017d2 = enumC11017d;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(viewState, enumC11017d2, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m61850k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m61851l(EnumC11017d enumC11017d, Function1 function1) {
        int i13 = a.f84407a[enumC11017d.ordinal()];
        if (i13 == 1) {
            function1.invoke(AbstractC17546f.a.f67870a);
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(AbstractC11022i.a.f34542a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final CalendarView m61852m(Calendar calendar, C17542b c17542b, Context context) {
        AbstractC22676k.m65750j(context, "context");
        CalendarView calendarView = new CalendarView(new ContextThemeWrapper(context, AbstractC38481d.f164876a));
        calendarView.setWeekDayTextAppearance(AbstractC38481d.f164878c);
        calendarView.setDateTextAppearance(AbstractC38481d.f164877b);
        calendarView.setDate(calendar.getTimeInMillis());
        Object objClone = calendar.clone();
        AbstractC22676k.m65748h(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.setTime(c17542b.getMinDate());
        calendarView.setMinDate(calendar2.getTimeInMillis());
        Object objClone2 = calendar.clone();
        AbstractC22676k.m65748h(objClone2, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar3 = (Calendar) objClone2;
        calendar3.setTime(c17542b.getMaxDate());
        calendarView.setMaxDate(calendar3.getTimeInMillis());
        calendarView.setFirstDayOfWeek(1);
        return calendarView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m61853n(final Calendar calendar, final C22669g0 c22669g0, final SimpleDateFormat simpleDateFormat, CalendarView views) {
        AbstractC22676k.m65750j(views, "views");
        views.setOnDateChangeListener(new CalendarView.OnDateChangeListener() { // from class: jp1.e
            @Override // android.widget.CalendarView.OnDateChangeListener
            public final void onSelectedDayChange(CalendarView calendarView, int i13, int i14, int i15) {
                AbstractC21854f.m61854o(calendar, c22669g0, simpleDateFormat, calendarView, i13, i14, i15);
            }
        });
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final void m61854o(Calendar calendar, C22669g0 c22669g0, SimpleDateFormat simpleDateFormat, CalendarView calendarView, int i13, int i14, int i15) {
        AbstractC22676k.m65750j(calendarView, "<unused var>");
        calendar.set(i13, i14, i15);
        c22669g0.f89336w = simpleDateFormat.format(calendar.getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m61855p(EnumC11017d enumC11017d, Function1 function1, C17542b c17542b, C22669g0 c22669g0) {
        int i13 = a.f84407a[enumC11017d.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new C23464j("An operation is not implemented: CALL PREGNANCY ONBOARDING");
        }
        function1.invoke(new AbstractC17546f.c(c17542b.getNextId(), new C14676d((String) c22669g0.f89336w, null, null, false, null, 0, null, null, null, null, 1022, null)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m61856q(Function1 function1, C17542b c17542b, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC17546f.g(c17542b.getSkipNextId()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m61857r(Function1 function1) {
        function1.invoke(AbstractC17546f.a.f67870a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m61858s(C17542b c17542b, EnumC11017d enumC11017d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m61849j(c17542b, enumC11017d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
