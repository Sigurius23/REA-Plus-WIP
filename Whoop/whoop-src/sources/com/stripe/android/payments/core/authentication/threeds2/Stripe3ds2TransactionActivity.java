package com.stripe.android.payments.core.authentication.threeds2;

import a20.C0168h;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.AbstractC1329o1;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1643y1;
import aq0.C1904o;
import com.mapbox.maps.C5538l;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.whoop.profile.view.edit.C9790n;
import cz.C11194d;
import d20.C11494j;
import d20.C11495k;
import d20.C11496l;
import d20.C11502r;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import m83.AbstractC25267u;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p235iz.C21037a;
import p236j.AbstractC21065d;
import p314m.AbstractActivityC24852m;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import t30.C33514p;
import v10.C35526b;
import y00.C38831f7;
import y00.C38972u7;
import y00.C38981v7;
import yb3.AbstractC39397a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionActivity;", "Lm/m;", "<init>", "()V", "Ld20/r;", "viewModel", "payments-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class Stripe3ds2TransactionActivity extends AbstractActivityC24852m {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f22356z = 0;

    /* JADX INFO: renamed from: w */
    public final C23470p f22357w = AbstractC30060g.m92088H(new C11494j(this, 1));

    /* JADX INFO: renamed from: x */
    public C11496l f22358x;

    /* JADX INFO: renamed from: y */
    public final C0168h f22359y;

    public Stripe3ds2TransactionActivity() {
        int i13 = 2;
        this.f22359y = new C0168h(new C11494j(this, i13), i13);
    }

    /* JADX INFO: renamed from: o */
    public final void m16856o(C35526b c35526b) {
        setResult(-1, new Intent().putExtras(c35526b.m112682b()));
        finish();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x011d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0134  */
    /* JADX WARN: Code duplicated, block: B:35:0x0138  */
    /* JADX WARN: Code duplicated, block: B:42:0x0198  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c8  */
    @Override // androidx.fragment.app.AbstractActivityC1340r0, p161g.AbstractActivityC14909l, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Throwable th3;
        Object objM107888l;
        Throwable thM68037a;
        C23470p c23470p;
        C11496l c11496l;
        Integer num;
        C1643y1 c1643y1;
        C9790n c9790n;
        AbstractC21065d abstractC21065dRegisterForActivityResult;
        AbstractC21065d abstractC21065dRegisterForActivityResult2;
        int iIntValue;
        Window window;
        Object objM107888l2;
        Integer num2;
        try {
            Intent intent = getIntent();
            AbstractC22676k.m65749i(intent, "getIntent(...)");
            C11496l c11496l2 = (C11496l) intent.getParcelableExtra("extra_args");
            try {
                if (c11496l2 == null) {
                    throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.");
                }
                String str = c11496l2.f36967x.f150603x.f150611w.f97799F;
                if (str != null) {
                    try {
                        objM107888l2 = Integer.valueOf(Color.parseColor(str));
                    } catch (Throwable th4) {
                        objM107888l2 = AbstractC34132o.m107888l(th4);
                    }
                    if (objM107888l2 instanceof C23467m) {
                        objM107888l2 = null;
                    }
                    num2 = (Integer) objM107888l2;
                } else {
                    num2 = null;
                }
                AbstractC1329o1 supportFragmentManager = getSupportFragmentManager();
                C38981v7 sdkData = c11496l2.f36969z;
                AbstractC22676k.m65750j(sdkData, "sdkData");
                String source = sdkData.f167785w;
                String directoryServerName = sdkData.f167786x;
                String serverTransactionId = sdkData.f167787y;
                C38972u7 c38972u7 = sdkData.f167788z;
                String directoryServerId = c38972u7.f167745w;
                String dsCertificateData = c38972u7.f167746x;
                List rootCertsData = c38972u7.f167747y;
                String str2 = c38972u7.f167748z;
                AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
                AbstractC22676k.m65750j(dsCertificateData, "dsCertificateData");
                AbstractC22676k.m65750j(rootCertsData, "rootCertsData");
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                th3 = null;
                byte[] bytes = dsCertificateData.getBytes(AbstractC39397a.f169546a);
                AbstractC22676k.m65749i(bytes, "getBytes(...)");
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                AbstractC22676k.m65748h(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                PublicKey publicKey = ((X509Certificate) certificateGenerateCertificate).getPublicKey();
                AbstractC22676k.m65749i(publicKey, "getPublicKey(...)");
                List list = rootCertsData;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    Iterator it3 = it;
                    CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
                    Integer num3 = num2;
                    byte[] bytes2 = str3.getBytes(AbstractC39397a.f169546a);
                    AbstractC22676k.m65749i(bytes2, "getBytes(...)");
                    Certificate certificateGenerateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
                    AbstractC22676k.m65748h(certificateGenerateCertificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificateGenerateCertificate2);
                    it = it3;
                    supportFragmentManager = supportFragmentManager;
                    num2 = num3;
                }
                new C38831f7(directoryServerId, publicKey, arrayList, str2);
                AbstractC22676k.m65750j(source, "source");
                AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
                AbstractC22676k.m65750j(serverTransactionId, "serverTransactionId");
                supportFragmentManager.f5698B = new C33514p(directoryServerName, c11496l2.f36966w, num2);
                objM107888l = c11496l2;
                super.onCreate(bundle);
                thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    int i13 = StripeException.f22154E;
                    m16856o(new C35526b((String) null, 2, AbstractC32123d.m100024d(thM68037a), false, (String) null, (String) null, 121));
                    return;
                }
                this.f22358x = (C11496l) objM107888l;
                c23470p = this.f22357w;
                setContentView(((C21037a) c23470p.getValue()).f79752a);
                c11496l = this.f22358x;
                if (c11496l != null) {
                    AbstractC22676k.m65757q("args");
                    throw th3;
                }
                num = c11496l.f36963G;
                if (num != null) {
                    iIntValue = num.intValue();
                    if (Build.VERSION.SDK_INT <= 34 && (window = getWindow()) != null) {
                        window.setStatusBarColor(iIntValue);
                    }
                }
                c1643y1 = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11502r.class), new C11495k(this, 0), new C11494j(this, 0), new C11495k(this, 1));
                c9790n = new C9790n(8, this, c1643y1);
                abstractC21065dRegisterForActivityResult = registerForActivityResult(new ChallengeContract(), new C1904o(c9790n, 2));
                abstractC21065dRegisterForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new C1904o(this, 3));
                if (!((C11502r) c1643y1.getValue()).f36999M) {
                    AbstractC1613o1.m5020j(this).m4973b(new C11194d(this, abstractC21065dRegisterForActivityResult, c9790n, abstractC21065dRegisterForActivityResult2, c1643y1, null, 3));
                }
                AbstractC29125c.m88513V(getWindow(), false);
                FragmentContainerView fragmentContainerView = ((C21037a) c23470p.getValue()).f79752a;
                C5538l c5538l = new C5538l(16);
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                AbstractC16877h0.m47517l(fragmentContainerView, c5538l);
            } catch (Throwable th5) {
                th = th5;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } catch (Throwable th6) {
            th = th6;
            th3 = null;
        }
        objM107888l = AbstractC34132o.m107888l(th);
        super.onCreate(bundle);
        thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a == null) {
            int i14 = StripeException.f22154E;
            m16856o(new C35526b((String) null, 2, AbstractC32123d.m100024d(thM68037a), false, (String) null, (String) null, 121));
            return;
        }
        this.f22358x = (C11496l) objM107888l;
        c23470p = this.f22357w;
        setContentView(((C21037a) c23470p.getValue()).f79752a);
        c11496l = this.f22358x;
        if (c11496l != null) {
            AbstractC22676k.m65757q("args");
            throw th3;
        }
        num = c11496l.f36963G;
        if (num != null) {
            iIntValue = num.intValue();
            if (Build.VERSION.SDK_INT <= 34) {
                window.setStatusBarColor(iIntValue);
            }
        }
        c1643y1 = new C1643y1(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11502r.class), new C11495k(this, 0), new C11494j(this, 0), new C11495k(this, 1));
        c9790n = new C9790n(8, this, c1643y1);
        abstractC21065dRegisterForActivityResult = registerForActivityResult(new ChallengeContract(), new C1904o(c9790n, 2));
        abstractC21065dRegisterForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new C1904o(this, 3));
        if (!((C11502r) c1643y1.getValue()).f36999M) {
            AbstractC1613o1.m5020j(this).m4973b(new C11194d(this, abstractC21065dRegisterForActivityResult, c9790n, abstractC21065dRegisterForActivityResult2, c1643y1, null, 3));
        }
        AbstractC29125c.m88513V(getWindow(), false);
        FragmentContainerView fragmentContainerView2 = ((C21037a) c23470p.getValue()).f79752a;
        C5538l c5538l2 = new C5538l(16);
        WeakHashMap weakHashMap2 = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(fragmentContainerView2, c5538l2);
    }
}
