package lm1;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bm0.C3413p;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import gz0.EnumC16313m0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kl2.C22571f;
import l01.C23045q;
import l72.C23407n;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.C24174a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.C17893k;
import p238j0.C21084j;
import p270k2.C22135i;
import p270k2.InterfaceC22129c;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lm1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0011\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a#\u0010\u0015\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u0013\u0010\u001b\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, m65681d2 = {"Llm1/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Llm1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/s1;", "Lgz0/m0;", "icon", "p", "(Ll0/s1;Lgz0/m0;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "", "subtitle", "k", "(Ll0/s1;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lkd1/o;", "text", "i", "(Lkd1/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "r", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "t", "v", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24513c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    /* JADX INFO: renamed from: i */
    private static final void m71386i(AbstractC22403o abstractC22403o, String str, Composer composer, int i13) {
        int i14;
        String str2;
        ?? r10;
        C28655q c28655q;
        boolean z4;
        boolean z13;
        boolean z14;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1707074137);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q3.m87153g(abstractC22403o) : c28655q3.m87157i(abstractC22403o) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87153g(str) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            AbstractC17911t abstractC17911tM43972A = AbstractC15673b0.m43972A();
            float f13 = 4;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(2 * f13);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3356a = AbstractC1092a.m3356a(0.2f, c2314t, abstractC17911tM43972A, c33252iM105489e);
            float f14 = 1 * 8;
            Modifier modifierM3424u = AbstractC1102d.m3424u(21 * f13, AbstractC1099a.m3394p(f14, modifierM3356a));
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(f14, C2299e.f9111N), C2299e.f9107J, c28655q3, 6);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3424u);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            if (abstractC22403o == null) {
                c28655q3.m87150e0(-79014571);
                c28655q3.m87173q(false);
                z4 = true;
                z13 = false;
            } else {
                c28655q3.m87150e0(-79014570);
                z4 = true;
                z13 = false;
                AbstractC15005f3.m43107a(AbstractC22404p.m64500i(abstractC22403o, null, null, c28655q3, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(6 * f13, c2314t), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getBrandWhite(), c28655q3, 432, 0);
                c28655q3.m87173q(false);
            }
            if (str == null) {
                c28655q3.m87150e0(-78756620);
                c28655q3.m87173q(z13);
                str2 = str;
                z14 = z4;
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-78756619);
                C38072d c38072d = C38072d.f163053a;
                int i16 = C38072d.f163054b;
                C2886a c2886aM8405C = c38072d.m121952e(c28655q3, i16).getN6();
                int i17 = C2886a.f11498d << 18;
                boolean z15 = z4 ? 1 : 0;
                str2 = str;
                AbstractC30795n.m94707h(str2, null, c38072d.m121949b(c28655q3, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8405C, null, c28655q3, (i15 >> 3) & 14, i17, 196602);
                C28655q c28655q4 = c28655q3;
                c28655q4.m87173q(false);
                z14 = true;
                c28655q2 = c28655q4;
            }
            c28655q2.m87173q(z14);
            r10 = z14;
            c28655q = c28655q2;
        } else {
            str2 = str;
            r10 = 1;
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3413p(abstractC22403o, str2, i13, r10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m71387j(AbstractC22403o abstractC22403o, String str, int i13, Composer composer, int i14) {
        m71386i(abstractC22403o, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m71388k(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(929406848);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierMo66771a = interfaceC22997s1.mo66771a(interfaceC22997s1.mo66772c(C2314t.f9131w, true, 1.0f), C2299e.f9108K);
            C22949e c22949e = AbstractC22977m.f90650a;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo733e0(4)), C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo66771a);
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
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, TextResource.$stable | ((i14 >> 3) & 14));
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8437r = c38072d.m121952e(c28655q, i15).getH4();
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            int i16 = C2886a.f11498d << 18;
            int i17 = i14;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8437r, null, c28655q, 0, i16, 196602);
            c28655q = c28655q;
            if (str == null) {
                c28655q.m87150e0(-725212366);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-725212365);
                AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB4(), null, c28655q, (i17 >> 6) & 14, i16, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(interfaceC22997s1, textResource, str, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m71389l(InterfaceC22997s1 interfaceC22997s1, TextResource textResource, String str, int i13, Composer composer, int i14) {
        m71388k(interfaceC22997s1, textResource, str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m71390m(C24514d viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Modifier modifierM71399v;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-972978223);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = viewState.getCommitmentLevel() == EnumC24511a.COMMITTED;
            boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.AIM_ACTIVITY_RECS_TILE_REDESIGN);
            C2314t c2314t = C2314t.f9131w;
            if (zIsFeatureEnabled) {
                modifierM71399v = z4 ? m71395r(c2314t) : m71397t(c2314t);
            } else {
                modifierM71399v = z4 ? m71399v(c2314t) : m71395r(c2314t);
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C21084j c21084j = new C21084j();
            boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(viewState))) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(onViewEvent, viewState, 22);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 4;
            float f14 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * f14, AbstractC1092a.m3356a(0.2f, AbstractC1092a.m3360e(modifierM3409f, c21084j, null, false, null, (InterfaceC4339a) objM87133R, 28).mo3471e(modifierM71399v), AbstractC15673b0.m43972A(), AbstractC33253j.m105489e(3 * f13)));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f14), C2299e.f9107J, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (viewState.getPillIcon() == null && viewState.getPillTitle() == null) {
                c28655q.m87150e0(-1485088083);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1485233194);
                m71386i(viewState.getPillIcon(), viewState.getPillTitle(), c28655q, AbstractC22403o.f87638a);
                c28655q.m87173q(false);
            }
            TextResource textResourceM71407h = viewState.getTitle();
            String strM71406g = viewState.getSubtitle();
            int i15 = (TextResource.$stable << 3) | 6;
            C23000t1 c23000t1 = C23000t1.f90727a;
            m71388k(c23000t1, textResourceM71407h, strM71406g, c28655q, i15);
            EnumC16313m0 enumC16313m0M71405f = viewState.getSecondaryIcon();
            if (enumC16313m0M71405f == null) {
                c28655q.m87150e0(-1484934107);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1484934106);
                m71393p(c23000t1, enumC16313m0M71405f, c28655q, 6);
                c28655q.m87173q(false);
            }
            if (viewState.getPillIcon() == null && viewState.getPillTitle() == null) {
                c28655q.m87150e0(-1484715928);
                AbstractC25012a.m73388u(10, f13, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-1484649619);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(viewState, onViewEvent, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m71391n(Function1 function1, C24514d c24514d) {
        function1.invoke(c24514d.getNavigationAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m71392o(C24514d c24514d, Function1 function1, int i13, Composer composer, int i14) {
        m71390m(c24514d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m71393p(InterfaceC22997s1 interfaceC22997s1, EnumC16313m0 enumC16313m0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1255857106);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC22997s1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87149e(enumC16313m0.ordinal()) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0.toWhoopIcon(), c28655q, 6), null, interfaceC22997s1.mo66771a(AbstractC1102d.m3419p(5 * 4, C2314t.f9131w), C2299e.f9108K), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 48, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(interfaceC22997s1, enumC16313m0, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m71394q(InterfaceC22997s1 interfaceC22997s1, EnumC16313m0 enumC16313m0, int i13, Composer composer, int i14) {
        m71393p(interfaceC22997s1, enumC16313m0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final Modifier m71395r(Modifier modifier) {
        return AbstractC1125a.m3480c(modifier, new C24174a(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m71396s(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22135i c22135i = new C22135i(c0238p0.mo743q0((float) 1.5d), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
        AbstractC17911t abstractC17911tM43972A = AbstractC15673b0.m43972A();
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911tM43972A, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), 0.0f, c22135i, 214);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final Modifier m71397t(Modifier modifier) {
        return AbstractC1125a.m3480c(modifier, new C24174a(5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m71398u(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        C22135i c22135i = new C22135i(c0238p0.mo743q0((float) 1.5d), 0.0f, 0, 0, new C17893k(new DashPathEffect(new float[]{10.0f, 10.0f}, 0.0f)), 14);
        long jMo134585toTestableColor0d7_KjU = EnumC39333f.WHITE_50.getColor();
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        InterfaceC22131e.m63374D(drawWithContent, jMo134585toTestableColor0d7_KjU, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), c22135i, 0.0f, 230);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v */
    private static final Modifier m71399v(Modifier modifier) {
        return AbstractC1125a.m3480c(modifier, new C24174a(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m71400w(InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        AbstractC17911t abstractC17911tM43972A = AbstractC15673b0.m43972A();
        C22135i c22135i = new C22135i(c0238p0.mo743q0((float) 1.5d), 0.0f, 0, 0, null, 14);
        float fMo743q0 = c0238p0.mo743q0(3 * 4);
        InterfaceC22131e.m63376J0(drawWithContent, abstractC17911tM43972A, 0L, 0L, (((long) Float.floatToRawIntBits(fMo743q0)) << 32) | (((long) Float.floatToRawIntBits(fMo743q0)) & 4294967295L), 0.0f, c22135i, 214);
        return C23454a0.f92919a;
    }
}
