package s31;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import gb1.AbstractC15676d;
import gb1.AbstractC15681i;
import hy0.AbstractC17746g1;
import hy0.AbstractC17783r0;
import hy0.C17750h1;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import o72.C27640a;
import org.xmlpull.v1.XmlPullParserException;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p209i3.C18027i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.C30599e;
import p736sz0.AbstractC33166b0;
import p736sz0.C33169c0;
import p745y81.EnumC39333f;
import q11.C29793c;
import qb0.C30179a;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: s31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a=\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012*\u00020\nH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u0018\u0010\u001f\u001a\u00020\u0016*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c\"\u0018\u0010!\u001a\u00020\u0016*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001c¨\u0006\""}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ls31/e;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Ls31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ls31/d;", "size", "j", "(Landroidx/compose/ui/Modifier;Ls31/e;Ls31/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ls31/a$a;", "cta", "l", "(Ls31/a$a;Landroidx/compose/runtime/Composer;I)V", "", "Li2/x;", "q", "(Ls31/d;Landroidx/compose/runtime/Composer;I)Ljava/util/List;", "Ly3/f;", "a", "F", "PROGRESSIVE_BLUR_END_RADIUS", "", "n", "(Ls31/d;)F", "aspectRatio", "p", "textColumnStartInset", "o", "contentGap", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32106c {

    /* JADX INFO: renamed from: a */
    private static final float f133108a = 8;

    /* JADX INFO: renamed from: s31.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f133109a;

        static {
            int[] iArr = new int[EnumC32107d.values().length];
            try {
                iArr[EnumC32107d.HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32107d.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32107d.TALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f133109a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
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
    /* JADX INFO: renamed from: f */
    public static final void m99906f(Modifier modifier, C32108e viewState, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        C1100b c1100b;
        ?? r10;
        C28655q c28655q2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1677575227);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier3 = i16 != 0 ? c2314t : modifier2;
            EnumC32107d enumC32107dM99922f = viewState.getSize();
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f13 * f13);
            Modifier modifierM44113a = AbstractC15681i.m44113a(AbstractC37056f.m118994r(AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, modifier3), false, m99914n(enumC32107dM99922f)), c33252iM105489e), c33252iM105489e, 0.0f, c28655q3, 0, 2);
            boolean z4 = viewState.getInteraction() != null;
            boolean zM87157i = c28655q3.m87157i(viewState) | ((i15 & 896) == 256);
            Object objM87133R = c28655q3.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C29793c(viewState, onViewEvent, 24);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM44113a, z4, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM44099b);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            AbstractC22403o abstractC22403oM99921e = viewState.getMedia();
            C1100b c1100b2 = C1100b.f4583a;
            if (abstractC22403oM99921e == null) {
                c28655q3.m87150e0(-1955775289);
                AbstractC22989q.m66760a(AbstractC1092a.m3358c(c1100b2.mo3401b(c2314t), C38072d.f163053a.m121949b(c28655q3, 6).getBackgroundDarkStd(), AbstractC17918w0.f69621a), c28655q3, 0);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(-1955596543);
                c28655q3.m87173q(false);
            }
            AbstractC22403o abstractC22403oM99921e2 = viewState.getMedia();
            if (abstractC22403oM99921e2 == null) {
                c28655q3.m87150e0(-1955560832);
                c28655q3.m87173q(false);
                c1100b = c1100b2;
                r10 = 0;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-1955560831);
                c1100b = c1100b2;
                r10 = 0;
                AbstractC17783r0.m51101c(AbstractC22404p.m64500i(abstractC22403oM99921e2, null, null, c28655q3, 0, 3), 0.6666667f, f133108a, c1100b.mo3401b(c2314t), null, c28655q3, 432, 16);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            List<C17919x> listM99917q = m99917q(enumC32107dM99922f, c28655q2, r10);
            if (listM99917q == null) {
                c28655q2.m87150e0(-1955248259);
                c28655q2.m87173q(r10);
            } else {
                c28655q2.m87150e0(-1955248258);
                AbstractC22989q.m66760a(AbstractC1092a.m3357b(c1100b.mo3401b(c2314t), C17909s.m51493k(AbstractC17911t.f69612b, listM99917q, 0.0f, 0.0f, 14), null, 0.0f, 6), c28655q2, r10);
                c28655q2.m87173q(r10);
            }
            m99910j(c1100b.mo3400a(c2314t, C2299e.f9104G), viewState, enumC32107dM99922f, onViewEvent, c28655q2, ((i15 << 3) & 7168) | (i15 & 112), 0);
            c28655q2.m87173q(true);
            modifier2 = modifier3;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 26, modifier2, viewState, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Modifier m99907g(C32108e c32108e, Function1 function1, Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1772c1.m5391i(applyIf, false, new C18027i(0), new C30599e(c32108e, function1, 27), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m99908h(C32108e c32108e, Function1 function1) {
        GenericInteraction genericInteractionM99920c = c32108e.getInteraction();
        if (genericInteractionM99920c != null) {
            function1.invoke(genericInteractionM99920c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99909i(Modifier modifier, C32108e c32108e, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m99906f(modifier, c32108e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v22 */
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
    /* JADX INFO: renamed from: j */
    private static final void m99910j(Modifier modifier, C32108e c32108e, EnumC32107d enumC32107d, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28655q c28655q;
        ?? r10;
        C2314t c2314t;
        C28655q c28655q2;
        ?? r14;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(636604679);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(c32108e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87149e(enumC32107d.ordinal()) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t2;
            }
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, modifier2));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q3, 48);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            Modifier modifier4 = modifier2;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), m99916p(enumC32107d), 0.0f, 0.0f, 0.0f, 14);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(m99915o(enumC32107d));
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q3, 0);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q3, 0);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, c2314t2);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
            C17750h1 c17750h1M99923g = c32108e.getTag();
            if (c17750h1M99923g == null) {
                c28655q3.m87150e0(1635500665);
                c28655q3.m87173q(false);
                c2314t = c2314t2;
                r10 = 1;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(1635500666);
                r10 = 1;
                c2314t = c2314t2;
                AbstractC17746g1.m50872h(c17750h1M99923g, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 1 * f13, 7), null, c28655q3, 48, 4);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                c28655q2 = c28655q4;
            }
            AbstractC33166b0.m105053d(null, c32108e.getTitle(), 0, 0, 0, c28655q2, 0, 29);
            C33169c0 c33169c0M99919b = c32108e.getDescription();
            if (c33169c0M99919b == null) {
                c28655q2.m87150e0(1635706102);
                r14 = 0;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1635706103);
                AbstractC33166b0.m105053d(AbstractC1099a.m3398t(c2314t, 0.0f, ((float) r10) * f13, 0.0f, 0.0f, 13), c33169c0M99919b, 0, 0, 0, c28655q2, 6, 28);
                r14 = 0;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(r10);
            if (c32108e.getCta() instanceof InterfaceC32104a.a) {
                c28655q2.m87150e0(-206307482);
                m99912l((InterfaceC32104a.a) c32108e.getCta(), c28655q2, r14);
                c28655q2.m87173q(r14);
            } else {
                c28655q2.m87150e0(-206231563);
                c28655q2.m87173q(r14);
            }
            c28655q2.m87173q(r10);
            if (c32108e.getCta() instanceof InterfaceC32104a.b) {
                c28655q2.m87150e0(-461898890);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(((InterfaceC32104a.b) c32108e.getCta()).getIcon().toWhoopIcon(), c28655q2, 6), null, AbstractC1102d.m3419p(5 * 4, AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14)), C38072d.f163053a.m121949b(c28655q2, 6).getBrandWhite(), c28655q2, 432, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-461572801);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(r10);
            modifier3 = modifier4;
            c28655q = c28655q2;
        } else {
            c28655q3.m87138X();
            modifier3 = modifier2;
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a(modifier3, c32108e, enumC32107d, function1, i13, i14, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m99911k(Modifier modifier, C32108e c32108e, EnumC32107d enumC32107d, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m99910j(modifier, c32108e, enumC32107d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m99912l(InterfaceC32104a.a aVar, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(618716633);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            String upperCase = aVar.getText().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC33166b0.m105053d(null, new C33169c0(upperCase, EnumC2888c.BT_S, EnumC39333f.BRAND_WHITE, 5, null, null, null, null, false, null, 752, null), 0, 0, 0, c28655q, 0, 29);
            float f13 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(aVar.getIcon().toWhoopIcon(), c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14)), C38072d.f163053a.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(aVar, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m99913m(InterfaceC32104a.a aVar, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m99912l(aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final float m99914n(EnumC32107d enumC32107d) {
        int i13 = a.f133109a[enumC32107d.ordinal()];
        if (i13 == 1) {
            return 2.0287356f;
        }
        if (i13 == 2) {
            return 1.063253f;
        }
        if (i13 == 3) {
            return 0.706f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private static final float m99915o(EnumC32107d enumC32107d) {
        int i13 = a.f133109a[enumC32107d.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2) {
            return 1 * 8;
        }
        if (i13 == 3) {
            return ((float) 1.5d) * 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: p */
    private static final float m99916p(EnumC32107d enumC32107d) {
        int i13 = a.f133109a[enumC32107d.ordinal()];
        if (i13 == 1) {
            return 0;
        }
        if (i13 == 2 || i13 == 3) {
            return ((float) 0.75d) * 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: q */
    private static final List<C17919x> m99917q(EnumC32107d enumC32107d, Composer composer, int i13) {
        int i14 = a.f133109a[enumC32107d.ordinal()];
        if (i14 == 1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1416572276);
            int i15 = C17919x.f69638o;
            List<C17919x> listM118959K = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q, 6).getBlack30()));
            c28655q.m87173q(false);
            return listM118959K;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                throw AbstractC11895b.m32003v(-1416573519, (C28655q) composer, false);
            }
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-963903419);
            c28655q2.m87173q(false);
            return null;
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-1416569588);
        int i16 = C17919x.f69638o;
        List<C17919x> listM118959K2 = AbstractC37056f.m118959K(new C17919x(C17919x.f69636m), new C17919x(C38072d.f163053a.m121949b(c28655q3, 6).getBlack20()));
        c28655q3.m87173q(false);
        return listM118959K2;
    }
}
