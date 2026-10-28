package com.whoop.data.remote.commons;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0006\u0010\u0002\u001a\u00020\u0003J\u0006\u0010\u0004\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lcom/whoop/data/remote/commons/AppExecutors;", "", "diskIO", "Ljava/util/concurrent/Executor;", "mainThread", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V", "()V", "MainThreadExecutor", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class AppExecutors {
    private final Executor diskIO;
    private final Executor mainThread;

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/data/remote/commons/AppExecutors$MainThreadExecutor;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "command", "Ll83/a0;", "execute", "(Ljava/lang/Runnable;)V", "Landroid/os/Handler;", "mainThreadHandler", "Landroid/os/Handler;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class MainThreadExecutor implements Executor {
        private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            AbstractC22676k.m65750j(command, "command");
            this.mainThreadHandler.post(command);
        }
    }

    public AppExecutors(Executor diskIO, Executor mainThread) {
        AbstractC22676k.m65750j(diskIO, "diskIO");
        AbstractC22676k.m65750j(mainThread, "mainThread");
        this.diskIO = diskIO;
        this.mainThread = mainThread;
    }

    /* JADX INFO: renamed from: diskIO, reason: from getter */
    public final Executor getDiskIO() {
        return this.diskIO;
    }

    /* JADX INFO: renamed from: mainThread, reason: from getter */
    public final Executor getMainThread() {
        return this.mainThread;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppExecutors() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC22676k.m65749i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(executorServiceNewSingleThreadExecutor, new MainThreadExecutor());
    }
}
