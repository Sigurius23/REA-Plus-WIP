package p314m;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import live.hms.video.factories.C24148c;
import p043c4.C3978u;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: m.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24863v {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m72891a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m72892b(Object obj, LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0) {
        Objects.requireNonNull(layoutInflaterFactory2C24829a0);
        C3978u c3978u = new C3978u(layoutInflaterFactory2C24829a0, 3);
        C24148c.m71063i(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, c3978u);
        return c3978u;
    }

    /* JADX INFO: renamed from: c */
    public static void m72893c(Object obj, Object obj2) {
        C24148c.m71063i(obj).unregisterOnBackInvokedCallback(C24148c.m71062h(obj2));
    }
}
