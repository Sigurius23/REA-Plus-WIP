package p730qt2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8692a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import e93.AbstractC12889b;
import f41.C14063a;
import f41.C14069g;
import gb1.AbstractC15676d;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import jp1.C21859k;
import l83.C23454a0;
import nt2.AbstractC27131a;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
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
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qb0.C30179a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qt2.x */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lqt2/v;", "metricPlanTileItemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30618x {
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x0121  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m93996f(Modifier modifier, C30616v metricPlanTileItemState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Integer numM93983b;
        Modifier modifierM3362g;
        String strM21265c;
        boolean zM87157i;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(metricPlanTileItemState, "metricPlanTileItemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-660366730);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(metricPlanTileItemState) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C30617w(0);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                numM93983b = metricPlanTileItemState.getContributorId();
                modifierM3362g = C2314t.f9131w;
                if (numM93983b != null) {
                    c28655q.m87150e0(-2034818733);
                    zM87157i = c28655q.m87157i(metricPlanTileItemState) | ((i15 & 896) == 256);
                    objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == c28676v0) {
                        objM87133R = new C30599e(3, function4, metricPlanTileItemState);
                        c28655q.m87172p0(objM87133R);
                    }
                    modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-2034695756);
                    c28655q.m87173q(false);
                }
                strM21265c = AbstractC8692a.m21265c(AbstractC8693b.m21274h(metricPlanTileItemState.getTitle(), c28655q, TextResource.$stable));
                if (strM21265c == null) {
                    strM21265c = "";
                }
                float f13 = 4;
                AbstractC12889b.m36263b(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier.mo3471e(modifierM3362g)), null, 3), AbstractC33253j.m105489e(3 * f13), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, 0 * f13, AbstractC37817c.m121344e(-1457018125, c28655q, new C21859k(metricPlanTileItemState, strM21265c, function4, 18)), c28655q, 1769472, 24);
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30179a(i13, i14, 16, modifier, metricPlanTileItemState, function3);
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
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C30617w(0);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            numM93983b = metricPlanTileItemState.getContributorId();
            modifierM3362g = C2314t.f9131w;
            if (numM93983b != null) {
                c28655q.m87150e0(-2034818733);
                zM87157i = c28655q.m87157i(metricPlanTileItemState) | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R = new C30599e(3, function4, metricPlanTileItemState);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = new C30599e(3, function4, metricPlanTileItemState);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2034695756);
                c28655q.m87173q(false);
            }
            strM21265c = AbstractC8692a.m21265c(AbstractC8693b.m21274h(metricPlanTileItemState.getTitle(), c28655q, TextResource.$stable));
            if (strM21265c == null) {
                strM21265c = "";
            }
            float f14 = 4;
            AbstractC12889b.m36263b(AbstractC1102d.m3427x(AbstractC1102d.m3409f(1.0f, modifier.mo3471e(modifierM3362g)), null, 3), AbstractC33253j.m105489e(3 * f14), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, 0 * f14, AbstractC37817c.m121344e(-1457018125, c28655q, new C21859k(metricPlanTileItemState, strM21265c, function4, 18)), c28655q, 1769472, 24);
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30179a(i13, i14, 16, modifier, metricPlanTileItemState, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m93997g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93998h(Function1 function1, C30616v c30616v) {
        function1.invoke(new AbstractC27131a.a(c30616v.getContributorId().intValue()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v35 */
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
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m93999i(C30616v c30616v, String str, Function1 function1, Composer composer, int i13) {
        C0209i c0209i;
        C0213j c0213j;
        ?? r10;
        C28655q c28655q;
        Object obj;
        boolean z4;
        C28655q c28655q2;
        C28655q c28655q3;
        C28655q c28655q4 = (C28655q) composer;
        boolean zM87135U = c28655q4.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q4.m87138X();
            return c23454a0;
        }
        C2314t c2314t = C2314t.f9131w;
        float f13 = 4;
        float f14 = 8;
        Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f14, AbstractC1102d.m3405b(AbstractC1102d.m3427x(c2314t, null, 3), 0.0f, 15 * f13, 1));
        C2306l c2306l = C2299e.f9108K;
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q4, 54);
        int iHashCode = Long.hashCode(c28655q4.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, modifierM3394p);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j2 = C0217k.f724b;
        c28655q4.m87158i0();
        if (c28655q4.f115903S) {
            c28655q4.m87163l(c0213j2);
        } else {
            c28655q4.m87178s0();
        }
        C0209i c0209i2 = C0217k.f729g;
        AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a);
        C0209i c0209i3 = C0217k.f728f;
        AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m);
        C0209i c0209i4 = C0217k.f732j;
        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i4);
        }
        C0209i c0209i5 = C0217k.f726d;
        AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N);
        EnumC16313m0 enumC16313m0M93986f = c30616v.getLeftIcon();
        if (enumC16313m0M93986f == null) {
            c28655q4.m87150e0(-2105765295);
            c28655q4.m87173q(false);
            c0209i = c0209i4;
            c0213j = c0213j2;
        } else {
            c0209i = c0209i4;
            c0213j = c0213j2;
            AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q4, -2105765294, enumC16313m0M93986f, c28655q4, 6), null, AbstractC1102d.m3419p(18, c2314t), C38072d.f163053a.m121949b(c28655q4, C38072d.f163054b).getWhite50(), c28655q4, 432, 0);
            AbstractC25012a.m73389v(c2314t, 10, c28655q4, false);
        }
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, AbstractC2294a.f9095c, c28655q4, 0);
        int iHashCode2 = Long.hashCode(c28655q4.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, layoutWeightElement);
        c28655q4.m87158i0();
        if (c28655q4.f115903S) {
            c28655q4.m87163l(c0213j);
        } else {
            c28655q4.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q4, c0209i2, c23010xM66775a);
        AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m2);
        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
        }
        AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N2);
        C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q4, 48);
        int iHashCode3 = Long.hashCode(c28655q4.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q4.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q4, c2314t);
        c28655q4.m87158i0();
        if (c28655q4.f115903S) {
            c28655q4.m87163l(c0213j);
        } else {
            c28655q4.m87178s0();
        }
        AbstractC28683x.m87239G(c28655q4, c0209i2, c22994r1M66759a2);
        AbstractC28683x.m87239G(c28655q4, c0209i3, interfaceC28653p1M87165m3);
        if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, c28655q4, iHashCode3, c0209i);
        }
        AbstractC28683x.m87239G(c28655q4, c0209i5, modifierM118962N3);
        TextResource textResourceM93990j = c30616v.getTitle();
        int i14 = TextResource.$stable;
        String strM21274h = AbstractC8693b.m21274h(textResourceM93990j, c28655q4, i14);
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 0.5d) * f14, 0.0f, 11);
        C38072d c38072d = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        C2886a c2886aM8414L = c38072d.m121952e(c28655q4, i15).getSh4();
        long jM125430y = c38072d.m121949b(c28655q4, i15).getBrandWhite();
        int i16 = C2886a.f11498d << 18;
        AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q4, 48, i16, 196600);
        C28655q c28655q5 = c28655q4;
        C14063a c14063aM93985e = c30616v.getInformationButton();
        if (c14063aM93985e == null) {
            c28655q5.m87150e0(-934531779);
            c28655q5.m87173q(false);
        } else {
            c28655q5.m87150e0(-934531778);
            C27270o c27270o = new C27270o(AbstractC27274q.d.f109141f, c38072d.m121951d().getTinyIcons().getTinyInformation(), EnumC39333f.RECOVERY, null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
            String strM21274h2 = AbstractC8693b.m21274h(c14063aM93985e.getDescription(), c28655q5, i14);
            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "MetricPlanTile_" + str + "_InfoButton");
            boolean zM87153g = c28655q5.m87153g(function1) | c28655q5.m87157i(c14063aM93985e);
            Object objM87133R = c28655q5.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C14069g(function1, c14063aM93985e, 1);
                c28655q5.m87172p0(objM87133R);
            }
            AbstractC27242b1.m82092d(c27270o, strM21274h2, modifierM44101d, null, (InterfaceC4339a) objM87133R, c28655q5, C27270o.f109105k, 8);
            c28655q5.m87173q(false);
        }
        c28655q5.m87173q(true);
        if (AbstractC8693b.m21270d(c30616v.getMetricValue())) {
            c28655q5.m87150e0(-27370542);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c30616v.getMetricValue(), c28655q5, i14), AbstractC15676d.m44101d(c2314t, "MetricPlanTile_" + str + "_MetricValue"), c30616v.getMetricValueStyle().mo134584toComposableColorWaAFU9c(c28655q5, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q5, i15).getN9(), null, c28655q5, 0, i16, 196600);
            C28655q c28655q6 = c28655q5;
            r10 = 0;
            c28655q6.m87173q(false);
            c28655q = c28655q6;
        } else {
            r10 = 0;
            c28655q5.m87150e0(-26992311);
            c28655q5.m87173q(false);
            c28655q = c28655q5;
        }
        c28655q.m87173q(true);
        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(10, c2314t));
        if (c30616v.m93982a() == null) {
            c28655q.m87150e0(-2103584662);
            c28655q.m87173q(r10);
            obj = null;
        } else {
            c28655q.m87150e0(-2103584661);
            AbstractC30610p.m93941c(c30616v.m93982a(), c28655q, r10);
            AbstractC25012a.m73389v(c2314t, 16, c28655q, r10);
            obj = c23454a0;
        }
        if (obj == null) {
            c28655q.m87150e0(-2103435396);
            if (AbstractC8693b.m21270d(c30616v.getDescription())) {
                c28655q.m87150e0(-343719515);
                C28655q c28655q7 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c30616v.getDescription(), c28655q, i14), AbstractC15676d.m44101d(c2314t, "MetricPlanTile_" + str + "_Description"), c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q7, 0, i16, 196600);
                C28655q c28655q8 = c28655q7;
                z4 = false;
                c28655q8.m87173q(false);
                c28655q3 = c28655q8;
            } else {
                z4 = false;
                c28655q.m87150e0(-343373958);
                c28655q.m87173q(false);
                c28655q3 = c28655q;
            }
            c28655q3.m87173q(z4);
            c28655q2 = c28655q3;
        } else {
            z4 = false;
            c28655q.m87150e0(763425813);
            c28655q.m87173q(false);
            c28655q2 = c28655q;
        }
        EnumC16313m0 enumC16313m0M93989i = c30616v.getRightButtonIcon();
        if (enumC16313m0M93989i == null) {
            c28655q2.m87150e0(-2102915868);
            c28655q2.m87173q(z4);
        } else {
            c28655q2.m87150e0(-2102915867);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(enumC16313m0M93989i.toWhoopIcon(), c28655q2, 6), AbstractC11895b.m31996o("Add ", AbstractC8693b.m21274h(c30616v.getTitle(), c28655q2, i14), " Goal Button"), AbstractC1102d.m3419p(5 * f13, c2314t), c38072d.m121949b(c28655q2, i15).getBrandWhite(), c28655q2, 384, 0);
            c28655q2.m87173q(false);
        }
        c28655q2.m87173q(true);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m94000j(Function1 function1, C14063a c14063a) {
        function1.invoke(c14063a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m94001k(Modifier modifier, C30616v c30616v, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m93996f(modifier, c30616v, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
