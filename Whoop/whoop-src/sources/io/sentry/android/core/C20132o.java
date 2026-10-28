package io.sentry.android.core;

import com.google.crypto.tink.internal.C5099k0;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;

/* JADX INFO: renamed from: io.sentry.android.core.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C20132o extends C5099k0 implements InterfaceC20060b0 {
    @Override // com.google.crypto.tink.internal.C5099k0, io.sentry.metrics.InterfaceC20427a
    /* JADX INFO: renamed from: a */
    public final void mo16002a(boolean z4) {
        C20071e0.f75391E.m55944k(this);
        super.mo16002a(z4);
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        C20513q6 c20513q6 = (C20513q6) this.f21439x;
        try {
            c20513q6.getExecutorService().submit(new RunnableC20129n(this));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to submit metrics flush in onBackground()", new Object[0]);
        }
    }
}
