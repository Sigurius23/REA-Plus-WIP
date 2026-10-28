package p31;

import a11.C0137o;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.C1119d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.C1815o0;
import az0.C2158a;
import b11.C2275b;
import b91.C2886a;
import b91.EnumC2888c;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import e61.C12762e;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import ih0.AbstractC18489d0;
import kd1.EnumC22400l;
import l83.C23454a0;
import nm1.C26842g;
import nx1.C27225g;
import ny0.AbstractC27242b1;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.C27270o;
import ny0.EnumC27269n0;
import of2.C27900d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15210z4;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22965i;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28329e;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: p31.n */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a-\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010\"\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b$\u0010 \u001a\u0019\u0010%\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b%\u0010#¨\u0006&"}, m65681d2 = {"Lp31/p;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lp31/j;", "Ll83/a0;", "onClick", "p", "(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp31/p$a;", "", "onEvent", "v", "(Lp31/p$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lp31/p$d;", "E", "(Lp31/p$d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lp31/p$c;", "C", "(Lp31/p$c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "Lp31/p$e;", "Lkotlin/Function0;", "G", "(Lp31/p$e;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lp31/p$b;", "z", "(Lp31/p$b;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lp31/r;", "style", "Lb91/a;", "L", "(Lp31/r;Landroidx/compose/runtime/Composer;I)Lb91/a;", "Li2/x;", "K", "(Lp31/r;Landroidx/compose/runtime/Composer;I)J", "N", "M", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28803n {

    /* JADX INFO: renamed from: p31.n$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f116588a;

        static {
            int[] iArr = new int[EnumC28807r.values().length];
            try {
                iArr[EnumC28807r.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC28807r.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f116588a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m87592A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m87593B(AbstractC28805p.b bVar, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m87631z(bVar, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m87594C(AbstractC28805p.c cVar, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1731156266);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(cVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = modifier.mo3471e(AbstractC1102d.m3409f(1.0f, c2314t));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC28805p.a aVar = new AbstractC28805p.a(cVar.getTitle(), null, cVar.getStyle(), cVar.getTypography(), null, null, false, false, null, null, 882, null);
            if (0.6f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m87627v(aVar, new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), null, c28655q, 0, 4);
            if (0.4f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, false);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90651b, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, ((float) 0.5d) * 8, 0.0f, 2);
            String strM21274h = AbstractC8693b.m21274h(cVar.getSubtitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, modifierM3396r, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 3120, 185848);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getSubtitleEnd(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(5), 0L, 2, false, 1, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 3120, 185850);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(cVar, modifier, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m87595D(AbstractC28805p.c cVar, Modifier modifier, int i13, Composer composer, int i14) {
        m87594C(cVar, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final void m87596E(AbstractC28805p.d dVar, Modifier modifier, Composer composer, int i13) {
        int i14;
        Modifier modifierMo3471e;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(528536782);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(dVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            C2314t c2314t = C2314t.f9131w;
            if (zIsFeatureEnabled || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                float f13 = 4;
                modifierMo3471e = modifier.mo3471e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, f13, 0.0f, 10));
            } else {
                modifierMo3471e = modifier.mo3471e(AbstractC1102d.m3409f(1.0f, c2314t));
            }
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dVar.getLeftTitle(), c28655q, 0), new LayoutWeightElement(1.0f, true), m87602K(dVar.getStyle(), c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m87603L(dVar.getStyle(), c28655q, 0), null, c28655q, 0, 0, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dVar.getRightTitle(), c28655q, 0), null, m87604M(dVar.getStyle(), c28655q, 0), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, m87605N(dVar.getStyle(), c28655q, 0), null, c28655q, 0, 0, 196090);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(dVar, modifier, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m87597F(AbstractC28805p.d dVar, Modifier modifier, int i13, Composer composer, int i14) {
        m87596E(dVar, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v38 */
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
    /* JADX INFO: renamed from: G */
    private static final void m87598G(AbstractC28805p.e eVar, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        ?? r10;
        C2886a c2886aM87603L;
        long jM87602K;
        int i15;
        C28655q c28655q2;
        int i16;
        float f13;
        Modifier modifierM3398t;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-820405735);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q3.m87153g(eVar) : c28655q3.m87157i(eVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
            boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierMo3471e = (zIsFeatureEnabled || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) ? modifier.mo3471e(AbstractC1099a.m3396r(c2314t, 1 * 4, 0.0f, 2)) : modifier;
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q3, 54);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
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
            if (eVar.getTypography() != null) {
                c28655q3.m87150e0(-845050207);
                r10 = 0;
                c28655q3.m87173q(false);
                c2886aM87603L = EnumC2888c.INSTANCE.m8402a(eVar.getTypography());
            } else {
                r10 = 0;
                c28655q3.m87150e0(-845048379);
                c2886aM87603L = m87603L(eVar.getStyle(), c28655q3, 0);
                c28655q3.m87173q(false);
            }
            C2886a c2886a = c2886aM87603L;
            if (eVar.getTypography() != null) {
                c28655q3.m87150e0(-845043897);
                jM87602K = AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, 6, r10);
            } else {
                c28655q3.m87150e0(-845042880);
                jM87602K = m87602K(eVar.getStyle(), c28655q3, r10);
                c28655q3.m87173q(r10);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q3, 48);
            int i17 = i14;
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C2314t c2314t2 = c2314t;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(eVar.getLeftTitle(), c28655q3, 0), new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), jM87602K, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, c28655q3, 0, 3120, 186360);
            C28655q c28655q4 = c28655q3;
            TextResource textResourceM87667k = eVar.getTitleEnd();
            if (textResourceM87667k == null) {
                c28655q4.m87150e0(1622011045);
                c28655q4.m87173q(false);
                i15 = 8;
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(1622011046);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t2, 1 * 8, 0.0f, 0.0f, 0.0f, 14);
                c2314t2 = c2314t2;
                i15 = 8;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM87667k, c28655q4, 0), modifierM3398t2, C38072d.f163053a.m121949b(c28655q4, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, c28655q4, 48, 3120, 186360);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            c28655q2.m87173q(true);
            TextResource textResource = null;
            boolean z4 = false;
            if (eVar.getShouldShowAiGradient()) {
                i16 = 2;
                f13 = 0.0f;
                float f14 = i15;
                modifierM3398t = AbstractC1099a.m3395q(AbstractC1092a.m3357b(c2314t2, AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(2 * 4), 0.0f, 4), 1 * f14, ((float) 0.5d) * f14);
            } else {
                i16 = 2;
                f13 = 0.0f;
                if (eVar.getShouldShowOnboarding()) {
                    float f15 = 1;
                    float f16 = i15;
                    modifierM3398t = AbstractC1099a.m3398t(AbstractC1092a.m3357b(c2314t2, AbstractC15673b0.m44000O(), AbstractC33253j.m105489e(4 * f15), 0.0f, 4), f15 * f16, 0.0f, ((float) 0.5d) * f16, 0.0f, 10);
                } else {
                    modifierM3398t = null;
                }
            }
            C1119d c1119dM43228a = AbstractC15210z4.m43228a(0L, 7, false, f13);
            Object objM87133R = c28655q2.m87133R();
            Object obj = C28635l.f115821a;
            Object objM30453g = objM87133R;
            if (objM87133R == obj) {
                objM30453g = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM30453g;
            boolean zM87669m = eVar.getIsEnabled();
            C18027i c18027i = new C18027i(0);
            int i18 = i17 & 896;
            boolean z13 = i18 == 256;
            Object objM87133R2 = c28655q2.m87133R();
            Object obj2 = objM87133R2;
            if (z13 || objM87133R2 == obj) {
                Object c12762e = new C12762e(interfaceC4339a, 9);
                c28655q2.m87172p0(c12762e);
                obj2 = c12762e;
            }
            Modifier modifierM44103f = AbstractC15676d.m44103f(AbstractC1092a.m3360e(c2314t2, interfaceC21083i, c1119dM43228a, zM87669m, c18027i, (InterfaceC4339a) obj2, 8), modifierM3398t);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource textResourceM87663g = eVar.getRightTitle();
            C39274g c39274g = new C39274g(eVar.getIcon(), textResource, i16, z4 ? 1 : 0);
            boolean zM87669m2 = eVar.getIsEnabled();
            boolean z14 = i18 == 256;
            Object objM87133R3 = c28655q2.m87133R();
            Object obj3 = objM87133R3;
            if (z14 || objM87133R3 == obj) {
                Object c1815o0 = new C1815o0(interfaceC4339a, 2);
                c28655q2.m87172p0(c1815o0);
                obj3 = c1815o0;
            }
            C28655q c28655q6 = c28655q2;
            AbstractC27265l0.m82217i(modifierM44103f, enumC27269n0, textResourceM87663g, null, c39274g, zM87669m2, null, null, false, false, null, null, (Function1) obj3, c28655q6, 100663344, 0, 3784);
            C28655q c28655q7 = c28655q6;
            c28655q7.m87173q(true);
            c28655q = c28655q7;
        } else {
            C28655q c28655q8 = c28655q3;
            c28655q8.m87138X();
            c28655q = c28655q8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0137o(eVar, modifier, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m87599H(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m87600I(InterfaceC4339a interfaceC4339a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m87601J(AbstractC28805p.e eVar, Modifier modifier, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m87598G(eVar, modifier, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final long m87602K(EnumC28807r enumC28807r, Composer composer, int i13) {
        int i14 = enumC28807r == null ? -1 : a.f116588a[enumC28807r.ordinal()];
        if (i14 == -1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(461828643);
            return AbstractC18489d0.m53358D(C38072d.f163053a, c28655q, 6, false);
        }
        if (i14 == 1) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(461825382);
            return AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(461823468, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(461827334);
        return AbstractC31061c.m95624D(C38072d.f163053a, c28655q3, 6, false);
    }

    /* JADX INFO: renamed from: L */
    private static final C2886a m87603L(EnumC28807r enumC28807r, Composer composer, int i13) {
        int i14 = enumC28807r == null ? -1 : a.f116588a[enumC28807r.ordinal()];
        if (i14 == -1) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-839942136);
            C2886a c2886aM8414L = C38072d.f163053a.m121952e(c28655q, 6).getSh4();
            c28655q.m87173q(false);
            return c2886aM8414L;
        }
        if (i14 == 1) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-839945145);
            C2886a c2886aM8419Q = C38072d.f163053a.m121952e(c28655q2, 6).getT4();
            c28655q2.m87173q(false);
            return c2886aM8419Q;
        }
        if (i14 != 2) {
            throw AbstractC11895b.m32003v(-839947187, (C28655q) composer, false);
        }
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87150e0(-839943321);
        C2886a c2886aM8418P = C38072d.f163053a.m121952e(c28655q3, 6).getT3();
        c28655q3.m87173q(false);
        return c2886aM8418P;
    }

    /* JADX INFO: renamed from: M */
    private static final long m87604M(EnumC28807r enumC28807r, Composer composer, int i13) {
        if ((enumC28807r == null ? -1 : a.f116588a[enumC28807r.ordinal()]) == 2) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1874149049);
            long jM125385c1 = C38072d.f163053a.m121949b(c28655q, 6).getWhite70();
            c28655q.m87173q(false);
            return jM125385c1;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1874147833);
        long jM125374Y0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite30();
        c28655q2.m87173q(false);
        return jM125374Y0;
    }

    /* JADX INFO: renamed from: N */
    private static final C2886a m87605N(EnumC28807r enumC28807r, Composer composer, int i13) {
        if ((enumC28807r == null ? -1 : a.f116588a[enumC28807r.ordinal()]) == 2) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-1612484701);
            C2886a c2886aM8420a = C38072d.f163053a.m121952e(c28655q, 6).getB1();
            c28655q.m87173q(false);
            return c2886aM8420a;
        }
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87150e0(-1612483516);
        C2886a c2886aM8415M = C38072d.f163053a.m121952e(c28655q2, 6).getSh5();
        c28655q2.m87173q(false);
        return c2886aM8415M;
    }

    /* JADX INFO: renamed from: p */
    public static final void m87621p(final AbstractC28805p state, Modifier modifier, final Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1719852815);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(state) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C26842g(14);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (state instanceof AbstractC28805p.a) {
                c28655q.m87150e0(-1470111689);
                AbstractC28805p.a aVar = (AbstractC28805p.a) state;
                boolean z4 = (i15 & 896) == 256;
                Object objM87133R2 = c28655q.m87133R();
                if (z4 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2275b(function1, 14);
                    c28655q.m87172p0(objM87133R2);
                }
                m87627v(aVar, modifier, (Function1) objM87133R2, c28655q, i15 & 126, 0);
                c28655q.m87173q(false);
            } else if (state instanceof AbstractC28805p.d) {
                c28655q.m87150e0(-1469605056);
                m87596E((AbstractC28805p.d) state, modifier, c28655q, i15 & 126);
                c28655q.m87173q(false);
            } else if (state instanceof AbstractC28805p.c) {
                c28655q.m87150e0(-1469474050);
                m87594C((AbstractC28805p.c) state, modifier, c28655q, i15 & 126);
                c28655q.m87173q(false);
            } else if (state instanceof AbstractC28805p.e) {
                c28655q.m87150e0(-1469324258);
                AbstractC28805p.e eVar = (AbstractC28805p.e) state;
                boolean z13 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
                Object objM87133R3 = c28655q.m87133R();
                if (z13 || objM87133R3 == c28676v0) {
                    final int i18 = 0;
                    objM87133R3 = new InterfaceC4339a() { // from class: p31.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC28803n.m87624s(state, function1);
                                default:
                                    return AbstractC28803n.m87625t(state, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                m87598G(eVar, modifier, (InterfaceC4339a) objM87133R3, c28655q, i15 & 126);
                c28655q.m87173q(false);
            } else {
                if (!(state instanceof AbstractC28805p.b)) {
                    throw AbstractC11895b.m32003v(783860108, c28655q, false);
                }
                c28655q.m87150e0(-1468905727);
                AbstractC28805p.b bVar = (AbstractC28805p.b) state;
                boolean z14 = ((i15 & 14) == 4) | ((i15 & 896) == 256);
                Object objM87133R4 = c28655q.m87133R();
                if (z14 || objM87133R4 == c28676v0) {
                    final int i19 = 1;
                    objM87133R4 = new InterfaceC4339a() { // from class: p31.m
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC28803n.m87624s(state, function1);
                                default:
                                    return AbstractC28803n.m87625t(state, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R4);
                }
                m87631z(bVar, modifier, (InterfaceC4339a) objM87133R4, c28655q, i15 & 126);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a(state, modifier2, function2, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m87622q(AbstractC28799j it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m87623r(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EnumC22400l) {
            function1.invoke(new AbstractC28799j.d((EnumC22400l) event));
        } else if (event instanceof AbstractC28799j) {
            function1.invoke(event);
        } else {
            function1.invoke(AbstractC28799j.b.f116577a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m87624s(AbstractC28805p abstractC28805p, Function1 function1) {
        AbstractC28805p.e eVar = (AbstractC28805p.e) abstractC28805p;
        if (eVar.getDestination() != null) {
            function1.invoke(new AbstractC28799j.a(eVar.getDestination()));
        } else {
            function1.invoke(new AbstractC28799j.c(eVar.getCtaType()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m87625t(AbstractC28805p abstractC28805p, Function1 function1) {
        C9598e c9598eM87644a = ((AbstractC28805p.b) abstractC28805p).getDestination();
        if (c9598eM87644a != null) {
            function1.invoke(new AbstractC28799j.a(c9598eM87644a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m87626u(AbstractC28805p abstractC28805p, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87621p(abstractC28805p, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0307  */
    /* JADX WARN: Code duplicated, block: B:103:0x031e  */
    /* JADX WARN: Code duplicated, block: B:106:0x036d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0377  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x0139  */
    /* JADX WARN: Code duplicated, block: B:69:0x0154  */
    /* JADX WARN: Code duplicated, block: B:72:0x0160  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:81:0x020d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0219  */
    /* JADX WARN: Code duplicated, block: B:85:0x0278  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:98:0x02db  */
    /* JADX WARN: Code duplicated, block: B:99:0x02e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r27v2, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v14, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r2v18, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r7v16, types: [x81.d] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v10, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v9, types: [p1.q] */
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
    /* JADX INFO: renamed from: v */
    private static final void m87627v(AbstractC28805p.a aVar, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        AbstractC28805p.a aVar2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        ?? r10;
        C28677v1 c28677v1M87180u;
        Object obj;
        Function1 function4;
        boolean zIsFeatureEnabled;
        C2314t c2314t;
        Modifier modifierMo3471e;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC22965i interfaceC22965i;
        int iHashCode2;
        ?? r14;
        C2886a c2886aM87603L;
        C2886a c2886a;
        long jM87602K;
        Function1 function5;
        ?? r15;
        TextResource textResourceM87642j;
        ?? r16;
        boolean z13;
        TextResource textResourceM87639g;
        int i16;
        C2886a c2886aM8421b;
        ?? r17;
        ?? r18;
        Object objM87133R;
        Object objM87133R2;
        ?? r19 = (C28655q) composer;
        r19.m87154g0(29104682);
        if ((i13 & 6) == 0) {
            aVar2 = aVar;
            i15 = (r19.m87157i(aVar2) ? 4 : 2) | i13;
        } else {
            aVar2 = aVar;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= r19.m87153g(modifier) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= r19.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (r19.m87135U(i15 & 1, z4)) {
                obj = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = r19.m87133R();
                    if (objM87133R2 == obj) {
                        objM87133R2 = new C26842g(15);
                        r19.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) r19.m87161k(AbstractC38073e.m121968p());
                zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
                c2314t = C2314t.f9131w;
                if (!zIsFeatureEnabled || featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.HOME_FUTURE_IA)) {
                    modifierMo3471e = modifier.mo3471e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 4, 0.0f, 0.0f, 0.0f, 14));
                } else {
                    modifierMo3471e = modifier.mo3471e(AbstractC1102d.m3409f(1.0f, c2314t));
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, r19, 54);
                iHashCode = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = r19.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(r19, modifierMo3471e);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j);
                } else {
                    r19.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(r19, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(r19, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, r19, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(r19, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                if (aVar2.getLeadingButton()) {
                    interfaceC22965i = AbstractC22977m.f90656g;
                } else {
                    interfaceC22965i = AbstractC22977m.f90650a;
                }
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, r19, 48);
                iHashCode2 = Long.hashCode(r19.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = r19.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(r19, modifierM3409f);
                r19.m87158i0();
                if (r19.f115903S) {
                    r19.m87163l(c0213j);
                } else {
                    r19.m87178s0();
                }
                AbstractC28683x.m87239G(r19, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(r19, c0209i3, interfaceC28653p1M87165m2);
                if (r19.f115903S || !AbstractC22676k.m65745e(r19.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, r19, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(r19, c0209i4, modifierM118962N2);
                if (aVar.getTypography() != null) {
                    r19.m87150e0(1979862504);
                    r14 = 0;
                    r19.m87173q(false);
                    c2886aM87603L = EnumC2888c.INSTANCE.m8402a(aVar.getTypography());
                } else {
                    r14 = 0;
                    r19.m87150e0(1979864460);
                    c2886aM87603L = m87603L(aVar.getStyle(), r19, 0);
                    r19.m87173q(false);
                }
                c2886a = c2886aM87603L;
                String strM21274h = AbstractC8693b.m21274h(aVar.getTitle(), r19, r14);
                if (aVar.getTypography() != null) {
                    r19.m87150e0(1979872782);
                    jM87602K = AbstractC31061c.m95624D(C38072d.f163053a, r19, 6, r14);
                } else {
                    r19.m87150e0(1979874055);
                    jM87602K = m87602K(aVar.getStyle(), r19, r14);
                    r19.m87173q(r14);
                }
                function5 = function4;
                AbstractC30795n.m94707h(strM21274h, null, jM87602K, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, r19, 0, 3120, 186362);
                r15 = r19;
                textResourceM87642j = aVar.getTitleEnd();
                if (textResourceM87642j == null) {
                    r15.m87150e0(1246739004);
                    r15.m87173q(r14);
                    r16 = r15;
                } else {
                    r15.m87150e0(1246739005);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM87642j, r15, r14), AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14), C38072d.f163053a.m121949b(r15, 6).getSecondaryText(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, r15, 48, 3120, 186360);
                    ?? r24 = r15;
                    r24.m87173q(r14);
                    r16 = r24;
                }
                if (aVar.getLeadingButton()) {
                    r16.m87150e0(1247169502);
                    C28792c c28792c = new C28792c(aVar.getLeadingButton(), aVar.getJournalEnabled(), false, aVar.m87635c(), 4, null);
                    Modifier modifierM3419p = AbstractC1102d.m3419p(9 * 4, c2314t);
                    if ((i15 & 896) == 256) {
                        r18 = 1;
                    } else {
                        r18 = r14;
                    }
                    objM87133R = r16.m87133R();
                    if (r18 == 0 || objM87133R == obj) {
                        objM87133R = new C2275b(function5, 15);
                        r16.m87172p0(objM87133R);
                    }
                    AbstractC28795f.m87577y(c28792c, modifierM3419p, null, (Function1) objM87133R, r16, 48, 4);
                    r16.m87173q(r14);
                } else {
                    r16.m87150e0(1247846046);
                    r16.m87173q(r14);
                }
                z13 = true;
                r16.m87173q(true);
                textResourceM87639g = aVar.getSubtitle();
                if (textResourceM87639g == null) {
                    r16.m87150e0(1402193145);
                    r16.m87173q(r14);
                    r17 = r16;
                } else {
                    r16.m87150e0(1402193146);
                    Modifier modifierM3398t = AbstractC1099a.m3398t(r33, 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM87639g, r16, r14);
                    if (aVar.getSubtitleTypography() != null) {
                        r16.m87150e0(-48786664);
                        r16.m87173q(r14);
                        c2886aM8421b = EnumC2888c.INSTANCE.m8402a(aVar.getSubtitleTypography());
                        i16 = 6;
                    } else {
                        r16.m87150e0(-48783666);
                        i16 = 6;
                        c2886aM8421b = C38072d.f163053a.m121952e(r16, 6).getB2();
                        r16.m87173q(r14);
                    }
                    ?? r27 = r16;
                    AbstractC30795n.m94707h(strM21274h2, modifierM3398t, C38072d.f163053a.m121949b(r16, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b, null, r27, 48, 3120, 186360);
                    ?? r25 = r27;
                    r25.m87173q(r14);
                    z13 = true;
                    r17 = r25;
                }
                r17.m87173q(z13);
                function3 = function5;
                r10 = r17;
            } else {
                r19.m87138X();
                function3 = function2;
                r10 = r19;
            }
            c28677v1M87180u = r10.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2158a((AbstractC28805p) aVar, modifier, function3, i13, i14, 8);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r19.m87135U(i15 & 1, z4)) {
            obj = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = r19.m87133R();
                if (objM87133R2 == obj) {
                    objM87133R2 = new C26842g(15);
                    r19.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            FeatureFlagChecker featureFlagChecker2 = (FeatureFlagChecker) r19.m87161k(AbstractC38073e.m121968p());
            zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled(OnboardingFeatureFlag.HOME_ONBOARDING_FUTURE_IA);
            c2314t = C2314t.f9131w;
            if (zIsFeatureEnabled) {
                modifierMo3471e = modifier.mo3471e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 4, 0.0f, 0.0f, 0.0f, 14));
            } else {
                modifierMo3471e = modifier.mo3471e(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 4, 0.0f, 0.0f, 0.0f, 14));
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9110M, r19, 54);
            iHashCode = Long.hashCode(r19.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = r19.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(r19, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            r19.m87158i0();
            if (r19.f115903S) {
                r19.m87163l(c0213j);
            } else {
                r19.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(r19, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(r19, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (r19.f115903S) {
                AbstractC11266d.m30471y(iHashCode, r19, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, r19, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(r19, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            if (aVar2.getLeadingButton()) {
                interfaceC22965i = AbstractC22977m.f90656g;
            } else {
                interfaceC22965i = AbstractC22977m.f90650a;
            }
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(interfaceC22965i, C2299e.f9108K, r19, 48);
            iHashCode2 = Long.hashCode(r19.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = r19.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(r19, modifierM3409f2);
            r19.m87158i0();
            if (r19.f115903S) {
                r19.m87163l(c0213j);
            } else {
                r19.m87178s0();
            }
            AbstractC28683x.m87239G(r19, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(r19, c0209i6, interfaceC28653p1M87165m4);
            if (r19.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, r19, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, r19, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(r19, c0209i7, modifierM118962N4);
            if (aVar.getTypography() != null) {
                r19.m87150e0(1979862504);
                r14 = 0;
                r19.m87173q(false);
                c2886aM87603L = EnumC2888c.INSTANCE.m8402a(aVar.getTypography());
            } else {
                r14 = 0;
                r19.m87150e0(1979864460);
                c2886aM87603L = m87603L(aVar.getStyle(), r19, 0);
                r19.m87173q(false);
            }
            c2886a = c2886aM87603L;
            String strM21274h3 = AbstractC8693b.m21274h(aVar.getTitle(), r19, r14);
            if (aVar.getTypography() != null) {
                r19.m87150e0(1979872782);
                jM87602K = AbstractC31061c.m95624D(C38072d.f163053a, r19, 6, r14);
            } else {
                r19.m87150e0(1979874055);
                jM87602K = m87602K(aVar.getStyle(), r19, r14);
                r19.m87173q(r14);
            }
            function5 = function4;
            AbstractC30795n.m94707h(strM21274h3, null, jM87602K, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, r19, 0, 3120, 186362);
            r15 = r19;
            textResourceM87642j = aVar.getTitleEnd();
            if (textResourceM87642j == null) {
                r15.m87150e0(1246739004);
                r15.m87173q(r14);
                r16 = r15;
            } else {
                r15.m87150e0(1246739005);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM87642j, r15, r14), AbstractC1099a.m3398t(c2314t, 1 * 8, 0.0f, 0.0f, 0.0f, 14), C38072d.f163053a.m121949b(r15, 6).getSecondaryText(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, r15, 48, 3120, 186360);
                ?? r26 = r15;
                r26.m87173q(r14);
                r16 = r26;
            }
            if (aVar.getLeadingButton()) {
                r16.m87150e0(1247169502);
                C28792c c28792c2 = new C28792c(aVar.getLeadingButton(), aVar.getJournalEnabled(), false, aVar.m87635c(), 4, null);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(9 * 4, c2314t);
                if ((i15 & 896) == 256) {
                    r18 = 1;
                } else {
                    r18 = r14;
                }
                objM87133R = r16.m87133R();
                if (r18 == 0) {
                    objM87133R = new C2275b(function5, 15);
                    r16.m87172p0(objM87133R);
                } else {
                    objM87133R = new C2275b(function5, 15);
                    r16.m87172p0(objM87133R);
                }
                AbstractC28795f.m87577y(c28792c2, modifierM3419p2, null, (Function1) objM87133R, r16, 48, 4);
                r16.m87173q(r14);
            } else {
                r16.m87150e0(1247846046);
                r16.m87173q(r14);
            }
            z13 = true;
            r16.m87173q(true);
            textResourceM87639g = aVar.getSubtitle();
            if (textResourceM87639g == null) {
                r16.m87150e0(1402193145);
                r16.m87173q(r14);
                r17 = r16;
            } else {
                r16.m87150e0(1402193146);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(r33, 0.0f, 1 * 4, 0.0f, 0.0f, 13);
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM87639g, r16, r14);
                if (aVar.getSubtitleTypography() != null) {
                    r16.m87150e0(-48786664);
                    r16.m87173q(r14);
                    c2886aM8421b = EnumC2888c.INSTANCE.m8402a(aVar.getSubtitleTypography());
                    i16 = 6;
                } else {
                    r16.m87150e0(-48783666);
                    i16 = 6;
                    c2886aM8421b = C38072d.f163053a.m121952e(r16, 6).getB2();
                    r16.m87173q(r14);
                }
                ?? r28 = r16;
                AbstractC30795n.m94707h(strM21274h4, modifierM3398t2, C38072d.f163053a.m121949b(r16, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886aM8421b, null, r28, 48, 3120, 186360);
                ?? r29 = r28;
                r29.m87173q(r14);
                z13 = true;
                r17 = r29;
            }
            r17.m87173q(z13);
            function3 = function5;
            r10 = r17;
        } else {
            r19.m87138X();
            function3 = function2;
            r10 = r19;
        }
        c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2158a((AbstractC28805p) aVar, modifier, function3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m87628w(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m87629x(Function1 function1, AbstractC28793d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC28793d.a) {
            function1.invoke(((AbstractC28793d.a) event).getHomeCtaType());
        } else {
            if (!(event instanceof AbstractC28793d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            function1.invoke(AbstractC28799j.e.f116580a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m87630y(AbstractC28805p.a aVar, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m87627v(aVar, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m87631z(AbstractC28805p.b bVar, Modifier modifier, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C2886a c2886aM87603L;
        long jM87602K;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(734239339);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(bVar) : c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierMo3471e = modifier.mo3471e(AbstractC1099a.m3396r(C2314t.f9131w, 1 * 4, 0.0f, 2));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            String strM21274h = AbstractC8693b.m21274h(bVar.getTitle(), c28655q, 0);
            if (bVar.getTypography() != null) {
                c28655q.m87150e0(1395373043);
                c28655q.m87173q(false);
                c2886aM87603L = EnumC2888c.INSTANCE.m8402a(bVar.getTypography());
            } else {
                c28655q.m87150e0(1395374999);
                c2886aM87603L = m87603L(bVar.getStyle(), c28655q, 0);
                c28655q.m87173q(false);
            }
            C2886a c2886a = c2886aM87603L;
            if (bVar.getTypography() != null) {
                c28655q.m87150e0(1395379609);
                jM87602K = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            } else {
                c28655q.m87150e0(1395380754);
                jM87602K = m87602K(bVar.getStyle(), c28655q, 0);
                c28655q.m87173q(false);
            }
            boolean z4 = false;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM87602K, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c2886a, null, c28655q, 0, 3120, 186360);
            c28655q = c28655q;
            C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, bVar.getIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
            String strM21273g = AbstractC8693b.m21273g(AbstractC16277f.f62323f0, c28655q, 0);
            if ((i14 & 896) == 256) {
                z4 = true;
            }
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C28329e(interfaceC4339a, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM21273g, null, null, (InterfaceC4339a) objM87133R, c28655q, 0, 12);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(bVar, modifier, interfaceC4339a, i13, 12);
        }
    }
}
