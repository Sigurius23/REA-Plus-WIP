package h20;

import a30.C0320q0;
import a30.C0332w0;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.view.Window;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.android.R;
import g32.C15314n;
import p236j.AbstractC21065d;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32417h;

/* JADX INFO: renamed from: h20.r3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16727r3 {

    /* JADX INFO: renamed from: a */
    public final C0332w0 f64274a;

    public C16727r3(C0332w0 c0332w0) {
        this.f64274a = c0332w0;
    }

    /* JADX INFO: renamed from: a */
    public final void m47259a(C16744u2 intentConfiguration, C16761x1 c16761x1) {
        Window window;
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        C0320q0 c0320q0 = new C0320q0(intentConfiguration);
        C0332w0 c0332w0 = this.f64274a;
        Activity activity = (Activity) c0332w0.f1169y;
        if (c16761x1 == null) {
            c16761x1 = AbstractC32417h.m101217z(activity);
        }
        C16761x1 c16761x2 = c16761x1;
        AbstractC22676k.m65750j(activity, "activity");
        Integer numValueOf = null;
        if (Build.VERSION.SDK_INT <= 34 && (window = activity.getWindow()) != null) {
            numValueOf = Integer.valueOf(window.getStatusBarColor());
        }
        C16757w3 c16757w3 = new C16757w3(c0320q0, c16761x2, (String) c0332w0.f1170z, numValueOf, true);
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(((Application) c0332w0.f1165F).getApplicationContext(), R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
        AbstractC22676k.m65749i(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        try {
            ((AbstractC21065d) c0332w0.f1168x).mo4052a(c16757w3, activityOptionsCompatMakeCustomAnimation);
        } catch (IllegalStateException e5) {
            ((C15314n) c0332w0.f1166G).mo43511a(new C16626a4(new IllegalStateException("The host activity is not in a valid state (" + ((InterfaceC1585g0) c0332w0.f1164E).getLifecycle().getCurrentState() + ").", e5)));
        }
    }
}
