package h20;

import a30.C0332w0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import d10.C11465b;
import g32.C15314n;
import g40.C15352f4;
import h00.C16497d0;
import j93.InterfaceC21467g;
import p048ce.AbstractC4482w;
import p108e4.AbstractC12667a;
import p179h.C16351i;
import p245j8.AbstractC21412c;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p634y1.AbstractC39038k;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import ro.C31624i;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h20.m1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16695m1 {

    /* JADX INFO: renamed from: a */
    public final C15314n f64218a;

    /* JADX INFO: renamed from: b */
    public final C31624i f64219b = new C31624i(22);

    public C16695m1(C15314n c15314n) {
        this.f64218a = c15314n;
    }

    /* JADX INFO: renamed from: a */
    public final C16727r3 m47254a(C28655q c28655q) {
        C15314n c15314n;
        c28655q.m87150e0(-1013366796);
        C11465b c11465b = new C11465b((InterfaceC16627b) this.f64219b.f130665x);
        c28655q.m87150e0(750973432);
        Object[] objArr = new Object[0];
        c28655q.m87150e0(-501681967);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C16497d0(5);
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        Object objM124459e = AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R, c28655q, 3072, 6);
        AbstractC22676k.m65749i(objM124459e, "rememberSaveable(...)");
        String str = (String) objM124459e;
        AbstractC12667a.m35459k(str, c11465b, c28655q, 0);
        c28655q.m87150e0(-501676720);
        C15314n c15314n2 = this.f64218a;
        boolean zM87157i = c28655q.m87157i(c15314n2);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i || objM87133R2 == c28676v0) {
            c15314n = c15314n2;
            C15352f4 c15352f4 = new C15352f4(1, c15314n, InterfaceC16638c4.class, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V", 0, 5);
            c28655q.m87172p0(c15352f4);
            objM87133R2 = c15352f4;
        } else {
            c15314n = c15314n2;
        }
        c28655q.m87173q(false);
        C16351i c16351iM118972a0 = AbstractC37056f.m118972a0(new PaymentSheetContract(), (Function1) ((InterfaceC21467g) AbstractC28683x.m87238F((InterfaceC21467g) objM87133R2, c28655q).getValue()), c28655q, 0);
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        InterfaceC1585g0 interfaceC1585g0 = (InterfaceC1585g0) c28655q.m87161k(AbstractC21412c.f82093a);
        c28655q.m87150e0(-501666383);
        Object objM87133R3 = c28655q.m87133R();
        if (objM87133R3 == c28676v0) {
            objM87133R3 = new C16497d0(6);
            c28655q.m87172p0(objM87133R3);
        }
        c28655q.m87173q(false);
        Activity activityM13991b0 = AbstractC4482w.m13991b0((InterfaceC4339a) objM87133R3, c28655q);
        c28655q.m87150e0(-501663102);
        boolean zM87153g = c28655q.m87153g(c15314n);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g || objM87133R4 == c28676v0) {
            Context applicationContext = context.getApplicationContext();
            AbstractC22676k.m65748h(applicationContext, "null cannot be cast to non-null type android.app.Application");
            objM87133R4 = new C16727r3(new C0332w0(c16351iM118972a0, activityM13991b0, interfaceC1585g0, (Application) applicationContext, c15314n, str));
            c28655q.m87172p0(objM87133R4);
        }
        C16727r3 c16727r3 = (C16727r3) objM87133R4;
        AbstractC25012a.m73392y(c28655q, false, false, false);
        return c16727r3;
    }

    /* JADX INFO: renamed from: b */
    public final void m47255b(InterfaceC16627b interfaceC16627b) {
        this.f64219b.f130665x = interfaceC16627b;
    }
}
