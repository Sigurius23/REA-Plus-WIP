package hj0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import nf1.AbstractC26660a;
import p479s4.AbstractC32122c;

/* JADX INFO: renamed from: hj0.q */
/* JADX INFO: loaded from: classes.dex */
public class C17358q {

    /* JADX INFO: renamed from: a */
    private Context f67275a;

    /* JADX INFO: renamed from: b */
    private Intent f67276b;

    /* JADX INFO: renamed from: c */
    private ActivityOptionsCompat f67277c;

    public C17358q(Context context, Class<?> cls) {
        m49153l(context);
        this.f67276b = new Intent(context, cls);
    }

    /* JADX INFO: renamed from: g */
    private ActivityOptionsCompat m49143g() {
        return this.f67277c;
    }

    /* JADX INFO: renamed from: a */
    public C17358q m49144a() {
        this.f67276b.addFlags(32768);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C17358q m49145b() {
        this.f67276b.addFlags(67108864);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public C17358q m49146c() {
        m49150i().addFlags(268435456);
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C17358q m49147d() {
        m49152k(ActivityOptionsCompat.makeCustomAnimation(this.f67275a, AbstractC26660a.f105967l, AbstractC26660a.f105974s));
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C17358q m49148e() {
        AbstractActivityC17347f.m49094y(m49150i());
        m49152k(ActivityOptionsCompat.makeCustomAnimation(this.f67275a, AbstractC26660a.f105970o, AbstractC26660a.f105972q));
        return this;
    }

    /* JADX INFO: renamed from: f */
    public Intent mo23852f() {
        return m49150i();
    }

    /* JADX INFO: renamed from: h */
    public Context m49149h() {
        return this.f67275a;
    }

    /* JADX INFO: renamed from: i */
    public Intent m49150i() {
        return this.f67276b;
    }

    /* JADX INFO: renamed from: j */
    public void m49151j() {
        this.f67275a = null;
    }

    /* JADX INFO: renamed from: k */
    public void m49152k(ActivityOptionsCompat activityOptionsCompat) {
        this.f67277c = activityOptionsCompat;
    }

    /* JADX INFO: renamed from: l */
    public void m49153l(Context context) {
        this.f67275a = context;
    }

    /* JADX INFO: renamed from: m */
    public void m49154m() {
        ActivityOptionsCompat activityOptionsCompatM49143g = m49143g();
        if (activityOptionsCompatM49143g == null) {
            this.f67275a.startActivity(mo23852f());
            return;
        }
        try {
            AbstractC32122c.startActivity(this.f67275a, mo23852f(), activityOptionsCompatM49143g.toBundle());
        } catch (NullPointerException e5) {
            if (!e5.getMessage().contains("setPausedForTransition")) {
                throw e5;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m49155n(Activity activity, int i13) {
        ActivityOptionsCompat activityOptionsCompatM49143g = m49143g();
        if (activityOptionsCompatM49143g == null) {
            activity.startActivityForResult(mo23852f(), i13);
        } else {
            ActivityCompat.startActivityForResult(activity, mo23852f(), i13, activityOptionsCompatM49143g.toBundle());
        }
    }

    /* JADX INFO: renamed from: o */
    public C17358q m49156o(Uri uri) {
        this.f67276b.setData(uri);
        return this;
    }

    /* JADX INFO: renamed from: p */
    public C17358q m49157p(Bundle bundle) {
        this.f67276b.setExtrasClassLoader(getClass().getClassLoader());
        this.f67276b.putExtras(bundle);
        return this;
    }

    public C17358q(Context context, Intent intent) {
        m49153l(context);
        this.f67276b = intent;
    }

    public C17358q(Context context, String str) {
        this(context, new Intent(str));
    }
}
