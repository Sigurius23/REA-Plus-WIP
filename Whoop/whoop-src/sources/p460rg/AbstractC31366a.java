package p460rg;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import cd0.C4435a;
import com.whoop.android.R;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import d40.AbstractC11673r;
import d40.C11669n;
import d40.C11671p;
import g40.C15373j1;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import j93.InterfaceC21467g;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import jp1.C21859k;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25235a0;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26622k;
import ne3.C26624l;
import no.nordicsemi.android.dfu.DfuBaseService;
import o71.C27632b;
import o73.C27648a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p097ds.AbstractC12313p;
import p132f0.C13825t;
import p161g.AbstractC14911n;
import p161g.C14899c0;
import p161g.C14901d0;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15005f3;
import p163g1.AbstractC15011f9;
import p163g1.C14970c1;
import p163g1.C15069l3;
import p208i2.AbstractC17918w0;
import p208i2.C17903p;
import p208i2.C17916v0;
import p208i2.C17919x;
import p208i2.C17924z0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22976l1;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p314m.AbstractActivityC24852m;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p40.C28826a;
import p463rj.AbstractC31479j;
import p474s.AbstractC32004s;
import p478s3.C32096b;
import p490t0.AbstractC33244a;
import p529uo.AbstractC35135w;
import p530up.AbstractC35148d;
import p547v8.AbstractC35785b;
import p555vl.AbstractC36095b;
import p557vo.InterfaceC36222d;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p579wc.AbstractC37106n;
import p579wc.C37090h0;
import p579wc.C37108o;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import r80.AbstractC31061c;
import s01.C32049e;
import sc3.AbstractC32398l;
import sg2.C32464o;
import t23.C33481y1;
import tx0.C34238a;
import ud3.C34807d0;
import ud3.C34810e0;
import uf0.C34904e;
import v20.C35567g;
import v20.C35578r;
import v20.C35579s;
import v20.EnumC35561a;
import va3.AbstractC35846d;
import vg.C35971r;
import vg.InterfaceC35967n;
import wb3.AbstractC37056f;
import wr0.C37550r;
import x30.C37877c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: rg.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC31366a {
    /* JADX INFO: renamed from: a */
    public static final void m96461a(boolean z4, C37877c element, Modifier modifier, Composer composer, int i13) {
        int i14;
        Modifier modifier2;
        AbstractC22676k.m65750j(element, "element");
        String str = element.f162193b;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1217517664);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(element) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            modifier2 = modifier;
            i14 |= c28655q.m87153g(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            Resources resources = context.getResources();
            AbstractC22676k.m65749i(resources, "getResources(...)");
            String string = resources.getString(R.string.stripe_afterpay_clearpay_marketing);
            AbstractC22676k.m65749i(string, "getString(...)");
            String strM125926K = AbstractC39421y.m125926K(AbstractC39421y.m125926K(string, "<img/>", "<img/> <b>ⓘ</b>", false), "<img/>", "<img src=\"afterpay\"/>", false);
            Map mapM73989X = AbstractC25247g0.m73989X(new C23465k("afterpay", new C28826a("GBP".equalsIgnoreCase(str) ? R.drawable.stripe_ic_clearpay_logo : R.drawable.stripe_ic_afterpay_logo, "GBP".equalsIgnoreCase(str) ? R.string.stripe_paymentsheet_payment_method_clearpay : R.string.stripe_paymentsheet_payment_method_afterpay, AbstractC11673r.m31087p(C15069l3.m43147a(c28655q).m43093h()) ? null : new C17903p(C17919x.f69629f, 5))));
            long j7 = AbstractC11673r.m31082k(c28655q).f37672e;
            C23285v0 c23285v0 = C15069l3.m43149c(c28655q).f56279f;
            C23267m0 c23267m0 = new C23267m0(0L, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65535);
            c28655q.m87150e0(1671755009);
            boolean zM87157i = c28655q.m87157i(element) | c28655q.m87157i(context);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37550r(5, element, context);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC35148d.m111173d(strM125926K, modifier2, mapM73989X, j7, c23285v0, z4, c23267m0, 3, (InterfaceC4339a) objM87133R, c28655q, ((i14 >> 3) & 112) | 1572864 | ((i14 << 15) & 458752), 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(z4, element, modifier, i13, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m96462b(C35578r c35578r, Composer composer, int i13) {
        C35578r c35578r2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2134028887);
        if ((((c28655q.m87157i(c35578r) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
            c35578r2 = c35578r;
        } else {
            c28655q.m87140Z();
            if ((i13 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
            }
            c28655q.m87175r();
            C35579s c35579s = (C35579s) C27648a.m83597t(c35578r.f151317y, c28655q, 0).getValue();
            c28655q.m87150e0(-1046941732);
            boolean zM87157i = c28655q.m87157i(c35578r);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                c35578r2 = c35578r;
                C35567g c35567g = new C35567g(1, c35578r2, C35578r.class, "handleViewAction", "handleViewAction(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationViewAction;)V", 0, 0);
                c28655q.m87172p0(c35567g);
                objM87133R = c35567g;
            } else {
                c35578r2 = c35578r;
            }
            c28655q.m87173q(false);
            m96463c(c35579s, (Function1) ((InterfaceC21467g) objM87133R), null, c28655q, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34238a(c35578r2, i13, 17);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m96463c(C35579s state, Function1 viewActionHandler, Modifier modifier, Composer composer, int i13) {
        Modifier modifier2;
        C0209i c0209i;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1180186540);
        int i14 = (c28655q.m87157i(state) ? 4 : 2) | i13 | (c28655q.m87157i(viewActionHandler) ? 32 : 16) | 384;
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
            modifier2 = modifier;
        } else {
            C11669n c11669n = C11671p.f37680a;
            C22976l1 c22976l1M31081j = AbstractC11673r.m31081j();
            C28674u2 c28674u2 = AbstractC14981d1.f55997a;
            long jM43093h = ((C14970c1) c28655q.m87161k(c28674u2)).m43093h();
            C17916v0 c17916v0 = AbstractC17918w0.f69621a;
            modifier2 = C2314t.f9131w;
            Modifier modifierM3393o = AbstractC1099a.m3393o(c22976l1M31081j, AbstractC1092a.m3358c(modifier2, jM43093h, c17916v0));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(16), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC32004s.m99532a(AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_bacs_mandate_title), AbstractC1099a.m3398t(modifier2, 0.0f, 0.0f, 0.0f, 2, 7), c28655q, 48, 0);
            m96464d(state.f151318a, state.f151319b, state.f151320c, state.f151321d, c28655q, 0);
            m96466f(AbstractC30060g.m92102X(R.string.stripe_paymentsheet_bacs_email_mandate, new Object[]{state.f151318a}, c28655q), null, false, c28655q, 0, 6);
            m96466f(AbstractC30060g.m92102X(R.string.stripe_paymentsheet_bacs_notice_mandate, new Object[]{AbstractC35785b.m113396S(state.f151322e, c28655q)}, c28655q), null, false, c28655q, 0, 6);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            String strM92102X = AbstractC30060g.m92102X(R.string.stripe_paymentsheet_bacs_protection_mandate, new Object[]{AbstractC35785b.m113396S(state.f151324g, c28655q)}, c28655q);
            C0209i c0209i6 = c0209i;
            if (0.6f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            m96466f(strM92102X, new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), true, c28655q, 384, 0);
            if (0.4f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9103F, false);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_bacs_direct_debit_mark, c28655q, 0), null, null, C17919x.m51541c(0.5f, AbstractC11673r.m31087p(((C14970c1) c28655q.m87161k(c28674u2)).m43093h()) ? C17919x.f69625b : C17919x.f69629f), c28655q, 48, 4);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            m96466f(AbstractC35785b.m113396S(state.f151323f, c28655q), null, true, c28655q, 384, 2);
            m96467g(viewActionHandler, c28655q, (i14 >> 3) & 14);
            AbstractC12313p.m34283e(0.0f, 0, c28655q, 1);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21859k(state, viewActionHandler, modifier2, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m96464d(String email, String nameOnAccount, String sortCode, String accountNumber, Composer composer, int i13) {
        AbstractC22676k.m65750j(email, "email");
        AbstractC22676k.m65750j(nameOnAccount, "nameOnAccount");
        AbstractC22676k.m65750j(sortCode, "sortCode");
        AbstractC22676k.m65750j(accountNumber, "accountNumber");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1563055350);
        int i14 = i13 | (c28655q.m87153g(email) ? 4 : 2) | (c28655q.m87153g(nameOnAccount) ? 32 : 16) | (c28655q.m87153g(sortCode) ? 256 : 128) | (c28655q.m87153g(accountNumber) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC33244a abstractC33244a = C15069l3.m43148b(c28655q).f56427a;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, abstractC33244a);
            C13825t c13825tM48880a = AbstractC17269i.m48880a(1, AbstractC11673r.m31082k(c28655q).f37669b);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3394p(12, AbstractC1092a.m3358c(AbstractC15751g.m44456i(c13825tM48880a.f49345a, modifierM118994r, c13825tM48880a.f49346b, C15069l3.m43148b(c28655q).f56427a), AbstractC11673r.m31082k(c28655q).f37668a, AbstractC17918w0.f69621a)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(10), C2299e.f9110M, c28655q, 6);
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
            m96465e(AbstractC30060g.m92103Y(c28655q, R.string.stripe_email), email, null, c28655q, (i14 << 3) & 112);
            m96465e(AbstractC30060g.m92103Y(c28655q, R.string.stripe_au_becs_account_name), nameOnAccount, null, c28655q, i14 & 112);
            m96465e(AbstractC30060g.m92103Y(c28655q, R.string.stripe_bacs_sort_code), sortCode, null, c28655q, (i14 >> 3) & 112);
            m96465e(AbstractC30060g.m92103Y(c28655q, R.string.stripe_bacs_account_number), accountNumber, null, c28655q, (i14 >> 6) & 112);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27632b(email, nameOnAccount, sortCode, accountNumber, i13, 8);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m96465e(String label, String value, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        Modifier modifier2;
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(value, "value");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1498693175);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(label) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(value) ? 32 : 16;
        }
        int i15 = i14 | 384;
        if ((i15 & 147) == 146 && c28655q2.m87121F()) {
            c28655q2.m87138X();
            modifier2 = modifier;
            c28655q = c28655q2;
        } else {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (0.4f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC15011f9.m43114b(label, new LayoutWeightElement(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true), AbstractC11673r.m31082k(c28655q2).f37671d, 0L, null, new C28780r(AbstractC11673r.m31084m(c28655q2).f37720b), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q2, i15 & 14, 0, 131032);
            if (0.6f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC15011f9.m43114b(value, new LayoutWeightElement(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true), AbstractC11673r.m31082k(c28655q2).f37671d, 0L, null, new C28780r(AbstractC11673r.m31084m(c28655q2).f37719a), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q2, (i15 >> 3) & 14, 0, 131032);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier2 = c2314t;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e((Object) label, (Object) value, modifier2, i13, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0141  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final void m96466f(String text, Modifier modifier, boolean z4, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z13;
        Modifier modifier3;
        boolean z14;
        Modifier modifier4;
        boolean z15;
        Modifier modifier5;
        boolean z16;
        C28677v1 c28677v1M87180u;
        AbstractC22676k.m65750j(text, "text");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1677633983);
        int i16 = (c28655q.m87153g(text) ? 4 : 2) | i13;
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 = i16 | 48;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i15 = i16 | (c28655q.m87153g(modifier2) ? 32 : 16);
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) == 146 || !c28655q.m87121F()) {
                if (i17 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    z14 = false;
                } else {
                    z14 = z13;
                }
                if (z14) {
                    c28655q.m87150e0(1606754157);
                    int i19 = i15 & 126;
                    modifier4 = modifier3;
                    AbstractC35148d.m111173d(text, modifier4, null, AbstractC11673r.m31082k(c28655q).f37672e, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), 0, null, c28655q, i19, 420);
                    c28655q.m87173q(false);
                    z15 = z14;
                } else {
                    if (z14) {
                        throw AbstractC11895b.m32003v(1991492681, c28655q, false);
                    }
                    c28655q.m87150e0(1607092119);
                    int i24 = i15 & 126;
                    modifier4 = modifier3;
                    z15 = z14;
                    AbstractC15011f9.m43114b(text, modifier4, AbstractC11673r.m31082k(c28655q).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), c28655q, i24, 0, 65528);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                modifier5 = modifier4;
                z16 = z15;
            } else {
                c28655q.m87138X();
                modifier5 = modifier2;
                z16 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C15373j1(text, modifier5, z16, i13, i14, 2);
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) == 146) {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (z14) {
                c28655q.m87150e0(1606754157);
                int i110 = i15 & 126;
                modifier4 = modifier3;
                AbstractC35148d.m111173d(text, modifier4, null, AbstractC11673r.m31082k(c28655q).f37672e, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), 0, null, c28655q, i110, 420);
                c28655q.m87173q(false);
                z15 = z14;
            } else {
                if (z14) {
                    throw AbstractC11895b.m32003v(1991492681, c28655q, false);
                }
                c28655q.m87150e0(1607092119);
                int i25 = i15 & 126;
                modifier4 = modifier3;
                z15 = z14;
                AbstractC15011f9.m43114b(text, modifier4, AbstractC11673r.m31082k(c28655q).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), c28655q, i25, 0, 65528);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            modifier5 = modifier4;
            z16 = z15;
        } else {
            if (i17 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                z14 = false;
            } else {
                z14 = z13;
            }
            if (z14) {
                c28655q.m87150e0(1606754157);
                int i111 = i15 & 126;
                modifier4 = modifier3;
                AbstractC35148d.m111173d(text, modifier4, null, AbstractC11673r.m31082k(c28655q).f37672e, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), false, new C23267m0(C15069l3.m43147a(c28655q).m43091f(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, (C36776l) null, (C17924z0) null, 65534), 0, null, c28655q, i111, 420);
                c28655q.m87173q(false);
                z15 = z14;
            } else {
                if (z14) {
                    throw AbstractC11895b.m32003v(1991492681, c28655q, false);
                }
                c28655q.m87150e0(1607092119);
                int i26 = i15 & 126;
                modifier4 = modifier3;
                z15 = z14;
                AbstractC15011f9.m43114b(text, modifier4, AbstractC11673r.m31082k(c28655q).f37672e, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(C15069l3.m43149c(c28655q).f56285l, 0L, 0L, C28780r.f116539F, null, 0L, 0, 0L, null, null, 16777211), c28655q, i26, 0, 65528);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            modifier5 = modifier4;
            z16 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15373j1(text, modifier5, z16, i13, i14, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m96467g(Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1347696627);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(function1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(8), C2299e.f9110M, c28655q, 6);
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
            EnumC35561a enumC35561a = EnumC35561a.f151286w;
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_confirm);
            c28655q.m87150e0(899774497);
            int i15 = i14 & 14;
            boolean z4 = i15 == 4;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C34904e(function1, 8);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC32398l.m100969b(enumC35561a, strM92103Y, (InterfaceC4339a) objM87133R, c28655q, 6);
            EnumC35561a enumC35561a2 = EnumC35561a.f151287x;
            String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_bacs_modify_details_button_label);
            c28655q.m87150e0(899784711);
            boolean z13 = i15 == 4;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C34904e(function1, 9);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC32398l.m100969b(enumC35561a2, strM92103Y2, (InterfaceC4339a) objM87133R2, c28655q, 6);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(function1, i13, 18);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m96468h(char c3, int i13, int i14, String str) {
        if (i14 >= str.length()) {
            throw new DateTimeParseException(AbstractC31061c.m95640p("Unexpected end of input, missing field ", AbstractC36095b.m114697y(i13), ": ", str), str, i14);
        }
        if (str.charAt(i14) != c3) {
            throw new DateTimeParseException(String.format("Expected character %s at position %d, found %s: %s", Character.valueOf(c3), Integer.valueOf(i14 + 1), Character.valueOf(str.charAt(i14)), str), str, i14);
        }
    }

    /* JADX INFO: renamed from: i */
    public static float m96469i(float f13, float f14, float f15, float f16, float f17) {
        return m96475o(f13, f14, Math.max(0.0f, Math.min(1.0f, f15 == f16 ? 0.0f : (f17 - f15) / (f16 - f15))));
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC36222d m96470j(byte[] bArr, Parcelable.Creator creator) {
        AbstractC35135w.m111094f(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC36222d interfaceC36222d = (InterfaceC36222d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC36222d;
    }

    /* JADX INFO: renamed from: k */
    public static Object m96471k(String str, InterfaceC35967n interfaceC35967n, long j7, long j13, C37090h0 c37090h0) {
        ArrayList arrayList = new ArrayList();
        if (AbstractC37106n.f158735a[((C35971r) interfaceC35967n).m114208c().f153133a.ordinal()] == 1) {
            arrayList.add("cmd.exe");
            arrayList.add("/C");
        } else {
            arrayList.add("sh");
            arrayList.add("-c");
        }
        arrayList.add(str);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return AbstractC3006f0.m8705K(ExecutorC22364d.f87316w, new C37108o(arrayList, j13, j7, null), c37090h0);
    }

    /* JADX INFO: renamed from: l */
    public static C33481y1 m96472l(Map map) {
        Object obj = map.get("qualityLimitationReason");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("jitter");
        Double d3 = obj2 instanceof Double ? (Double) obj2 : null;
        Object obj3 = map.get("frameWidth");
        Long l7 = obj3 instanceof Long ? (Long) obj3 : null;
        if (l7 == null || l7.longValue() <= 0) {
            l7 = null;
        }
        Object obj4 = map.get("frameHeight");
        Long l12 = obj4 instanceof Long ? (Long) obj4 : null;
        Long l13 = (l12 == null || l12.longValue() <= 0) ? null : l12;
        Object obj5 = map.get("framesPerSecond");
        Double d14 = obj5 instanceof Double ? (Double) obj5 : null;
        Object obj6 = map.get("totalPacketSendDelay");
        return new C33481y1(str, d3, l7, l13, d14, obj6 instanceof Double ? (Double) obj6 : null);
    }

    /* JADX INFO: renamed from: m */
    public static final InterfaceC31373h m96473m(InterfaceC30063j interfaceC30063j) {
        AbstractC22676k.m65750j(interfaceC30063j, "<this>");
        C31374i c31374i = (C31374i) interfaceC30063j.get(C31374i.f129037x);
        if (c31374i != null) {
            return c31374i.f129038w;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static String m96474n(C34810e0 url) {
        AbstractC22676k.m65750j(url, "url");
        C26622k c26622k = C26624l.f105882z;
        return C26622k.m79241b(url.f146570i).mo79252c("MD5").mo79254e();
    }

    /* JADX INFO: renamed from: o */
    public static float m96475o(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: p */
    public static String m96476p(int i13) {
        if (i13 == 26) {
            return "HCI ERROR UNSUPPORTED REMOTE FEATURE";
        }
        if (i13 == 30) {
            return "HCI ERROR INVALID LMP PARAM";
        }
        if (i13 == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i13 == 42) {
            return "HCI ERROR DIFF TRANSACTION COLLISION";
        }
        if (i13 == 257) {
            return "TOO MANY OPEN CONNECTIONS";
        }
        if (i13 == 58) {
            return "GATT CONTROLLER BUSY";
        }
        if (i13 == 59) {
            return "GATT UNACCEPT CONN INTERVAL";
        }
        switch (i13) {
            case 1:
                return "GATT INVALID HANDLE";
            case 2:
                return "GATT READ NOT PERMIT";
            case 3:
                return "GATT WRITE NOT PERMIT";
            case 4:
                return "GATT INVALID PDU";
            case 5:
                return "GATT INSUF AUTHENTICATION";
            case 6:
                return "GATT REQ NOT SUPPORTED";
            case 7:
                return "GATT INVALID OFFSET";
            case 8:
                return "GATT INSUF AUTHORIZATION";
            case 9:
                return "GATT PREPARE Q FULL";
            case 10:
                return "GATT NOT FOUND";
            case 11:
                return "GATT NOT LONG";
            case 12:
                return "GATT INSUF KEY SIZE";
            case 13:
                return "GATT INVALID ATTR LEN";
            case 14:
                return "GATT ERR UNLIKELY";
            case 15:
                return "GATT INSUF ENCRYPTION";
            case 16:
                return "GATT UNSUPPORT GRP TYPE";
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return "GATT INSUF RESOURCE";
            default:
                switch (i13) {
                    case 128:
                        return "GATT NO RESOURCES";
                    case 129:
                        return "GATT INTERNAL ERROR";
                    case 130:
                        return "GATT WRONG STATE";
                    case 131:
                        return "GATT DB FULL";
                    case 132:
                        return "GATT BUSY";
                    case 133:
                        return "GATT ERROR";
                    case 134:
                        return "GATT CMD STARTED";
                    case 135:
                        return "GATT ILLEGAL PARAMETER";
                    case 136:
                        return "GATT PENDING";
                    case 137:
                        return "GATT AUTH FAIL";
                    case 138:
                        return "GATT MORE";
                    case 139:
                        return "GATT INVALID CFG";
                    case 140:
                        return "GATT SERVICE STARTED";
                    case 141:
                        return "GATT ENCRYPTED NO MITM";
                    case 142:
                        return "GATT NOT ENCRYPTED";
                    case 143:
                        return "GATT CONGESTED";
                    default:
                        switch (i13) {
                            case 253:
                                return "GATT CCCD CFG ERROR";
                            case 254:
                                return "GATT PROCEDURE IN PROGRESS";
                            case 255:
                                return "GATT VALUE OUT OF RANGE";
                            default:
                                switch (i13) {
                                    case 4096:
                                        return "DFU DEVICE DISCONNECTED";
                                    case DfuBaseService.ERROR_FILE_NOT_FOUND /* 4097 */:
                                        return "DFU FILE NOT FOUND";
                                    case DfuBaseService.ERROR_FILE_ERROR /* 4098 */:
                                        return "DFU FILE ERROR";
                                    case DfuBaseService.ERROR_FILE_INVALID /* 4099 */:
                                        return "DFU NOT A VALID HEX FILE";
                                    case DfuBaseService.ERROR_FILE_IO_EXCEPTION /* 4100 */:
                                        return "DFU IO EXCEPTION";
                                    case DfuBaseService.ERROR_SERVICE_DISCOVERY_NOT_STARTED /* 4101 */:
                                        return "DFU SERVICE DISCOVERY NOT STARTED";
                                    case DfuBaseService.ERROR_SERVICE_NOT_FOUND /* 4102 */:
                                        return "DFU CHARACTERISTICS NOT FOUND";
                                    default:
                                        switch (i13) {
                                            case DfuBaseService.ERROR_INVALID_RESPONSE /* 4104 */:
                                                return "DFU INVALID RESPONSE";
                                            case DfuBaseService.ERROR_FILE_TYPE_UNSUPPORTED /* 4105 */:
                                                return "DFU FILE TYPE NOT SUPPORTED";
                                            case DfuBaseService.ERROR_BLUETOOTH_DISABLED /* 4106 */:
                                                return "BLUETOOTH ADAPTER DISABLED";
                                            case DfuBaseService.ERROR_INIT_PACKET_REQUIRED /* 4107 */:
                                            case DfuBaseService.ERROR_FILE_SIZE_INVALID /* 4108 */:
                                                return "DFU INIT PACKET REQUIRED";
                                            case DfuBaseService.ERROR_CRC_ERROR /* 4109 */:
                                                return "DFU CRC ERROR";
                                            case DfuBaseService.ERROR_DEVICE_NOT_BONDED /* 4110 */:
                                                return "DFU DEVICE NOT BONDED";
                                            default:
                                                return AbstractC2875y.m8296i(i13, "UNKNOWN (", ")");
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m96477q(int i13) {
        if (i13 == 0) {
            return "SUCCESS";
        }
        if (i13 == 1) {
            return "GATT CONN L2C FAILURE";
        }
        if (i13 == 8) {
            return "GATT CONN TIMEOUT";
        }
        if (i13 == 19) {
            return "GATT CONN TERMINATE PEER USER";
        }
        if (i13 == 22) {
            return "GATT CONN TERMINATE LOCAL HOST";
        }
        if (i13 == 34) {
            return "GATT CONN LMP TIMEOUT";
        }
        if (i13 == 62) {
            return "GATT CONN FAIL ESTABLISH";
        }
        if (i13 != 133) {
            return i13 != 256 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : "GATT CONN CANCEL ";
        }
        return "GATT ERROR";
    }

    /* JADX INFO: renamed from: r */
    public static String m96478r(int i13) {
        int i14 = i13 & 3840;
        if (i14 == 256) {
            return AbstractC31375j.m96494j(i13);
        }
        if (i14 == 512) {
            return AbstractC31479j.m96943v(i13);
        }
        if (i14 != 1024) {
            return i14 != 2048 ? AbstractC2875y.m8296i(i13, "UNKNOWN (", ")") : AbstractC31479j.m96944w(i13);
        }
        return AbstractC31479j.m96945x(i13);
    }

    /* JADX INFO: renamed from: s */
    public static void m96479s(String str, int i13, char... cArr) {
        throw new DateTimeParseException(String.format("Expected character %s at position %d, found %s: %s", Arrays.toString(cArr), Integer.valueOf(i13 + 1), Character.valueOf(str.charAt(i13)), str), str, i13);
    }

    /* JADX INFO: renamed from: t */
    public static int m96480t(C26621j0 c26621j0) throws IOException {
        try {
            C26616h c26616h = c26621j0.f105872x;
            c26621j0.mo79207g0(1L);
            long j7 = 0;
            while (true) {
                long j13 = j7 + 1;
                if (!c26621j0.request(j13)) {
                    break;
                }
                byte bM79229s = c26616h.m79229s(j7);
                if ((bM79229s >= 48 && bM79229s <= 57) || (j7 == 0 && bM79229s == 45)) {
                    j7 = j13;
                }
                if (j7 != 0) {
                    break;
                }
                AbstractC35846d.m113779c(16);
                String string = Integer.toString(bM79229s, 16);
                AbstractC22676k.m65749i(string, "toString(...)");
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
            }
            long jM79223o0 = c26616h.m79223o0();
            String strMo79187M = c26621j0.mo79187M(Long.MAX_VALUE);
            if (jM79223o0 >= 0 && jM79223o0 <= 2147483647L && strMo79187M.length() <= 0) {
                return (int) jM79223o0;
            }
            throw new IOException("expected an int but was \"" + jM79223o0 + strMo79187M + '\"');
        } catch (NumberFormatException e5) {
            throw new IOException(e5.getMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    public static Set m96481u(C34807d0 c34807d0) {
        int size = c34807d0.size();
        TreeSet treeSet = null;
        for (int i13 = 0; i13 < size; i13++) {
            if ("Vary".equalsIgnoreCase(c34807d0.m109864c(i13))) {
                String strM109867g = c34807d0.m109867g(i13);
                if (treeSet == null) {
                    AbstractC39421y.m125922G();
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = AbstractC39414r.m125905x0(strM109867g, new char[]{DateTimeRange.lowerUpperDelimiter}, 0, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC39414r.m125869O0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? C25235a0.f99113w : treeSet;
    }

    /* JADX INFO: renamed from: v */
    public static void m96482v(AbstractActivityC24852m abstractActivityC24852m) {
        int i13 = AbstractC14911n.f55592a;
        C14899c0 c14899c0 = C14899c0.f55570x;
        AbstractC14911n.m43003a(abstractActivityC24852m, new C14901d0(0, 0, 0, c14899c0), new C14901d0(AbstractC14911n.f55592a, AbstractC14911n.f55593b, 0, c14899c0));
        AbstractC29125c.m88513V(abstractActivityC24852m.getWindow(), true);
    }
}
