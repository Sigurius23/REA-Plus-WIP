package c20;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.C1601k1;
import bi.AbstractC3269g;
import h20.C16652f0;
import i20.C17932c0;
import i20.C17970p0;
import n10.C26138l;
import n10.C26140m;
import n20.C26186u;
import p078d1.C11457j;
import p537ux.C35362x;
import p537ux.C35363y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import s10.C32064f;
import s93.AbstractC32309k;
import sz.C33127e;
import v00.C35459c0;
import v03.C35518e;
import v03.InterfaceC35517d;
import v10.C35525a;

/* JADX INFO: renamed from: c20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C3879g implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f15871w;

    /* JADX INFO: renamed from: x */
    public final C35518e f15872x;

    public /* synthetic */ C3879g(Object obj, C35518e c35518e, int i13) {
        this.f15871w = i13;
        this.f15872x = c35518e;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f15871w) {
            case 0:
                return new C11457j((InterfaceC30063j) this.f15872x.f151137w);
            case 1:
                Context context = (Context) this.f15872x.f151137w;
                AbstractC22676k.m65750j(context, "context");
                String packageName = context.getPackageName();
                AbstractC22676k.m65749i(packageName, "getPackageName(...)");
                return new C35525a(packageName);
            case 2:
                Application application = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application, "application");
                return application;
            case 3:
                Application application2 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application2, "application");
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(application2).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                }
                return c35363y;
            case 4:
                return new C26140m((C26138l) this.f15872x.f151137w);
            case 5:
                Application application3 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application3, "application");
                Context applicationContext = application3.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
                return applicationContext;
            case 6:
                C26186u viewModel = (C26186u) this.f15872x.f151137w;
                AbstractC22676k.m65750j(viewModel, "viewModel");
                C1601k1 c1601k1 = viewModel.f103861x;
                AbstractC32309k.m100574c(c1601k1);
                return c1601k1;
            case 7:
                C17932c0 args = (C17932c0) this.f15872x.f151137w;
                AbstractC22676k.m65750j(args, "args");
                return new C17970p0(args.f69693x);
            case 8:
                Application application4 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application4, "application");
                Context applicationContext2 = application4.getApplicationContext();
                AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
                return applicationContext2;
            case 9:
                C16652f0 args2 = (C16652f0) this.f15872x.f151137w;
                AbstractC22676k.m65750j(args2, "args");
                String str = args2.f64029G;
                AbstractC32309k.m100574c(str);
                return str;
            case 10:
                Application application5 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application5, "application");
                return application5;
            case 11:
                return new C32064f((C1601k1) this.f15872x.f151137w);
            case 12:
                return new C33127e((Context) this.f15872x.f151137w);
            case 13:
                Application application6 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application6, "application");
                return application6;
            case 14:
                C35459c0 paymentMethodMetadata = (C35459c0) this.f15872x.f151137w;
                AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
                return AbstractC3269g.m9493Z(paymentMethodMetadata);
            case 15:
                Application application7 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application7, "application");
                return application7;
            default:
                Application application8 = (Application) this.f15872x.f151137w;
                AbstractC22676k.m65750j(application8, "application");
                return application8;
        }
    }

    public /* synthetic */ C3879g(C35518e c35518e, int i13) {
        this.f15871w = i13;
        this.f15872x = c35518e;
    }
}
