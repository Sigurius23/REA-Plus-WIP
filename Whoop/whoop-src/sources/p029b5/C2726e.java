package p029b5;

import android.p017os.OutcomeReceiver;
import bc3.C3033m;
import java.util.concurrent.atomic.AtomicBoolean;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: b5.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C2726e extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: w */
    public final C3033m f10736w;

    public C2726e(C3033m c3033m) {
        super(false);
        this.f10736w = c3033m;
    }

    public final void onError(Throwable th3) {
        if (compareAndSet(false, true)) {
            this.f10736w.resumeWith(AbstractC34132o.m107888l(th3));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f10736w.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
