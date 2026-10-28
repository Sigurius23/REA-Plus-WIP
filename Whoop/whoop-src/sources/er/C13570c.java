package er;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;
import p043c4.C3978u;
import p715kotlin.time.DurationKt;

/* JADX INFO: renamed from: er.c */
/* JADX INFO: loaded from: classes6.dex */
public class C13570c {

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback f47919a;

    /* JADX INFO: renamed from: a */
    public OnBackInvokedCallback mo38313a(InterfaceC13569b interfaceC13569b) {
        Objects.requireNonNull(interfaceC13569b);
        return new C3978u(interfaceC13569b, 1);
    }

    /* JADX INFO: renamed from: b */
    public void m38314b(InterfaceC13569b interfaceC13569b, View view, boolean z4) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.f47919a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallbackMo38313a = mo38313a(interfaceC13569b);
            this.f47919a = onBackInvokedCallbackMo38313a;
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z4 ? DurationKt.NANOS_IN_MILLIS : 0, onBackInvokedCallbackMo38313a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m38315c(View view) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f47919a);
        this.f47919a = null;
    }
}
