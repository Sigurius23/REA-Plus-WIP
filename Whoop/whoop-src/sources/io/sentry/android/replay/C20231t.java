package io.sentry.android.replay;

import io.sentry.util.C20579a;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.replay.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C20231t implements Closeable {

    /* JADX INFO: renamed from: w */
    public final AtomicBoolean f76006w = new AtomicBoolean(false);

    /* JADX INFO: renamed from: x */
    public final C20579a f76007x = new C20579a();

    /* JADX INFO: renamed from: y */
    public final C20220s f76008y = new C20220s(this);

    /* JADX INFO: renamed from: z */
    public final C20219r f76009z = new C20219r(this);

    /* JADX INFO: renamed from: b */
    public final C20220s m56152b() {
        return this.f76008y;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f76006w.set(true);
        this.f76008y.clear();
    }
}
