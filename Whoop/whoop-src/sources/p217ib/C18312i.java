package p217ib;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import p097ds.RunnableC12316s;
import p412q3.C29875i;
import p600x.AbstractC37787b;
import p600x.AbstractC37788c;
import p600x.AbstractC37789d;
import p600x.C37786a;

/* JADX INFO: renamed from: ib.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C18312i {

    /* JADX INFO: renamed from: a */
    public int f71286a;

    /* JADX INFO: renamed from: b */
    public boolean f71287b;

    /* JADX INFO: renamed from: c */
    public final Object f71288c;

    /* JADX INFO: renamed from: d */
    public final Object f71289d;

    /* JADX INFO: renamed from: e */
    public Object f71290e;

    /* JADX INFO: renamed from: f */
    public Object f71291f;

    public C18312i(AbstractC18302a0 abstractC18302a0, int i13, Executor executor, AbstractC18314k abstractC18314k) {
        this.f71290e = new Object();
        this.f71287b = false;
        this.f71288c = abstractC18302a0;
        this.f71286a = i13;
        this.f71291f = executor;
        this.f71289d = abstractC18314k;
    }

    /* JADX INFO: renamed from: a */
    public C29875i m52714a() {
        Intent intent = (Intent) this.f71288c;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f71287b);
        intent.putExtras(((C37786a) this.f71289d).m121286a().m121288c());
        Bundle bundle2 = (Bundle) this.f71291f;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f71286a);
        int i13 = Build.VERSION.SDK_INT;
        String strM121290a = AbstractC37788c.m121290a();
        if (!TextUtils.isEmpty(strM121290a)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strM121290a);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i13 >= 34) {
            if (((ActivityOptions) this.f71290e) == null) {
                this.f71290e = AbstractC37787b.m121289a();
            }
            AbstractC37789d.m121291a((ActivityOptions) this.f71290e, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.f71290e;
        return new C29875i(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    /* JADX INFO: renamed from: b */
    public void m52715b(C18315l c18315l) {
        Executor executor;
        synchronized (this.f71290e) {
            if (this.f71287b) {
                throw new IllegalStateException("callback.onResult already called, cannot call again.");
            }
            this.f71287b = true;
            executor = (Executor) this.f71291f;
        }
        if (executor == null) {
            ((AbstractC18314k) this.f71289d).mo52710a(this.f71286a, c18315l);
        } else {
            executor.execute(new RunnableC12316s(this, c18315l, false, 10));
        }
    }

    /* JADX INFO: renamed from: c */
    public void m52716c(C37786a c37786a) {
        this.f71291f = c37786a.m121288c();
    }

    /* JADX INFO: renamed from: d */
    public void m52717d() {
        Intent intent = (Intent) this.f71288c;
        this.f71286a = 2;
        intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
    }

    /* JADX INFO: renamed from: e */
    public void m52718e() {
        ((Intent) this.f71288c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
    }

    public C18312i() {
        this.f71288c = new Intent("android.intent.action.VIEW");
        this.f71289d = new C37786a();
        this.f71286a = 0;
        this.f71287b = true;
    }
}
