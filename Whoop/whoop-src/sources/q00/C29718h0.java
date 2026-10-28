package q00;

import a33.C0352d;
import al0.C0971f;
import android.content.Context;
import android.content.Intent;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import b10.C2222b;
import b20.C2321a;
import b20.EnumC2323c;
import b30.AbstractC2590o3;
import b30.C2598p3;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c10.C3824g;
import c93.InterfaceC4339a;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.model.Country;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.PaymentAccount;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.stripe.android.view.ShippingInfoWidget;
import com.whoop.android.R;
import d30.C11514a;
import e30.AbstractC12605c;
import ec3.C13045h2;
import ec3.C13096w1;
import h20.C16687l;
import h20.C16776z4;
import io.getstream.chat.android.models.MessageType;
import java.util.Map;
import k20.C22136a;
import k20.C22147l;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25235a0;
import m83.C25272z;
import n20.C26175j;
import n40.AbstractC26268h;
import n40.C26267g;
import p133f1.C13941g1;
import p133f1.C13992x1;
import p266jz.AbstractC22067o;
import p294l3.C23254g;
import p294l3.C23283u0;
import p412q3.C29860a;
import p412q3.C29891y;
import p442qy.C30766e;
import p477s2.AbstractC32073e;
import p477s2.C32071c;
import p479s4.AbstractC32123d;
import p479s4.AbstractC32128i;
import p479s4.AbstractC32131l;
import p510u0.C34309d0;
import p510u0.C34322h1;
import p510u0.C34358t1;
import p510u0.EnumC34330k0;
import p599wz.AbstractC37740n1;
import p599wz.C37704b1;
import p664yy.C39865j;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22672i;
import q20.AbstractC29840y;
import q20.C29810c;
import q20.C29834s;
import q83.InterfaceC30057d;
import rc3.C31236a;
import s10.C32064f;
import s40.C32180t0;
import s90.C32290f;
import s93.AbstractC32309k;
import sc3.C32404r;
import sc3.C32406t;
import sc3.InterfaceC32403q;
import t10.C33285e;
import t10.C33290j;
import t10.C33300t;
import t20.C33321b;
import t20.C33323d;
import t20.C33324e;
import t20.C33326g;
import t20.C33338s;
import t20.C33342w;
import t20.InterfaceC33340u;
import v10.C35526b;
import wb3.AbstractC37056f;
import y00.AbstractC38794c0;
import y00.C38899m6;
import y00.InterfaceC38802c8;
import z10.AbstractC39995r;
import z10.C39984g;
import z10.C39985h;
import z10.C39986i;
import z10.C39990m;
import z10.C39991n;
import z10.C39992o;
import z10.C39993p;
import z10.C39994q;
import z10.InterfaceC39987j;

/* JADX INFO: renamed from: q00.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C29718h0 extends C22672i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121533w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29718h0(int i13, Object obj, Class cls, String str, String str2, int i14, int i15) {
        super(i13, i14, cls, obj, str, str2);
        this.f121533w = i15;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r13v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r3v37, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r3v38, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r5v35, types: [s90.f] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        C33326g c33326g;
        C33323d c33323d;
        String str;
        String str2;
        InterfaceC38802c8 interfaceC38802c8;
        Object value9;
        FinancialConnectionsAccount financialConnectionsAccount;
        Object value10;
        BankAccount bankAccount;
        C39991n c39991n;
        C39991n c39991n2;
        C39990m c39990m;
        FinancialConnectionsSession financialConnectionsSession;
        C29860a c29860a;
        EnumC34330k0 enumC34330k0M108671b;
        Integer numValueOf;
        int i13 = this.f121533w;
        String str3 = "cancelled";
        int i14 = 1;
        boolean z4 = true;
        ?? additionalNonPiiParams = 0;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                AbstractC38794c0 p13 = (AbstractC38794c0) obj;
                AbstractC22676k.m65750j(p13, "p0");
                C29734p0 c29734p0 = (C29734p0) this.receiver;
                c29734p0.getClass();
                if (!p13.equals(((C29720i0) c29734p0.f121608N.f45200w.getValue()).m91175d())) {
                    c29734p0.f121609O.mo43573s("");
                    c29734p0.f121610P.mo43573s("");
                }
                C13045h2 c13045h2 = c29734p0.f121607M;
                do {
                    value = c13045h2.getValue();
                } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, p13.getId(), false, null, null, null, null, null, null, null, 268402655)));
                return c23454a0;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                C13045h2 c13045h3 = ((C29734p0) this.receiver).f121607M;
                do {
                    value2 = c13045h3.getValue();
                } while (!c13045h3.m36569i(value2, C29720i0.m91172a((C29720i0) value2, null, null, false, bool, null, null, null, null, null, null, 268402687)));
                return c23454a0;
            case 2:
                AbstractC38794c0 p14 = (AbstractC38794c0) obj;
                AbstractC22676k.m65750j(p14, "p0");
                C29734p0 c29734p1 = (C29734p0) this.receiver;
                c29734p1.getClass();
                C13045h2 c13045h4 = c29734p1.f121607M;
                do {
                    value3 = c13045h4.getValue();
                } while (!c13045h4.m36569i(value3, C29720i0.m91172a((C29720i0) value3, null, null, false, null, p14.getId(), null, null, null, null, null, 268369919)));
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c29734p1), null, null, new C29730n0(c29734p1, p14, (InterfaceC30057d) null), 3);
                return c23454a0;
            case 3:
                AbstractC38794c0 p15 = (AbstractC38794c0) obj;
                AbstractC22676k.m65750j(p15, "p0");
                C29734p0 c29734p2 = (C29734p0) this.receiver;
                c29734p2.getClass();
                C26267g c26267g = c29734p2.f121601G;
                C37704b1 c37704b1 = C37704b1.f161562d;
                String paymentDetailsId = p15.getId();
                c37704b1.getClass();
                AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
                AbstractC26268h.m77946b(c26267g, AbstractC37740n1.m121154c(c37704b1.f161580a, AbstractC25247g0.m73990Y(new C23465k("payment_details", paymentDetailsId), new C23465k("is_billing_update_flow", String.valueOf(false)), new C23465k("billing_update_cvc", null))));
                return c23454a0;
            case 4:
                AbstractC38794c0 p16 = (AbstractC38794c0) obj;
                AbstractC22676k.m65750j(p16, "p0");
                C29734p0 c29734p3 = (C29734p0) this.receiver;
                c29734p3.getClass();
                C13045h2 c13045h5 = c29734p3.f121607M;
                do {
                    value4 = c13045h5.getValue();
                } while (!c13045h5.m36569i(value4, C29720i0.m91172a((C29720i0) value4, null, null, false, null, p16.getId(), null, null, null, null, null, 268369919)));
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c29734p3), null, null, new C29730n0(p16, c29734p3, (InterfaceC30057d) null), 3);
                return c23454a0;
            case 5:
                AbstractC22067o p17 = (AbstractC22067o) obj;
                AbstractC22676k.m65750j(p17, "p0");
                C29734p0 c29734p4 = (C29734p0) this.receiver;
                c29734p4.getClass();
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(c29734p4), null, null, new C26175j(p17, c29734p4, (InterfaceC30057d) additionalNonPiiParams, 18), 3);
                return c23454a0;
            case 6:
                ((PaymentAuthWebViewActivity) this.receiver).startActivity((Intent) obj);
                return c23454a0;
            case 7:
                Throwable th3 = (Throwable) obj;
                PaymentAuthWebViewActivity paymentAuthWebViewActivity = (PaymentAuthWebViewActivity) this.receiver;
                if (th3 != null) {
                    paymentAuthWebViewActivity.getClass();
                    Context applicationContext = paymentAuthWebViewActivity.getApplicationContext();
                    AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                    Context applicationContext2 = applicationContext.getApplicationContext();
                    AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
                    C22365e c22365e = AbstractC3050q0.f12077a;
                    ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
                    AbstractC32309k.m100574c(executorC22364d);
                    C39865j c39865j = new C39865j(C30766e.f126697b, executorC22364d);
                    C2222b c2222b = new C2222b(applicationContext2, C25235a0.f99113w, new C0971f(applicationContext2, i14));
                    EnumC2323c enumC2323c = EnumC2323c.AUTH_WEB_VIEW_FAILURE;
                    int i15 = StripeException.f22154E;
                    StripeException stripeExceptionM100024d = AbstractC32123d.m100024d(th3);
                    if ((4 & 2) != 0) {
                        stripeExceptionM100024d = null;
                    }
                    ?? r10 = 4 & 4;
                    Map mapM7173b = C25272z.f99163w;
                    additionalNonPiiParams = r10 != 0 ? mapM7173b : 0;
                    AbstractC22676k.m65750j(additionalNonPiiParams, "additionalNonPiiParams");
                    if (stripeExceptionM100024d != null) {
                        mapM7173b = C2321a.m7173b(stripeExceptionM100024d);
                    }
                    c39865j.m127938a(c2222b.mo7052a(enumC2323c, AbstractC25247g0.m73995d0(mapM7173b, additionalNonPiiParams)));
                    C32180t0 c32180t0M16921s = paymentAuthWebViewActivity.m16921s();
                    c32180t0M16921s.f133273x.m127938a(C2222b.m7051c(c32180t0M16921s.f133274y, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, 62));
                    String str4 = paymentAuthWebViewActivity.m16921s().m100108g().f151153w;
                    StripeException stripeExceptionM100024d2 = AbstractC32123d.m100024d(th3);
                    String str5 = paymentAuthWebViewActivity.m16921s().m100108g().f151150E;
                    paymentAuthWebViewActivity.m16921s().m100108g();
                    Intent intentPutExtras = new Intent().putExtras(new C35526b(str4, 2, stripeExceptionM100024d2, true, str5, (C38899m6) null, paymentAuthWebViewActivity.m16921s().m100108g().f151152G).m112682b());
                    AbstractC22676k.m65749i(intentPutExtras, "putExtras(...)");
                    paymentAuthWebViewActivity.setResult(-1, intentPutExtras);
                } else {
                    C32180t0 c32180t0M16921s2 = paymentAuthWebViewActivity.m16921s();
                    c32180t0M16921s2.f133273x.m127938a(C2222b.m7051c(c32180t0M16921s2.f133274y, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, 62));
                }
                paymentAuthWebViewActivity.finish();
                return c23454a0;
            case 8:
                Country p18 = (Country) obj;
                AbstractC22676k.m65750j(p18, "p0");
                ShippingInfoWidget shippingInfoWidget = (ShippingInfoWidget) this.receiver;
                int i16 = ShippingInfoWidget.f22560T;
                shippingInfoWidget.m16925c(p18);
                return c23454a0;
            case 9:
                return (C31236a) ((C32404r) this.receiver).m100982a(obj);
            case 10:
                return ((C32404r) this.receiver).f134148a.get(obj);
            case 11:
                return Boolean.valueOf(((InterfaceC32403q) this.receiver).test(obj));
            case 12:
                ((C32406t) this.receiver).getClass();
                return Boolean.TRUE;
            case 13:
                throw null;
            case 14:
                return (Integer) ((C32404r) this.receiver).m100982a(obj);
            case 15:
                return (Integer) ((C32404r) this.receiver).m100982a(obj);
            case 16:
                String p19 = (String) obj;
                AbstractC22676k.m65750j(p19, "p0");
                C22136a c22136a = (C22136a) this.receiver;
                c22136a.getClass();
                c22136a.m63388g(new C3824g(p19));
                C22136a.m63387i(c22136a, new C22147l(p19, 6));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((C32064f) this.receiver).m99630a((AbstractC29840y) obj);
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC33340u p24 = (InterfaceC33340u) obj;
                AbstractC22676k.m65750j(p24, "p0");
                ((C22136a) this.receiver).m63400t(p24);
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                Function1 p25 = (Function1) obj;
                AbstractC22676k.m65750j(p25, "p0");
                C33285e c33285e = (C33285e) this.receiver;
                C13045h2 c13045h6 = c33285e.f138824f;
                C33300t c33300t = c33285e.f138822d;
                C2598p3 c2598p3 = (C2598p3) p25.invoke(c33285e.f138826h);
                c33285e.f138826h = c2598p3;
                if (c2598p3 != null) {
                    InterfaceC4339a interfaceC4339a = c2598p3.f10108c;
                    c33300t.getClass();
                    c33300t.f138867a = interfaceC4339a;
                    do {
                        value6 = c13045h6.getValue();
                    } while (!c13045h6.m36569i(value6, C33290j.m105602a((C33290j) value6, c2598p3.f10106a, c2598p3.f10110e, null, false, null, null, 124)));
                } else {
                    c33300t.f138867a = null;
                    do {
                        value5 = c13045h6.getValue();
                    } while (!c13045h6.m36569i(value5, C33290j.m105602a((C33290j) value5, C33285e.m105601a(c33285e.f138819a.f150996w, c33285e.f138821c), c33285e.f138820b.f132973b.f45200w.getValue() != null, null, false, null, null, 124)));
                }
                return c23454a0;
            case 20:
                InterfaceC41211c interfaceC41211c = (InterfaceC41211c) obj;
                C13045h2 c13045h7 = ((C33285e) this.receiver).f138824f;
                do {
                    value7 = c13045h7.getValue();
                } while (!c13045h7.m36569i(value7, C33290j.m105602a((C33290j) value7, null, false, null, false, interfaceC41211c, null, 95)));
                return c23454a0;
            case 21:
                C29834s c29834s = (C29834s) obj;
                C11514a c11514a = (C11514a) this.receiver;
                c11514a.f37087a.invoke(c29834s);
                C0352d c0352d = c11514a.f37088b;
                ((C13045h2) c0352d.f1238y).m36570j((c29834s != null ? 0 : 1) != 0 ? (C29810c) c0352d.f1237x : null);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                AbstractC2590o3 p26 = (AbstractC2590o3) obj;
                AbstractC22676k.m65750j(p26, "p0");
                AbstractC12605c abstractC12605c = (AbstractC12605c) this.receiver;
                abstractC12605c.getClass();
                C13045h2 c13045h8 = abstractC12605c.f43014R;
                c13045h8.getClass();
                c13045h8.m36571k(null, p26);
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((AbstractC12605c) this.receiver).mo35337v((InterfaceC41211c) obj);
                return c23454a0;
            case 24:
                C29834s c29834s2 = (C29834s) obj;
                C11514a c11514a2 = (C11514a) this.receiver;
                c11514a2.f37087a.invoke(c29834s2);
                C0352d c0352d2 = c11514a2.f37088b;
                ((C13045h2) c0352d2.f1238y).m36570j((c29834s2 != null ? 0 : 1) != 0 ? (C29810c) c0352d2.f1237x : null);
                return c23454a0;
            case 25:
                InterfaceC39987j p27 = (InterfaceC39987j) obj;
                AbstractC22676k.m65750j(p27, "p0");
                C33342w c33342w = (C33342w) this.receiver;
                c33342w.f139134z.m5004e(Boolean.FALSE, "has_launched");
                boolean z13 = p27 instanceof C39985h;
                C39985h c39985h = z13 ? (C39985h) p27 : null;
                C13096w1 c13096w1 = c33342w.f139126a0;
                if (z13) {
                    str3 = "completed";
                } else if (p27 instanceof C39986i) {
                    str3 = MessageType.FAILED;
                } else if (!(p27 instanceof C39984g)) {
                    throw new NoWhenBranchMatchedException();
                }
                c13096w1.mo36564a(new C33338s(str3, null, c39985h != null ? c39985h.f172553w : null));
                if (z13) {
                    C39985h c39985h2 = (C39985h) p27;
                    C13045h2 c13045h9 = c33342w.f139124Y;
                    do {
                        value8 = c13045h9.getValue();
                        c33326g = (C33326g) value8;
                        c33323d = new C33323d(c39985h2.f172554x);
                        str = c39985h2.f172556z;
                        str2 = c39985h2.f172555y;
                        interfaceC38802c8 = c39985h2.f172553w;
                    } while (!c13045h9.m36569i(value8, AbstractC32131l.m100079u(c33326g, new C33321b(c33323d, str, str2, interfaceC38802c8 != null ? interfaceC38802c8.getId() : null, null, c33342w.m105697g(false, ((Boolean) c33342w.f139122W.getValue()).booleanValue()), false, c39985h2.f172552E))));
                } else if (p27 instanceof C39986i) {
                    c33342w.m105701p(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_ach_something_went_wrong));
                } else {
                    if (!(p27 instanceof C39984g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c33342w.m105701p(null);
                }
                return c23454a0;
            case 26:
                AbstractC39995r p28 = (AbstractC39995r) obj;
                AbstractC22676k.m65750j(p28, "p0");
                C33342w c33342w2 = (C33342w) this.receiver;
                c33342w2.getClass();
                c33342w2.f139134z.m5004e(Boolean.FALSE, "has_launched");
                boolean z14 = p28 instanceof C39993p;
                C39993p c39993p = z14 ? (C39993p) p28 : null;
                C13096w1 c13096w2 = c33342w2.f139126a0;
                if (z14) {
                    str3 = "completed";
                } else if (p28 instanceof C39994q) {
                    str3 = MessageType.FAILED;
                } else if (!(p28 instanceof C39992o)) {
                    throw new NoWhenBranchMatchedException();
                }
                c13096w2.mo36564a(new C33338s(str3, (c39993p == null || (c39991n2 = c39993p.f172568w) == null || (c39990m = c39991n2.f172565x) == null || (financialConnectionsSession = c39990m.f172563w) == null) ? null : financialConnectionsSession.getId(), (c39993p == null || (c39991n = c39993p.f172568w) == null) ? null : c39991n.f172564w));
                if (z14) {
                    C39991n c39991n3 = ((C39993p) p28).f172568w;
                    InterfaceC38802c8 interfaceC38802c9 = c39991n3.f172564w;
                    String id4 = interfaceC38802c9 != null ? interfaceC38802c9.getId() : null;
                    C39990m c39990m2 = c39991n3.f172565x;
                    if (c39990m2 != null) {
                        C13045h2 c13045h10 = c33342w2.f139124Y;
                        FinancialConnectionsSession financialConnectionsSession2 = c39990m2.f172563w;
                        PaymentAccount paymentAccount = financialConnectionsSession2.getPaymentAccount();
                        if (paymentAccount instanceof BankAccount) {
                            do {
                                value10 = c13045h10.getValue();
                                bankAccount = (BankAccount) paymentAccount;
                            } while (!c13045h10.m36569i(value10, AbstractC32131l.m100079u((C33326g) value10, new C33321b(new C33324e(financialConnectionsSession2.getId()), bankAccount.getBankName(), bankAccount.getLast4(), id4, financialConnectionsSession2.getId(), c33342w2.m105697g(true, ((Boolean) c33342w2.f139122W.getValue()).booleanValue()), bankAccount.getUsesMicrodeposits(), false))));
                        } else if (paymentAccount instanceof FinancialConnectionsAccount) {
                            do {
                                value9 = c13045h10.getValue();
                                financialConnectionsAccount = (FinancialConnectionsAccount) paymentAccount;
                            } while (!c13045h10.m36569i(value9, AbstractC32131l.m100079u((C33326g) value9, new C33321b(new C33324e(financialConnectionsSession2.getId()), financialConnectionsAccount.getInstitutionName(), financialConnectionsAccount.getLast4(), id4, financialConnectionsSession2.getId(), c33342w2.m105697g(false, ((Boolean) c33342w2.f139122W.getValue()).booleanValue()), false, false))));
                        } else {
                            if (paymentAccount != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c33342w2.m105701p(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_ach_something_went_wrong));
                        }
                    } else {
                        c33342w2.m105701p(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_ach_something_went_wrong));
                    }
                } else if (p28 instanceof C39994q) {
                    c33342w2.m105701p(AbstractC32128i.m100054h(R.string.stripe_paymentsheet_ach_something_went_wrong));
                } else {
                    if (!(p28 instanceof C39992o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c33342w2.m105701p(null);
                }
                return c23454a0;
            case 27:
                KeyEvent keyEvent = ((C32071c) obj).f133019a;
                C34322h1 c34322h1 = (C34322h1) this.receiver;
                C13992x1 c13992x1 = c34322h1.f144119f;
                boolean z15 = c34322h1.f144117d;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c29860a = null;
                } else {
                    C34309d0 c34309d0 = c34322h1.f144122i;
                    c34309d0.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c34309d0.f144072a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = c34309d0.f144072a;
                        if (num != null) {
                            c34309d0.f144072a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c29860a = new C29860a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    } else {
                        c29860a = null;
                    }
                }
                if (c29860a != null) {
                    if (z15) {
                        c34322h1.m108618a(AbstractC37056f.m118958J(c29860a));
                        c13992x1.f49931a = null;
                    } else {
                        z4 = false;
                    }
                } else if (AbstractC32073e.m99720L(keyEvent) != 2 || (enumC34330k0M108671b = c34322h1.f144123j.m108671b(keyEvent)) == null || (enumC34330k0M108671b.f144202w && !z15)) {
                    z4 = false;
                } else {
                    C22659b0 c22659b0 = new C22659b0();
                    c22659b0.f89329w = true;
                    ?? c32290f = new C32290f(enumC34330k0M108671b, c34322h1, c22659b0, 16);
                    C29891y c29891y = c34322h1.f144116c;
                    C13941g1 c13941g1 = new C13941g1(c29891y, c34322h1.f144120g, c34322h1.f144114a.m108662d(), c13992x1);
                    c32290f.invoke(c13941g1);
                    boolean zM67356b = C23283u0.m67356b(c13941g1.f49700f, c29891y.f122126b);
                    C23254g c23254g = c13941g1.f49701g;
                    if (!zM67356b || !AbstractC22676k.m65745e(c23254g, c29891y.f122125a)) {
                        c34322h1.f144124k.invoke(C29891y.m91511b(c29891y, c23254g, c13941g1.f49700f, 4));
                    }
                    C34358t1 c34358t1 = c34322h1.f144121h;
                    if (c34358t1 != null) {
                        c34358t1.f144358e = true;
                    }
                    z4 = c22659b0.f89329w;
                }
                return Boolean.valueOf(z4);
            case 28:
                C16687l p29 = (C16687l) obj;
                AbstractC22676k.m65750j(p29, "p0");
                ((C16776z4) this.receiver).m47285f(p29);
                return c23454a0;
            default:
                ((C32064f) this.receiver).m99630a((AbstractC29840y) obj);
                return c23454a0;
        }
    }
}
