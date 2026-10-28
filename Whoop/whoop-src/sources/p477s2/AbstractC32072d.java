package p477s2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import aws.sdk.kotlin.runtime.auth.credentials.ProviderConfigurationException;
import b30.AbstractC2495c4;
import b30.AbstractC2526g3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.stripe.android.model.BankAccount$Status;
import com.stripe.android.model.BankAccount$Type;
import com.whoop.android.R;
import d40.AbstractC11673r;
import ec3.C13045h2;
import g40.C15430u2;
import gf.C15760a;
import i20.C17962m0;
import ih0.AbstractC18489d0;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.InterfaceC26620j;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p008a7.C0510a;
import p008a7.C0512c;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2399k2;
import p031b9.AbstractC2875y;
import p048ce.C4469j;
import p048ce.C4470k;
import p088dc.AbstractC11894a;
import p088dc.AbstractC11895b;
import p163g1.AbstractC14983d3;
import p163g1.C15006f4;
import p164g2.C15247s;
import p208i2.C17919x;
import p250jf.AbstractC21636e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p315m0.AbstractC24868a;
import p335n6.InterfaceC26398o;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p470rv.AbstractC31834n;
import p474s.AbstractC32004s;
import p474s.C31983m2;
import p499t9.C33623c0;
import p499t9.C33647p;
import p501te.C33740e;
import p505ts.AbstractC34132o;
import p521ue.C34856b;
import p545v6.C35725n;
import p545v6.C35728q;
import p545v6.C35733v;
import p547v8.AbstractC35785b;
import p580wd.C37148a;
import p580wd.C37155h;
import p580wd.C37156i;
import p580wd.C37157j;
import p580wd.C37158k;
import p580wd.C37159l;
import p580wd.C37160m;
import p580wd.EnumC37161n;
import p598wy.InterfaceC37689b;
import p602x1.AbstractC37817c;
import p628xw.C38671a;
import p635y2.InterfaceC39127r0;
import p646yd.AbstractC39455f;
import p677zd.C40543a;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p733ry2.C31918g;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s93.AbstractC32306h;
import se.AbstractC32410a;
import sg2.C32464o;
import sh.C32490p;
import sh.C32493s;
import t10.C33291k;
import te0.AbstractC33745d;
import th.C33809g;
import u10.C34418f;
import vg.InterfaceC35967n;
import w20.AbstractC36712c;
import w20.C36711b0;
import w20.C36726p;
import w20.C36727q;
import w20.C36729s;
import w20.C36736z;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;
import x30.C37897i1;
import x30.C37900j1;
import y00.C38813e;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: s2.d */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32072d implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final void m99692a(boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        boolean z13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1690775401);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC4339a) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
            z13 = z4;
        } else {
            float f13 = 0;
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3397s(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), f13, 32, f13, 20), "CVC_CONFIRM");
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3599a);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_confirm);
            c28655q.m87150e0(78264052);
            boolean z14 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 19);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            z13 = z4;
            AbstractC2495c4.m7457d(strM92103Y, false, z13, null, null, null, (InterfaceC4339a) objM87133R, c28655q, ((i14 << 6) & 896) | 48, 56);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33291k(z13, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m99693b(String lastFour, boolean z4, C36736z c36736z, Function1 onValueChanged, Composer composer, int i13) {
        AbstractC22676k.m65750j(lastFour, "lastFour");
        AbstractC22676k.m65750j(onValueChanged, "onValueChanged");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(715675132);
        int i14 = i13 | (c28655q.m87153g(lastFour) ? 4 : 2);
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (((i14 | (c28655q.m87153g(c36736z) ? 256 : 128) | (c28655q.m87157i(onValueChanged) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED)) & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            long jM51541c = AbstractC11894a.m31939G(c28655q) ? C17919x.m51541c(0.075f, C17919x.f69629f) : C17919x.m51541c(0.075f, C17919x.f69625b);
            c28655q.m87150e0(331796465);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC33745d.m106649h(c28655q);
            }
            C15247s c15247s = (C15247s) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(331798052);
            if (!((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                c28655q.m87150e0(331800061);
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C17962m0(c15247s, null, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, C23454a0.f92919a);
            }
            c28655q.m87173q(false);
            AbstractC32410a.m101046p(null, null, false, 0L, null, AbstractC37817c.m121344e(-404027903, c28655q, new C36729s(jM51541c, onValueChanged, c15247s, c36736z, z4, lastFour)), c28655q, ProfileVerifier.CompilationStatus.f6515xf2722a21, 31);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36726p(lastFour, z4, c36736z, onValueChanged, i13, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m99694c(C36711b0 c36711b0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1132926818);
        if ((((c28655q.m87153g(c36711b0) ? 4 : 2) | i13) & 3) == 2 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(790453684, c28655q, new C34418f(2, c36711b0, C27648a.m83597t(c36711b0.f157193c, c28655q, 0))), c28655q, 12582912, 127);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36727q(c36711b0, i13);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m99695d(String lastFour, boolean z4, C36736z c36736z, Function1 viewActionHandler, Composer composer, int i13) {
        int i14;
        boolean z13;
        C36736z c36736z2;
        AbstractC22676k.m65750j(lastFour, "lastFour");
        AbstractC22676k.m65750j(viewActionHandler, "viewActionHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-694222012);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(lastFour) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            z13 = z4;
            i14 |= c28655q.m87155h(z13) ? 32 : 16;
        } else {
            z13 = z4;
        }
        if ((i13 & 384) == 0) {
            c36736z2 = c36736z;
            i14 |= c28655q.m87153g(c36736z2) ? 256 : 128;
        } else {
            c36736z2 = c36736z;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(viewActionHandler) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 1171) == 1170 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            AbstractC11673r.m31072a(null, null, null, null, null, null, null, AbstractC37817c.m121344e(-1597672614, c28655q, new C15006f4(z13, viewActionHandler, lastFour, c36736z2, 3)), c28655q, 12582912, 127);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36726p(lastFour, z4, c36736z, viewActionHandler, i13, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m99696e(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(802797669);
        if (i13 == 0 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            float f13 = 0;
            AbstractC32004s.m99532a(AbstractC30060g.m92103Y(c28655q, R.string.stripe_paymentsheet_confirm_your_cvc), AbstractC1136a.m3599a(AbstractC1099a.m3397s(C2314t.f9131w, f13, f13, f13, 16), "TEST_TAG_CONFIRM_CVC"), c28655q, 48, 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35728q(i13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m99697f(boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1018538037);
        int i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13 | (c28655q.m87157i(interfaceC4339a) ? 32 : 16);
        if ((i14 & 19) == 18 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            float f13 = 0;
            float f14 = 16;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3411h = AbstractC1102d.m3411h(32, AbstractC1099a.m3397s(c2314t, f13, f14, f13, f13));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            c28655q.m87150e0(-1173678682);
            if (z4) {
                AbstractC2526g3.m7465d(c28655q, 0);
            }
            c28655q.m87173q(false);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            c28655q.m87150e0(-1173674070);
            boolean z13 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z13 || objM87133R == C28635l.f115821a) {
                objM87133R = new C31918g(interfaceC4339a, 20);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC14983d3.m43104a((InterfaceC4339a) objM87133R, AbstractC1099a.m3391m(c2314t, f14, -8), false, AbstractC36712c.f157195a, c28655q, 24624, 12);
            c28655q.m87173q(true);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33291k(z4, interfaceC4339a, i13, 2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static C32490p m99698g(C26611e0 c26611e0, AbstractC26632p abstractC26632p, String str, C33809g c33809g, int i13) {
        if ((i13 & 4) != 0) {
            str = null;
        }
        if ((i13 & 8) != 0) {
            c33809g = null;
        }
        return new C32490p(c26611e0, abstractC26632p, str, c33809g);
    }

    /* JADX INFO: renamed from: h */
    public static C32493s m99699h(InterfaceC26620j interfaceC26620j, AbstractC26632p abstractC26632p) {
        return new C32493s(interfaceC26620j, abstractC26632p, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m99700i(boolean z4, C37897i1 element, Modifier modifier, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(element, "element");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1061070076);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(element) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            C15430u2 c15430u2 = element.f162265c;
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t((C13045h2) c15430u2.f58004f, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c15430u2.f58000b, c28655q, 0);
            boolean zBooleanValue = ((Boolean) interfaceC28601c1M83597t.getValue()).booleanValue();
            String strM113396S = AbstractC35785b.m113396S((InterfaceC41211c) interfaceC28601c1M83597t2.getValue(), c28655q);
            c28655q.m87150e0(-230117885);
            boolean zM87157i = c28655q.m87157i(c15430u2) | c28655q.m87153g(interfaceC28601c1M83597t);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C37900j1(0, c15430u2, interfaceC28601c1M83597t);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC37926s0.m121463a(modifier, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG", zBooleanValue, strM113396S, z4, (Function1) objM87133R, c28655q, ((i14 >> 6) & 14) | 48 | ((i14 << 12) & 57344), 0);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32464o(z4, element, modifier, i13, 8);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m99701j(int i13, int i14) {
        return i13 == i14;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC26398o m99702k(InterfaceC26398o interfaceC26398o) {
        return m99703l(interfaceC26398o).mo78107d(new C35725n(C0512c.f1721a));
    }

    /* JADX INFO: renamed from: l */
    public static final InterfaceC26398o m99703l(InterfaceC26398o interfaceC26398o) {
        return interfaceC26398o.mo78107d(new C35733v(C0512c.f1721a));
    }

    /* JADX INFO: renamed from: n */
    public static C15760a m99704n() {
        return C33740e.f141123e;
    }

    /* JADX INFO: renamed from: o */
    public static final InterfaceC26398o m99705o(InterfaceC26398o interfaceC26398o, float f13) {
        return interfaceC26398o.mo78107d(new C35725n(new C0510a(f13)));
    }

    /* JADX INFO: renamed from: p */
    public static LinkedList m99706p(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            if (list.get(i13) != null) {
                try {
                    linkedList.add(AbstractC32076h.m99778k(((C38671a) list.get(i13)).m124047a()));
                } catch (CertificateException e5) {
                    StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Invalid X.509 certificate at position ", ": ");
                    sbM30466t.append(e5.getMessage());
                    throw new ParseException(sbM30466t.toString(), 0);
                }
            }
        }
        return linkedList;
    }

    /* JADX INFO: renamed from: q */
    public static C38813e m99707q(JSONObject jSONObject) {
        Object next;
        Object obj;
        String strM99551t = AbstractC32004s.m99551t("id", jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("account_holder_name", jSONObject);
        C33647p c33647p = BankAccount$Type.f22214x;
        String strM99551t3 = AbstractC32004s.m99551t("account_holder_type", jSONObject);
        c33647p.getClass();
        Iterator it = BankAccount$Type.f22216z.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((BankAccount$Type) next).f22217w.equals(strM99551t3));
        BankAccount$Type bankAccount$Type = (BankAccount$Type) next;
        String strM99551t4 = AbstractC32004s.m99551t("bank_name", jSONObject);
        String strOptString = jSONObject.optString("country");
        if (strOptString == null || "null".equals(strOptString) || strOptString.length() == 0) {
            strOptString = null;
        }
        if (strOptString == null || strOptString.length() != 2) {
            strOptString = null;
            obj = null;
        } else {
            obj = null;
        }
        String strM99549r = AbstractC32004s.m99549r(jSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("fingerprint", jSONObject);
        String strM99551t6 = AbstractC32004s.m99551t("last4", jSONObject);
        String strM99551t7 = AbstractC32004s.m99551t("routing_number", jSONObject);
        C33623c0 c33623c0 = BankAccount$Status.f22210x;
        String strM99551t8 = AbstractC32004s.m99551t(NotificationCompat.CATEGORY_STATUS, jSONObject);
        c33623c0.getClass();
        for (Object obj2 : BankAccount$Status.f22212z) {
            if (((BankAccount$Status) obj2).f22213w.equals(strM99551t8)) {
                obj = obj2;
                break;
            }
        }
        return new C38813e(strM99551t, strM99551t2, bankAccount$Type, strM99551t4, strOptString, strM99549r, strM99551t5, strM99551t6, strM99551t7, (BankAccount$Status) obj);
    }

    /* JADX INFO: renamed from: r */
    public static C37159l m99708r(C4469j config) {
        String string;
        AbstractC32004s c37155h;
        String strM13963a;
        EnumC37161n enumC37161n;
        C37160m c37160m;
        AbstractC22676k.m65750j(config, "config");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        String str = config.m13961a().f17994a;
        while (true) {
            C4470k c4470k = (C4470k) config.m13962b().get(str);
            if (c4470k == null) {
                if (linkedHashSet.isEmpty()) {
                    string = AbstractC11266d.m30461o("could not find source profile ", str);
                } else {
                    StringBuilder sbM53375p = AbstractC18489d0.m53375p("could not find source profile ", str, " referenced from ");
                    sbM53375p.append((String) AbstractC25265s.m74111O0(linkedHashSet));
                    string = sbM53375p.toString();
                }
                throw new ProviderConfigurationException(string, null);
            }
            Map map = c4470k.f17995b;
            String str2 = c4470k.f17994a;
            if (!linkedHashSet.add(str)) {
                throw new ProviderConfigurationException(AbstractC2875y.m8304q(new StringBuilder("profile formed an infinite loop: "), AbstractC25265s.m74110N0(linkedHashSet, " -> ", null, null, null, 62), " -> ", str), null);
            }
            String strM13963a2 = c4470k.m13963a("aws_access_key_id", null);
            String strM13963a3 = c4470k.m13963a("aws_secret_access_key", null);
            String strM13963a4 = c4470k.m13963a("aws_account_id", null);
            if (strM13963a2 == null && strM13963a3 == null) {
                c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str2, ") missing `aws_access_key_id` & `aws_secret_access_key`"));
            } else if (strM13963a2 == null) {
                c37155h = new C37155h(AbstractC11895b.m31996o("profile (", str2, ") missing `aws_access_key_id`"));
            } else {
                c37155h = strM13963a3 == null ? new C37155h(AbstractC11895b.m31996o("profile (", str2, ") missing `aws_secret_access_key`")) : new C37156i(new C37148a(AbstractC32306h.m100560h(strM13963a2, strM13963a3, c4470k.m13963a("aws_session_token", null), null, strM13963a4, 24)));
            }
            AbstractC31834n abstractC31834nM99772e = c37155h instanceof C37156i ? ((C37156i) c37155h).f158912a : null;
            if (abstractC31834nM99772e == null) {
                if ((map.containsKey("credential_source") || map.containsKey("source_profile") || !map.containsKey("web_identity_token_file")) && (strM13963a = c4470k.m13963a("role_arn", null)) != null) {
                    if (!map.containsKey("source_profile") || map.containsKey("credential_source")) {
                        enumC37161n = (!map.containsKey("credential_source") || map.containsKey("source_profile")) ? null : EnumC37161n.f158922x;
                    } else {
                        enumC37161n = EnumC37161n.f158921w;
                    }
                    c37160m = new C37160m(strM13963a, enumC37161n, c4470k.m13963a("role_session_name", null), c4470k.m13963a("external_id", null));
                } else {
                    c37160m = null;
                }
                if (c37160m != null) {
                    arrayList.add(c37160m);
                    String strM13963a5 = c4470k.m13963a("source_profile", null);
                    String strM13963a6 = c4470k.m13963a("credential_source", null);
                    if (strM13963a5 != null && strM13963a6 != null) {
                        throw new ProviderConfigurationException(AbstractC11895b.m31996o("profile (", str2, ") contained both `source_profile` and `credential_source`. Only one or the other can be defined."), null);
                    }
                    if (strM13963a5 == null && strM13963a6 == null) {
                        throw new ProviderConfigurationException(AbstractC11895b.m31996o("profile (", str2, ") must contain `source_profile` or `credential_source` but neither were defined"), null);
                    }
                    AbstractC32069a c37157j = (strM13963a5 == null || strM13963a6 != null || strM13963a5.equals(str2)) ? C37158k.f158914a : new C37157j(strM13963a5);
                    if (c37157j instanceof C37158k) {
                        abstractC31834nM99772e = AbstractC32076h.m99772e(c4470k, config);
                    } else {
                        if (!(c37157j instanceof C37157j)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((C37157j) c37157j).f158913a;
                    }
                } else {
                    abstractC31834nM99772e = AbstractC32076h.m99772e(c4470k, config);
                }
            }
            Collections.reverse(arrayList);
            return new C37159l(abstractC31834nM99772e, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[LOOP:0: B:22:0x0071->B:24:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[LOOP:2: B:32:0x00b6->B:34:0x00bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public static final Object m99709s(InterfaceC35967n interfaceC35967n, C31983m2 c31983m2, AbstractC32269c abstractC32269c) throws Throwable {
        C40543a c40543a;
        String strM13963a;
        ArrayList arrayList;
        Iterator it;
        ArrayList<String> arrayList2;
        ArrayList arrayList3;
        if (abstractC32269c instanceof C40543a) {
            c40543a = (C40543a) abstractC32269c;
            int i13 = c40543a.f174446x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40543a.f174446x = i13 - Integer.MIN_VALUE;
            } else {
                c40543a = new C40543a(abstractC32269c);
            }
        } else {
            c40543a = new C40543a(abstractC32269c);
        }
        Object objM99483g = c40543a.f174445w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c40543a.f174446x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM99483g);
            strM13963a = (String) AbstractC21636e.m60881b(AbstractC39455f.f169764z, interfaceC35967n);
            if (strM13963a == null) {
                c40543a.f174446x = 1;
                objM99483g = c31983m2.m99483g(c40543a);
                if (objM99483g == obj) {
                    return obj;
                }
            }
            if (strM13963a != null) {
                return C25271y.f99162w;
            }
            List listM125906y0 = AbstractC39414r.m125906y0(strM13963a, new String[]{","}, 6);
            arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y0, 10));
            it = listM125906y0.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC39414r.m125869O0((String) it.next()).toString());
            }
            arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((String) obj2).length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            for (String id4 : arrayList2) {
                AbstractC22676k.m65750j(id4, "id");
                arrayList3.add(new C34856b(id4));
            }
            return AbstractC25265s.m74093D1(arrayList3);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM99483g);
        C4470k c4470k = (C4470k) objM99483g;
        AbstractC22676k.m65750j(c4470k, "<this>");
        strM13963a = c4470k.m13963a("auth_scheme_preference", null);
        if (strM13963a != null) {
            return C25271y.f99162w;
        }
        List listM125906y1 = AbstractC39414r.m125906y0(strM13963a, new String[]{","}, 6);
        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM125906y1, 10));
        it = listM125906y1.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC39414r.m125869O0((String) it.next()).toString());
        }
        arrayList2 = new ArrayList();
        while (r5.hasNext()) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
        while (r4.hasNext()) {
            AbstractC22676k.m65750j(id4, "id");
            arrayList3.add(new C34856b(id4));
        }
        return AbstractC25265s.m74093D1(arrayList3);
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC26398o m99710t(float f13) {
        return m99705o(new C35733v(new C0510a(f13)), f13);
    }

    /* JADX INFO: renamed from: u */
    public static LinkedList m99711u(List list) {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            Object obj = list.get(i13);
            if (obj == null) {
                throw new ParseException(AbstractC2875y.m8296i(i13, "The X.509 certificate at position ", " must not be null"), 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException(AbstractC2875y.m8296i(i13, "The X.509 certificate at position ", " must be encoded as a Base64 string"), 0);
            }
            linkedList.add(new C38671a((String) obj));
        }
        return linkedList;
    }
}
