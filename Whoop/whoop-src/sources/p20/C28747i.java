package p20;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.C1601k1;
import b20.C2326f;
import d10.AbstractC11464a;
import e10.C12568r0;
import h20.C16757w3;
import n10.C26135j0;
import n20.C26169d;
import ng3.C26702o;
import p537ux.C35362x;
import p537ux.C35363y;
import p599wz.C37734l1;
import p631xz.C38721f0;
import p631xz.C38737n0;
import p665yz.C39898a;
import p665yz.C39899b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;
import t10.C33283c;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import x30.C37929t0;

/* JADX INFO: renamed from: p20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C28747i implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116436w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f116437x;

    public /* synthetic */ C28747i(InterfaceC35521h interfaceC35521h, int i13) {
        this.f116436w = i13;
        this.f116437x = interfaceC35521h;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f116436w) {
            case 0:
                Context appContext = (Context) this.f116437x.get();
                AbstractC22676k.m65750j(appContext, "appContext");
                C35363y c35363y = C35363y.f150632y;
                if (c35363y == null) {
                    SharedPreferences sharedPreferences = new C35362x(appContext).f150631a;
                    String string = sharedPreferences.getString("key_publishable_key", null);
                    c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
                    if (c35363y == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y;
                }
                return c35363y;
            case 1:
                InterfaceC35521h paymentConfiguration = this.f116437x;
                AbstractC22676k.m65750j(paymentConfiguration, "paymentConfiguration");
                return new C26135j0(paymentConfiguration, 3);
            case 2:
                String paymentElementCallbackIdentifier = (String) this.f116437x.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier);
                return null;
            case 3:
                C1601k1 savedStateHandle = (C1601k1) this.f116437x.get();
                AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
                return new C38721f0(savedStateHandle);
            case 4:
                C16757w3 args = (C16757w3) this.f116437x.get();
                AbstractC22676k.m65750j(args, "args");
                String str = args.f64384y;
                AbstractC32309k.m100574c(str);
                return str;
            case 5:
                Context appContext2 = (Context) this.f116437x.get();
                AbstractC22676k.m65750j(appContext2, "appContext");
                C35363y c35363y2 = C35363y.f150632y;
                if (c35363y2 == null) {
                    SharedPreferences sharedPreferences2 = new C35362x(appContext2).f150631a;
                    String string2 = sharedPreferences2.getString("key_publishable_key", null);
                    c35363y2 = string2 != null ? new C35363y(string2, sharedPreferences2.getString("key_account_id", null)) : null;
                    if (c35363y2 == null) {
                        throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
                    }
                    C35363y.f150632y = c35363y2;
                }
                return c35363y2;
            case 6:
                String paymentElementCallbackIdentifier2 = (String) this.f116437x.get();
                AbstractC22676k.m65750j(paymentElementCallbackIdentifier2, "paymentElementCallbackIdentifier");
                AbstractC11464a.m30761a(paymentElementCallbackIdentifier2);
                return null;
            case 7:
                C12568r0 confirmationHandler = (C12568r0) this.f116437x.get();
                AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
                return new C33283c(confirmationHandler);
            case 8:
                C1601k1 savedStateHandle2 = (C1601k1) this.f116437x.get();
                AbstractC22676k.m65750j(savedStateHandle2, "savedStateHandle");
                return new C38721f0(savedStateHandle2);
            case 9:
                return new C37734l1((C26169d) this.f116437x.get());
            case 10:
                return new C37929t0((C2326f) this.f116437x.get());
            case 11:
                return new C38737n0((Context) this.f116437x.get());
            default:
                return new C39898a((C39899b) this.f116437x.get());
        }
    }

    public C28747i(C26702o c26702o, C35518e c35518e) {
        this.f116436w = 4;
        this.f116437x = c35518e;
    }
}
