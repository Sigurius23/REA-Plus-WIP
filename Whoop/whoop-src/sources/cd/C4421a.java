package cd;

import android.content.Context;
import android.content.SharedPreferences;
import p537ux.C35362x;
import p537ux.C35363y;
import p715kotlin.jvm.internal.AbstractC22676k;
import re.C31254a0;
import re.C31267e1;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: cd.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C4421a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f17884a;

    /* JADX INFO: renamed from: b */
    public String f17885b;

    /* JADX INFO: renamed from: c */
    public String f17886c;

    /* JADX INFO: renamed from: d */
    public String f17887d;

    /* JADX INFO: renamed from: a */
    public C31254a0 m13866a() {
        return new C31254a0(this);
    }

    /* JADX INFO: renamed from: b */
    public C31267e1 m13867b() {
        return new C31267e1(this);
    }

    /* JADX INFO: renamed from: c */
    public void m13868c(String str) {
        switch (this.f17884a) {
            case 3:
                this.f17885b = str;
                break;
            default:
                this.f17885b = str;
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m13869d(String str) {
        this.f17886c = str;
    }

    /* JADX INFO: renamed from: e */
    public void m13870e(String str) {
        this.f17887d = str;
    }

    /* JADX INFO: renamed from: f */
    public void m13871f(String str) {
        this.f17886c = str;
    }

    /* JADX INFO: renamed from: g */
    public void m13872g(String str) {
        this.f17887d = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4421a(Context context) {
        this.f17884a = 5;
        AbstractC22676k.m65750j(context, "context");
        C35363y c35363y = C35363y.f150632y;
        if (c35363y == null) {
            SharedPreferences sharedPreferences = new C35362x(context).f150631a;
            String string = sharedPreferences.getString("key_publishable_key", null);
            c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
            if (c35363y == null) {
                throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
            }
            C35363y.f150632y = c35363y;
        }
        this(c35363y.f150633w, c35363y.f150634x);
    }

    public C4421a(String publishableKey, String str) {
        this.f17884a = 5;
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f17885b = str;
        if (!AbstractC39414r.m125890i0(publishableKey)) {
            if (!AbstractC39421y.m125930O(publishableKey, "sk_", false)) {
                if (!AbstractC39421y.m125930O(publishableKey, "rk_", false)) {
                    this.f17886c = publishableKey;
                    this.f17887d = "22.6.1";
                    return;
                }
                throw new IllegalArgumentException("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
            }
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
    }
}
