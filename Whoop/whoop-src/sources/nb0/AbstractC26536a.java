package nb0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ep0.C13404j;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gb1.AbstractC15674c;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import j21.AbstractC21243b;
import java.util.List;
import kb0.AbstractC22319a;
import kd0.InterfaceC22381a;
import kw1.C22852c;
import l80.C23434k;
import l83.C23454a0;
import lb0.AbstractC23586c;
import md0.AbstractC25448c;
import mf2.C25514e;
import n72.C26439b;
import no.nordicsemi.android.dfu.DfuBaseService;
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
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nb0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aO\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a+\u0010\u0011\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Llb0/c;", "viewState", "", "source", "Lkotlin/Function1;", "Lkd0/a$c;", "Ll83/a0;", "onAnalyticsEvent", "Lkb0/a;", "onNavigationEvent", "n", "(Llb0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llb0/c$c;", "i", "(Llb0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", NotificationCompat.CATEGORY_EVENT, "s", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26536a {

    /* JADX INFO: renamed from: nb0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.clinicalinsights.view.ClinicalInsightsScreenKt$ClinicalInsightsScreen$5$1", m100430f = "ClinicalInsightsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f105472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f105473x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC23586c f105474y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f105475z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, AbstractC23586c abstractC23586c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f105473x = function1;
            this.f105474y = abstractC23586c;
            this.f105475z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f105473x, this.f105474y, this.f105475z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f105472w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f105473x.invoke(new InterfaceC22381a.h0(this.f105475z, ((AbstractC23586c.c) this.f105474y).getAnalyticsData()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:57:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:69:0x021e  */
    /* JADX WARN: Code duplicated, block: B:71:0x022f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0231  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:81:0x026e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0278  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static final void m78618i(AbstractC23586c.c viewState, Function1 function1, Composer composer, int i13, int i14) {
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i15;
        boolean z13;
        Object objM87133R;
        Function1 function4;
        int i16;
        C28676v0 c28676v1;
        int iHashCode2;
        int i17;
        boolean z14;
        Object objM87133R2;
        Function1 function5;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(688782776);
        int i18 = (i13 & 6) == 0 ? i13 | (c28655q2.m87157i(viewState) ? 4 : 2) : i13;
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i18 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            if ((i18 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i18 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26439b(6);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function3 = (Function1) objM87133R3;
                } else {
                    function3 = function2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
                C13404j c13404jM68231d = viewState.getScreenContextMetadata();
                int i24 = C13404j.f46947x << 3;
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM44028b0, c13404jM68231d, false, c28655q2, i24, 2)), "ClinicalInsightsSuccessState");
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
                i15 = i18 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C25514e(function3, 12);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = function3;
                i16 = i15;
                c28676v1 = c28676v0;
                AbstractC6719b.m20143d(modifierM3409f, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                float f13 = 8;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 2 * f13, 0.0f, 2);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC11895b.m31988g(modifierM3396r, true, 1.0f), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q2, i24, 6);
                c28655q = c28655q2;
                C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f13, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM34108a);
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
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                c28655q.m87150e0(-183476795);
                for (InterfaceC25312u interfaceC25312u : viewState.m68232e()) {
                    C25307p c25307pM74678B0 = AbstractC25448c.m74678B0();
                    i17 = i16;
                    if (i17 == 32) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    C28676v0 c28676v2 = c28676v1;
                    if (!z14 || objM87133R2 == c28676v2) {
                        function5 = function4;
                        objM87133R2 = new C23434k(function5, 27);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        function5 = function4;
                    }
                    C28655q c28655q3 = c28655q;
                    AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B0, null, (Function1) objM87133R2, c28655q3, C25307p.f99300b << 3, 4);
                    i16 = i17;
                    c28655q = c28655q3;
                    c28676v1 = c28676v2;
                    function4 = function5;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                function2 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24671c(viewState, i13, function2, i14, 21);
            }
        }
        i18 |= 48;
        function2 = function1;
        if ((i18 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i18 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26439b(6);
                    c28655q2.m87172p0(objM87133R3);
                }
                function3 = (Function1) objM87133R3;
            } else {
                function3 = function2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b1 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2));
            C13404j c13404jM68231d2 = viewState.getScreenContextMetadata();
            int i25 = C13404j.f46947x << 3;
            Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM44028b1, c13404jM68231d2, false, c28655q2, i25, 2)), "ClinicalInsightsSuccessState");
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i7, modifierM118962N3);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(viewState.getNavigationBar().getNavigationTitle()), null, Integer.valueOf(EnumC16313m0.CARET_BACKWARD.toWhoopIcon()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null);
            i15 = i18 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z13) {
                objM87133R = new C25514e(function3, 12);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C25514e(function3, 12);
                c28655q2.m87172p0(objM87133R);
            }
            function4 = function3;
            i16 = i15;
            c28676v1 = c28676v0;
            AbstractC6719b.m20143d(modifierM3409f2, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f14 = 8;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t2), 2 * f14, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(AbstractC15674c.m44085i(AbstractC11895b.m31988g(modifierM3396r2, true, 1.0f), 0.0f, null, 3, null), AbstractC30060g.m92099U(0, c28655q2, 1), 14), viewState.getScreenContextMetadata(), 0.0f, false, c28655q2, i25, 6);
            c28655q = c28655q2;
            C23010x c23010xM73381n2 = AbstractC25012a.m73381n(3, f14, c2305k2, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM34108a2);
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
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f14, c2314t2));
            c28655q.m87150e0(-183476795);
            while (r0.hasNext()) {
                C25307p c25307pM74678B1 = AbstractC25448c.m74678B0();
                i17 = i16;
                if (i17 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R2 = c28655q.m87133R();
                C28676v0 c28676v3 = c28676v1;
                if (z14) {
                    function5 = function4;
                    objM87133R2 = new C23434k(function5, 27);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function5 = function4;
                    objM87133R2 = new C23434k(function5, 27);
                    c28655q.m87172p0(objM87133R2);
                }
                C28655q c28655q4 = c28655q;
                AbstractC25303l.m74291r(interfaceC25312u, c25307pM74678B1, null, (Function1) objM87133R2, c28655q4, C25307p.f99300b << 3, 4);
                i16 = i17;
                c28655q = c28655q4;
                c28676v1 = c28676v3;
                function4 = function5;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            function2 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(viewState, i13, function2, i14, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m78619j(AbstractC22319a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m78620k(Function1 function1) {
        function1.invoke(AbstractC22319a.a.f87094a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m78621l(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m78628s(function1, event);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m78622m(AbstractC23586c.c cVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m78618i(cVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0218  */
    /* JADX WARN: Code duplicated, block: B:105:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0222  */
    /* JADX WARN: Code duplicated, block: B:110:0x0241  */
    /* JADX WARN: Code duplicated, block: B:112:0x0249  */
    /* JADX WARN: Code duplicated, block: B:115:0x0256  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:73:0x0111  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0177  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:87:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x0206  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209  */
    /* JADX WARN: Code duplicated, block: B:97:0x020d  */
    /* JADX WARN: Code duplicated, block: B:98:0x020f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m78623n(AbstractC23586c viewState, String str, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        String str2;
        int i16;
        Function1 function3;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        boolean z4;
        C28655q c28655q;
        String str3;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        List list;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        int i24;
        boolean z13;
        C2314t c2314t;
        String str4;
        Function1 function9;
        Function1 function10;
        Function1 function11;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R;
        boolean z17;
        Object objM87133R2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R3;
        Object objM87133R4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-363117276);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i25 = i14 & 2;
        if (i25 == 0) {
            if ((i13 & 48) == 0) {
                str2 = str;
                i15 |= c28655q2.m87153g(str2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function3 = function1;
                    if (c28655q2.m87157i(function3)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        function4 = function2;
                        if (c28655q2.m87157i(function4)) {
                            i19 = 2048;
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
                    if (c28655q2.m87135U(i15 & 1, z4)) {
                        list = null;
                        objArr3 = 0;
                        objArr2 = 0;
                        objArr = 0;
                        if (i25 != 0) {
                            str2 = null;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i16 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C26439b(4);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function7 = (Function1) objM87133R4;
                        } else {
                            function7 = function3;
                        }
                        if (i18 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C26439b(5);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function8 = (Function1) objM87133R3;
                        } else {
                            function8 = function4;
                        }
                        i24 = i15 & 14;
                        AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                        z13 = viewState instanceof AbstractC23586c.b;
                        c2314t = C2314t.f9131w;
                        if (z13) {
                            c28655q2.m87150e0(1396279528);
                            C22961h c22961h = AbstractC22977m.f90654e;
                            C2305k c2305k = C2299e.f9111N;
                            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 54);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3599a);
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
                            function9 = function7;
                            str4 = str2;
                            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(false);
                            function4 = function8;
                            c28655q = c28655q2;
                        } else {
                            str4 = str2;
                            function9 = function7;
                            function10 = function8;
                            if (viewState instanceof AbstractC23586c.a) {
                                c28655q2.m87150e0(1396741242);
                                int i26 = 2;
                                AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i26, objArr == true ? 1 : 0), false, null, 6, null);
                                TextResource textResourceM21267a = AbstractC8693b.m21267a();
                                TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i26, objArr3 == true ? 1 : 0);
                                z17 = (i15 & 7168) == 2048;
                                objM87133R2 = c28655q2.m87133R();
                                if (z17 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C25514e(function10, 11);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                AbstractC33199m0.m105214F(bVar, textResourceM21267a, null, c8688b, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                                c28655q = c28655q2;
                                c28655q.m87173q(false);
                                function4 = function10;
                            } else {
                                function4 = function10;
                                function11 = function9;
                                c28655q = c28655q2;
                                if (viewState instanceof AbstractC23586c.c) {
                                    throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                                }
                                c28655q.m87150e0(1397265297);
                                if ((i15 & 896) == 256) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (i24 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = ((i15 & 112) == 32) | z14 | z15;
                                objM87133R = c28655q.m87133R();
                                if (z16 || objM87133R == c28676v0) {
                                    objM87133R = new a(function11, viewState, str4, null);
                                    c28655q.m87172p0(objM87133R);
                                }
                                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                                m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                                c28655q.m87173q(false);
                            }
                            str3 = str4;
                            function5 = function11;
                        }
                        function11 = function9;
                        str3 = str4;
                        function5 = function11;
                    } else {
                        c28655q = c28655q2;
                        c28655q.m87138X();
                        str3 = str2;
                        function5 = function3;
                    }
                    function6 = function4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
                    }
                }
                i15 |= 3072;
                function4 = function2;
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(4);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26439b(5);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    } else {
                        function8 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                    z13 = viewState instanceof AbstractC23586c.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q2.m87150e0(1396279528);
                        C22961h c22961h2 = AbstractC22977m.f90654e;
                        C2305k c2305k2 = C2299e.f9111N;
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h2, c2305k2, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3599a2);
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
                        function9 = function7;
                        str4 = str2;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                        function4 = function8;
                        c28655q = c28655q2;
                    } else {
                        str4 = str2;
                        function9 = function7;
                        function10 = function8;
                        if (viewState instanceof AbstractC23586c.a) {
                            c28655q2.m87150e0(1396741242);
                            int i27 = 2;
                            AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i27, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a2 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i27, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar2, textResourceM21267a2, null, c8688b2, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                            function4 = function10;
                        } else {
                            function4 = function10;
                            function11 = function9;
                            c28655q = c28655q2;
                            if (viewState instanceof AbstractC23586c.c) {
                                throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                            }
                            c28655q.m87150e0(1397265297);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = ((i15 & 112) == 32) | z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                            c28655q.m87173q(false);
                        }
                        str3 = str4;
                        function5 = function11;
                    }
                    function11 = function9;
                    str3 = str4;
                    function5 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
                }
            }
            i15 |= 384;
            function3 = function1;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = 2048;
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(4);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26439b(5);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    } else {
                        function8 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                    z13 = viewState instanceof AbstractC23586c.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q2.m87150e0(1396279528);
                        C22961h c22961h3 = AbstractC22977m.f90654e;
                        C2305k c2305k3 = C2299e.f9111N;
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22961h3, c2305k3, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3599a3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N3);
                        function9 = function7;
                        str4 = str2;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                        function4 = function8;
                        c28655q = c28655q2;
                    } else {
                        str4 = str2;
                        function9 = function7;
                        function10 = function8;
                        if (viewState instanceof AbstractC23586c.a) {
                            c28655q2.m87150e0(1396741242);
                            int i28 = 2;
                            AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i28, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a3 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i28, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar3, textResourceM21267a3, null, c8688b3, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                            function4 = function10;
                        } else {
                            function4 = function10;
                            function11 = function9;
                            c28655q = c28655q2;
                            if (viewState instanceof AbstractC23586c.c) {
                                throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                            }
                            c28655q.m87150e0(1397265297);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = ((i15 & 112) == 32) | z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                            c28655q.m87173q(false);
                        }
                        str3 = str4;
                        function5 = function11;
                    }
                    function11 = function9;
                    str3 = str4;
                    function5 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(4);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26439b(5);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                z13 = viewState instanceof AbstractC23586c.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q2.m87150e0(1396279528);
                    C22961h c22961h4 = AbstractC22977m.f90654e;
                    C2305k c2305k4 = C2299e.f9111N;
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22961h4, c2305k4, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3599a4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N4);
                    function9 = function7;
                    str4 = str2;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                    function4 = function8;
                    c28655q = c28655q2;
                } else {
                    str4 = str2;
                    function9 = function7;
                    function10 = function8;
                    if (viewState instanceof AbstractC23586c.a) {
                        c28655q2.m87150e0(1396741242);
                        int i29 = 2;
                        AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i29, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b4 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i29, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar4, textResourceM21267a4, null, c8688b4, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        function4 = function10;
                    } else {
                        function4 = function10;
                        function11 = function9;
                        c28655q = c28655q2;
                        if (viewState instanceof AbstractC23586c.c) {
                            throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                        }
                        c28655q.m87150e0(1397265297);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = ((i15 & 112) == 32) | z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                        c28655q.m87173q(false);
                    }
                    str3 = str4;
                    function5 = function11;
                }
                function11 = function9;
                str3 = str4;
                function5 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
            }
        }
        i15 |= 48;
        str2 = str;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                if (c28655q2.m87157i(function3)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q2.m87157i(function4)) {
                        i19 = 2048;
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
                if (c28655q2.m87135U(i15 & 1, z4)) {
                    list = null;
                    objArr3 = 0;
                    objArr2 = 0;
                    objArr = 0;
                    if (i25 != 0) {
                        str2 = null;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i16 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C26439b(4);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function7 = (Function1) objM87133R4;
                    } else {
                        function7 = function3;
                    }
                    if (i18 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C26439b(5);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function8 = (Function1) objM87133R3;
                    } else {
                        function8 = function4;
                    }
                    i24 = i15 & 14;
                    AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                    z13 = viewState instanceof AbstractC23586c.b;
                    c2314t = C2314t.f9131w;
                    if (z13) {
                        c28655q2.m87150e0(1396279528);
                        C22961h c22961h5 = AbstractC22977m.f90654e;
                        C2305k c2305k5 = C2299e.f9111N;
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22961h5, c2305k5, c28655q2, 54);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3599a5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N5);
                        function9 = function7;
                        str4 = str2;
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(false);
                        function4 = function8;
                        c28655q = c28655q2;
                    } else {
                        str4 = str2;
                        function9 = function7;
                        function10 = function8;
                        if (viewState instanceof AbstractC23586c.a) {
                            c28655q2.m87150e0(1396741242);
                            int i210 = 2;
                            AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i210, objArr == true ? 1 : 0), false, null, 6, null);
                            TextResource textResourceM21267a5 = AbstractC8693b.m21267a();
                            TextResource.C8688b c8688b5 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i210, objArr3 == true ? 1 : 0);
                            if ((i15 & 7168) == 2048) {
                            }
                            objM87133R2 = c28655q2.m87133R();
                            if (z17) {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C25514e(function10, 11);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            AbstractC33199m0.m105214F(bVar5, textResourceM21267a5, null, c8688b5, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                            c28655q = c28655q2;
                            c28655q.m87173q(false);
                            function4 = function10;
                        } else {
                            function4 = function10;
                            function11 = function9;
                            c28655q = c28655q2;
                            if (viewState instanceof AbstractC23586c.c) {
                                throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                            }
                            c28655q.m87150e0(1397265297);
                            if ((i15 & 896) == 256) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (i24 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = ((i15 & 112) == 32) | z14 | z15;
                            objM87133R = c28655q.m87133R();
                            if (z16) {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            } else {
                                objM87133R = new a(function11, viewState, str4, null);
                                c28655q.m87172p0(objM87133R);
                            }
                            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                            m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                            c28655q.m87173q(false);
                        }
                        str3 = str4;
                        function5 = function11;
                    }
                    function11 = function9;
                    str3 = str4;
                    function5 = function11;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    str3 = str2;
                    function5 = function3;
                }
                function6 = function4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(4);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26439b(5);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                z13 = viewState instanceof AbstractC23586c.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q2.m87150e0(1396279528);
                    C22961h c22961h6 = AbstractC22977m.f90654e;
                    C2305k c2305k6 = C2299e.f9111N;
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22961h6, c2305k6, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3599a6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N6);
                    function9 = function7;
                    str4 = str2;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                    function4 = function8;
                    c28655q = c28655q2;
                } else {
                    str4 = str2;
                    function9 = function7;
                    function10 = function8;
                    if (viewState instanceof AbstractC23586c.a) {
                        c28655q2.m87150e0(1396741242);
                        int i211 = 2;
                        AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i211, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a6 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b6 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i211, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar6, textResourceM21267a6, null, c8688b6, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        function4 = function10;
                    } else {
                        function4 = function10;
                        function11 = function9;
                        c28655q = c28655q2;
                        if (viewState instanceof AbstractC23586c.c) {
                            throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                        }
                        c28655q.m87150e0(1397265297);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = ((i15 & 112) == 32) | z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                        c28655q.m87173q(false);
                    }
                    str3 = str4;
                    function5 = function11;
                }
                function11 = function9;
                str3 = str4;
                function5 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
            }
        }
        i15 |= 384;
        function3 = function1;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q2.m87157i(function4)) {
                    i19 = 2048;
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
            if (c28655q2.m87135U(i15 & 1, z4)) {
                list = null;
                objArr3 = 0;
                objArr2 = 0;
                objArr = 0;
                if (i25 != 0) {
                    str2 = null;
                }
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C26439b(4);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function7 = (Function1) objM87133R4;
                } else {
                    function7 = function3;
                }
                if (i18 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C26439b(5);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function8 = (Function1) objM87133R3;
                } else {
                    function8 = function4;
                }
                i24 = i15 & 14;
                AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
                z13 = viewState instanceof AbstractC23586c.b;
                c2314t = C2314t.f9131w;
                if (z13) {
                    c28655q2.m87150e0(1396279528);
                    C22961h c22961h7 = AbstractC22977m.f90654e;
                    C2305k c2305k7 = C2299e.f9111N;
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22961h7, c2305k7, c28655q2, 54);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3599a7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N7);
                    function9 = function7;
                    str4 = str2;
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(false);
                    function4 = function8;
                    c28655q = c28655q2;
                } else {
                    str4 = str2;
                    function9 = function7;
                    function10 = function8;
                    if (viewState instanceof AbstractC23586c.a) {
                        c28655q2.m87150e0(1396741242);
                        int i212 = 2;
                        AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i212, objArr == true ? 1 : 0), false, null, 6, null);
                        TextResource textResourceM21267a7 = AbstractC8693b.m21267a();
                        TextResource.C8688b c8688b7 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i212, objArr3 == true ? 1 : 0);
                        if ((i15 & 7168) == 2048) {
                        }
                        objM87133R2 = c28655q2.m87133R();
                        if (z17) {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C25514e(function10, 11);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        AbstractC33199m0.m105214F(bVar7, textResourceM21267a7, null, c8688b7, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                        function4 = function10;
                    } else {
                        function4 = function10;
                        function11 = function9;
                        c28655q = c28655q2;
                        if (viewState instanceof AbstractC23586c.c) {
                            throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                        }
                        c28655q.m87150e0(1397265297);
                        if ((i15 & 896) == 256) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i24 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = ((i15 & 112) == 32) | z14 | z15;
                        objM87133R = c28655q.m87133R();
                        if (z16) {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new a(function11, viewState, str4, null);
                            c28655q.m87172p0(objM87133R);
                        }
                        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                        m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                        c28655q.m87173q(false);
                    }
                    str3 = str4;
                    function5 = function11;
                }
                function11 = function9;
                str3 = str4;
                function5 = function11;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                str3 = str2;
                function5 = function3;
            }
            function6 = function4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            list = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (i25 != 0) {
                str2 = null;
            }
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C26439b(4);
                    c28655q2.m87172p0(objM87133R4);
                }
                function7 = (Function1) objM87133R4;
            } else {
                function7 = function3;
            }
            if (i18 != 0) {
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C26439b(5);
                    c28655q2.m87172p0(objM87133R3);
                }
                function8 = (Function1) objM87133R3;
            } else {
                function8 = function4;
            }
            i24 = i15 & 14;
            AbstractC14874j.m42904c(viewState, "advanced_labs_clinical_insights", c28655q2, i24 | 48);
            z13 = viewState instanceof AbstractC23586c.b;
            c2314t = C2314t.f9131w;
            if (z13) {
                c28655q2.m87150e0(1396279528);
                C22961h c22961h8 = AbstractC22977m.f90654e;
                C2305k c2305k8 = C2299e.f9111N;
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(c2314t, "ClinicalInsightsLoadingState");
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22961h8, c2305k8, c28655q2, 54);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3599a8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N8);
                function9 = function7;
                str4 = str2;
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q2.m87173q(true);
                c28655q2.m87173q(false);
                function4 = function8;
                c28655q = c28655q2;
            } else {
                str4 = str2;
                function9 = function7;
                function10 = function8;
                if (viewState instanceof AbstractC23586c.a) {
                    c28655q2.m87150e0(1396741242);
                    int i213 = 2;
                    AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC16277f.f62271P1, list, i213, objArr == true ? 1 : 0), false, null, 6, null);
                    TextResource textResourceM21267a8 = AbstractC8693b.m21267a();
                    TextResource.C8688b c8688b8 = new TextResource.C8688b(AbstractC35283c.f150167E, objArr2 == true ? 1 : 0, i213, objArr3 == true ? 1 : 0);
                    if ((i15 & 7168) == 2048) {
                    }
                    objM87133R2 = c28655q2.m87133R();
                    if (z17) {
                        objM87133R2 = new C25514e(function10, 11);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C25514e(function10, 11);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    AbstractC33199m0.m105214F(bVar8, textResourceM21267a8, null, c8688b8, (InterfaceC4339a) objM87133R2, false, false, null, null, AbstractC1136a.m3599a(c2314t, "ClinicalInsightsErrorState"), false, false, c28655q2, 805306368 | AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | (TextResource.C8688b.f25889c << 9), 0, 3556);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                    function4 = function10;
                } else {
                    function4 = function10;
                    function11 = function9;
                    c28655q = c28655q2;
                    if (viewState instanceof AbstractC23586c.c) {
                        throw AbstractC11895b.m32003v(-1063338964, c28655q, false);
                    }
                    c28655q.m87150e0(1397265297);
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i24 == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = ((i15 & 112) == 32) | z14 | z15;
                    objM87133R = c28655q.m87133R();
                    if (z16) {
                        objM87133R = new a(function11, viewState, str4, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new a(function11, viewState, str4, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, viewState);
                    m78618i((AbstractC23586c.c) viewState, function4, c28655q, ((i15 >> 6) & 112) | i24, 0);
                    c28655q.m87173q(false);
                }
                str3 = str4;
                function5 = function11;
            }
            function11 = function9;
            str3 = str4;
            function5 = function11;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            str3 = str2;
            function5 = function3;
        }
        function6 = function4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) str3, (Object) function5, (Object) function6, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m78624o(InterfaceC22381a.c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m78625p(AbstractC22319a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m78626q(Function1 function1) {
        function1.invoke(AbstractC22319a.a.f87094a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m78627r(AbstractC23586c abstractC23586c, String str, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m78623n(abstractC23586c, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m78628s(Function1 onNavigationEvent, Object event) {
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC22319a.b((C9598e) event));
        } else if (event instanceof AbstractC21243b.b) {
            onNavigationEvent.invoke(new AbstractC22319a.b(((AbstractC21243b.b) event).getDestination()));
        }
    }
}
