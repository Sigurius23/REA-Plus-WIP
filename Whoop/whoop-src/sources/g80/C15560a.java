package g80;

import androidx.core.app.NotificationCompat;
import d70.C11752f;
import d70.C11753g;
import f70.InterfaceC14173d;
import j80.InterfaceC21413a;
import j80.InterfaceC21415c;
import j80.InterfaceC21416d;
import m70.InterfaceC25187a;
import o70.AbstractC27630d;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: g80.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lg80/a;", "", "<init>", "()V", "Lj80/a;", NotificationCompat.CATEGORY_EVENT, "Lf70/d;", "a", "(Lj80/a;)Lf70/d;", "Lj80/c;", "Lm70/a;", "b", "(Lj80/c;)Lm70/a;", "Lj80/d;", "Lo70/d;", "c", "(Lj80/d;)Lo70/d;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15560a {
    /* JADX INFO: renamed from: a */
    public final InterfaceC14173d m43811a(InterfaceC21413a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC21413a.p) {
            return InterfaceC14173d.o.f51127a;
        }
        if (event instanceof InterfaceC21413a.q) {
            return InterfaceC14173d.p.f51128a;
        }
        if (event instanceof InterfaceC21413a.i) {
            return InterfaceC14173d.h.f51120a;
        }
        if (event instanceof InterfaceC21413a.r) {
            return InterfaceC14173d.q.f51129a;
        }
        if (event instanceof InterfaceC21413a.h) {
            return InterfaceC14173d.g.f51119a;
        }
        if (event instanceof InterfaceC21413a.u) {
            return InterfaceC14173d.t.f51132a;
        }
        if (event instanceof InterfaceC21413a.i0) {
            return InterfaceC14173d.a0.f51109a;
        }
        if (event instanceof InterfaceC21413a.c0) {
            InterfaceC21413a.c0 c0Var = (InterfaceC21413a.c0) event;
            return new InterfaceC14173d.z(c0Var.getIsSkipAction(), c0Var.getCurrentDestination(), c0Var.getSignUpSource());
        }
        if (event instanceof InterfaceC21413a.j0) {
            return InterfaceC14173d.b0.f51111a;
        }
        if (event instanceof InterfaceC21413a.m0) {
            return new InterfaceC14173d.c0(((InterfaceC21413a.m0) event).getCurrentDestination());
        }
        if (event instanceof InterfaceC21413a.y) {
            InterfaceC21413a.y yVar = (InterfaceC21413a.y) event;
            return new InterfaceC14173d.x(yVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String(), yVar.getFromPostPairing());
        }
        if (event instanceof InterfaceC21413a.g) {
            return new InterfaceC14173d.f(((InterfaceC21413a.g) event).getType());
        }
        if (event instanceof InterfaceC21413a.f) {
            return InterfaceC14173d.y.a.f51138a;
        }
        if (event instanceof InterfaceC21413a.e) {
            return InterfaceC14173d.e.f51116a;
        }
        if (event instanceof InterfaceC21413a.c) {
            return InterfaceC14173d.d.f51114a;
        }
        if (event instanceof InterfaceC21413a.d) {
            return new InterfaceC14173d.y.e(((InterfaceC21413a.d) event).getCountry());
        }
        if (event instanceof InterfaceC21413a.q0) {
            return new InterfaceC14173d.y.n(((InterfaceC21413a.q0) event).getState());
        }
        if (event instanceof InterfaceC21413a.s0) {
            return new InterfaceC14173d.y.f(((InterfaceC21413a.s0) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String());
        }
        if (event instanceof InterfaceC21413a.u0) {
            InterfaceC21413a.u0 u0Var = (InterfaceC21413a.u0) event;
            return new InterfaceC14173d.y.k(u0Var.getPassword(), u0Var.getFilledViaCredentialManager());
        }
        if (event instanceof InterfaceC21413a.t0) {
            InterfaceC21413a.t0 t0Var = (InterfaceC21413a.t0) event;
            return new InterfaceC14173d.y.j(t0Var.getFirstName(), t0Var.getLastName(), t0Var.getUsername());
        }
        if (event instanceof InterfaceC21413a.a0) {
            return new InterfaceC14173d.y.h(((InterfaceC21413a.a0) event).getType());
        }
        if (event instanceof InterfaceC21413a.k0) {
            return new InterfaceC14173d.y.o(((InterfaceC21413a.k0) event).getStripeToken());
        }
        if (event instanceof InterfaceC21413a.e0) {
            return new InterfaceC14173d.y.d(((InterfaceC21413a.e0) event).getBirthday());
        }
        if (event instanceof InterfaceC21413a.d0) {
            return new InterfaceC14173d.y.c(((InterfaceC21413a.d0) event).getBillingFrequency());
        }
        if (event instanceof InterfaceC21413a.f0) {
            return new InterfaceC14173d.y.m(((InterfaceC21413a.f0) event).getCommitmentTypeSelected());
        }
        if (event instanceof InterfaceC21413a.h0) {
            return new InterfaceC14173d.y.l(((InterfaceC21413a.h0) event).getPaymentMethodIndex());
        }
        if (event instanceof InterfaceC21413a.z) {
            return new InterfaceC14173d.y.g(((InterfaceC21413a.z) event).getType());
        }
        if (event instanceof InterfaceC21413a.v0) {
            InterfaceC21413a.v0 v0Var = (InterfaceC21413a.v0) event;
            return new InterfaceC14173d.y.s(v0Var.getPounds(), v0Var.getUnitSystem());
        }
        if (event instanceof InterfaceC21413a.b0) {
            InterfaceC21413a.b0 b0Var = (InterfaceC21413a.b0) event;
            return new InterfaceC14173d.y.b(b0Var.getCentimeters(), b0Var.getUnitSystem());
        }
        if (event instanceof InterfaceC21413a.l0) {
            InterfaceC21413a.l0 l0Var = (InterfaceC21413a.l0) event;
            return new InterfaceC14173d.y.p(l0Var.getConsentsAccepted(), l0Var.getMarketingOptIn(), l0Var.getRecommendationOptIn(), l0Var.m60187a());
        }
        if (event instanceof InterfaceC21413a.n0) {
            return new InterfaceC14173d.y.q(((InterfaceC21413a.n0) event).getSelectedRafCodesAmount());
        }
        if (event instanceof InterfaceC21413a.a) {
            return InterfaceC14173d.b.f51110a;
        }
        if (event instanceof InterfaceC21413a.b) {
            return InterfaceC14173d.c.f51112a;
        }
        if (event instanceof InterfaceC21413a.t) {
            return InterfaceC14173d.s.f51131a;
        }
        if (event instanceof InterfaceC21413a.s) {
            return InterfaceC14173d.r.f51130a;
        }
        if (event instanceof InterfaceC21413a.k) {
            return InterfaceC14173d.j.f51122a;
        }
        if (event instanceof InterfaceC21413a.w) {
            return InterfaceC14173d.v.f51134a;
        }
        if (event instanceof InterfaceC21413a.v) {
            return InterfaceC14173d.u.f51133a;
        }
        if (event instanceof InterfaceC21413a.l) {
            return new InterfaceC14173d.k(((InterfaceC21413a.l) event).getSource());
        }
        if (event instanceof InterfaceC21413a.o) {
            return InterfaceC14173d.n.f51126a;
        }
        if (event instanceof InterfaceC21413a.n) {
            return InterfaceC14173d.m.f51125a;
        }
        if (event instanceof InterfaceC21413a.m) {
            return InterfaceC14173d.l.f51124a;
        }
        if (event instanceof InterfaceC21413a.j) {
            return InterfaceC14173d.i.f51121a;
        }
        if (event instanceof InterfaceC21413a.x) {
            return InterfaceC14173d.w.f51135a;
        }
        if (event instanceof InterfaceC21413a.o0) {
            return new InterfaceC14173d.d0(((InterfaceC21413a.o0) event).getShouldDismissError());
        }
        if (event instanceof InterfaceC21413a.r0) {
            return new InterfaceC14173d.y.r(((InterfaceC21413a.r0) event).getCard());
        }
        if (event instanceof InterfaceC21413a.g0) {
            return new InterfaceC14173d.y.i(((InterfaceC21413a.g0) event).getOptedIn());
        }
        if (event instanceof InterfaceC21413a.p0) {
            return InterfaceC14173d.e0.f51117a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x0159  */
    /* JADX INFO: renamed from: b */
    public final InterfaceC25187a m43812b(InterfaceC21415c event) {
        int iIntValue;
        String str;
        int iIntValue2;
        int iIntValue3;
        AbstractC22676k.m65750j(event, "event");
        int iIntValue4 = 0;
        if (event instanceof InterfaceC21415c.a) {
            InterfaceC21415c.a aVar = (InterfaceC21415c.a) event;
            C11753g cardNumber = aVar.getCard().getCardNumber();
            String value = aVar.getCard().getCardExpiration().getValue();
            if (value.length() != 4) {
                value = null;
            }
            if (value != null) {
                String strSubstring = value.substring(0, 2);
                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                Integer numM125932Q = AbstractC39421y.m125932Q(strSubstring);
                if (numM125932Q != null) {
                    iIntValue3 = numM125932Q.intValue();
                } else {
                    iIntValue3 = 0;
                }
            } else {
                iIntValue3 = 0;
            }
            C11752f c11752f = new C11752f(iIntValue3);
            String value2 = aVar.getCard().getCardExpiration().getValue();
            str = value2.length() == 4 ? value2 : null;
            if (str != null) {
                String strSubstring2 = str.substring(2, 4);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                Integer numM125932Q2 = AbstractC39421y.m125932Q(strSubstring2);
                if (numM125932Q2 != null) {
                    iIntValue4 = numM125932Q2.intValue();
                }
            }
            return new InterfaceC25187a.a(cardNumber, c11752f, new C11752f(iIntValue4), aVar.getCard().getCardCvv(), aVar.getCard().getCardZip(), aVar.getUpcycleVariant(), aVar.getUserCountryCode());
        }
        if (event instanceof InterfaceC21415c.c) {
            InterfaceC21415c.c cVar = (InterfaceC21415c.c) event;
            C11753g cardNumber2 = cVar.getCard().getCardNumber();
            String value3 = cVar.getCard().getCardExpiration().getValue();
            if (value3.length() != 4) {
                value3 = null;
            }
            if (value3 != null) {
                String strSubstring3 = value3.substring(0, 2);
                AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                Integer numM125932Q3 = AbstractC39421y.m125932Q(strSubstring3);
                if (numM125932Q3 != null) {
                    iIntValue2 = numM125932Q3.intValue();
                } else {
                    iIntValue2 = 0;
                }
            } else {
                iIntValue2 = 0;
            }
            C11752f c11752f2 = new C11752f(iIntValue2);
            String value4 = cVar.getCard().getCardExpiration().getValue();
            str = value4.length() == 4 ? value4 : null;
            if (str != null) {
                String strSubstring4 = str.substring(2, 4);
                AbstractC22676k.m65749i(strSubstring4, "substring(...)");
                Integer numM125932Q4 = AbstractC39421y.m125932Q(strSubstring4);
                if (numM125932Q4 != null) {
                    iIntValue4 = numM125932Q4.intValue();
                }
            }
            return new InterfaceC25187a.d(cardNumber2, c11752f2, new C11752f(iIntValue4), cVar.getCard().getCardCvv(), cVar.getCard().getCardZip(), cVar.getPayload(), cVar.getPromoCode(), cVar.getOrderDetailsReplaced(), cVar.getIsSavedPaymentMethod(), cVar.getUserCountryCode());
        }
        if (!(event instanceof InterfaceC21415c.b)) {
            if (event instanceof InterfaceC21415c.d) {
                return InterfaceC25187a.b.f98836a;
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC21415c.b bVar = (InterfaceC21415c.b) event;
        C11753g cardNumber3 = bVar.getCard().getCardNumber();
        String value5 = bVar.getCard().getCardExpiration().getValue();
        if (value5.length() != 4) {
            value5 = null;
        }
        if (value5 != null) {
            String strSubstring5 = value5.substring(0, 2);
            AbstractC22676k.m65749i(strSubstring5, "substring(...)");
            Integer numM125932Q5 = AbstractC39421y.m125932Q(strSubstring5);
            if (numM125932Q5 != null) {
                iIntValue = numM125932Q5.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            iIntValue = 0;
        }
        C11752f c11752f3 = new C11752f(iIntValue);
        String value6 = bVar.getCard().getCardExpiration().getValue();
        str = value6.length() == 4 ? value6 : null;
        if (str != null) {
            String strSubstring6 = str.substring(2, 4);
            AbstractC22676k.m65749i(strSubstring6, "substring(...)");
            Integer numM125932Q6 = AbstractC39421y.m125932Q(strSubstring6);
            if (numM125932Q6 != null) {
                iIntValue4 = numM125932Q6.intValue();
            }
        }
        return new InterfaceC25187a.c(cardNumber3, c11752f3, new C11752f(iIntValue4), bVar.getCard().getCardCvv(), bVar.getCard().getCardZip(), bVar.getPayload(), bVar.getPromoCode(), bVar.getOrderDetailsReplaced(), bVar.getIsSavedPaymentMethod(), bVar.getUserCountryCode());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC27630d m43813c(InterfaceC21416d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC21416d.f) {
            return new AbstractC27630d.f(((InterfaceC21416d.f) event).m60226a());
        }
        if (event instanceof InterfaceC21416d.c) {
            InterfaceC21416d.c cVar = (InterfaceC21416d.c) event;
            return new AbstractC27630d.c(cVar.getTermId(), cVar.getFullTermsUrl());
        }
        if (event instanceof InterfaceC21416d.a) {
            return new AbstractC27630d.a(((InterfaceC21416d.a) event).getTermId());
        }
        if (event instanceof InterfaceC21416d.d) {
            return new AbstractC27630d.d(((InterfaceC21416d.d) event).getTermId());
        }
        if (event instanceof InterfaceC21416d.e) {
            return AbstractC27630d.e.f111188a;
        }
        if (event instanceof InterfaceC21416d.b) {
            return AbstractC27630d.b.f111184a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
