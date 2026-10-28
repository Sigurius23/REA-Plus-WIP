package q30;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.location.Location;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import aws.smithy.kotlin.runtime.client.endpoints.EndpointProviderException;
import bc3.AbstractC3006f0;
import bf.AbstractC3187b;
import bf.EnumC3188c;
import bg.InterfaceC3212g;
import cg.C4559n;
import cg.C4560o;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC4980k;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.Task;
import com.stripe.android.view.StripeEditText;
import gf.C15760a;
import gf.C15762c;
import gf.InterfaceC15761b;
import ie.EnumC18439b;
import java.io.File;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TimeZone;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import l83.C23467m;
import lb3.AbstractC23811y;
import m83.AbstractC25247g0;
import m83.C25272z;
import mm.C25680d;
import n20.C26175j;
import ne.C26593b;
import np.AbstractC27007l;
import np.BinderC27003h;
import np.C27000e;
import np.C27004i;
import o52.C27567n;
import p014aj.C0928c;
import p036bq.RunnableC3543b;
import p073cq.C11040i;
import p073cq.C11048q;
import p073cq.InterfaceC11035d;
import p088dc.AbstractC11895b;
import p116ef.C13140a;
import p146fe.C14410b;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p184h5.RunnableC16922w0;
import p249jc.AbstractC21598x;
import p249jc.C21567b;
import p309lo.AbstractC24543a;
import p309lo.C24547e;
import p360o8.InterfaceC27649a;
import p412q3.C29875i;
import p413q4.AbstractC29957b;
import p413q4.C29960e;
import p422qe.AbstractC30299b;
import p422qe.C30298a;
import p434qq.InterfaceC30541a;
import p444r.C30811e;
import p444r.C30820n;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;
import p444r.SubMenuC30810d0;
import p444r.ViewOnKeyListenerC30812f;
import p474s.C31960h;
import p474s.InterfaceC31972k;
import p474s.InterfaceC32022w1;
import p503tp.C34039j;
import p505ts.AbstractC34132o;
import p508ty.C34248b;
import p508ty.C34251e;
import p508ty.C34252f;
import p522uf.C34896w;
import p522uf.InterfaceC34875f;
import p529uo.AbstractC35135w;
import p581we.AbstractC37185f;
import p611xd.AbstractC38196a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p719m22.C24947b;
import q83.C30064k;
import q83.InterfaceC30057d;
import q93.C30092p;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import ro.C31619d;
import s30.InterfaceC32099a;
import s40.InterfaceC32146e1;
import s83.AbstractC32269c;
import sn.InterfaceC32760t0;
import tm.C33944v;
import tm.RunnableC33931i;
import to.C34003v;
import to.InterfaceC33987n;
import ub3.InterfaceC34747a;
import ud3.InterfaceC34845v;

/* JADX INFO: renamed from: q30.u0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29934u0 implements InterfaceC16915u, InterfaceC34747a, InterfaceC34875f, InterfaceC30541a, InterfaceC32022w1, InterfaceC34845v, InterfaceC27649a, InterfaceC30829w, InterfaceC31972k, InterfaceC32146e1, InterfaceC32760t0, InterfaceC11035d, InterfaceC33987n {

    /* JADX INFO: renamed from: y */
    public static C29934u0 f122247y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122248w;

    /* JADX INFO: renamed from: x */
    public Object f122249x;

    public /* synthetic */ C29934u0(Object obj, int i13) {
        this.f122248w = i13;
        this.f122249x = obj;
    }

    /* JADX INFO: renamed from: A */
    public C34251e m91525A(C34248b c34248b) {
        C34252f c34252f = (C34252f) this.f122249x;
        c34252f.getClass();
        C23465k c23465k = new C23465k("v2", 1);
        C23465k c23465k2 = new C23465k("tag", "22.6.1");
        C23465k c23465k3 = new C23465k("src", "android-sdk");
        String string = Locale.getDefault().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        C23465k c23465k4 = new C23465k("a", AbstractC25247g0.m73990Y(new C23465k("c", AbstractC31061c.m95645u("v", string)), new C23465k("d", AbstractC31061c.m95645u("v", c34252f.f143672e)), new C23465k("f", AbstractC31061c.m95645u("v", c34252f.f143671d)), new C23465k("g", AbstractC31061c.m95645u("v", c34252f.f143670c))));
        String str = c34248b != null ? c34248b.f143656x : null;
        if (str == null) {
            str = "";
        }
        C23465k c23465k5 = new C23465k("d", str);
        String str2 = c34248b != null ? c34248b.f143657y : null;
        if (str2 == null) {
            str2 = "";
        }
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k5, new C23465k("e", str2), new C23465k("k", c34252f.f143668a), new C23465k("o", Build.VERSION.RELEASE), new C23465k("p", Integer.valueOf(Build.VERSION.SDK_INT)), new C23465k("q", Build.MANUFACTURER), new C23465k("r", Build.BRAND), new C23465k("s", Build.MODEL), new C23465k("t", Build.TAGS));
        String str3 = c34252f.f143669b;
        Map mapM95645u = str3 != null ? AbstractC31061c.m95645u("l", str3) : null;
        if (mapM95645u == null) {
            mapM95645u = C25272z.f99163w;
        }
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("b", AbstractC25247g0.m73995d0(mapM73990Y, mapM95645u)));
        String str4 = c34248b != null ? c34248b.f143655w : null;
        return new C34251e(str4 != null ? str4 : "", mapM73990Y2);
    }

    /* JADX INFO: renamed from: B */
    public File m91526B() {
        return ((File[]) this.f122249x)[0];
    }

    /* JADX INFO: renamed from: C */
    public Typeface m91527C() {
        return (Typeface) this.f122249x;
    }

    /* JADX INFO: renamed from: D */
    public void m91528D(Exception exc) {
        AbstractC24543a.m71578n("MediaCodecAudioRenderer", "Audio sink error", exc);
        C29875i c29875i = ((C33944v) this.f122249x).f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, exc, 7));
        }
    }

    /* JADX INFO: renamed from: E */
    public void m91529E() {
        String string;
        StripeEditText stripeEditText = (StripeEditText) this.f122249x;
        Editable text = stripeEditText.getText();
        if (text == null || (string = text.toString()) == null) {
            string = "";
        }
        if (string.length() > 1) {
            String strSubstring = string.substring(0, string.length() - 1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            stripeEditText.setText(strSubstring);
        }
        stripeEditText.requestFocus();
        stripeEditText.setSelection(stripeEditText.length());
    }

    /* JADX INFO: renamed from: F */
    public void m91530F() {
        ((C34003v) this.f122249x).f142506r.f142427N.post(new RunnableC3543b(this, 27));
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public boolean mo91531a() {
        for (InterfaceC32760t0 interfaceC32760t0 : (InterfaceC32760t0[]) this.f122249x) {
            if (interfaceC32760t0.mo91531a()) {
                return true;
            }
        }
        return false;
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.f122248w) {
            case 26:
                Location location = (Location) this.f122249x;
                C0928c c0928c = (C0928c) ((C27004i) obj).f107683A.f17959E;
                ((C27004i) c0928c.f3421x).m111058c();
                C27000e c27000eM2318a0 = c0928c.m2318a0();
                Parcel parcelM80981s = c27000eM2318a0.m80981s();
                AbstractC27007l.m80996c(parcelM80981s, location);
                c27000eM2318a0.m80980c0(parcelM80981s, 13);
                ((C11040i) obj2).m29687b(null);
                break;
            case 27:
                C34039j c34039j = (C34039j) this.f122249x;
                C27004i c27004i = (C27004i) obj;
                C11048q c11048q = new C11048q(3, (C11040i) obj2);
                c27004i.m111058c();
                AbstractC35135w.m111090b(c34039j != null, "locationSettingsRequest can't be null nor empty.");
                BinderC27003h binderC27003h = new BinderC27003h("com.google.android.gms.location.internal.ISettingsCallbacks", 2);
                binderC27003h.f107682g = c11048q;
                C27000e c27000e = (C27000e) c27004i.m111061j();
                Parcel parcelM80981s2 = c27000e.m80981s();
                AbstractC27007l.m80996c(parcelM80981s2, c34039j);
                AbstractC27007l.m80997d(parcelM80981s2, binderC27003h);
                parcelM80981s2.writeString(null);
                c27000e.m80980c0(parcelM80981s2, 63);
                break;
            default:
                ((FusedLocationProviderClient) this.f122249x).zzd((C27004i) obj, (C11040i) obj2);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0217 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p522uf.InterfaceC34875f
    /* JADX INFO: renamed from: c */
    public Object mo8834c(C34896w request, InterfaceC30057d interfaceC30057d) {
        C30298a c30298a;
        C14410b c14410bM92606a;
        C13140a c13140a;
        C13140a c13140a2;
        C26593b config = (C26593b) this.f122249x;
        if (interfaceC30057d instanceof C30298a) {
            c30298a = (C30298a) interfaceC30057d;
            int i13 = c30298a.f123990z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c30298a.f123990z = i13 - Integer.MIN_VALUE;
            } else {
                c30298a = new C30298a(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c30298a = new C30298a(this, (AbstractC32269c) interfaceC30057d);
        }
        Object c13140a3 = c30298a.f123988x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c30298a.f123990z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(c13140a3);
            AbstractC22676k.m65750j(config, "config");
            AbstractC22676k.m65750j(request, "request");
            String str = config.f105785z;
            Boolean boolValueOf = Boolean.valueOf(config.f105778M);
            Boolean boolValueOf2 = Boolean.valueOf(config.f105779N);
            C4560o c4560o = config.f105773H;
            String str2 = c4560o != null ? c4560o.f18375h : null;
            C21567b c21567b = config.f105772G;
            c30298a.f123987w = request;
            c30298a.f123990z = 1;
            c21567b.getClass();
            C4559n c4559n = C4560o.f18367i;
            if (str2 != null) {
                Boolean bool = Boolean.TRUE;
                if (AbstractC22676k.m65745e(boolValueOf2, bool)) {
                    throw new EndpointProviderException("Invalid Configuration: FIPS and custom endpoint are not supported");
                }
                if (AbstractC22676k.m65745e(boolValueOf, bool)) {
                    throw new EndpointProviderException("Invalid Configuration: Dualstack and custom endpoint are not supported");
                }
                C4560o c4560oM14242a = C4559n.m14242a(c4559n, str2);
                C15762c c15762c = new C15762c();
                C15760a c15760aM9173e = AbstractC3187b.m9173e();
                Boolean bool2 = Boolean.TRUE;
                AbstractC22676k.m65750j(c15760aM9173e, "<this>");
                c15762c.mo33083c(c15760aM9173e, bool2);
                c13140a2 = new C13140a(c4560oM14242a, c15762c);
            } else {
                if (str == null || (c14410bM92606a = AbstractC30299b.m92606a(str)) == null) {
                    throw new EndpointProviderException("Invalid Configuration: Missing Region");
                }
                Boolean bool3 = Boolean.TRUE;
                if (AbstractC22676k.m65745e(boolValueOf2, bool3) && AbstractC22676k.m65745e(boolValueOf, bool3)) {
                    if (!bool3.equals(c14410bM92606a.m41053d()) || !bool3.equals(c14410bM92606a.m41052c())) {
                        throw new EndpointProviderException("FIPS and DualStack are enabled, but this partition does not support one or both");
                    }
                    if (AbstractC22676k.m65745e(str, "us-east-1")) {
                        c13140a3 = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips.us-east-1.amazonaws.com"));
                    } else if (AbstractC22676k.m65745e(str, "us-east-2")) {
                        c13140a3 = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips.us-east-2.amazonaws.com"));
                    } else if (AbstractC22676k.m65745e(str, "us-west-1")) {
                        c13140a3 = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips.us-west-1.amazonaws.com"));
                    } else if (AbstractC22676k.m65745e(str, "us-west-2")) {
                        c13140a3 = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips.us-west-2.amazonaws.com"));
                    } else {
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips." + str + '.' + c14410bM92606a.m41051b()));
                    }
                    if (c13140a3 == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (AbstractC22676k.m65745e(boolValueOf2, bool3)) {
                    if (!AbstractC22676k.m65745e(c14410bM92606a.m41053d(), bool3)) {
                        throw new EndpointProviderException("FIPS is enabled but this partition does not support FIPS");
                    }
                    c13140a = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp-fips." + str + '.' + c14410bM92606a.m41050a()));
                } else if (!AbstractC22676k.m65745e(boolValueOf, bool3)) {
                    c13140a = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp." + str + '.' + c14410bM92606a.m41050a()));
                } else {
                    if (!bool3.equals(c14410bM92606a.m41052c())) {
                        throw new EndpointProviderException("DualStack is enabled but this partition does not support DualStack");
                    }
                    if ("aws".equals(c14410bM92606a.f52561a)) {
                        c13140a2 = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp." + str + ".amazonaws.com"));
                    } else {
                        c13140a = new C13140a(C4559n.m14242a(c4559n, "https://cognito-idp." + str + '.' + c14410bM92606a.m41051b()));
                    }
                }
                c13140a3 = c13140a;
                if (c13140a3 == enumC31071a) {
                    return enumC31071a;
                }
            }
            c13140a3 = c13140a2;
            if (c13140a3 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            request = c30298a.f123987w;
            AbstractC34132o.m107864I(c13140a3);
        }
        C13140a c13140a4 = (C13140a) c13140a3;
        InterfaceC15761b interfaceC15761b = c13140a4.f45449b;
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12495c)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.SERVICE_ENDPOINT_OVERRIDE);
        }
        if (interfaceC15761b.mo33084d(AbstractC3187b.f12494b)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.ACCOUNT_ID_BASED_ENDPOINT);
        }
        C15760a c15760a = AbstractC37185f.f158991d;
        if (interfaceC15761b.mo33084d(c15760a) && AbstractC21598x.m60654J(interfaceC15761b, c15760a).equals("s3express")) {
            AbstractC3187b.m9170b(request.f146962a, EnumC18439b.S3_EXPRESS_BUCKET);
        }
        if (request.f146964c.getAttributes().mo33084d(AbstractC38196a.f163563b)) {
            AbstractC3187b.m9170b(request.f146962a, EnumC3188c.RESOLVED_ACCOUNT_ID);
        }
        return c13140a4;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public long mo91532d() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC32760t0 interfaceC32760t0 : (InterfaceC32760t0[]) this.f122249x) {
            long jMo91532d = interfaceC32760t0.mo91532d();
            if (jMo91532d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo91532d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: g */
    public void mo16445g(MenuC30818l menuC30818l, boolean z4) {
        if (menuC30818l instanceof SubMenuC30810d0) {
            ((SubMenuC30810d0) menuC30818l).f127010A.mo94800l().m94815d(false);
        }
        InterfaceC30829w interfaceC30829w = ((C31960h) this.f122249x).f132682E;
        if (interfaceC30829w != null) {
            interfaceC30829w.mo16445g(menuC30818l, z4);
        }
    }

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: l */
    public void mo83604l() {
    }

    @Override // ud3.InterfaceC34845v
    public List lookup(String hostname) {
        AbstractC22676k.m65750j(hostname, "hostname");
        return (List) AbstractC3006f0.m8699E(C30064k.f122676w, new C26175j(this, hostname, (InterfaceC30057d) null, 24));
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public long mo91533m() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC32760t0 interfaceC32760t0 : (InterfaceC32760t0[]) this.f122249x) {
            long jMo91533m = interfaceC32760t0.mo91533m();
            if (jMo91533m != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo91533m);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public void mo91534n(long j7) {
        for (InterfaceC32760t0 interfaceC32760t0 : (InterfaceC32760t0[]) this.f122249x) {
            interfaceC32760t0.mo91534n(j7);
        }
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        AbstractC29957b abstractC29957b;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f122249x;
        if (!Objects.equals(coordinatorLayout.f5250O, c16905q1)) {
            coordinatorLayout.f5250O = c16905q1;
            boolean z4 = c16905q1.m47600d() > 0;
            coordinatorLayout.f5251P = z4;
            coordinatorLayout.setWillNotDraw(!z4 && coordinatorLayout.getBackground() == null);
            if (!c16905q1.f64864a.mo47545o()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt = coordinatorLayout.getChildAt(i13);
                    WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                    if (childAt.getFitsSystemWindows() && (abstractC29957b = ((C29960e) childAt.getLayoutParams()).f122364a) != null) {
                        c16905q1 = abstractC29957b.m91646j(coordinatorLayout, childAt, c16905q1);
                        if (c16905q1.f64864a.mo47545o()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c16905q1;
    }

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: p */
    public /* bridge */ /* synthetic */ void mo83605p(Object obj) {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f122249x;
        signInHubActivity.setResult(signInHubActivity.f20476z, signInHubActivity.f20472E);
        signInHubActivity.finish();
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        ((CountDownLatch) this.f122249x).countDown();
    }

    @Override // ub3.InterfaceC34747a
    /* JADX INFO: renamed from: r */
    public Iterable mo13799r(Object obj) {
        C30092p c30092p = (C30092p) this.f122249x;
        Collection supertypes = ((InterfaceC31117e) obj).mo60496e().getSupertypes();
        AbstractC22676k.m65749i(supertypes, "getSupertypes(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            InterfaceC31126h interfaceC31126hMo1784d = ((AbstractC23811y) it.next()).mo69844i0().mo1784d();
            InterfaceC31117e interfaceC31117eM92221f = null;
            InterfaceC31126h interfaceC31126hMo78660a = interfaceC31126hMo1784d != null ? interfaceC31126hMo1784d.mo78660a() : null;
            InterfaceC31117e interfaceC31117e = interfaceC31126hMo78660a instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo78660a : null;
            if (interfaceC31117e != null && (interfaceC31117eM92221f = c30092p.m92221f(interfaceC31117e)) == null) {
                interfaceC31117eM92221f = interfaceC31117e;
            }
            if (interfaceC31117eM92221f != null) {
                arrayList.add(interfaceC31117eM92221f);
            }
        }
        return arrayList;
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: s */
    public boolean mo16448s(MenuC30818l menuC30818l) {
        C31960h c31960h = (C31960h) this.f122249x;
        if (menuC30818l == c31960h.f132703y) {
            return false;
        }
        ((SubMenuC30810d0) menuC30818l).f127011B.getClass();
        c31960h.getClass();
        InterfaceC30829w interfaceC30829w = c31960h.f132682E;
        if (interfaceC30829w != null) {
            return interfaceC30829w.mo16448s(menuC30818l);
        }
        return false;
    }

    @Override // p474s.InterfaceC32022w1
    /* JADX INFO: renamed from: t */
    public void mo91535t(MenuC30818l menuC30818l, MenuItem menuItem) {
        ((ViewOnKeyListenerC30812f) this.f122249x).f127016F.removeCallbacksAndMessages(menuC30818l);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public boolean mo91536u(long j7) {
        boolean zMo91536u;
        boolean z4 = false;
        do {
            long jMo91532d = mo91532d();
            if (jMo91532d == Long.MIN_VALUE) {
                return z4;
            }
            zMo91536u = false;
            for (InterfaceC32760t0 interfaceC32760t0 : (InterfaceC32760t0[]) this.f122249x) {
                long jMo91532d2 = interfaceC32760t0.mo91532d();
                boolean z13 = jMo91532d2 != Long.MIN_VALUE && jMo91532d2 <= j7;
                if (jMo91532d2 == jMo91532d || z13) {
                    zMo91536u |= interfaceC32760t0.mo91536u(j7);
                }
            }
            z4 |= zMo91536u;
        } while (zMo91536u);
        return z4;
    }

    @Override // p360o8.InterfaceC27649a
    /* JADX INFO: renamed from: w */
    public C31619d mo83606w() {
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f122249x;
        Set set = AbstractC4980k.f20514a;
        synchronized (set) {
        }
        return new C31619d(signInHubActivity, set);
    }

    @Override // p474s.InterfaceC32022w1
    /* JADX INFO: renamed from: x */
    public void mo91537x(MenuC30818l menuC30818l, C30820n c30820n) {
        ViewOnKeyListenerC30812f viewOnKeyListenerC30812f = (ViewOnKeyListenerC30812f) this.f122249x;
        Handler handler = viewOnKeyListenerC30812f.f127016F;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC30812f.f127018H;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                i13 = -1;
                break;
            } else if (menuC30818l == ((C30811e) arrayList.get(i13)).f127013b) {
                break;
            } else {
                i13++;
            }
        }
        if (i13 == -1) {
            return;
        }
        int i14 = i13 + 1;
        handler.postAtTime(new RunnableC16922w0(this, i14 < arrayList.size() ? (C30811e) arrayList.get(i14) : null, c30820n, menuC30818l), menuC30818l, SystemClock.uptimeMillis() + 200);
    }

    /* JADX INFO: renamed from: y */
    public void m91538y(int i13, boolean z4) {
        C24547e c24547e = (C24547e) this.f122249x;
        if (z4) {
            c24547e.m71592a(i13);
        } else {
            c24547e.getClass();
        }
    }

    /* JADX INFO: renamed from: z */
    public Object m91539z(Object obj) {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2) {
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
        return C27567n.m83212P0((C24947b) ((C25680d) this.f122249x).f101015x, objArr[0], objArr[1]);
    }

    public C29934u0(int i13) {
        this.f122248w = i13;
        switch (i13) {
            case 10:
                this.f122249x = new C24547e(0);
                break;
            case 14:
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC32099a.class);
                AbstractC22676k.m65749i(serviceLoaderLoad, "load(...)");
                this.f122249x = serviceLoaderLoad;
                break;
        }
    }

    public C29934u0(StripeEditText backUpTarget) {
        this.f122248w = 15;
        AbstractC22676k.m65750j(backUpTarget, "backUpTarget");
        this.f122249x = backUpTarget;
    }

    public C29934u0(Context context) {
        Object objM107888l;
        String timeZone;
        this.f122248w = 29;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        AbstractC22676k.m65749i(displayMetrics, "getDisplayMetrics(...)");
        String packageName = context.getPackageName();
        packageName = packageName == null ? "" : packageName;
        try {
            objM107888l = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        PackageInfo packageInfo = (PackageInfo) (objM107888l instanceof C23467m ? null : objM107888l);
        String str = packageInfo != null ? packageInfo.versionName : null;
        int iConvert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
        if (iConvert % 60 == 0) {
            timeZone = String.valueOf(iConvert / 60);
        } else {
            timeZone = new BigDecimal(iConvert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            AbstractC22676k.m65749i(timeZone, "toString(...)");
        }
        AbstractC22676k.m65750j(timeZone, "timeZone");
        C34252f c34252f = new C34252f();
        c34252f.f143668a = packageName;
        c34252f.f143669b = str;
        c34252f.f143670c = timeZone;
        c34252f.f143671d = displayMetrics.widthPixels + "w_" + displayMetrics.heightPixels + "h_" + displayMetrics.densityDpi + "dpi";
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        int i13 = Build.VERSION.SDK_INT;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Android ", str2, " ", str3, " ");
        sbM32001t.append(i13);
        c34252f.f143672e = sbM32001t.toString();
        this.f122249x = c34252f;
    }

    public C29934u0(Application appContext) {
        this.f122248w = 21;
        AbstractC22676k.m65750j(appContext, "appContext");
        this.f122249x = appContext;
    }

    public C29934u0(C26593b config) {
        this.f122248w = 3;
        AbstractC22676k.m65750j(config, "config");
        this.f122249x = config;
    }

    public C29934u0(InterfaceC3212g hr3) {
        this.f122248w = 9;
        AbstractC22676k.m65750j(hr3, "hr");
        this.f122249x = hr3;
    }
}
