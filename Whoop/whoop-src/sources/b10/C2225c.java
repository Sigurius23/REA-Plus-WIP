package b10;

import a00.C0074i;
import a00.C0076k;
import a30.C0294h;
import a33.C0352d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.LocaleList;
import androidx.room.C1836v0;
import b30.C2570m;
import b30.C2624t0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c20.C3879g;
import c20.C3887o;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import com.stripe.android.shoppay.ShopPayActivityContract;
import cy.C11181b;
import d30.C11514a;
import d30.C11530f0;
import d30.C11566v;
import ec3.AbstractC13091v;
import ec3.C13081r1;
import ec3.C13096w1;
import f20.EnumC14023b;
import g10.C15215a;
import g73.C15556d;
import h20.C16657g;
import h20.C16741u;
import h20.C16765y;
import h20.C16776z4;
import h20.EnumC16673i3;
import h20.InterfaceC16747v;
import hc3.AbstractC17182o;
import i20.C17928b;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k20.C22136a;
import kc3.C22365e;
import la.C23548b;
import m83.AbstractC25265s;
import n10.C26135j0;
import n53.C26318e;
import ng3.C26701n;
import o20.C27457b;
import p00.C28573j;
import p007a6.C0416e;
import p012ab.C0679g;
import p029b5.C2725d;
import p029b5.C2728g;
import p098dt.AbstractC12350b;
import p20.C28747i;
import p203hy.C17714c;
import p352ny.C27232d;
import p442qy.C30765d;
import p479s4.AbstractC32121b;
import p499t9.C33623c0;
import p499t9.C33647p;
import p537ux.C35362x;
import p537ux.C35363y;
import p664yy.AbstractC39851c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33192k;
import q00.C29718h0;
import q20.AbstractC29835t;
import q20.C29810c;
import q80.C30036h;
import r12.C30856a;
import rq0.C31703x;
import s10.C32063e;
import s10.C32064f;
import s20.C32077a;
import sc0.C32355c;
import se.AbstractC32410a;
import t00.C33254a;
import t10.C33285e;
import t10.C33286f;
import t20.C33333n;
import u00.C34377e;
import u00.C34378f;
import u10.C34433u;
import v00.C35459c0;
import v00.C35484p;
import v00.InterfaceC35471i0;
import v03.C35522i;
import v03.InterfaceC35517d;
import y00.C38887l3;
import y00.EnumC38828f4;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: b10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2225c implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8861w;

    /* JADX INFO: renamed from: x */
    public final Object f8862x;

    public /* synthetic */ C2225c(Object obj, int i13) {
        this.f8861w = i13;
        this.f8862x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0184  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r7v10 */
    @Override // k83.InterfaceC22297a
    public final Object get() {
        C2725d c2725d;
        boolean z4;
        int i13 = 2;
        int i14 = 0;
        C35363y c35363y = 0;
        switch (this.f8861w) {
            case 0:
                ((C34377e) this.f8862x).getClass();
                EnumC2228d enumC2228d = EnumC2228d.PaymentElement;
                return EnumC2228d.PaymentElement;
            case 1:
                return (C0074i) ((C0076k) this.f8862x).get();
            case 2:
                ((C15556d) this.f8862x).getClass();
                UUID uuid = AbstractC39851c.f172106g;
                String string = AbstractC39851c.f172106g.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            case 3:
                Set definitions = (Set) ((C35522i) this.f8862x).get();
                AbstractC22676k.m65750j(definitions, "definitions");
                return new C0679g(AbstractC25265s.m74093D1(definitions), i13);
            case 4:
                return new C23548b((C30765d) ((C11181b) this.f8862x).get());
            case 5:
                ((C26701n) this.f8862x).getClass();
                return AbstractC12350b.m34570S("PaymentSheet.AddressController");
            case 6:
                return (C17714c) ((C2221a1) this.f8862x).get();
            case 7:
                ((C26701n) this.f8862x).getClass();
                return EventReporter$Mode.Custom;
            case 8:
                return new C26135j0((C28747i) this.f8862x, 2);
            case 9:
                return new C15215a((ShopPayActivityContract) ((C0294h) this.f8862x).get());
            case 10:
                C11530f0 c11530f0 = (C11530f0) ((C2221a1) this.f8862x).get();
                String selectedPaymentMethodCode = (String) c11530f0.f37151d;
                C32063e c32063e = (C32063e) c11530f0.f37153f;
                InterfaceC2994c0 coroutineScope = (InterfaceC2994c0) c11530f0.f37154g;
                C35459c0 paymentMethodMetadata = (C35459c0) c11530f0.f37150c;
                C22136a eventReporter = (C22136a) c11530f0.f37149b;
                boolean z13 = c11530f0.f37148a;
                boolean z14 = !z13;
                C33286f c33286f = new C33286f(c11530f0, i14);
                C33286f c33286f2 = new C33286f(c11530f0, 1);
                C33286f c33286f3 = new C33286f(c11530f0, i13);
                c32063e.getClass();
                AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
                AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
                C29810c c29810c = paymentMethodMetadata.f150979V;
                InterfaceC38802c8 interfaceC38802c8 = paymentMethodMetadata.f150996w;
                AbstractC22676k.m65750j(eventReporter, "eventReporter");
                String str = c32063e.f132970e;
                if (AbstractC39414r.m125890i0(str)) {
                    c2725d = null;
                } else {
                    Object value = c32063e.f132967b.f132973b.f45200w.getValue();
                    AbstractC29835t abstractC29835t = value instanceof AbstractC29835t ? (AbstractC29835t) value : null;
                    C33623c0 c33623c0 = EnumC38828f4.f167088G;
                    if (str.equals("card")) {
                        if ((abstractC29835t != null ? abstractC29835t.mo91330i() : null) == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                    } else {
                        z4 = false;
                    }
                    c2725d = new C2725d(!z4, paymentMethodMetadata.f150986c0, c32063e.f132969d);
                }
                C27232d tapToAddCollectionHandler = c32063e.f132971f;
                C31703x c31703x = new C31703x(c33286f2, 7);
                C31703x c31703x2 = new C31703x(c33286f, 8);
                AbstractC22676k.m65750j(tapToAddCollectionHandler, "tapToAddCollectionHandler");
                C16657g c16657g = new C16657g(coroutineScope, new C16765y(), c32063e.f132968c, paymentMethodMetadata, new C30036h(c32063e, 23), c33286f3, c32063e.f132966a, z14, eventReporter, c32063e.f132969d, null, false, c2725d, paymentMethodMetadata.f150994k0 ? new C2570m(coroutineScope, tapToAddCollectionHandler, paymentMethodMetadata, c31703x, c31703x2) : null);
                int i15 = 0;
                int i16 = 1;
                C29718h0 c29718h0 = new C29718h0(i16, (C32064f) c11530f0.f37152e, C32064f.class, "set", "set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", i15, 17);
                C29718h0 c29718h1 = new C29718h0(i16, (C22136a) c11530f0.f37149b, C22136a.class, "onUsBankAccountFormEvent", "onUsBankAccountFormEvent(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel$AnalyticsEvent;)V", i15, 18);
                C29718h0 c29718h2 = new C29718h0(1, (C33285e) c11530f0.f37155h, C33285e.class, "updatePrimaryButton", "updatePrimaryButton(Lkotlin/jvm/functions/Function1;)V", 0, 19);
                C29718h0 c29718h3 = new C29718h0(1, (C33285e) c11530f0.f37155h, C33285e.class, "updateError", "updateError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0, 20);
                C30856a c30856a = new C30856a(c11530f0, 26);
                C32355c c32355c = new C32355c(c11530f0, 5);
                AbstractC22676k.m65750j(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                InterfaceC35471i0 interfaceC35471i0 = paymentMethodMetadata.f150976S;
                C35484p c35484p = paymentMethodMetadata.f150973P;
                boolean zM100011q = AbstractC32121b.m100011q(selectedPaymentMethodCode, interfaceC35471i0, interfaceC38802c8, c35484p != null);
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                boolean zEquals = selectedPaymentMethodCode.equals("link");
                C11514a c11514a = new C11514a(c29718h0, new C0352d(c29810c));
                boolean z15 = zM100011q && !zEquals;
                EnumC38922p2 enumC38922p2 = paymentMethodMetadata.f150977T;
                String str2 = paymentMethodMetadata.f150990g0;
                boolean z16 = interfaceC38802c8 instanceof C38887l3;
                String id4 = interfaceC38802c8.getId();
                String clientSecret = interfaceC38802c8.getClientSecret();
                C17928b c17928b = paymentMethodMetadata.f150969L;
                C29718h0 c29718h4 = new C29718h0(1, c11514a, C11514a.class, "handleLinkedBankAccountChanged", "handleLinkedBankAccountChanged(Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;)V", 0, 24);
                C29810c c29810c2 = paymentMethodMetadata.f150979V;
                boolean z17 = c35484p != null ? c35484p.f151062z : false;
                EnumC14023b enumC14023b = paymentMethodMetadata.f150980W;
                EnumC16673i3 enumC16673i3 = (EnumC16673i3) paymentMethodMetadata.f150983Z.get(EnumC38828f4.f167119l0);
                if (enumC16673i3 == null) {
                    enumC16673i3 = EnumC16673i3.f64121w;
                }
                C33333n c33333n = new C33333n(zEquals, c29810c2, enumC38922p2, str2, z15, false, z16, id4, clientSecret, "payment_element", c17928b, null, null, c29718h1, c30856a, c29718h4, c29718h2, new C33192k(8), c29718h3, c32355c, z17, enumC14023b, z14, enumC16673i3, paymentMethodMetadata.f150967J, paymentMethodMetadata.f150984a0, paymentMethodMetadata.f150987d0);
                InterfaceC16747v interfaceC16747vM47228c = c16657g.m47228c(selectedPaymentMethodCode);
                C32077a c32077aM47226a = c16657g.m47226a(selectedPaymentMethodCode);
                if (interfaceC16747vM47228c instanceof C16741u) {
                    C32064f c32064f = (C32064f) c11530f0.f37152e;
                    C27457b c27457bM99782a = c32077aM47226a.m99782a();
                    C34378f c34378fM112534R = paymentMethodMetadata.m112534R(selectedPaymentMethodCode);
                    if (c34378fM112534R == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    c32064f.m99630a(AbstractC32410a.m101037j0(c27457bM99782a, c34378fM112534R, paymentMethodMetadata, null, null));
                }
                List listM47227b = c16657g.m47227b(selectedPaymentMethodCode);
                C1836v0 c1836v0 = new C1836v0(2, c16657g, C16657g.class, "onFormFieldValuesChanged", "onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V", 0, 20);
                C29718h0 c29718h5 = new C29718h0(1, (C22136a) c11530f0.f37149b, C22136a.class, "onPaymentMethodFormInteraction", "onPaymentMethodFormInteraction(Ljava/lang/String;)V", 0, 16);
                C33254a c33254aM112540i = paymentMethodMetadata.m112540i(selectedPaymentMethodCode, z13);
                boolean zMo124338q0 = interfaceC38802c8.mo124338q0();
                C26318e c26318eM9484M = AbstractC3269g.m9484M(((C33285e) c11530f0.f37155h).f138825g, new C33192k(5));
                C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(AbstractC13091v.m36593c(c29810c));
                C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) c11530f0.f37154g;
                C22365e c22365e = AbstractC3050q0.f12077a;
                return new C11566v(selectedPaymentMethodCode, c32077aM47226a, listM47227b, c1836v0, c33333n, c29718h5, c33254aM112540i, zMo124338q0, c26318eM9484M, c13096w1M36592b, c13081r1M36598h, interfaceC2994c0, AbstractC17182o.f65999a);
            case 11:
                C34433u c34433u = (C34433u) ((C3887o) this.f8862x).get();
                return new C16776z4(AbstractC3269g.m9493Z(c34433u.f144680f), c34433u.f144675a, c34433u.f144683i, c34433u.f144681g, c34433u.f144682h, c34433u.f144676b, c34433u.f144677c.f132973b, new C29718h0(1, c34433u.f144677c, C32064f.class, "set", "set(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", 0, 29), c34433u.f144678d, new C0416e(c34433u, c35363y, 16), new C28573j(0, c34433u, C34433u.class, "onPaymentMethodRemoved", "onPaymentMethodRemoved()V", 0, 21), new C2624t0(c34433u, 4), AbstractC3269g.m9493Z(Boolean.FALSE), false);
            case 12:
                Context context = (Context) ((C3879g) this.f8862x).get();
                C35363y c35363y2 = C35363y.f150632y;
                if (c35363y2 != null) {
                    return c35363y2;
                }
                SharedPreferences sharedPreferences = new C35362x(context).f150631a;
                String string2 = sharedPreferences.getString("key_publishable_key", null);
                c35363y = string2 != null ? new C35363y(string2, sharedPreferences.getString("key_account_id", null)) : 0;
                if (c35363y == 0) {
                    throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                }
                C35363y.f150632y = c35363y;
                return c35363y;
            case 13:
                ((C33647p) this.f8862x).getClass();
                C2728g c2728g = C2728g.f10738b;
                C2728g c2728gM7699f = C2728g.m7699f(LocaleList.getAdjustedDefault());
                if (c2728gM7699f.m7701c()) {
                    c2728gM7699f = null;
                }
                if (c2728gM7699f != null) {
                    return c2728gM7699f.m7700b(0);
                }
                return null;
            default:
                Context context2 = (Context) ((C3879g) this.f8862x).get();
                C35363y c35363y3 = C35363y.f150632y;
                if (c35363y3 != null) {
                    return c35363y3;
                }
                SharedPreferences sharedPreferences2 = new C35362x(context2).f150631a;
                String string3 = sharedPreferences2.getString("key_publishable_key", null);
                C35363y c35363y4 = string3 != null ? new C35363y(string3, sharedPreferences2.getString("key_account_id", null)) : null;
                if (c35363y4 == null) {
                    throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                }
                C35363y.f150632y = c35363y4;
                return c35363y4;
        }
    }

    public /* synthetic */ C2225c(Object obj, InterfaceC35517d interfaceC35517d, int i13) {
        this.f8861w = i13;
        this.f8862x = interfaceC35517d;
    }
}
