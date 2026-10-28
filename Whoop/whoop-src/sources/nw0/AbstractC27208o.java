package nw0;

import a71.C0520a;
import a81.C0556g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2633u2;
import b61.AbstractC2756k;
import b91.C2886a;
import bb2.C2931g;
import bw0.AbstractC3680c;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.avatar.C9768a;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import j71.C21395c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k71.AbstractC22242b;
import k71.C22252i;
import k71.C22257n;
import kd1.AbstractC22404p;
import kotlin.C1990b0;
import kw0.AbstractC22848a;
import l72.C23407n;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25265s;
import mc1.EnumC25417b;
import mf2.C25514e;
import mi2.C25592o;
import mw0.AbstractC25979g;
import mw0.AbstractC25981i;
import mw0.C25973a;
import mw0.C25975c;
import mw0.C25984l;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26954j0;
import no0.C26957l;
import no1.C26993g;
import or2.C28205u0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24965t;
import p736sz0.AbstractC33186i;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.C33210q;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import s01.C32048d;
import vv0.AbstractC36529b;
import vz0.AbstractC36612a;
import vz0.C36613b;
import wb3.AbstractC37056f;
import x81.C38072d;
import y11.C39059l;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: nw0.o */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001am\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a?\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ak\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00152\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a#\u0010\u0019\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001ak\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006&²\u0006\u000e\u0010%\u001a\u00020$8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lmw0/i;", "viewState", "Lkotlin/Function1;", "Lmw0/g;", "Ll83/a0;", "onViewEvent", "Lkw0/a;", "onNavigationEvent", "Lzr2/a;", "dateAndTimeProvider", "Lmw0/c;", "dialogViewModel", "Lbw0/c;", "onAnalyticsEvent", "Lor2/u0;", "localizedTimeFormatter", "K", "(Lmw0/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzr2/a;Lmw0/c;Lkotlin/jvm/functions/Function1;Lor2/u0;Landroidx/compose/runtime/Composer;II)V", "Lmw0/i$b;", "u", "(Lmw0/i$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lmw0/i$c;", "localizedDateTimeFormatter", "z", "(Lmw0/i$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzr2/a;Lor2/u0;Lmw0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "H", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lmw0/i$a;", "N", "(Lmw0/i$a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzr2/a;Lor2/u0;Lmw0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lmw0/a;", "missingHrData", "V", "(Lmw0/a;Landroidx/compose/runtime/Composer;I)V", "F", "(Landroidx/compose/runtime/Composer;I)V", "", "isScrubbing", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27208o {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m81889A(AbstractC25981i.c cVar, C25975c c25975c, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
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
            int iM46312P = C38072d.f163053a.m121951d().getVarious().getMissingData();
            TextResource textResourceM77067j = cVar.getToolbarTitle();
            boolean zM77068k = cVar.getIsNap();
            boolean zM77069l = cVar.getIsNapToSleepAvailable();
            int iM76997n = c25975c.getSleepId();
            String strM76998o = c25975c.getSleepIdV2();
            C23465k c23465kM77058a = cVar.getEditBounds();
            int i14 = TextResource.$stable;
            AbstractC27200g.m81790O(textResourceM77067j, null, function1, function2, iM46312P, zM77068k, zM77069l, iM76997n, strM76998o, c23465kM77058a, function3, c28655q, i14, 0, 2);
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14)), 0.0f, 0.0f, 0.0f, f13, 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            float f14 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14 * f14, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            C25984l c25984lM77066i = cVar.getStatsSectionState();
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C26993g(21);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27200g.m81825x(c25984lM77066i, function3, (Function1) objM87133R, function1, c28655q, C33210q.f138488m | C32048d.f132920h | 384);
            c28655q.m87173q(true);
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.7f);
            C21395c c21395cM77060c = cVar.getHrGraphState();
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C26993g(22);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC2756k.m7799p(modifierM3384f, c21395cM77060c, null, null, false, null, (Function1) objM87133R2, c28655q, (C21395c.f81985e << 3) | 1572870, 60);
            C28655q c28655q2 = c28655q;
            C22257n c22257nM77059b = cVar.getHeartRateBarGraphContainerState();
            if (c22257nM77059b == null) {
                c28655q2.m87150e0(-271410301);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-271410300);
                Object objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26993g(23);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC22242b.m63768i(null, c22257nM77059b, (Function1) objM87133R3, c28655q2, (C22257n.f86792c << 3) | 384, 1);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            C25973a c25973aM77064g = cVar.getMissingHrData();
            if (c25973aM77064g == null) {
                c28655q2.m87150e0(-271288099);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-271288098);
                m81910V(c25973aM77064g, c28655q2, i14);
                c28655q2.m87173q(false);
            }
            C28655q c28655q3 = c28655q2;
            AbstractC27200g.m81797V(cVar.getMetricsTitle(), cVar.getMetricsSubtitle(), cVar.m77061d(), null, function2, c28655q3, i14 | (i14 << 3), 8);
            c28655q3.m87173q(true);
            c28655q3.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m81890B(AbstractC25979g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m81891C(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m81892D(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m81893E(AbstractC25981i.c cVar, Function1 function1, Function1 function2, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, C25975c c25975c, Function1 function3, int i13, Composer composer, int i14) {
        m81937z(cVar, function1, function2, interfaceC41070a, c28205u0, c25975c, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    public static final void m81894F(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(318524703);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21278l(""), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24965t(i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m81895G(int i13, Composer composer, int i14) {
        m81894F(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static final void m81896H(Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(780351379);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(onNavigationEvent) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1099a.m3394p(f13 * f13, c2314t)));
            C2305k c2305k = C2299e.f9111N;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            AbstractC6721d.c cVar = new AbstractC6721d.c(null, new TextResource.C8688b(AbstractC36529b.f156345p, null, i15, 0 == true ? 1 : 0), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, AbstractC22404p.m64502k(AbstractC16319p0.m46430a().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String().getCom.whoop.service.network.model.UserState.States.SLEEP java.lang.String()), null, null, null, null, null, 8053, null);
            boolean z4 = (i14 & 14) == 4;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C25514e(onNavigationEvent, 28);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.c.f25657p << 3, 53);
            C22961h c22961h = AbstractC22977m.f90654e;
            Modifier modifierM3424u = AbstractC1102d.m3424u(66 * f13, c2314t);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3424u);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String upperCase = AbstractC30060g.m92103Y(c28655q2, AbstractC36529b.f156326G).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC33186i.m105160b(new TextResource.C8691e(upperCase), new TextResource.C8688b(AbstractC36529b.f156327H, null, 2, 0 == true ? 1 : 0), C38072d.f163053a.m121951d().getConnections().getNoNetwork(), null, c28655q2, TextResource.C8691e.f25898b | (TextResource.C8688b.f25889c << 3), 8);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onNavigationEvent, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m81897I(Function1 function1) {
        function1.invoke(AbstractC22848a.a.f90080a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m81898J(Function1 function1, int i13, Composer composer, int i14) {
        m81896H(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0121  */
    /* JADX WARN: Code duplicated, block: B:77:0x0133  */
    /* JADX WARN: Code duplicated, block: B:79:0x013b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x0161  */
    /* JADX WARN: Code duplicated, block: B:85:0x0165  */
    /* JADX WARN: Code duplicated, block: B:87:0x0190  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public static final void m81899K(AbstractC25981i viewState, Function1 onViewEvent, Function1 onNavigationEvent, InterfaceC41070a dateAndTimeProvider, C25975c dialogViewModel, Function1 function1, C28205u0 localizedTimeFormatter, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Function1 function4;
        Object objM87133R;
        boolean zM87157i;
        int i16;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(dialogViewModel, "dialogViewModel");
        AbstractC22676k.m65750j(localizedTimeFormatter, "localizedTimeFormatter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(885246273);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(dialogViewModel) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i17 = i14 & 32;
        if (i17 == 0) {
            if ((196608 & i13) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((1572864 & i13) == 0) {
                if ((2097152 & i13) == 0) {
                    zM87157i = c28655q.m87153g(localizedTimeFormatter);
                } else {
                    zM87157i = c28655q.m87157i(localizedTimeFormatter);
                }
                if (zM87157i) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i15 |= i16;
            }
            if ((599187 & i15) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C26993g(20);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (viewState instanceof AbstractC25981i.a) {
                    c28655q.m87150e0(318158677);
                    int i18 = ((i15 >> 6) & 57344) | (i15 & 8190) | (C28205u0.f113964d << 12);
                    int i19 = i15 << 3;
                    m81902N((AbstractC25981i.a) viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedTimeFormatter, dialogViewModel, function4, c28655q, (i19 & 3670016) | (458752 & i19) | i18);
                    c28655q.m87173q(false);
                } else if (viewState instanceof AbstractC25981i.b) {
                    c28655q.m87150e0(318164773);
                    m81932u((AbstractC25981i.b) viewState, onViewEvent, onNavigationEvent, c28655q, i15 & 1022);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25981i.d.f102677a)) {
                    c28655q.m87150e0(318168252);
                    m81894F(c28655q, 0);
                    c28655q.m87173q(false);
                } else if (viewState.equals(AbstractC25981i.e.f102678a)) {
                    c28655q.m87150e0(318170873);
                    m81896H(onNavigationEvent, c28655q, (i15 >> 6) & 14);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC25981i.c) {
                        throw AbstractC11895b.m32003v(318157195, c28655q, false);
                    }
                    c28655q.m87150e0(318174456);
                    int i24 = (i15 & 8190) | (C28205u0.f113964d << 12) | ((i15 >> 6) & 57344);
                    int i25 = i15 << 3;
                    m81937z((AbstractC25981i.c) viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedTimeFormatter, dialogViewModel, function4, c28655q, i24 | (i25 & 458752) | (i25 & 3670016));
                    c28655q.m87173q(false);
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, dialogViewModel, function3, localizedTimeFormatter, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function2 = function1;
        if ((1572864 & i13) == 0) {
            if ((2097152 & i13) == 0) {
                zM87157i = c28655q.m87153g(localizedTimeFormatter);
            } else {
                zM87157i = c28655q.m87157i(localizedTimeFormatter);
            }
            if (zM87157i) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i15 |= i16;
        }
        if ((599187 & i15) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C26993g(20);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (viewState instanceof AbstractC25981i.a) {
                c28655q.m87150e0(318158677);
                int i110 = ((i15 >> 6) & 57344) | (i15 & 8190) | (C28205u0.f113964d << 12);
                int i111 = i15 << 3;
                m81902N((AbstractC25981i.a) viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedTimeFormatter, dialogViewModel, function4, c28655q, (i111 & 3670016) | (458752 & i111) | i110);
                c28655q.m87173q(false);
            } else if (viewState instanceof AbstractC25981i.b) {
                c28655q.m87150e0(318164773);
                m81932u((AbstractC25981i.b) viewState, onViewEvent, onNavigationEvent, c28655q, i15 & 1022);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25981i.d.f102677a)) {
                c28655q.m87150e0(318168252);
                m81894F(c28655q, 0);
                c28655q.m87173q(false);
            } else if (viewState.equals(AbstractC25981i.e.f102678a)) {
                c28655q.m87150e0(318170873);
                m81896H(onNavigationEvent, c28655q, (i15 >> 6) & 14);
                c28655q.m87173q(false);
            } else {
                if (viewState instanceof AbstractC25981i.c) {
                    throw AbstractC11895b.m32003v(318157195, c28655q, false);
                }
                c28655q.m87150e0(318174456);
                int i26 = (i15 & 8190) | (C28205u0.f113964d << 12) | ((i15 >> 6) & 57344);
                int i27 = i15 << 3;
                m81937z((AbstractC25981i.c) viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedTimeFormatter, dialogViewModel, function4, c28655q, i26 | (i27 & 458752) | (i27 & 3670016));
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, dialogViewModel, function3, localizedTimeFormatter, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m81900L(AbstractC3680c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m81901M(AbstractC25981i abstractC25981i, Function1 function1, Function1 function2, InterfaceC41070a interfaceC41070a, C25975c c25975c, Function1 function3, C28205u0 c28205u0, int i13, int i14, Composer composer, int i15) {
        m81899K(abstractC25981i, function1, function2, interfaceC41070a, c25975c, function3, c28205u0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    public static final void m81902N(AbstractC25981i.a viewState, Function1 onViewEvent, Function1 onNavigationEvent, InterfaceC41070a dateAndTimeProvider, C28205u0 localizedTimeFormatter, C25975c dialogViewModel, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localizedTimeFormatter, "localizedTimeFormatter");
        AbstractC22676k.m65750j(dialogViewModel, "dialogViewModel");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1928685992);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q2.m87153g(localizedTimeFormatter) : c28655q2.m87157i(localizedTimeFormatter) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(dialogViewModel) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            int i16 = i15 << 3;
            c28655q = c28655q2;
            AbstractC27203j.m81841H(dialogViewModel, viewState.getShowDialog(), onViewEvent, onNavigationEvent, onAnalyticsEvent, localizedTimeFormatter, dateAndTimeProvider, AbstractC37817c.m121344e(-1237516725, c28655q2, new C1990b0(viewState, dialogViewModel, onNavigationEvent, onViewEvent, onAnalyticsEvent, (InterfaceC28601c1) objM87133R)), c28655q, ((i15 >> 15) & 14) | 12582912 | (i16 & 896) | (i16 & 7168) | (57344 & (i15 >> 6)) | (C28205u0.f113964d << 15) | (i16 & 458752) | ((i15 << 9) & 3670016), 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedTimeFormatter, dialogViewModel, onAnalyticsEvent, i13, 9);
        }
    }

    /* JADX INFO: renamed from: O */
    private static final boolean m81903O(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    private static final void m81904P(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m81905Q(AbstractC25981i.a aVar, C25975c c25975c, Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C0213j c0213j;
        C0209i c0209i;
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(c2314t);
            C13404j c13404jM77048j = aVar.getScreenContextMetadata();
            int i15 = C13404j.f46947x << 3;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM44028b0, c13404jM77048j, false, c28655q, i15, 2));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
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
            int iM77043e = aVar.getMainIcon();
            TextResource textResourceM77052n = aVar.getToolbarTitle();
            if (textResourceM77052n == null) {
                textResourceM77052n = new TextResource.C8688b(AbstractC36529b.f156345p, null, i14, 0 == true ? 1 : 0);
            }
            TextResource textResourceM77051m = aVar.getToolbarTimeWindowText();
            boolean zM77053o = aVar.getIsNap();
            boolean zM77054p = aVar.getIsNapToSleepAvailable();
            int iM76997n = c25975c.getSleepId();
            String strM76998o = c25975c.getSleepIdV2();
            C23465k c23465kM77040b = aVar.getEditBounds();
            int i16 = TextResource.$stable;
            int i17 = i16 | (i16 << 3);
            AbstractC27200g.m81790O(textResourceM77052n, textResourceM77051m, function1, function2, iM77043e, zM77053o, zM77054p, iM76997n, strM76998o, c23465kM77040b, function3, c28655q, i17, 0, 0);
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC12248d.m34108a(AbstractC22953f.m66722k(AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14)), aVar.getScreenContextMetadata(), 0.0f, false, c28655q, i15, 6), 0.0f, 0.0f, 0.0f, f13, 7);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            float f14 = 4;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14 * f14, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC27200g.m81825x(aVar.getStatsSectionState(), function3, function2, function1, c28655q, C33210q.f138488m | C32048d.f132920h);
            c28655q.m87173q(true);
            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.7f);
            C21395c c21395cM77042d = aVar.getHrGraphState();
            boolean zM87153g = c28655q.m87153g(function3) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C9768a(function3, function2, interfaceC28601c1, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC2756k.m7799p(modifierM3384f, c21395cM77042d, null, null, false, null, (Function1) objM87133R, c28655q, (C21395c.f81985e << 3) | 6, 60);
            C22257n c22257nM77041c = aVar.getHeartRateBarGraphContainerState();
            if (c22257nM77041c == null) {
                c28655q.m87150e0(1785135110);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1785135111);
                boolean zM87157i = c28655q.m87157i(c22257nM77041c) | c28655q.m87153g(function3) | c28655q.m87153g(function2);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C26954j0((Object) c22257nM77041c, function2, (Object) function3, 3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC22242b.m63768i(null, c22257nM77041c, (Function1) objM87133R2, c28655q, C22257n.f86792c << 3, 1);
                c28655q.m87173q(false);
            }
            C25973a c25973aM77047i = aVar.getMissingHrData();
            if (c25973aM77047i == null) {
                c28655q.m87150e0(1786105844);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1786105845);
                m81910V(c25973aM77047i, c28655q, i16);
                c28655q.m87173q(false);
            }
            C36613b c36613bM77039a = aVar.getAdditionalInfoText();
            if (c36613bM77039a == null) {
                c28655q.m87150e0(1786242864);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1786242865);
                boolean zM87153g2 = c28655q.m87153g(function1);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C26957l(function1, 12);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC36612a.m117607d(c36613bM77039a, (Function1) objM87133R3, c28655q, C36613b.f156835d);
                c28655q.m87173q(false);
            }
            AbstractC27200g.m81797V(aVar.getMetricsTitle(), aVar.getMetricsSubtitle(), aVar.m77044f(), function3, function2, c28655q, i17, 0);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m81906R(Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, Object it) {
        C0520a c0520a;
        C0520a c0520a2;
        C0520a c0520a3;
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC11732a) {
            AbstractC11258s abstractC11258s = (AbstractC11258s) AbstractC25265s.m74113Q0(((InterfaceC11732a) it).mo31360b().values());
            TextResource textResourceM1227g = null;
            List<C0520a> listMo30408a = abstractC11258s != null ? abstractC11258s.mo30408a() : null;
            if (!m81903O(interfaceC28601c1)) {
                function1.invoke(AbstractC3680c.l.f15011a);
                m81904P(interfaceC28601c1, true);
            } else if (listMo30408a == null) {
                m81904P(interfaceC28601c1, false);
            }
            TextResource textResourceM1231k = (listMo30408a == null || (c0520a3 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a3.getValueDisplay();
            TextResource textResourceM1229i = (listMo30408a == null || (c0520a2 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a2.getUnitDisplay();
            if (listMo30408a != null && (c0520a = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) != null) {
                textResourceM1227g = c0520a.getSecondaryContextualDisplay();
            }
            function2.invoke(new AbstractC25979g.d(textResourceM1231k, textResourceM1229i, textResourceM1227g));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m81907S(C22257n c22257n, Function1 function1, Function1 function2, Object heartRateEvent) {
        Object next;
        AbstractC22676k.m65750j(heartRateEvent, "heartRateEvent");
        Iterator<T> it = c22257n.m63919c().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C39059l) next).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String(), heartRateEvent));
        C39059l c39059l = (C39059l) next;
        if (c39059l != null) {
            function2.invoke(new AbstractC3680c.m(AbstractC8693b.m21268b(c39059l.getTitle()), c39059l.getIsSelected(), c39059l.getIsDrillDown() || c39059l.getIsSelected()));
        }
        function1.invoke(new AbstractC25979g.i((EnumC25417b) heartRateEvent));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m81908T(Function1 function1, C9598e action) {
        AbstractC22676k.m65750j(action, "action");
        function1.invoke(new AbstractC22848a.d(action));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m81909U(AbstractC25981i.a aVar, Function1 function1, Function1 function2, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, C25975c c25975c, Function1 function3, int i13, Composer composer, int i14) {
        m81902N(aVar, function1, function2, interfaceC41070a, c28205u0, c25975c, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V */
    private static final void m81910V(C25973a c25973a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1225978089);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c25973a) : c28655q.m87157i(c25973a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22961h c22961h = AbstractC22977m.f90656g;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            float f14 = 3 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 2 * f13, 5);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            TextResource textResourceM76990b = c25973a.getTitle();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM76990b, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125382b1 = c38072d.m121949b(c28655q, i16).getWhite50();
            C2886a c2886aM8438s = c38072d.m121952e(c28655q, i16).getH5();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, i17, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c25973a.getTime(), c28655q, i15), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f14, 0.0f, 11), c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getN7(), null, c28655q, 48, i17, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(c25973a, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m81911W(C25973a c25973a, int i13, Composer composer, int i14) {
        m81910V(c25973a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public static final void m81932u(AbstractC25981i.b viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1808282657);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(viewState.getErrorTitle(), false, null, 6, null);
            TextResource textResourceM77055a = viewState.getErrorBody();
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC36529b.f156347r, null, i15, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC36529b.f156328I, 0 == true ? 1 : 0, i15, 0 == true ? 1 : 0);
            int i16 = i14 & 896;
            boolean z4 = i16 == 256;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C25514e(onNavigationEvent, 29);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q2.m87157i(viewState))) | ((i14 & 112) == 32);
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25592o(11, onViewEvent, viewState);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            boolean z14 = i16 == 256;
            Object objM87133R3 = c28655q2.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C27207n(onNavigationEvent, 0);
                c28655q2.m87172p0(objM87133R3);
            }
            int i17 = 196608 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3);
            int i18 = TextResource.C8688b.f25889c;
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(bVar, textResourceM77055a, interfaceC4339a, c8688b2, interfaceC4339a2, true, false, c8688b, (InterfaceC4339a) objM87133R3, null, false, false, c28655q, i17 | (i18 << 9) | (i18 << 21), 0, 3648);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(viewState, onViewEvent, onNavigationEvent, i13, 29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m81933v(Function1 function1) {
        function1.invoke(AbstractC22848a.a.f90080a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m81934w(Function1 function1, AbstractC25981i.b bVar) {
        String strM77057c = bVar.getSleepIdV2();
        if (strM77057c == null) {
            strM77057c = "";
        }
        function1.invoke(new AbstractC25979g.c(null, strM77057c));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m81935x(Function1 function1) {
        function1.invoke(AbstractC22848a.a.f90080a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m81936y(AbstractC25981i.b bVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m81932u(bVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    public static final void m81937z(AbstractC25981i.c viewState, Function1 onViewEvent, Function1 onNavigationEvent, InterfaceC41070a dateAndTimeProvider, C28205u0 localizedDateTimeFormatter, C25975c dialogViewModel, Function1 onAnalyticsEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(dialogViewModel, "dialogViewModel");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(650727503);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(dateAndTimeProvider) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= (32768 & i13) == 0 ? c28655q2.m87153g(localizedDateTimeFormatter) : c28655q2.m87157i(localizedDateTimeFormatter) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(dialogViewModel) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 1048576 : 524288;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (599187 & i15) != 599186)) {
            int i16 = i15 << 3;
            c28655q = c28655q2;
            AbstractC27203j.m81841H(dialogViewModel, viewState.getShowDialog(), onViewEvent, onNavigationEvent, onAnalyticsEvent, localizedDateTimeFormatter, dateAndTimeProvider, AbstractC37817c.m121344e(1383900290, c28655q2, new C0556g((Object) viewState, (Object) dialogViewModel, onNavigationEvent, (Object) onViewEvent, (Object) onAnalyticsEvent, 9)), c28655q, ((i15 >> 15) & 14) | 12582912 | (i16 & 896) | (i16 & 7168) | (57344 & (i15 >> 6)) | (C28205u0.f113964d << 15) | (i16 & 458752) | ((i15 << 9) & 3670016), 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(viewState, onViewEvent, onNavigationEvent, dateAndTimeProvider, localizedDateTimeFormatter, dialogViewModel, onAnalyticsEvent, i13, 10);
        }
    }
}
