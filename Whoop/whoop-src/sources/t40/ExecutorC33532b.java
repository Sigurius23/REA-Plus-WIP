package t40;

import java.util.concurrent.Executor;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class ExecutorC33532b implements Executor {

    /* JADX INFO: renamed from: w */
    public static final ExecutorC33532b f139976w = new ExecutorC33532b();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r10) {
        AbstractC22676k.m65750j(r10, "r");
        r10.run();
    }
}
