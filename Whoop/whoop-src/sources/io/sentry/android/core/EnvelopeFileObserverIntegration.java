package io.sentry.android.core;

import io.sentry.C20371i4;
import io.sentry.C20410l3;
import io.sentry.C20513q6;
import io.sentry.C20535s;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20545t1;
import io.sentry.InterfaceC20602v0;
import io.sentry.util.C20579a;
import java.io.Closeable;
import p249jc.AbstractC21598x;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EnvelopeFileObserverIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public FileObserverC20148q0 f75245w;

    /* JADX INFO: renamed from: x */
    public InterfaceC20602v0 f75246x;

    /* JADX INFO: renamed from: y */
    public boolean f75247y = false;

    /* JADX INFO: renamed from: z */
    public final C20579a f75248z = new C20579a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i13) {
            this();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m55898b(C20513q6 c20513q6, String str) {
        FileObserverC20148q0 fileObserverC20148q0 = new FileObserverC20148q0(str, new C20410l3(C20371i4.f76402a, c20513q6.getEnvelopeReader(), c20513q6.getSerializer(), c20513q6.getLogger(), c20513q6.getFlushTimeoutMillis(), c20513q6.getMaxQueueSize()), c20513q6.getLogger(), c20513q6.getFlushTimeoutMillis());
        this.f75245w = fileObserverC20148q0;
        try {
            fileObserverC20148q0.startWatching();
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            AbstractC21598x.m60683i("EnvelopeFileObserver");
        } catch (Throwable th3) {
            c20513q6.getLogger().mo16060j(EnumC20436n5.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C20535s c20535sM56711a = this.f75248z.m56711a();
        try {
            this.f75247y = true;
            c20535sM56711a.close();
            FileObserverC20148q0 fileObserverC20148q0 = this.f75245w;
            if (fileObserverC20148q0 != null) {
                fileObserverC20148q0.stopWatching();
                InterfaceC20602v0 interfaceC20602v0 = this.f75246x;
                if (interfaceC20602v0 != null) {
                    interfaceC20602v0.mo16066m(EnumC20436n5.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
        } catch (Throwable th3) {
            try {
                c20535sM56711a.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        this.f75246x = c20513q6.getLogger();
        String outboxPath = c20513q6.getOutboxPath();
        if (outboxPath == null) {
            this.f75246x.mo16066m(EnumC20436n5.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f75246x.mo16066m(EnumC20436n5.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            c20513q6.getExecutorService().submit(new RunnableC20064c1(this, c20513q6, outboxPath, 1));
        } catch (Throwable th3) {
            this.f75246x.mo16060j(EnumC20436n5.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th3);
        }
    }
}
