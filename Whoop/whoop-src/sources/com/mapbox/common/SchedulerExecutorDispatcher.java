package com.mapbox.common;

import bc3.AbstractC2995c1;
import java.util.concurrent.Executor;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/mapbox/common/SchedulerExecutorDispatcher;", "Lbc3/c1;", "Ljava/util/concurrent/Executor;", "executor", "<init>", "(Ljava/util/concurrent/Executor;)V", "Lq83/j;", "context", "Ljava/lang/Runnable;", "block", "Ll83/a0;", "dispatch", "(Lq83/j;Ljava/lang/Runnable;)V", "close", "()V", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "common_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class SchedulerExecutorDispatcher extends AbstractC2995c1 {
    private final Executor executor;

    public SchedulerExecutorDispatcher(Executor executor) {
        AbstractC22676k.m65750j(executor, "executor");
        this.executor = executor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // bc3.AbstractC3076z
    public void dispatch(InterfaceC30063j context, Runnable block) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(block, "block");
        getExecutor().execute(block);
    }

    @Override // bc3.AbstractC2995c1
    public Executor getExecutor() {
        return this.executor;
    }
}
