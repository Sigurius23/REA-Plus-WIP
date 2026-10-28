package kw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.membership.extensions.domain.models.CtaAction;
import ew1.C13722a;
import gy0.AbstractC16277f;
import hw1.AbstractC17702a;
import iw1.AbstractC21004j;
import iw1.AbstractC21005k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jp1.C21852d;
import jp1.C21860l;
import jp1.C21862n;
import jp2.C21881l;
import jx1.AbstractC22007b0;
import km2.C22594e;
import ku2.C22837a;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17918w0;
import p208i2.C17916v0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kw1.t */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aO\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a;\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Liw1/k;", "viewState", "Lkotlin/Function1;", "Liw1/j;", "Ll83/a0;", "onViewEvent", "Lhw1/a;", "onNavigationEvent", "Lew1/a;", "analyticsHelper", "q", "(Liw1/k;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;Landroidx/compose/runtime/Composer;II)V", "Liw1/k$d;", "Lkotlin/Function0;", "onBackButtonClicked", "", "l", "(Liw1/k$d;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22869t {

    /* JADX INFO: renamed from: kw1.t$a */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.view.ReactivationUpsellLandingScreenKt$ReactivationUpsellLandingScreen$5$1", m100430f = "ReactivationUpsellLandingScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f90132w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13722a f90133x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21005k f90134y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C13722a c13722a, AbstractC21005k abstractC21005k, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f90133x = c13722a;
            this.f90134y = abstractC21005k;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f90133x, this.f90134y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f90132w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C13722a c13722a = this.f90133x;
            if (c13722a != null) {
                String str = (String) AbstractC25265s.m74102I0(((AbstractC21005k.d) this.f90134y).getInitialSectionIndex(), ((AbstractC21005k.d) this.f90134y).m58556g());
                if (str == null) {
                    str = "";
                }
                c13722a.m38896w(str, ((AbstractC21005k.d) this.f90134y).getTrackingLabel(), ((AbstractC21005k.d) this.f90134y).getTrackingValue());
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b A[LOOP:0: B:51:0x0175->B:53:0x017b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0196  */
    /* JADX WARN: Code duplicated, block: B:57:0x0198  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01da  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0204  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x020f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0240  */
    /* JADX WARN: Code duplicated, block: B:82:0x024b  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private static final void m66431l(AbstractC21005k.d dVar, InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13, int i14) {
        InterfaceC4339a interfaceC4339a2;
        int i15;
        boolean z4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        C2314t c2314t;
        float f13;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        ArrayList arrayList;
        Iterator<T> it;
        int i16;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        int i17;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-337232814);
        int i18 = (i13 & 6) == 0 ? (c28655q2.m87157i(dVar) ? 4 : 2) | i13 : i13;
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i18 |= c28655q2.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i13 & 384) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i18 |= i17;
            }
            i15 = i18;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C22837a(22);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C38072d c38072d = C38072d.f163053a;
                long jM125410o = c38072d.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd();
                C17916v0 c17916v0 = AbstractC17918w0.f69621a;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o, c17916v0)));
                f13 = 8;
                float f14 = 2 * f13;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f14, modifierM66723l), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(dVar.getHeader(), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a4, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f13, c2314t));
                List<String> listM58556g = dVar.m58556g();
                arrayList = new ArrayList(AbstractC25267u.m74163i0(listM58556g, 10));
                it = listM58556g.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C33223u0((String) it.next(), null, 2, 0 == true ? 1 : 0));
                }
                int iM58555f = dVar.getInitialSectionIndex();
                i16 = i15 & 896;
                if (i16 == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C21862n(function1, 22);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33231x0.m105420e(arrayList, iM58555f, null, null, (Function1) objM87133R, c28655q2, 0, 12);
                c28655q = c28655q2;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
                c28655q.m87150e0(-1318047970);
                for (AbstractC21005k.c cVar : dVar.m58557h()) {
                    c28655q.m87150e0(-1318047019);
                    for (InterfaceC25312u interfaceC25312u : cVar.m58553a()) {
                        C25307p c25307pM62893b = AbstractC22007b0.m62893b();
                        if (i16 == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C21862n(function1, 23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        C28655q c28655q3 = c28655q;
                        AbstractC25303l.m74291r(interfaceC25312u, c25307pM62893b, null, (Function1) objM87133R2, c28655q3, C25307p.f99300b << 3, 4);
                        c28655q = c28655q3;
                        AbstractC11266d.m30469w(3, f13, c2314t, c28655q);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(dVar, interfaceC4339a3, function1, i13, i14, 22);
            }
        }
        i18 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i13 & 384) == 0) {
            if (c28655q2.m87157i(function1)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i18 |= i17;
        }
        i15 = i18;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C22837a(22);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R3;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C38072d c38072d2 = C38072d.f163053a;
            long jM125410o2 = c38072d2.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd();
            C17916v0 c17916v1 = AbstractC17918w0.f69621a;
            c2314t = C2314t.f9131w;
            Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3358c(c2314t, jM125410o2, c17916v1)));
            f13 = 8;
            float f15 = 2 * f13;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3394p(f15, modifierM66723l2), AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q2, 54);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(dVar.getHeader(), null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a4, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(4 * f13, c2314t));
            List<String> listM58556g2 = dVar.m58556g();
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM58556g2, 10));
            it = listM58556g2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C33223u0((String) it.next(), null, 2, 0 == true ? 1 : 0));
            }
            int iM58555f2 = dVar.getInitialSectionIndex();
            i16 = i15 & 896;
            if (i16 == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C21862n(function1, 22);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C21862n(function1, 22);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC33231x0.m105420e(arrayList, iM58555f2, null, null, (Function1) objM87133R, c28655q2, 0, 12);
            c28655q = c28655q2;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
            c28655q.m87150e0(-1318047970);
            while (r0.hasNext()) {
                c28655q.m87150e0(-1318047019);
                while (r12.hasNext()) {
                    C25307p c25307pM62893b2 = AbstractC22007b0.m62893b();
                    if (i16 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C21862n(function1, 23);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21862n(function1, 23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM62893b2, null, (Function1) objM87133R2, c28655q4, C25307p.f99300b << 3, 4);
                    c28655q = c28655q4;
                    AbstractC11266d.m30469w(3, f13, c2314t, c28655q);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(dVar, interfaceC4339a3, function1, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m66432m() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m66433n(Function1 function1, int i13) {
        function1.invoke(new AbstractC21004j.e(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m66434o(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        function1.invoke(event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m66435p(AbstractC21005k.d dVar, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m66431l(dVar, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x014b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:109:0x0163  */
    /* JADX WARN: Code duplicated, block: B:112:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x016c  */
    /* JADX WARN: Code duplicated, block: B:116:0x017a  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0181  */
    /* JADX WARN: Code duplicated, block: B:121:0x0183  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0199 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:135:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX INFO: renamed from: q */
    public static final void m66436q(AbstractC21005k viewState, Function1 function1, Function1 function2, C13722a c13722a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        int i19;
        boolean z4;
        C13722a c13722a2;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        C13722a c13722a3;
        int i24;
        boolean z13;
        boolean z14;
        Object objM87133R;
        int i25;
        boolean z15;
        Object objM87133R2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean zM87157i;
        Object c21881l;
        boolean z19;
        boolean z24;
        boolean z25;
        Object objM87133R3;
        boolean z26;
        boolean z27;
        boolean z28;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1909279822);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i26 = i14 & 2;
        if (i26 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87157i(c13722a)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    if ((i15 & 1171) != 1170) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22594e(23);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function7 = (Function1) objM87133R6;
                        } else {
                            function7 = function3;
                        }
                        if (i16 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22594e(24);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function4 = (Function1) objM87133R5;
                        }
                        if (i18 != 0) {
                            c13722a3 = null;
                        } else {
                            c13722a3 = c13722a;
                        }
                        if (viewState instanceof AbstractC21005k.a) {
                            if (viewState instanceof AbstractC21005k.b) {
                                c28655q.m87150e0(-866849974);
                                if ((i15 & 112) == 32) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                if ((i15 & 896) == 256) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                z25 = z24 | z19;
                                objM87133R3 = c28655q.m87133R();
                                if (z25 || objM87133R3 == c28676v0) {
                                    objM87133R3 = new C2777c(function7, 9, function4);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                                c28655q.m87173q(false);
                            } else {
                                if (viewState instanceof AbstractC21005k.d) {
                                    throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                                }
                                c28655q.m87150e0(-1102158939);
                                boolean zM87157i2 = c28655q.m87157i(c13722a3);
                                i24 = i15 & 14;
                                if (i24 == 4) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87157i2 | z13;
                                objM87133R = c28655q.m87133R();
                                if (z14 || objM87133R == c28676v0) {
                                    objM87133R = new a(c13722a3, viewState, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                                AbstractC21005k.d dVar = (AbstractC21005k.d) viewState;
                                i25 = i15 & 896;
                                if (i25 == 256) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z15 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C21860l(function4, 29);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                                if (i24 == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                if ((i15 & 112) == 32) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean z29 = z17 | z16;
                                if (i25 == 256) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                zM87157i = z29 | z18 | c28655q.m87157i(c13722a3);
                                Object objM87133R7 = c28655q.m87133R();
                                if (!zM87157i || objM87133R7 == c28676v0) {
                                    function5 = function7;
                                    c13722a2 = c13722a3;
                                    function6 = function4;
                                    c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                    c28655q.m87172p0(c21881l);
                                } else {
                                    c21881l = objM87133R7;
                                    function5 = function7;
                                    c13722a2 = c13722a3;
                                    function6 = function4;
                                }
                                m66431l(dVar, interfaceC4339a, (Function1) c21881l, c28655q, i24, 0);
                                c28655q.m87173q(false);
                            }
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                            }
                        }
                        c28655q.m87150e0(-866861784);
                        if ((i15 & 112) == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        z28 = z27 | z26;
                        objM87133R4 = c28655q.m87133R();
                        if (z28 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C2777c(function7, 8, function4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                        c28655q.m87173q(false);
                        function5 = function7;
                        c13722a2 = c13722a3;
                    } else {
                        c28655q.m87138X();
                        c13722a2 = c13722a;
                        function5 = function3;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                    }
                }
                i15 |= 3072;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(23);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(24);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i18 != 0) {
                        c13722a3 = null;
                    } else {
                        c13722a3 = c13722a;
                    }
                    if (viewState instanceof AbstractC21005k.a) {
                        if (viewState instanceof AbstractC21005k.b) {
                            c28655q.m87150e0(-866849974);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC21005k.d) {
                                throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                            }
                            c28655q.m87150e0(-1102158939);
                            boolean zM87157i3 = c28655q.m87157i(c13722a3);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i3 | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                            AbstractC21005k.d dVar2 = (AbstractC21005k.d) viewState;
                            i25 = i15 & 896;
                            if (i25 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
                            if (i24 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z210 = z17 | z16;
                            if (i25 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i = z210 | z18 | c28655q.m87157i(c13722a3);
                            Object objM87133R8 = c28655q.m87133R();
                            if (zM87157i) {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            } else {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            }
                            m66431l(dVar2, interfaceC4339a2, (Function1) c21881l, c28655q, i24, 0);
                            c28655q.m87173q(false);
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                        }
                    }
                    c28655q.m87150e0(-866861784);
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z27 | z26;
                    objM87133R4 = c28655q.m87133R();
                    if (z28) {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                    c28655q.m87173q(false);
                    function5 = function7;
                    c13722a2 = c13722a3;
                } else {
                    c28655q.m87138X();
                    c13722a2 = c13722a;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                }
            }
            i15 |= 384;
            function4 = function2;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(c13722a)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(23);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(24);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i18 != 0) {
                        c13722a3 = null;
                    } else {
                        c13722a3 = c13722a;
                    }
                    if (viewState instanceof AbstractC21005k.a) {
                        if (viewState instanceof AbstractC21005k.b) {
                            c28655q.m87150e0(-866849974);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC21005k.d) {
                                throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                            }
                            c28655q.m87150e0(-1102158939);
                            boolean zM87157i4 = c28655q.m87157i(c13722a3);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i4 | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                            AbstractC21005k.d dVar3 = (AbstractC21005k.d) viewState;
                            i25 = i15 & 896;
                            if (i25 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                            if (i24 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z211 = z17 | z16;
                            if (i25 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i = z211 | z18 | c28655q.m87157i(c13722a3);
                            Object objM87133R9 = c28655q.m87133R();
                            if (zM87157i) {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            } else {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            }
                            m66431l(dVar3, interfaceC4339a3, (Function1) c21881l, c28655q, i24, 0);
                            c28655q.m87173q(false);
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                        }
                    }
                    c28655q.m87150e0(-866861784);
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z27 | z26;
                    objM87133R4 = c28655q.m87133R();
                    if (z28) {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                    c28655q.m87173q(false);
                    function5 = function7;
                    c13722a2 = c13722a3;
                } else {
                    c28655q.m87138X();
                    c13722a2 = c13722a;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(23);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i18 != 0) {
                    c13722a3 = null;
                } else {
                    c13722a3 = c13722a;
                }
                if (viewState instanceof AbstractC21005k.a) {
                    if (viewState instanceof AbstractC21005k.b) {
                        c28655q.m87150e0(-866849974);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC21005k.d) {
                            throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                        }
                        c28655q.m87150e0(-1102158939);
                        boolean zM87157i5 = c28655q.m87157i(c13722a3);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i5 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                        AbstractC21005k.d dVar4 = (AbstractC21005k.d) viewState;
                        i25 = i15 & 896;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z212 = z17 | z16;
                        if (i25 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i = z212 | z18 | c28655q.m87157i(c13722a3);
                        Object objM87133R10 = c28655q.m87133R();
                        if (zM87157i) {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        } else {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        }
                        m66431l(dVar4, interfaceC4339a4, (Function1) c21881l, c28655q, i24, 0);
                        c28655q.m87173q(false);
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                    }
                }
                c28655q.m87150e0(-866861784);
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i15 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z27 | z26;
                objM87133R4 = c28655q.m87133R();
                if (z28) {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                c28655q.m87173q(false);
                function5 = function7;
                c13722a2 = c13722a3;
            } else {
                c28655q.m87138X();
                c13722a2 = c13722a;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(c13722a)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22594e(23);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function7 = (Function1) objM87133R6;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22594e(24);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function4 = (Function1) objM87133R5;
                    }
                    if (i18 != 0) {
                        c13722a3 = null;
                    } else {
                        c13722a3 = c13722a;
                    }
                    if (viewState instanceof AbstractC21005k.a) {
                        if (viewState instanceof AbstractC21005k.b) {
                            c28655q.m87150e0(-866849974);
                            if ((i15 & 112) == 32) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if ((i15 & 896) == 256) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            z25 = z24 | z19;
                            objM87133R3 = c28655q.m87133R();
                            if (z25) {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C2777c(function7, 9, function4);
                                c28655q.m87172p0(objM87133R3);
                            }
                            AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof AbstractC21005k.d) {
                                throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                            }
                            c28655q.m87150e0(-1102158939);
                            boolean zM87157i6 = c28655q.m87157i(c13722a3);
                            i24 = i15 & 14;
                            if (i24 == 4) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i6 | z13;
                            objM87133R = c28655q.m87133R();
                            if (z14) {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(c13722a3, viewState, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                            AbstractC21005k.d dVar5 = (AbstractC21005k.d) viewState;
                            i25 = i15 & 896;
                            if (i25 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z15) {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21860l(function4, 29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R2;
                            if (i24 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            if ((i15 & 112) == 32) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean z213 = z17 | z16;
                            if (i25 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            zM87157i = z213 | z18 | c28655q.m87157i(c13722a3);
                            Object objM87133R11 = c28655q.m87133R();
                            if (zM87157i) {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            } else {
                                function5 = function7;
                                c13722a2 = c13722a3;
                                function6 = function4;
                                c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                                c28655q.m87172p0(c21881l);
                            }
                            m66431l(dVar5, interfaceC4339a5, (Function1) c21881l, c28655q, i24, 0);
                            c28655q.m87173q(false);
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                        }
                    }
                    c28655q.m87150e0(-866861784);
                    if ((i15 & 112) == 32) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    z28 = z27 | z26;
                    objM87133R4 = c28655q.m87133R();
                    if (z28) {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C2777c(function7, 8, function4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                    c28655q.m87173q(false);
                    function5 = function7;
                    c13722a2 = c13722a3;
                } else {
                    c28655q.m87138X();
                    c13722a2 = c13722a;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                }
            }
            i15 |= 3072;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(23);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i18 != 0) {
                    c13722a3 = null;
                } else {
                    c13722a3 = c13722a;
                }
                if (viewState instanceof AbstractC21005k.a) {
                    if (viewState instanceof AbstractC21005k.b) {
                        c28655q.m87150e0(-866849974);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC21005k.d) {
                            throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                        }
                        c28655q.m87150e0(-1102158939);
                        boolean zM87157i7 = c28655q.m87157i(c13722a3);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i7 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                        AbstractC21005k.d dVar6 = (AbstractC21005k.d) viewState;
                        i25 = i15 & 896;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z214 = z17 | z16;
                        if (i25 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i = z214 | z18 | c28655q.m87157i(c13722a3);
                        Object objM87133R12 = c28655q.m87133R();
                        if (zM87157i) {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        } else {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        }
                        m66431l(dVar6, interfaceC4339a6, (Function1) c21881l, c28655q, i24, 0);
                        c28655q.m87173q(false);
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                    }
                }
                c28655q.m87150e0(-866861784);
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i15 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z27 | z26;
                objM87133R4 = c28655q.m87133R();
                if (z28) {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                c28655q.m87173q(false);
                function5 = function7;
                c13722a2 = c13722a3;
            } else {
                c28655q.m87138X();
                c13722a2 = c13722a;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
            }
        }
        i15 |= 384;
        function4 = function2;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(c13722a)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22594e(23);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function7 = (Function1) objM87133R6;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22594e(24);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                }
                if (i18 != 0) {
                    c13722a3 = null;
                } else {
                    c13722a3 = c13722a;
                }
                if (viewState instanceof AbstractC21005k.a) {
                    if (viewState instanceof AbstractC21005k.b) {
                        c28655q.m87150e0(-866849974);
                        if ((i15 & 112) == 32) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if ((i15 & 896) == 256) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        z25 = z24 | z19;
                        objM87133R3 = c28655q.m87133R();
                        if (z25) {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C2777c(function7, 9, function4);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof AbstractC21005k.d) {
                            throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                        }
                        c28655q.m87150e0(-1102158939);
                        boolean zM87157i8 = c28655q.m87157i(c13722a3);
                        i24 = i15 & 14;
                        if (i24 == 4) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i8 | z13;
                        objM87133R = c28655q.m87133R();
                        if (z14) {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(c13722a3, viewState, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                        AbstractC21005k.d dVar7 = (AbstractC21005k.d) viewState;
                        i25 = i15 & 896;
                        if (i25 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z15) {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21860l(function4, 29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        if (i24 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean z215 = z17 | z16;
                        if (i25 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i = z215 | z18 | c28655q.m87157i(c13722a3);
                        Object objM87133R13 = c28655q.m87133R();
                        if (zM87157i) {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        } else {
                            function5 = function7;
                            c13722a2 = c13722a3;
                            function6 = function4;
                            c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                            c28655q.m87172p0(c21881l);
                        }
                        m66431l(dVar7, interfaceC4339a7, (Function1) c21881l, c28655q, i24, 0);
                        c28655q.m87173q(false);
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                    }
                }
                c28655q.m87150e0(-866861784);
                if ((i15 & 112) == 32) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                if ((i15 & 896) == 256) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                z28 = z27 | z26;
                objM87133R4 = c28655q.m87133R();
                if (z28) {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2777c(function7, 8, function4);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
                c28655q.m87173q(false);
                function5 = function7;
                c13722a2 = c13722a3;
            } else {
                c28655q.m87138X();
                c13722a2 = c13722a;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
            }
        }
        i15 |= 3072;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C22594e(23);
                    c28655q.m87172p0(objM87133R6);
                }
                function7 = (Function1) objM87133R6;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C22594e(24);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            }
            if (i18 != 0) {
                c13722a3 = null;
            } else {
                c13722a3 = c13722a;
            }
            if (viewState instanceof AbstractC21005k.a) {
                if (viewState instanceof AbstractC21005k.b) {
                    c28655q.m87150e0(-866849974);
                    if ((i15 & 112) == 32) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    z25 = z24 | z19;
                    objM87133R3 = c28655q.m87133R();
                    if (z25) {
                        objM87133R3 = new C2777c(function7, 9, function4);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C2777c(function7, 9, function4);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC22863n.m66404e(null, (Function1) objM87133R3, c28655q, 0, 1);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof AbstractC21005k.d) {
                        throw AbstractC11895b.m32003v(-866862735, c28655q, false);
                    }
                    c28655q.m87150e0(-1102158939);
                    boolean zM87157i9 = c28655q.m87157i(c13722a3);
                    i24 = i15 & 14;
                    if (i24 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i9 | z13;
                    objM87133R = c28655q.m87133R();
                    if (z14) {
                        objM87133R = new a(c13722a3, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(c13722a3, viewState, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                    AbstractC21005k.d dVar8 = (AbstractC21005k.d) viewState;
                    i25 = i15 & 896;
                    if (i25 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z15) {
                        objM87133R2 = new C21860l(function4, 29);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21860l(function4, 29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R2;
                    if (i24 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z216 = z17 | z16;
                    if (i25 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i = z216 | z18 | c28655q.m87157i(c13722a3);
                    Object objM87133R14 = c28655q.m87133R();
                    if (zM87157i) {
                        function5 = function7;
                        c13722a2 = c13722a3;
                        function6 = function4;
                        c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                        c28655q.m87172p0(c21881l);
                    } else {
                        function5 = function7;
                        c13722a2 = c13722a3;
                        function6 = function4;
                        c21881l = new C21881l(viewState, function5, function6, c13722a2, 5);
                        c28655q.m87172p0(c21881l);
                    }
                    m66431l(dVar8, interfaceC4339a8, (Function1) c21881l, c28655q, i24, 0);
                    c28655q.m87173q(false);
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
                }
            }
            c28655q.m87150e0(-866861784);
            if ((i15 & 112) == 32) {
                z26 = true;
            } else {
                z26 = false;
            }
            if ((i15 & 896) == 256) {
                z27 = true;
            } else {
                z27 = false;
            }
            z28 = z27 | z26;
            objM87133R4 = c28655q.m87133R();
            if (z28) {
                objM87133R4 = new C2777c(function7, 8, function4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2777c(function7, 8, function4);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC22862m.m66395e(null, (Function1) objM87133R4, c28655q, 0, 1);
            c28655q.m87173q(false);
            function5 = function7;
            c13722a2 = c13722a3;
        } else {
            c28655q.m87138X();
            c13722a2 = c13722a;
            function5 = function3;
        }
        function6 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c(viewState, function5, function6, c13722a2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m66437r(AbstractC21004j it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m66438s(AbstractC17702a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m66439t(Function1 function1, Function1 function2, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        if (it == CtaAction.RETRY) {
            function1.invoke(AbstractC21004j.a.f79482a);
        } else {
            function2.invoke(AbstractC17702a.a.f68771a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m66440u(Function1 function1, Function1 function2, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        if (it == CtaAction.RETRY) {
            function1.invoke(AbstractC21004j.a.f79482a);
        } else {
            function2.invoke(AbstractC17702a.a.f68771a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m66441v(Function1 function1) {
        function1.invoke(AbstractC17702a.a.f68771a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66442w(AbstractC21005k abstractC21005k, Function1 function1, Function1 function2, C13722a c13722a, Object event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22868s.m66419a(event, (AbstractC21005k.d) abstractC21005k, function1, function2, c13722a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66443x(AbstractC21005k abstractC21005k, Function1 function1, Function1 function2, C13722a c13722a, int i13, int i14, Composer composer, int i15) {
        m66436q(abstractC21005k, function1, function2, c13722a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
