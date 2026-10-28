package p474s;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p043c4.C3978u;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: s.o2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC31991o2 {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m99501a(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static OnBackInvokedCallback m99502b(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C3978u(runnable, 4);
    }

    /* JADX INFO: renamed from: c */
    public static void m99503c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: d */
    public static void m99504d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
