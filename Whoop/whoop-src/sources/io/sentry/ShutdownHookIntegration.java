package io.sentry;

import java.io.Closeable;
import p249jc.AbstractC21598x;
import pf.AbstractC29125c;

/* JADX INFO: loaded from: classes5.dex */
public final class ShutdownHookIntegration implements InterfaceC20545t1, Closeable {

    /* JADX INFO: renamed from: w */
    public final Runtime f75177w;

    /* JADX INFO: renamed from: x */
    public Thread f75178x;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        AbstractC29125c.m88510S(runtime, "Runtime is required");
        this.f75177w = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.f75178x != null) {
            try {
                new RunnableC20277c7(this, 0).run();
            } catch (IllegalStateException e5) {
                String message = e5.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e5;
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC20545t1
    /* JADX INFO: renamed from: m */
    public final void mo55878m(C20513q6 c20513q6) {
        if (!c20513q6.isEnableShutdownHook()) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f75178x = new Thread(new RunnableC20423m4(c20513q6, 3), "sentry-shutdownhook");
        try {
            this.f75177w.addShutdownHook(this.f75178x);
            c20513q6.getLogger().mo16066m(EnumC20436n5.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            AbstractC21598x.m60683i("ShutdownHook");
        } catch (IllegalStateException e5) {
            String message = e5.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e5;
            }
        }
    }
}
