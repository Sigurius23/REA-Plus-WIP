package p000;

import a13.C0150h;
import a20.AbstractC0166f;
import a20.C0164d;
import a20.C0165e;
import a30.C0307l0;
import a30.C0332w0;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1621r0;
import androidx.lifecycle.InterfaceC1618q0;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b30.C2666z0;
import b33.EnumC2683d;
import b33.EnumC2686g;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import c93.InterfaceC4339a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.attestation.AttestationActivity;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import com.stripe.android.payments.bankaccount.p054ui.CollectBankAccountActivity;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherConfirmationActivity;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import com.whoop.android.R;
import d30.C11566v;
import e10.C12534a0;
import e10.C12579y;
import e10.C12580z;
import e10.InterfaceC12536b0;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import eg.C13161j;
import g20.AbstractC15258d;
import g40.AbstractC15380k2;
import g40.C15320a2;
import g40.C15339d3;
import g40.C15411q3;
import g40.C15413r0;
import g40.C15437w;
import g40.C15442x;
import g40.C15454z1;
import gm.C15990r;
import h02.C16587n0;
import h20.C16657g;
import h20.C16735t;
import h20.C16760x0;
import h20.C16771z;
import i20.AbstractC17960l1;
import i20.C17928b;
import i20.C17954j1;
import i20.C17955k;
import i20.C17958l;
import i20.C17982v0;
import i20.InterfaceC17961m;
import i43.C18087b;
import io.sentry.android.replay.video.C20245d;
import j00.AbstractC21106i0;
import j00.C21103h;
import j00.C21108k;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kz.AbstractC22911h;
import kz.InterfaceC22918o;
import l83.C23454a0;
import l83.C23465k;
import m43.C25056b;
import n20.C26174i;
import o20.C27457b;
import p00.C28578o;
import p043c4.AbstractC3979v;
import p078d1.C11457j;
import p102dy.InterfaceC12437f;
import p159fy.C14859d;
import p217ib.C18312i;
import p266jz.C22058f;
import p313lz.AbstractC24810g;
import p313lz.C24807d;
import p313lz.C24808e;
import p313lz.C24809f;
import p597wx.InterfaceC37676e;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p619xl.C38445a;
import p696zy.InterfaceC41211c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import q20.AbstractC29840y;
import q20.C29838w;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s00.C32038a;
import s00.C32040c;
import s00.C32043f;
import s00.InterfaceC32039b;
import s93.AbstractC32309k;
import so.C32800q;
import sz.AbstractC33132g0;
import sz.AbstractC33147o;
import t20.C33342w;
import t23.C33368c0;
import ug.AbstractC34924m;
import v00.C35459c0;
import w20.C36711b0;
import w20.C36735y;
import w23.C36750h;
import x20.C37848p;
import x20.C37855w;
import x23.C37869e;
import y00.EnumC38828f4;
import yb3.AbstractC39414r;
import z10.C39983f;
import z23.C40031a;
import z23.C40033c;

/* JADX INFO: renamed from: u */
/* JADX INFO: loaded from: classes9.dex */
public final class C34292u implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144027w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f144028x;

    public /* synthetic */ C34292u(Object obj, int i13) {
        this.f144027w = i13;
        this.f144028x = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) throws Throwable {
        C13045h2 c13045h2;
        Object value;
        C13045h2 c13045h3;
        Object value2;
        Object value3;
        Object value4;
        C15454z1 c15454z1;
        C15413r0 c15413r0;
        C15454z1 c15454z2;
        Object objM86908n;
        Object value5;
        Object value6;
        int i13 = this.f144027w;
        boolean z4 = false;
        strM125898q0 = null;
        String strM125898q0 = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f144028x;
        switch (i13) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((InterfaceC4339a) obj2).invoke();
                return c23454a0;
            case 1:
                AbstractC0166f abstractC0166f = (AbstractC0166f) obj;
                CollectBankAccountActivity collectBankAccountActivity = (CollectBankAccountActivity) obj2;
                if (abstractC0166f instanceof C0165e) {
                    C0165e c0165e = (C0165e) abstractC0166f;
                    InterfaceC22918o interfaceC22918o = collectBankAccountActivity.f22354x;
                    if (interfaceC22918o == null) {
                        AbstractC22676k.m65757q("financialConnectionsLauncher");
                        throw null;
                    }
                    interfaceC22918o.mo6701c(new C22058f(c0165e.f493b, c0165e.f492a, c0165e.f494c), c0165e.f495d);
                } else {
                    if (!(abstractC0166f instanceof C0164d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i14 = CollectBankAccountActivity.f22352z;
                    collectBankAccountActivity.setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract.extra_result", new C39983f(((C0164d) abstractC0166f).f491a)))));
                    collectBankAccountActivity.finish();
                }
                return c23454a0;
            case 2:
                Object objM5031a = ((C1621r0) ((InterfaceC1618q0) obj2)).m5031a(obj, interfaceC30057d);
                return objM5031a == EnumC31071a.f128113w ? objM5031a : c23454a0;
            case 3:
                InterfaceC32039b interfaceC32039b = (InterfaceC32039b) ((C11457j) obj2).f36754y;
                C35459c0 paymentMethodMetadata = ((C2666z0) obj).f10432b;
                C32038a c32038a = (C32038a) interfaceC32039b;
                C1601k1 c1601k1 = c32038a.f132911c;
                C13081r1 c13081r1 = c32038a.f132913e;
                AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
                C0307l0 c0307l0 = paymentMethodMetadata.f150995l0;
                C37718g0 c37718g0 = c0307l0 != null ? c0307l0.f1058w : null;
                C32043f c32043f = C32043f.f132919w;
                if (c37718g0 == null) {
                    C32040c it = (C32040c) c13081r1.f45200w.getValue();
                    AbstractC22676k.m65750j(it, "it");
                    c1601k1.m5004e(new C32040c(c32043f), "LINK_EMBEDDED_STATE_KEY");
                } else {
                    C37734l1 c37734l1 = c32038a.f132910b;
                    c37734l1.getClass();
                    c37734l1.m121148b(c37718g0).m77715b().getClass();
                    C32040c it3 = (C32040c) c13081r1.f45200w.getValue();
                    AbstractC22676k.m65750j(it3, "it");
                    c1601k1.m5004e(new C32040c(c32043f), "LINK_EMBEDDED_STATE_KEY");
                }
                return c23454a0;
            case 4:
                ((Function1) obj2).invoke((C27457b) obj);
                return c23454a0;
            case 5:
                C11457j c11457j = (C11457j) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC3979v.m12021l(c11457j.m30754y(), (View) c11457j.f36753x);
                }
                return c23454a0;
            case 6:
                C11566v c11566v = (C11566v) obj2;
                Object objM8705K = AbstractC3006f0.m8705K(c11566v.f37326j, new C0150h(c11566v, null, 8), interfaceC30057d);
                return objM8705K == EnumC31071a.f128113w ? objM8705K : c23454a0;
            case 7:
                PassiveChallengeActivity passiveChallengeActivity = (PassiveChallengeActivity) obj2;
                int i15 = PassiveChallengeActivity.f22144y;
                passiveChallengeActivity.setResult(4638, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.challenge.PassiveChallengeActivityContract.extra_result", (InterfaceC12437f) obj))));
                passiveChallengeActivity.finish();
                return c23454a0;
            case 8:
                PassiveChallengeWarmerActivity passiveChallengeWarmerActivity = (PassiveChallengeWarmerActivity) obj2;
                int i16 = PassiveChallengeWarmerActivity.f22147y;
                passiveChallengeWarmerActivity.setResult(4639, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.challenge.warmer.activity.PassiveChallengeWarmerContract.extra_result", (C14859d) obj))));
                passiveChallengeWarmerActivity.finish();
                return c23454a0;
            case 9:
                AbstractC15258d abstractC15258d = (AbstractC15258d) obj;
                if (abstractC15258d != null) {
                    int i17 = PaymentLauncherConfirmationActivity.f22360z;
                    ((PaymentLauncherConfirmationActivity) obj2).m16857o(abstractC15258d);
                }
                return c23454a0;
            case 10:
                AbstractC29840y abstractC29840y = (AbstractC29840y) obj;
                C16657g c16657g = (C16657g) obj2;
                c16657g.f64046f.invoke(abstractC29840y);
                String strM110122D = abstractC29840y != null ? AbstractC34924m.m110122D(abstractC29840y) : null;
                C1601k1 c1601k2 = c16657g.f64050j;
                if (strM110122D != null && c16657g.m47228c(strM110122D).equals(C16735t.f64290b) && !AbstractC22676k.m65745e((String) c1601k2.m5001b("previously_completed_payment_form"), strM110122D)) {
                    c16657g.f64049i.m63394n(strM110122D);
                    c1601k2.m5004e(strM110122D, "previously_completed_payment_form");
                }
                return c23454a0;
            case 11:
                AbstractC29840y abstractC29840y2 = (AbstractC29840y) obj;
                C16771z c16771z = (C16771z) obj2;
                InterfaceC41211c interfaceC41211cMo91324f = abstractC29840y2 != null ? abstractC29840y2.mo91324f(c16771z.f64458b, ((Boolean) c16771z.f64460d.invoke()).booleanValue()) : null;
                C29838w c29838w = abstractC29840y2 instanceof C29838w ? (C29838w) abstractC29840y2 : null;
                if (c29838w != null && c29838w.f121955x.f167511E == EnumC38828f4.f167093L) {
                    z4 = true;
                }
                c16771z.m47279a(interfaceC41211cMo91324f, z4);
                return c23454a0;
            case 12:
                C17982v0 c17982v0 = (C17982v0) obj2;
                C15339d3 c15339d3 = c17982v0.f69814H;
                if (((String) obj).length() == 0) {
                    InterfaceC13075p1 interfaceC13075p1 = c15339d3.f57645z;
                    do {
                        c13045h3 = (C13045h2) interfaceC13075p1;
                        value2 = c13045h3.getValue();
                    } while (!c13045h3.m36569i(value2, null));
                } else {
                    InterfaceC13075p1 interfaceC13075p2 = c15339d3.f57645z;
                    do {
                        c13045h2 = (C13045h2) interfaceC13075p2;
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, new C15411q3(R.drawable.stripe_ic_clear, true, new C16587n0(c17982v0, 11), 2)));
                }
                return c23454a0;
            case 13:
                InterfaceC17961m interfaceC17961m = (InterfaceC17961m) obj;
                C17954j1 c17954j1 = (C17954j1) obj2;
                C13045h2 c13045h4 = c17954j1.f69748I;
                C17928b c17928b = (C17928b) c13045h4.getValue();
                C16760x0 c16760x0Mo51573a = interfaceC17961m != null ? interfaceC17961m.mo51573a() : null;
                String str = c17928b != null ? c17928b.f69683w : null;
                if (c16760x0Mo51573a == null) {
                    c16760x0Mo51573a = c17928b != null ? c17928b.f69684x : null;
                }
                C17928b c17928b2 = new C17928b(str, c16760x0Mo51573a, c17928b != null ? c17928b.f69685y : null, c17928b != null ? c17928b.f69686z : null);
                Map mapM51589p = AbstractC17960l1.m51589p(c17928b2, null);
                if (interfaceC17961m instanceof C17958l) {
                    C13161j c13161j = c17954j1.f69759z;
                    if (c13161j != null) {
                        c13161j.invoke(new C15437w(mapM51589p));
                    }
                } else if (interfaceC17961m instanceof C17955k) {
                    C13161j c13161j2 = c17954j1.f69759z;
                    if (c13161j2 != null) {
                        c13161j2.invoke(new C15442x(mapM51589p));
                    }
                } else if (interfaceC17961m != null) {
                    throw new NoWhenBranchMatchedException();
                }
                c13045h4.emit(c17928b2, interfaceC30057d);
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                return c23454a0;
            case 14:
                C33368c0 c33368c0 = (C33368c0) obj;
                C18087b c18087b = (C18087b) obj2;
                if (c33368c0 != null) {
                    c18087b.f70294b = c33368c0;
                }
                int i18 = C18087b.f70292d;
                C2345k c2345kM51936a = c18087b.m51936a();
                InterfaceC2339e interfaceC2339e = c2345kM51936a.f9275c;
                String str2 = c2345kM51936a.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345kM51936a.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("Collected call: ", c33368c0 != null ? c33368c0.f139308v : null), null);
                }
                return c23454a0;
            case 15:
                AbstractC21106i0 abstractC21106i0 = (AbstractC21106i0) obj;
                C13045h2 c13045h5 = ((C21103h) obj2).f80015H;
                do {
                    value3 = c13045h5.getValue();
                } while (!c13045h5.m36569i(value3, C21108k.m58928a((C21108k) value3, abstractC21106i0, false, false, null, 4094)));
                return c23454a0;
            case 16:
                int iIntValue = ((Number) obj).intValue();
                C13045h2 c13045h6 = (C13045h2) ((C38445a) ((C15990r) obj2).f60512x).f164636x;
                do {
                    value4 = c13045h6.getValue();
                } while (!c13045h6.m36569i(value4, C25056b.m73534a((C25056b) value4, null, Integer.valueOf(iIntValue), null, null, false, null, 61)));
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC24810g abstractC24810g = (AbstractC24810g) obj;
                FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = (FinancialConnectionsSheetLiteActivity) obj2;
                if (abstractC24810g instanceof C24808e) {
                    WebView webView = financialConnectionsSheetLiteActivity.f22171w;
                    if (webView == null) {
                        AbstractC22676k.m65757q("webView");
                        throw null;
                    }
                    webView.loadUrl(((C24808e) abstractC24810g).f97127a);
                } else if (abstractC24810g instanceof C24807d) {
                    AbstractC22911h abstractC22911h = ((C24807d) abstractC24810g).f97126a;
                    int i19 = FinancialConnectionsSheetLiteActivity.f22170z;
                    financialConnectionsSheetLiteActivity.setResult(-1, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result", abstractC22911h))));
                    financialConnectionsSheetLiteActivity.finish();
                } else {
                    if (!(abstractC24810g instanceof C24809f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str3 = ((C24809f) abstractC24810g).f97128a;
                    int i24 = FinancialConnectionsSheetLiteActivity.f22170z;
                    C18312i c18312i = new C18312i();
                    c18312i.m52718e();
                    c18312i.m52717d();
                    ((Intent) c18312i.f71288c).putExtra("org.chromium.chrome.browser.customtabs.EXTRA_DISABLE_STAR_BUTTON", true);
                    c18312i.m52714a().m91499h(financialConnectionsSheetLiteActivity, Uri.parse(str3));
                }
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC12536b0 interfaceC12536b0 = (InterfaceC12536b0) obj;
                if (!(interfaceC12536b0 instanceof C12534a0) && !(interfaceC12536b0 instanceof C12580z)) {
                    if (!(interfaceC12536b0 instanceof C12579y)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C26174i.m77718a((C26174i) obj2, ((C12579y) interfaceC12536b0).f42950a);
                }
                return c23454a0;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String str4 = (String) obj;
                C15320a2 c15320a2 = (C15320a2) obj2;
                if (c15320a2 != null && (c15454z2 = c15320a2.f57557c) != null) {
                    strM125898q0 = AbstractC39414r.m125898q0((String) c15454z2.f58050e.getValue(), ((AbstractC15380k2) ((InterfaceC4339a) c15454z2.f58056k.f104635y).invoke()).mo43577c());
                }
                if ((strM125898q0 == null || AbstractC39414r.m125890i0(strM125898q0)) && c15320a2 != null && (c15454z1 = c15320a2.f57557c) != null && (c15413r0 = c15454z1.f58055j) != null) {
                    c15413r0.mo43573s(str4);
                }
                return c23454a0;
            case 20:
                String str5 = (String) obj;
                return (str5 == null || (objM86908n = ((C28578o) obj2).m86908n(str5, interfaceC30057d)) != EnumC31071a.f128113w) ? c23454a0 : objM86908n;
            case 21:
                ((CardMultilineWidget) obj2).getCardBrandView().setCbcEligible(((Boolean) obj).booleanValue());
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                if (((Boolean) obj).booleanValue()) {
                    int i25 = PaymentAuthWebViewActivity.f22551E;
                    CircularProgressIndicator progressBar = ((PaymentAuthWebViewActivity) obj2).m16920r().f79774b;
                    AbstractC22676k.m65749i(progressBar, "progressBar");
                    progressBar.setVisibility(8);
                }
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC33147o abstractC33147o = (AbstractC33147o) obj;
                if (abstractC33147o != null) {
                    int i26 = GooglePayLauncherActivity.f22184z;
                    ((GooglePayLauncherActivity) obj2).m16841o(abstractC33147o);
                }
                return c23454a0;
            case 24:
                AbstractC33132g0 abstractC33132g0 = (AbstractC33132g0) obj;
                if (abstractC33132g0 != null) {
                    int i27 = GooglePayPaymentMethodLauncherActivity.f22188z;
                    ((GooglePayPaymentMethodLauncherActivity) obj2).m16843o(abstractC33132g0);
                }
                return c23454a0;
            case 25:
                String str6 = (String) obj;
                if (str6 != null) {
                    ((C33342w) obj2).f139115P.f58055j.mo43573s(str6);
                }
                return c23454a0;
            case 26:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C13045h2 c13045h7 = ((C36711b0) obj2).f157192b;
                do {
                    value5 = c13045h7.getValue();
                } while (!c13045h7.m36569i(value5, C36735y.m117842a((C36735y) value5, null, !zBooleanValue, 7)));
                return c23454a0;
            case 27:
                C20245d c20245d = (C20245d) obj2;
                if (AbstractC22676k.m65745e((Boolean) obj, Boolean.FALSE) && ((AtomicBoolean) c20245d.f76051g).compareAndSet(false, true)) {
                    C40033c c40033c = (C40033c) c20245d.f76047c;
                    String sfuId = (String) ((C13081r1) ((C0332w0) c20245d.f76049e).f1169y).f45200w.getValue();
                    String str7 = (String) c20245d.f76045a;
                    String callType = (String) c20245d.f76046b;
                    C13081r1 c13081r2 = (C13081r1) ((C32800q) c20245d.f76048d).f136505x;
                    InterfaceC13037f2 interfaceC13037f2 = c13081r2.f45200w;
                    InterfaceC13037f2 interfaceC13037f3 = c13081r2.f45200w;
                    String str8 = ((C36750h) interfaceC13037f2.getValue()).f157282b;
                    if (str8 == null) {
                        str8 = "unknown";
                    }
                    String str9 = str8;
                    AbstractC32309k abstractC32309k = ((C36750h) interfaceC13037f3.getValue()).f157281a;
                    if (abstractC32309k == null) {
                        abstractC32309k = C37869e.f162182w;
                    }
                    AbstractC32309k abstractC32309k2 = abstractC32309k;
                    String str10 = ((C36750h) interfaceC13037f3.getValue()).f157285e;
                    c40033c.getClass();
                    AbstractC22676k.m65750j(sfuId, "sfuId");
                    AbstractC22676k.m65750j(callType, "callType");
                    String string = UUID.randomUUID().toString();
                    AbstractC22676k.m65749i(string, "toString(...)");
                    c40033c.f172739a.m927P(C40031a.m128361a(c40033c.f172741c, str7, callType, EnumC2683d.FIRST_AUDIO_FRAME_RENDERED, EnumC2686g.INITIATED, string, abstractC32309k2, str9, null, null, null, null, null, str10, sfuId, null, null, null, null, null, 8376192));
                    C2996c2 c2996c2 = (C2996c2) c20245d.f76052h;
                    if (c2996c2 != null) {
                        c2996c2.cancel((CancellationException) null);
                    }
                    c20245d.f76052h = null;
                }
                return c23454a0;
            case 28:
                AttestationActivity attestationActivity = (AttestationActivity) obj2;
                int i28 = AttestationActivity.f22138y;
                attestationActivity.setResult(4851, new Intent().putExtras(AbstractC12889b.m36273g(new C23465k("com.stripe.android.attestation.AttestationActivityContract.extra_result", (InterfaceC37676e) obj))));
                attestationActivity.finish();
                return c23454a0;
            default:
                long rawValue = ((Duration) obj).getRawValue();
                C13045h2 c13045h8 = ((C37855w) obj2).f162053y;
                do {
                    value6 = c13045h8.getValue();
                } while (!c13045h8.m36569i(value6, C37848p.m121377a((C37848p) value6, rawValue, null, false, 14)));
                return c23454a0;
        }
    }
}
