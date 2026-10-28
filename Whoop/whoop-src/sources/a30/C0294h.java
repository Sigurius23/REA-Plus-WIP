package a30;

import al0.C0971f;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1640x1;
import b00.C2179a;
import bz.C3710i;
import c00.C3797c;
import c20.AbstractC3877e;
import c20.C3875c;
import c20.C3880h;
import com.stripe.android.shoppay.ShopPayActivityContract;
import d10.AbstractC11464a;
import e10.C12554k0;
import g10.C15215a;
import h20.C16652f0;
import h20.C16663h;
import h20.C16759x;
import j20.C21241c;
import java.util.Set;
import l83.C23467m;
import m40.C25046w;
import n20.C26173h;
import n20.C26186u;
import p000.C26047n;
import p108e4.AbstractC12667a;
import p442qy.C30766e;
import p505ts.AbstractC34132o;
import p537ux.C35362x;
import p537ux.C35363y;
import p599wz.C37718g0;
import p599wz.C37734l1;
import p631xz.C38747x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import s93.AbstractC32309k;
import t40.C33536f;
import v00.C35459c0;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import v10.C35525a;
import z20.C40013g;

/* JADX INFO: renamed from: a30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C0294h implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1029w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f1030x;

    public /* synthetic */ C0294h(Object obj, InterfaceC35521h interfaceC35521h, int i13) {
        this.f1029w = i13;
        this.f1030x = interfaceC35521h;
    }

    /* JADX INFO: renamed from: a */
    public static C33536f m824a(Application context) {
        C33536f c33536f;
        AbstractC22676k.m65750j(context, "context");
        C3797c c3797c = C3797c.f15536a;
        C33536f c33536f2 = C3797c.f15537b;
        if (c33536f2 != null) {
            return c33536f2;
        }
        synchronized (c3797c) {
            c33536f = C3797c.f15537b;
            if (c33536f == null) {
                c33536f = new C33536f(new C26047n(27), new C29934u0(context));
                C3797c.f15537b = c33536f;
            }
        }
        return c33536f;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        Object objM107888l;
        C0290f1 c0290f1;
        int i13 = this.f1029w;
        InterfaceC35521h interfaceC35521h = this.f1030x;
        switch (i13) {
            case 0:
                return new C0291g((C37734l1) interfaceC35521h.get());
            case 1:
                return new C0286e0((C40013g) interfaceC35521h.get());
            case 2:
                return new C2179a((C37718g0) interfaceC35521h.get());
            case 3:
                return new C3710i((Context) interfaceC35521h.get());
            case 4:
                return ((Boolean) interfaceC35521h.get()).booleanValue() ? C30766e.f126696a : C30766e.f126697b;
            case 5:
                Context appContext = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(appContext, "appContext");
                C35363y c35363y = C35363y.f150632y;
                if (c35363y != null) {
                    return c35363y;
                }
                SharedPreferences sharedPreferences = new C35362x(appContext).f150631a;
                String string = sharedPreferences.getString("key_publishable_key", null);
                C35363y c35363y2 = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                if (c35363y2 == null) {
                    throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                }
                C35363y.f150632y = c35363y2;
                return c35363y2;
            case 6:
                String paymentElementCallbackIdentifier = (String) interfaceC35521h.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier);
                return null;
            case 7:
                C38747x linkAccountManager = (C38747x) interfaceC35521h.get();
                AbstractC22676k.m65750j(linkAccountManager, "linkAccountManager");
                return new C15215a(linkAccountManager);
            case 8:
                return m824a((Application) interfaceC35521h.get());
            case 9:
                return new C3875c((Function1) interfaceC35521h.get());
            case 10:
                return new C3880h((Function1) interfaceC35521h.get());
            case 11:
                Context context = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(context, "context");
                Resources resources = context.getResources();
                AbstractC22676k.m65749i(resources, "getResources(...)");
                return resources;
            case 12:
                return new C12554k0((C16663h) interfaceC35521h.get());
            case 13:
                Context context2 = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(context2, "context");
                String packageName = context2.getPackageName();
                AbstractC22676k.m65749i(packageName, "getPackageName(...)");
                return new C35525a(packageName);
            case 14:
                Context context3 = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(context3, "context");
                return Boolean.valueOf(AbstractC12667a.m35436G(context3));
            case 15:
                Object unsupportedNextActionHandler = (C3880h) interfaceC35521h.get();
                AbstractC22676k.m65750j(unsupportedNextActionHandler, "unsupportedNextActionHandler");
                try {
                    Object objNewInstance = Class.forName("com.stripe.android.payments.wechatpay.WeChatPayNextActionHandler").getConstructor(null).newInstance(null);
                    AbstractC22676k.m65748h(objNewInstance, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentNextActionHandler<com.stripe.android.model.StripeIntent>");
                    objM107888l = (AbstractC3877e) objNewInstance;
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (!(objM107888l instanceof C23467m)) {
                    unsupportedNextActionHandler = objM107888l;
                }
                return (AbstractC3877e) unsupportedNextActionHandler;
            case 16:
                return new C16759x((C37734l1) interfaceC35521h.get());
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new ShopPayActivityContract((String) interfaceC35521h.get());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                String paymentElementCallbackIdentifier2 = (String) interfaceC35521h.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier2, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier2);
                return null;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String paymentElementCallbackIdentifier3 = (String) interfaceC35521h.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier3, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier3);
                return null;
            case 20:
                Application application = (Application) interfaceC35521h.get();
                AbstractC22676k.m65750j(application, "application");
                String packageName2 = application.getPackageName();
                AbstractC22676k.m65749i(packageName2, "getPackageName(...)");
                return packageName2;
            case 21:
                C26186u viewModel = (C26186u) interfaceC35521h.get();
                AbstractC22676k.m65750j(viewModel, "viewModel");
                C26173h c26173hM77735g = viewModel.m77735g();
                if (c26173hM77735g == null || (c0290f1 = c26173hM77735g.f103767w) == null) {
                    return null;
                }
                return c0290f1.f1019E;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                Context context4 = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(context4, "context");
                return new C25046w(context4, 30);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C26186u viewModel2 = (C26186u) interfaceC35521h.get();
                AbstractC22676k.m65750j(viewModel2, "viewModel");
                return AbstractC1640x1.m5043b(viewModel2);
            case 24:
                String paymentElementCallbackIdentifier4 = (String) interfaceC35521h.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier4, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier4);
                return null;
            case 25:
                return new C15215a((C38747x) interfaceC35521h.get());
            case 26:
                C21241c defaultAddressLauncherEventReporter = (C21241c) interfaceC35521h.get();
                AbstractC22676k.m65750j(defaultAddressLauncherEventReporter, "defaultAddressLauncherEventReporter");
                return defaultAddressLauncherEventReporter;
            case 27:
                Context context5 = (Context) interfaceC35521h.get();
                AbstractC22676k.m65750j(context5, "context");
                return new C0971f(context5, 8);
            case 28:
                C16652f0 args = (C16652f0) interfaceC35521h.get();
                AbstractC22676k.m65750j(args, "args");
                C35459c0 c35459c0 = args.f64030w.f1019E;
                AbstractC32309k.m100574c(c35459c0);
                return c35459c0;
            default:
                C16652f0 args2 = (C16652f0) interfaceC35521h.get();
                AbstractC22676k.m65750j(args2, "args");
                Set set = args2.f64028F;
                AbstractC32309k.m100574c(set);
                return set;
        }
    }

    public /* synthetic */ C0294h(InterfaceC35521h interfaceC35521h, int i13) {
        this.f1029w = i13;
        this.f1030x = interfaceC35521h;
    }
}
