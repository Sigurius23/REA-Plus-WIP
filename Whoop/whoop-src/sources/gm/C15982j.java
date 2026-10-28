package gm;

import a00.C0072g;
import a30.C0332w0;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b30.C2570m;
import com.stripe.android.model.StripeIntent$Status;
import com.whoop.android.R;
import f93.C14289a;
import g73.C15556d;
import hm.C17417d;
import hn.C17494b;
import im.C18652a;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k83.InterfaceC22297a;
import m63.C25126d;
import m83.AbstractC25265s;
import p215i9.InterfaceC18234j;
import p215i9.InterfaceC18235k;
import p320m5.C25068l;
import p320m5.InterfaceC25065i;
import p344nm.C26823e;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p547v8.AbstractC35785b;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p623xr.InterfaceC38616l;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qg3.C30352d;
import y00.C38830f6;
import y00.C38840g6;
import y00.C38857i3;
import y00.C38887l3;
import y00.C38915o4;
import y00.C38981v7;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: gm.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C15982j implements InterfaceC18234j, InterfaceC38616l {

    /* JADX INFO: renamed from: w */
    public Context f60491w;

    public /* synthetic */ C15982j(Context context, byte b) {
        this.f60491w = context;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC25065i m45126d(C15982j c15982j) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            C25068l c25068l = new C25068l(c15982j.f60491w);
            C25068l c25068l2 = c25068l.isAvailableOnDevice() ? c25068l : null;
            return c25068l2 == null ? c15982j.m45130f() : c25068l2;
        }
        if (i13 <= 33) {
            return c15982j.m45130f();
        }
        return null;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public Object mo45127a() {
        return this.f60491w;
    }

    /* JADX INFO: renamed from: b */
    public C15983k m45128b() {
        Context context = this.f60491w;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C15983k c15983k = new C15983k();
        c15983k.f60494w = C18652a.m54083a(AbstractC15986n.f60500a);
        C14289a c14289a = new C14289a(context, 1);
        c15983k.f60495x = c14289a;
        c15983k.f60496y = C18652a.m54083a(new C20378c(18, c14289a, new C17417d(c14289a, 0)));
        C14289a c14289a2 = c15983k.f60495x;
        c15983k.f60497z = new C26823e(c14289a2, 1);
        InterfaceC22297a interfaceC22297aM54083a = C18652a.m54083a(new C30352d(25, c15983k.f60497z, C18652a.m54083a(new C26823e(c14289a2, 0))));
        c15983k.f60492E = interfaceC22297aM54083a;
        C15556d c15556d = new C15556d(21);
        C14289a c14289a3 = c15983k.f60495x;
        C15990r c15990r = new C15990r(c14289a3, interfaceC22297aM54083a, c15556d, 14);
        InterfaceC22297a interfaceC22297a = c15983k.f60494w;
        InterfaceC22297a interfaceC22297a2 = c15983k.f60496y;
        c15983k.f60493F = C18652a.m54083a(new C15990r(new C2570m(interfaceC22297a, interfaceC22297a2, c15990r, interfaceC22297aM54083a, interfaceC22297aM54083a, 7), new C25126d(c14289a3, interfaceC22297a2, interfaceC22297aM54083a, c15990r, interfaceC22297a, interfaceC22297aM54083a, interfaceC22297aM54083a), new C0072g(interfaceC22297a, interfaceC22297aM54083a, c15990r, interfaceC22297aM54083a, 24), 0));
        return c15983k;
    }

    /* JADX INFO: renamed from: c */
    public String m45129c(InterfaceC38802c8 intent, int i13) {
        C38915o4 c38915o4;
        EnumC38828f4 enumC38828f4;
        Context context = this.f60491w;
        AbstractC22676k.m65750j(intent, "intent");
        if (i13 == 4) {
            return context.getResources().getString(R.string.stripe_failure_reason_timed_out);
        }
        C38915o4 c38915o4Mo124330Y = intent.mo124330Y();
        if (((c38915o4Mo124330Y != null ? c38915o4Mo124330Y.f167511E : null) != EnumC38828f4.f167090I || !(intent.mo124335m() instanceof C38981v7)) && (intent.mo124331c() == StripeIntent$Status.RequiresPaymentMethod || intent.mo124331c() == StripeIntent$Status.RequiresAction)) {
            if (intent instanceof C38887l3) {
                C38887l3 c38887l3 = (C38887l3) intent;
                StripeIntent$Status stripeIntent$Status = c38887l3.f167382Q;
                C38857i3 c38857i3 = c38887l3.f167384S;
                if (stripeIntent$Status != StripeIntent$Status.RequiresAction || ((c38915o4 = c38887l3.f167379N) != null && (enumC38828f4 = c38915o4.f167511E) != null && enumC38828f4.f167133x)) {
                    if (!AbstractC22676k.m65745e(c38857i3 != null ? c38857i3.f167275x : null, "payment_intent_authentication_failure")) {
                        if (c38857i3 != null) {
                            AbstractC22676k.m65750j(context, "context");
                            return AbstractC35785b.m113428w(context, c38857i3.f167270E, c38857i3.f167275x, c38857i3.f167276y);
                        }
                    }
                }
                return context.getResources().getString(R.string.stripe_failure_reason_authentication);
            }
            if (!(intent instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            C38830f6 c38830f6 = ((C38840g6) intent).f167174M;
            if (AbstractC22676k.m65745e(c38830f6 != null ? c38830f6.f167141w : null, "setup_intent_authentication_failure")) {
                return context.getResources().getString(R.string.stripe_failure_reason_authentication);
            }
            if (c38830f6 != null) {
                AbstractC22676k.m65750j(context, "context");
                return AbstractC35785b.m113428w(context, c38830f6.f167144z, c38830f6.f167141w, c38830f6.f167142x);
            }
        }
        return null;
    }

    @Override // p215i9.InterfaceC18234j
    /* JADX INFO: renamed from: e */
    public InterfaceC18235k mo43808e(C0332w0 c0332w0) {
        Context context;
        int i13 = AbstractC38065t.f163031a;
        if (i13 < 23 || (i13 < 31 && ((context = this.f60491w) == null || i13 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new C15556d(6).mo43808e(c0332w0);
        }
        int iM109376i = AbstractC34587d0.m109376i(((C34610p) c0332w0.f1170z).f145783n);
        AbstractC38046a.m121818m("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC38065t.m121887A(iM109376i));
        return new C30352d(17, new C17494b(iM109376i, 2), new C17494b(iM109376i, 3)).mo43808e(c0332w0);
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC25065i m45130f() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f60491w;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listM74093D1 = AbstractC25265s.m74093D1(arrayList);
        if (listM74093D1.isEmpty()) {
            return null;
        }
        Iterator it = listM74093D1.iterator();
        InterfaceC25065i interfaceC25065i = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                InterfaceC25065i interfaceC25065i2 = (InterfaceC25065i) objNewInstance;
                if (!interfaceC25065i2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (interfaceC25065i != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    interfaceC25065i = interfaceC25065i2;
                }
            } catch (Throwable unused) {
            }
        }
        return interfaceC25065i;
    }

    public C15982j(Context context, int i13) {
        switch (i13) {
            case 5:
                AbstractC22676k.m65750j(context, "context");
                this.f60491w = context;
                break;
            default:
                AbstractC22676k.m65750j(context, "context");
                this.f60491w = context;
                break;
        }
    }
}
