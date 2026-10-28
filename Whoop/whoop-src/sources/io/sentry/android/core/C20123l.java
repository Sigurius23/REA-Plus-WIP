package io.sentry.android.core;

import a30.C0332w0;
import cd3.C4455g;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import p036bq.RunnableC3543b;

/* JADX INFO: renamed from: io.sentry.android.core.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C20123l extends C0332w0 implements InterfaceC20060b0 {
    public C20123l(C20513q6 c20513q6, C4455g c4455g) {
        super(c20513q6, c4455g);
        C20071e0.f75391E.m55941b(this);
    }

    @Override // a30.C0332w0, io.sentry.logger.InterfaceC20415a
    /* JADX INFO: renamed from: a */
    public final void mo852a(boolean z4) {
        C20071e0.f75391E.m55944k(this);
        super.mo852a(z4);
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: i */
    public final void mo55909i() {
    }

    @Override // io.sentry.android.core.InterfaceC20060b0
    /* JADX INFO: renamed from: k */
    public final void mo55910k() {
        C20513q6 c20513q6 = (C20513q6) this.f1168x;
        try {
            c20513q6.getExecutorService().submit(new RunnableC3543b(this, 6));
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16058i(EnumC20436n5.ERROR, th3, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
