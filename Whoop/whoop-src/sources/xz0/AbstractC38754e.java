package xz0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import b91.EnumC2888c;
import c13.AbstractC3855a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.Action;
import dp0.C12253i;
import fy1.C14873i;
import gy0.AbstractC16272a;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import j02.C21166s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd1.AbstractC22391d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import live.hms.video.error.ErrorCodes;
import m83.C25235a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27256h;
import ny0.C27270o;
import ny0.EnumC27243c;
import ny0.EnumC27254g;
import ny0.EnumC27272p;
import o71.C27632b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3788w0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC22997s1;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p636y3.EnumC39181m;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import uz1.C35429g;
import v41.C35658c;
import vl0.C36100c;
import vu1.AbstractC36512c;
import w20.C36727q;
import wb3.AbstractC37056f;
import wq1.C37508b;
import wr0.C37526f;
import wr0.C37550r;
import x30.C37888f1;
import x81.AbstractC38073e;
import x81.C38072d;
import xl0.C38448b;
import xn2.C38485d;

/* JADX INFO: renamed from: xz0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001aA\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016²\u0006\u000e\u0010\u0015\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lxz0/f;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "m", "(Landroidx/compose/ui/Modifier;Lxz0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "onDismiss", "t", "(Landroidx/compose/ui/Modifier;Lxz0/f;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxz0/a;", "dateViewState", "C", "(Landroidx/compose/ui/Modifier;Lxz0/a;Landroidx/compose/runtime/Composer;II)V", "A", "(Landroidx/compose/runtime/Composer;I)V", "", "isDismissed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC38754e {

    /* JADX INFO: renamed from: xz0.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC4351m {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m124212a(Composer composer, int i13) {
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
                c28655q.m87138X();
                return;
            }
            c28655q.m87150e0(892639569);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(3 * f13, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * f13), C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            List list = null;
            EnumC16313m0 enumC16313m0 = null;
            AbstractC18247a abstractC18247a = null;
            EnumC39333f enumC39333f = null;
            String str = null;
            String str2 = null;
            C17750h1 c17750h1 = new C17750h1(AbstractC8693b.m21278l("Upcoming"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null);
            C38750a c38750a = new C38750a("Sep", "16");
            EnumC16313m0 enumC16313m1 = EnumC16313m0.CROSS;
            DefaultConstructorMarker defaultConstructorMarker = null;
            C9598e c9598e = null;
            AbstractC38754e.m124198m(null, new C38755f(null, new C38751b(enumC16313m1, null, null, false, 14, null), c17750h1, "Today, 8:00 - 8:30 AM EST", null, "Dr. Drake Ramoray, MD, MPH", 0 == true ? 1 : 0, null, c38750a, list, c9598e, 1745, defaultConstructorMarker), null, c28655q, 0, 5);
            GenericInteraction genericInteraction = null;
            Action action = null;
            C39174f c39174f = null;
            String str3 = null;
            AbstractC18247a abstractC18247a2 = null;
            Object obj = null;
            C21166s c21166s = null;
            C38750a c38750a2 = null;
            AbstractC38754e.m124198m(null, new C38755f("UPCOMING CLINICIAN VIDEO CALL", new C38751b(EnumC16313m0.DOT_MENU, null, null, false, 14, null), new C17750h1(AbstractC8693b.m21278l("Request Confirmed"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), "On-demand consultation", null, "Your clinician will be joining shortly.", 0 == true ? 1 : 0, 0 == true ? 1 : 0, c38750a2, list, c9598e, ErrorCodes.InitAPIErrors.cServerErrors, defaultConstructorMarker), null, c28655q, 0, 5);
            C38751b c38751b = null;
            AbstractC38754e.m124198m(null, new C38755f(null, c38751b, new C17750h1(AbstractC8693b.m21278l("Available Now"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), "Video consultation", new AbstractC22403o.a(AbstractC36512c.f156071n), "Dr. April Kepner, MD", new AbstractC22403o.a(AbstractC16272a.f62188y), 0 == true ? 1 : 0, c38750a2, list, c9598e, 1923, defaultConstructorMarker), null, c28655q, 0, 5);
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            C9598e c9598e2 = null;
            AnalyticEventModel analyticEventModel = null;
            EnumC27254g enumC27254g = null;
            EnumC2888c enumC2888c = null;
            boolean z4 = false;
            boolean z13 = true;
            boolean z14 = false;
            boolean z15 = false;
            EnumC27243c enumC27243c = null;
            InterfaceC21430b interfaceC21430b = null;
            AbstractC18247a abstractC18247a3 = null;
            AbstractC38754e.m124198m(null, new C38755f(null, c38751b, new C17750h1(AbstractC8693b.m21278l("Upcoming"), null, null, null, null, null, null, null, false, null, 0.0f, 0.0f, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4194302, null), "Wed, 2:00 - 2:30 PM EST", new AbstractC22403o.a(AbstractC36512c.f156071n), "Dr. Meredith Grey, MD", null, 0 == true ? 1 : 0, new C38750a("Oct", "22"), AbstractC37056f.m118959K(new C27256h(AbstractC8693b.m21278l("Join Call"), enumC16313m0, abstractC18247a, enumC39333f, str, str2, EnumC27272p.HIGHLIGHT, c9598e2, action, analyticEventModel, enumC27254g, enumC2888c, c39174f, z4, z13, str3, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3, 33529790, defaultConstructorMarker2), new C27256h(AbstractC8693b.m21278l("Reschedule"), enumC16313m0, abstractC18247a, enumC39333f, str, str2, null, c9598e2, action, analyticEventModel, enumC27254g, enumC2888c, c39174f, z4, z13, str3, z14, z15, abstractC18247a2, obj, c21166s, enumC27243c, genericInteraction, interfaceC21430b, abstractC18247a3, 33529854, defaultConstructorMarker2)), c9598e, 1219, defaultConstructorMarker), null, c28655q, 0, 5);
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            AbstractC38754e.m124198m(null, new C38755f(null, new C38751b(enumC16313m1, null, null, false, 14, 0 == true ? 1 : 0), null, "Today, 8:00 - 8:30 AM EST", objArr2, "Dr. Drake Ramoray, MD, MPH", null, objArr, new C38750a("Sep", "16"), null, c9598e, 1745, defaultConstructorMarker), null, c28655q, 0, 5);
            c28655q.m87173q(true);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m124212a((Composer) obj, ((Number) obj2).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: A */
    public static final void m124182A(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1008982756);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22677k0 c22677k0 = new C22677k0(10);
            AbstractC28669t1 abstractC28669t1M11815B = AbstractC3855a.m11815B(AbstractC3855a.m11814A(AbstractC3855a.m11816C(AbstractC3855a.m11834r(AbstractC38073e.m121971s(), c22677k0), c22677k0), c22677k0), c22677k0);
            C25235a0 c25235a0 = C25235a0.f99113w;
            c22677k0.m65760a(AbstractC3855a.m11833q(AbstractC3855a.m11842z(c25235a0, AbstractC3855a.m11832p(c25235a0, abstractC28669t1M11815B, c22677k0), c22677k0), C14873i.f55508a, c22677k0).mo86977a(C12253i.f40998a));
            C28674u2 c28674u2 = AbstractC2453v1.f9573l;
            ArrayList arrayList = c22677k0.f89339a;
            AbstractC28683x.m87248b((C28673u1[]) arrayList.toArray(new C28673u1[AbstractC3855a.m11823g(c28674u2, c22677k0, arrayList)]), AbstractC37817c.m121344e(-306980961, c28655q, new a()), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m124183B(int i13, Composer composer, int i14) {
        m124182A(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m124184C(Modifier modifier, C38750a c38750a, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C38750a c38750a2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(93066222);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            c38750a2 = c38750a;
            i15 |= c28655q.m87153g(c38750a2) ? 32 : 16;
        } else {
            c38750a2 = c38750a;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, AbstractC33253j.m105489e(2 * 4));
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierMo3471e = AbstractC18249c.m52565c(modifierM118994r, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, 6).getWhite10())).mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
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
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC30795n.m94707h(c38750a2.getMonth(), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(c38750a.getDay(), null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getN45(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(modifier3, i13, c38750a, i14, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m124185D(Modifier modifier, C38750a c38750a, int i13, int i14, Composer composer, int i15) {
        m124184C(modifier, c38750a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public static final void m124198m(Modifier modifier, C38755f state, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier2;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1351964261);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
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
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C38448b(21);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                AbstractC22391d0.m64437c(!m124200o(interfaceC28601c1), AbstractC3730c1.f15251a, AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11580h(null, AbstractC17918w0.m51524l(0.5f, 0.0f), 1)), AbstractC37817c.m121344e(1957480801, c28655q, new C27632b(modifier3, state, function4, interfaceC28601c1, 11)), c28655q, 3072, 0);
                modifier2 = modifier3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C37526f(i13, i14, 18, modifier2, state, function3);
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
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C38448b(21);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R;
            AbstractC22391d0.m64437c(!m124200o(interfaceC28601c2), AbstractC3730c1.f15251a, AbstractC3788w0.m11578f(null, 3).m11563a(AbstractC3788w0.m11580h(null, AbstractC17918w0.m51524l(0.5f, 0.0f), 1)), AbstractC37817c.m121344e(1957480801, c28655q, new C27632b(modifier3, state, function4, interfaceC28601c2, 11)), c28655q, 3072, 0);
            modifier2 = modifier3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37526f(i13, i14, 18, modifier2, state, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m124199n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m124200o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m124201p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m124202q(Modifier modifier, C38755f c38755f, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C35429g(16, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            m124205t(modifier, c38755f, (InterfaceC4339a) objM87133R, function1, c28655q, 384);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m124203r(InterfaceC28601c1 interfaceC28601c1) {
        m124201p(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m124204s(Modifier modifier, C38755f c38755f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m124198m(modifier, c38755f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m124205t(Modifier modifier, C38755f c38755f, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1373337310);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(c38755f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C9598e c9598eM124216e = c38755f.getDestination();
            Modifier modifierM3362g = C2314t.f9131w;
            if (c9598eM124216e != null) {
                c28655q.m87150e0(-766447041);
                boolean zM87157i = c28655q.m87157i(c38755f) | ((i14 & 7168) == 2048);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C37550r(function1, c38755f, 14);
                    c28655q.m87172p0(objM87133R);
                }
                modifierM3362g = AbstractC1092a.m3362g(modifierM3362g, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-766374036);
                c28655q.m87173q(false);
            }
            AbstractC31926e.m99375j(modifier.mo3471e(modifierM3362g), null, C38072d.f163053a.m121949b(c28655q, 6).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0.0f, AbstractC37817c.m121344e(404962638, c28655q, new C36100c(c38755f, function1, interfaceC4339a, 9)), c28655q, 12582912, 114);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C38485d(modifier, c38755f, interfaceC4339a, function1, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m124206u(Function1 function1, C38755f c38755f) {
        function1.invoke(c38755f.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m124207v(C38755f c38755f, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C0213j c0213j;
        Modifier modifierM3398t;
        C2305k c2305k;
        C2314t c2314t;
        C0209i c0209i;
        double d3;
        C2314t c2314t2;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t3));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k2, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            String strM124217f = c38755f.getHeader();
            if (strM124217f == null) {
                c28655q.m87150e0(-2028120484);
                c28655q.m87173q(false);
                c0213j = c0213j2;
                c0209i = c0209i2;
                c2305k = c2305k2;
                c2314t = c2314t3;
                i14 = 6;
            } else {
                c28655q.m87150e0(-2028120483);
                C38072d c38072d = C38072d.f163053a;
                i14 = 6;
                C2886a c2886aM8414L = c38072d.m121952e(c28655q, 6).getSh4();
                long jM125430y = c38072d.m121949b(c28655q, 6).getBrandWhite();
                if (c38755f.getIconButton() != null) {
                    modifierM3398t = AbstractC1099a.m3398t(c2314t3, 0.0f, 0.0f, AbstractC27274q.c.f109140f.getTouchArea(), 0.0f, 11);
                    c0213j = c0213j2;
                } else {
                    c0213j = c0213j2;
                    modifierM3398t = c2314t3;
                }
                c2305k = c2305k2;
                c2314t = c2314t3;
                c0209i = c0209i2;
                AbstractC30795n.m94707h(strM124217f, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, 0, 196600);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            C28674u2 c28674u2 = AbstractC2453v1.f9575n;
            AbstractC28683x.m87247a(c28674u2.mo86977a(c38755f.getImageAlignment().getAlignment()), AbstractC37817c.m121344e(530508818, c28655q, new C37888f1(4, (EnumC39181m) c28655q.m87161k(c28674u2), c38755f)), c28655q, 56);
            double d14 = 1.5d;
            if (c38755f.m124221j().isEmpty()) {
                d3 = 1.5d;
                c2314t2 = c2314t;
                z4 = true;
                c28655q.m87150e0(-2023290032);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2023566800);
                C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 1.5d, f13, c2305k, c28655q, i14);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                c2314t2 = c2314t;
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                c28655q.m87150e0(1370870363);
                Iterator<T> it = c38755f.m124221j().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((InterfaceC25312u) it.next(), null, null, function1, c28655q, 0, 6);
                    d14 = d14;
                }
                d3 = d14;
                z4 = true;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            c28655q.m87173q(z4);
            C38751b c38751bM124218g = c38755f.getIconButton();
            if (c38751bM124218g == null) {
                c28655q.m87150e0(-114966978);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-114966977);
                Modifier modifierM3394p2 = AbstractC1099a.m3394p(((float) d3) * f13, C1100b.f4583a.mo3400a(c2314t2, C2299e.f9116y));
                C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, c38751bM124218g.getIcon().toWhoopIcon(), null, null, null, false, false, false, 0.0f, false, 1020, null);
                String strName = c38751bM124218g.getIcon().name();
                boolean zM87157i = c28655q.m87157i(c38751bM124218g) | c28655q.m87153g(interfaceC4339a) | c28655q.m87153g(function1) | c28655q.m87157i(c38755f);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    C27198e c27198e = new C27198e((Object) c38751bM124218g, (Object) interfaceC4339a, function1, (Object) c38755f, 25);
                    c28655q.m87172p0(c27198e);
                    objM87133R = c27198e;
                }
                C28655q c28655q2 = c28655q;
                AbstractC27242b1.m82092d(c27270o, strName, modifierM3394p2, null, (InterfaceC4339a) objM87133R, c28655q2, 0, 8);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m124208w(EnumC39181m enumC39181m, C38755f c38755f, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * 8), C2299e.f9107J, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC28683x.m87247a(AbstractC2453v1.f9575n.mo86977a(enumC39181m), AbstractC37817c.m121344e(833101166, c28655q, new C36727q(c38755f, 13)), c28655q, 56);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m124209x(C38755f c38755f, InterfaceC22997s1 interfaceC22997s1, Composer composer, int i13) {
        C39077b1 c39077b1;
        int i14;
        C0209i c0209i;
        C2306l c2306l = C2299e.f9108K;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C38750a c38750aM124213a = c38755f.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            C2314t c2314t = C2314t.f9131w;
            C39077b1 c39077b2 = C39102j.f168200b;
            if (c38750aM124213a != null) {
                c28655q.m87150e0(-1699068882);
                m124184C(AbstractC1102d.m3419p(18 * 4, c2314t), c38755f.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), c28655q, 6, 0);
                c28655q.m87173q(false);
                c39077b1 = c39077b2;
                i14 = 18;
            } else if (c38755f.getImageUrl() != null) {
                c28655q.m87150e0(-1698740685);
                i14 = 18;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c38755f.getImageUrl(), null, null, c28655q, 0, 3), null, interfaceC22997s1.mo66771a(AbstractC1102d.m3419p(18 * 4, c2314t), c2306l), null, c39077b2, 0.0f, null, c28655q, 24624, 104);
                c39077b1 = c39077b2;
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c39077b1 = c39077b2;
                i14 = 18;
                c28655q.m87150e0(-1698187180);
                c28655q.m87173q(false);
            }
            float f13 = (float) 4;
            Modifier modifierMo66772c = interfaceC22997s1.mo66772c(AbstractC1102d.m3413j(c2314t, i14 * f13, 0.0f, 2), true, 1.0f);
            C22949e c22949e = AbstractC22977m.f90650a;
            float f14 = 1 * 8;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66748k(f14, c2306l), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
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
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            C17750h1 c17750h1M124222k = c38755f.getTag();
            if (c17750h1M124222k == null) {
                c28655q.m87150e0(-1929453873);
                c28655q.m87173q(false);
                c0209i = c0209i5;
            } else {
                c28655q.m87150e0(-1929453872);
                c0209i = c0209i5;
                AbstractC17746g1.m50872h(c17750h1M124222k, null, null, c28655q, 0, 6);
                c28655q.m87173q(false);
            }
            String strM124223l = c38755f.getTitle();
            C38072d c38072d = C38072d.f163053a;
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM124223l, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB1(), null, c28655q2, 0, 0, 196602);
            C28655q c28655q3 = c28655q2;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q3, 54);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q3, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, modifierM118962N2);
            AbstractC22403o abstractC22403oM124215c = c38755f.getDescriptionImageSource();
            if (abstractC22403oM124215c == null) {
                c28655q3.m87150e0(1207180710);
                c28655q3.m87173q(false);
            } else {
                c28655q3.m87150e0(1207180711);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM124215c, null, null, c28655q3, 0, 3), null, AbstractC37056f.m118994r(AbstractC1102d.m3419p(f13 * f13, c2314t), AbstractC33253j.f138651a), null, c39077b1, 0.0f, null, c28655q3, 24624, 104);
                c28655q3 = c28655q3;
                c28655q3.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C28655q c28655q4 = c28655q3;
            AbstractC30795n.m94707h(c38755f.getDescription(), new LayoutWeightElement(1.0f, true), c38072d.m121949b(c28655q3, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, 6).getB2(), null, c28655q4, 0, 0, 196600);
            c28655q4.m87173q(true);
            c28655q4.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m124210y(C38751b c38751b, InterfaceC4339a interfaceC4339a, Function1 function1, C38755f c38755f) {
        if (c38751b.getAction() != null) {
            if (c38751b.getDismissesCard()) {
                interfaceC4339a.invoke();
            }
            function1.invoke(c38751b.getAction());
        } else if (c38751b.getModal() != null) {
            function1.invoke(c38751b.getModal());
        } else if (c38755f.getDestination() != null) {
            function1.invoke(c38755f.getDestination());
        } else {
            function1.invoke(c38751b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m124211z(Modifier modifier, C38755f c38755f, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m124205t(modifier, c38755f, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
